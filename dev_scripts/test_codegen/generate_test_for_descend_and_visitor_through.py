"""Generate the test code for the ``Descend`` methods and ``VisitorThrough``."""

import io
import os
import pathlib
import sys
import textwrap
from typing import List

import aas_core_codegen
import aas_core_codegen.common
import aas_core_codegen.java.naming
import aas_core_codegen.naming
import aas_core_codegen.parse
import aas_core_codegen.run
from aas_core_codegen import intermediate
from aas_core_codegen.common import Stripped
from aas_core_codegen.java.common import (
    INDENT as I,
    INDENT2 as II,
    INDENT3 as III,
    INDENT4 as IIII,
)
import test_codegen.common

def _generate_compare_or_rerecord_trace()-> Stripped:
    return Stripped(f"""\
private void compareOrRerecordTrace(IClass instance, Path expectedPath) throws IOException  {{
{I}final StringBuilder stringBuilder = new StringBuilder();
{I}for (IClass descendant : instance.descend()) {{
{II}if (descendant instanceof IIdentifiable) {{
{III}stringBuilder.append(descendant.getClass().getSimpleName())
{III}.append(" with ID ").append(((IIdentifiable) descendant).getId())
{III}.append("\\n");
{II}}} else if (descendant instanceof IReferable) {{
{III}stringBuilder.append(descendant.getClass().getSimpleName())
{III}.append(" with ID-short ")
{III}.append(((IReferable) descendant).getIdShort())
{III}.append("\\n");
{II}}} else {{
{III}stringBuilder
{IIII}.append(descendant.getClass().getSimpleName())
{IIII}.append("\\n");
{II}}}
{I}}}
{I}
{I}final String got = stringBuilder.toString();
{I}if (Common.RECORD_MODE) {{
{II}Files.createDirectories(expectedPath.getParent());
{II}Files.write(expectedPath, got.getBytes());
{I}}}else {{
{III}if (!Files.exists(expectedPath)) {{
{IIII}throw new FileNotFoundException("The file with the recorded value does not exist: " + expectedPath);
{III}}}
{III}final String expected = Files.readAllLines(expectedPath).stream().collect(Collectors.joining("\\n"));
{III}assertEquals(expected.replace("\\n",""), got.replace("\\n",""));
{I}}}
}}""")

def _generate_assert_descend_and_visitor_through_same()-> Stripped:
    return Stripped(f"""\
private void assertDescendAndVisitorThroughSame(IClass instance) {{
{I}final List<String> logFromDescend = new ArrayList<>();
{I}for (IClass subInstance : instance.descend()) {{
{II}logFromDescend.add(trace(subInstance));
{I}}}
{I}final TracingVisitorThrough visitor = new TracingVisitorThrough();
{I}visitor.visit(instance);
{I}final List<String> traceFromVisitor = visitor.log;
{I}assertFalse(traceFromVisitor.isEmpty());
{I}assertEquals(trace(instance), traceFromVisitor.get(0));
{I}traceFromVisitor.remove(0);
{I}assertTrue(logFromDescend.equals(traceFromVisitor));
}}""")

def _generate_trace()-> Stripped:
    return Stripped(f"""\
private String trace(IClass instance) {{
{I}if (instance instanceof IIdentifiable) {{
{II}return instance.getClass().getSimpleName() + " with ID " + (((IIdentifiable) instance).getId());
{I}}} else if (instance instanceof IReferable) {{
{II}return instance.getClass().getSimpleName() + " with ID-short " + (((IReferable) instance).getIdShort());
{I}}} else {{
{II}return instance.getClass().getSimpleName();
{I}}}
}}""")

def _generate_visitor()-> Stripped:
    return Stripped(f"""\
private class TracingVisitorThrough extends VisitorThrough {{
{I}public final List<String> log = new ArrayList<>();
{I}
{I}@Override
{I}public void visit(IClass that) {{
{II}log.add(trace(that));
{II}super.visit(that);
{I}}}
}}""")

def main() -> int:
    """Execute the main routine."""
    symbol_table = test_codegen.common.load_symbol_table()

    this_path = pathlib.Path(os.path.realpath(__file__))
    repo_root = this_path.parent.parent.parent

    # noinspection PyListCreation
    blocks = [
        _generate_compare_or_rerecord_trace(),
        _generate_assert_descend_and_visitor_through_same(),
        _generate_trace(),
        _generate_visitor()
              ]  # type: List[str]



    for our_type in symbol_table.our_types:
        if not isinstance(our_type, intermediate.ConcreteClass):
            continue

        cls_name_java = aas_core_codegen.java.naming.class_name(our_type.name)

        blocks.append(
            Stripped(
                f"""\
@Test
public void testDescendOf{cls_name_java}() throws IOException {{
{I}final {cls_name_java} instance = CommonJsonization.loadMaximal{cls_name_java}();
{I}compareOrRerecordTrace(instance,
{II}Paths.get(Common.TEST_DATA_DIR,
{III}"Descend",
{III}"{cls_name_java}",
{III}"maximal.json.trace"));
}}  // public void testDescendOf{cls_name_java}"""
            )
        )

        blocks.append(
            Stripped(
                f"""\
@Test
public void testDescendAgainstVisitorThroughFor{cls_name_java}() throws IOException {{
{I}final {cls_name_java} instance = CommonJsonization.loadMaximal{cls_name_java}();
{I}assertDescendAndVisitorThroughSame(instance);
}}  // public void testDescendAgainstVisitorThroughFor{cls_name_java}"""
            )
        )

    writer = io.StringIO()
    writer.write(
        """\
/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */
 
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.IClass;
import aas_core.aas3_0.types.model.IIdentifiable;
import aas_core.aas3_0.types.model.IReferable;
import aas_core.aas3_0.visitation.VisitorThrough;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.*;


public class TestDescendAndVisitorThrough {
"""
    )

    for i, block in enumerate(blocks):
        if i > 0:
            writer.write("\n\n")

        writer.write(textwrap.indent(block, "        "))

    writer.write(
        """
}  // class TestDescendAndVisitorThrough


/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */
"""
    )

    target_pth = repo_root / "src/test/java/TestDescendAndVisitorThrough.java"
    target_pth.write_text(writer.getvalue(), encoding="utf-8")

    return 0


if __name__ == "__main__":
    sys.exit(main())
