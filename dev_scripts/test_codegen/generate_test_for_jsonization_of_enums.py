"""Generate the test code for the JSON de/serialization of enums."""

import io
import json
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
from aas_core_codegen.java import common as java_common
import aas_core_codegen.java.naming
from test_codegen.common import load_symbol_table
from aas_core_codegen.java.common import (
    INDENT as I,
    INDENT2 as II,
    INDENT3 as III,
    INDENT4 as IIII,
    INDENT5 as IIIII,
    INDENT6 as IIIIII,
)


def main() -> int:
    """Execute the main routine."""
    symbol_table = load_symbol_table()

    # noinspection PyListCreation
    blocks = []  # type: List[str]

    for our_type in symbol_table.our_types:
        if not isinstance(our_type, intermediate.Enumeration):
            continue

        enum_name = aas_core_codegen.java.naming.enum_name(our_type.name)
        method_name = aas_core_codegen.java.naming.method_name(
            aas_core_codegen.common.Identifier(f"{our_type.name}_to_json_value")
        )

        assert (
            len(our_type.literals) > 0
        ), f"Unexpected enumeration without literals: {our_type.name}"

        literal_value = our_type.literals[0].value
        literal_value_json_str = json.dumps(literal_value)

        blocks.append(
            Stripped(
                f"""\
@Test
public void testRoundTrip{enum_name}() throws JsonProcessingException {{
{I}final JsonNode node = mapper.readTree({java_common.string_literal(literal_value_json_str)});
{I}final {enum_name} parsed = Jsonization.Deserialize.deserialize{enum_name}(node);
{I}final JsonNode serialized = Jsonization.Serialize.{method_name}(parsed);
{I}assertEquals({java_common.string_literal(literal_value_json_str)}, serialized.toString());
}}  // void Test_round_trip_{enum_name}"""
            )
        )
        
    writer = io.StringIO()
    writer.write(
        """\
/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */

import aas_core.aas3_0.jsonization.Jsonization;
import aas_core.aas3_0.types.enums.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import javax.annotation.Generated;
import static org.junit.jupiter.api.Assertions.assertEquals;


@Generated("Generated by aas-test-gen")
public class TestJsonizationOfEnums {

            final static ObjectMapper mapper = new ObjectMapper();

"""
    )

    for i, block in enumerate(blocks):
        if i > 0:
            writer.write("\n\n")

        writer.write(textwrap.indent(block, "        "))

    writer.write(
        """
}  // class TestJsonizationOfEnums

/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */
"""
    )

    this_path = pathlib.Path(os.path.realpath(__file__))
    repo_root = this_path.parent.parent.parent

    target_pth = repo_root / "/home/mboehm/IdeaProjects/TestGen/src/test/java/TestJsonizationOfEnums.java"
    target_pth.write_text(writer.getvalue(), encoding="utf-8")

    return 0


if __name__ == "__main__":
    sys.exit(main())
