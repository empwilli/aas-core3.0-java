/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.IClass;
import aas_core.aas3_0.types.model.IIdentifiable;
import aas_core.aas3_0.types.model.IReferable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class TestDescendOnce {
  private void compareOrRerecordTrace(IClass instance, Path expectedPath) throws IOException {
    final StringBuilder stringBuilder = new StringBuilder();
    for (IClass descendant : instance.descendOnce()) {
      if (descendant instanceof IIdentifiable) {
        stringBuilder
            .append(descendant.getClass().getSimpleName())
            .append(" with ID ")
            .append(((IIdentifiable) descendant).getId())
            .append("\n");
      } else if (descendant instanceof IReferable) {
        stringBuilder
            .append(descendant.getClass().getSimpleName())
            .append(" with ID-short ")
            .append(((IReferable) descendant).getIdShort())
            .append("\n");
      } else {
        stringBuilder.append(descendant.getClass().getSimpleName()).append("\n");
      }
    }

    final String got = stringBuilder.toString();
    if (Common.RECORD_MODE) {
      Files.createDirectories(expectedPath.getParent());
      Files.write(expectedPath, got.getBytes());
    } else {
      if (!Files.exists(expectedPath)) {
        throw new FileNotFoundException(
            "The file with the recorded value does not exist: " + expectedPath);
      }
      final String expected =
          Files.readAllLines(expectedPath).stream().collect(Collectors.joining("\n"));
      assertEquals(expected.replace("\n", ""), got.replace("\n", ""));
    }
  }

  @Test
  public void testExtension() throws IOException {

    final Extension instance = CommonJsonization.loadMaximalExtension();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Extension", "maximal.json.trace"));
  } // public void testExtension

  @Test
  public void testAdministrativeInformation() throws IOException {

    final AdministrativeInformation instance =
        CommonJsonization.loadMaximalAdministrativeInformation();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "AdministrativeInformation",
            "maximal.json.trace"));
  } // public void testAdministrativeInformation

  @Test
  public void testQualifier() throws IOException {

    final Qualifier instance = CommonJsonization.loadMaximalQualifier();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Qualifier", "maximal.json.trace"));
  } // public void testQualifier

  @Test
  public void testAssetAdministrationShell() throws IOException {

    final AssetAdministrationShell instance =
        CommonJsonization.loadMaximalAssetAdministrationShell();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR, "DescendOnce", "AssetAdministrationShell", "maximal.json.trace"));
  } // public void testAssetAdministrationShell

  @Test
  public void testAssetInformation() throws IOException {

    final AssetInformation instance = CommonJsonization.loadMaximalAssetInformation();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "AssetInformation", "maximal.json.trace"));
  } // public void testAssetInformation

  @Test
  public void testResource() throws IOException {

    final Resource instance = CommonJsonization.loadMaximalResource();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Resource", "maximal.json.trace"));
  } // public void testResource

  @Test
  public void testSpecificAssetId() throws IOException {

    final SpecificAssetId instance = CommonJsonization.loadMaximalSpecificAssetId();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "SpecificAssetId", "maximal.json.trace"));
  } // public void testSpecificAssetId

  @Test
  public void testSubmodel() throws IOException {

    final Submodel instance = CommonJsonization.loadMaximalSubmodel();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Submodel", "maximal.json.trace"));
  } // public void testSubmodel

  @Test
  public void testRelationshipElement() throws IOException {

    final RelationshipElement instance = CommonJsonization.loadMaximalRelationshipElement();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR, "DescendOnce", "RelationshipElement", "maximal.json.trace"));
  } // public void testRelationshipElement

  @Test
  public void testSubmodelElementList() throws IOException {

    final SubmodelElementList instance = CommonJsonization.loadMaximalSubmodelElementList();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR, "DescendOnce", "SubmodelElementList", "maximal.json.trace"));
  } // public void testSubmodelElementList

  @Test
  public void testSubmodelElementCollection() throws IOException {

    final SubmodelElementCollection instance =
        CommonJsonization.loadMaximalSubmodelElementCollection();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "SubmodelElementCollection",
            "maximal.json.trace"));
  } // public void testSubmodelElementCollection

  @Test
  public void testProperty() throws IOException {

    final Property instance = CommonJsonization.loadMaximalProperty();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Property", "maximal.json.trace"));
  } // public void testProperty

  @Test
  public void testMultiLanguageProperty() throws IOException {

    final MultiLanguageProperty instance = CommonJsonization.loadMaximalMultiLanguageProperty();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR, "DescendOnce", "MultiLanguageProperty", "maximal.json.trace"));
  } // public void testMultiLanguageProperty

  @Test
  public void testRange() throws IOException {

    final Range instance = CommonJsonization.loadMaximalRange();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Range", "maximal.json.trace"));
  } // public void testRange

  @Test
  public void testReferenceElement() throws IOException {

    final ReferenceElement instance = CommonJsonization.loadMaximalReferenceElement();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "ReferenceElement", "maximal.json.trace"));
  } // public void testReferenceElement

  @Test
  public void testBlob() throws IOException {

    final Blob instance = CommonJsonization.loadMaximalBlob();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Blob", "maximal.json.trace"));
  } // public void testBlob

  @Test
  public void testFile() throws IOException {

    final File instance = CommonJsonization.loadMaximalFile();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "File", "maximal.json.trace"));
  } // public void testFile

  @Test
  public void testAnnotatedRelationshipElement() throws IOException {

    final AnnotatedRelationshipElement instance =
        CommonJsonization.loadMaximalAnnotatedRelationshipElement();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "AnnotatedRelationshipElement",
            "maximal.json.trace"));
  } // public void testAnnotatedRelationshipElement

  @Test
  public void testEntity() throws IOException {

    final Entity instance = CommonJsonization.loadMaximalEntity();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Entity", "maximal.json.trace"));
  } // public void testEntity

  @Test
  public void testEventPayload() throws IOException {

    final EventPayload instance = CommonJsonization.loadMaximalEventPayload();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "EventPayload", "maximal.json.trace"));
  } // public void testEventPayload

  @Test
  public void testBasicEventElement() throws IOException {

    final BasicEventElement instance = CommonJsonization.loadMaximalBasicEventElement();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "BasicEventElement", "maximal.json.trace"));
  } // public void testBasicEventElement

  @Test
  public void testOperation() throws IOException {

    final Operation instance = CommonJsonization.loadMaximalOperation();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Operation", "maximal.json.trace"));
  } // public void testOperation

  @Test
  public void testOperationVariable() throws IOException {

    final OperationVariable instance = CommonJsonization.loadMaximalOperationVariable();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "OperationVariable", "maximal.json.trace"));
  } // public void testOperationVariable

  @Test
  public void testCapability() throws IOException {

    final Capability instance = CommonJsonization.loadMaximalCapability();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Capability", "maximal.json.trace"));
  } // public void testCapability

  @Test
  public void testConceptDescription() throws IOException {

    final ConceptDescription instance = CommonJsonization.loadMaximalConceptDescription();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "ConceptDescription", "maximal.json.trace"));
  } // public void testConceptDescription

  @Test
  public void testReference() throws IOException {

    final Reference instance = CommonJsonization.loadMaximalReference();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Reference", "maximal.json.trace"));
  } // public void testReference

  @Test
  public void testKey() throws IOException {

    final Key instance = CommonJsonization.loadMaximalKey();
    compareOrRerecordTrace(
        instance, Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Key", "maximal.json.trace"));
  } // public void testKey

  @Test
  public void testLangStringNameType() throws IOException {

    final LangStringNameType instance = CommonJsonization.loadMaximalLangStringNameType();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "LangStringNameType", "maximal.json.trace"));
  } // public void testLangStringNameType

  @Test
  public void testLangStringTextType() throws IOException {

    final LangStringTextType instance = CommonJsonization.loadMaximalLangStringTextType();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "LangStringTextType", "maximal.json.trace"));
  } // public void testLangStringTextType

  @Test
  public void testEnvironment() throws IOException {

    final Environment instance = CommonJsonization.loadMaximalEnvironment();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "Environment", "maximal.json.trace"));
  } // public void testEnvironment

  @Test
  public void testEmbeddedDataSpecification() throws IOException {

    final EmbeddedDataSpecification instance =
        CommonJsonization.loadMaximalEmbeddedDataSpecification();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "EmbeddedDataSpecification",
            "maximal.json.trace"));
  } // public void testEmbeddedDataSpecification

  @Test
  public void testLevelType() throws IOException {

    final LevelType instance = CommonJsonization.loadMaximalLevelType();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "LevelType", "maximal.json.trace"));
  } // public void testLevelType

  @Test
  public void testValueReferencePair() throws IOException {

    final ValueReferencePair instance = CommonJsonization.loadMaximalValueReferencePair();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "ValueReferencePair", "maximal.json.trace"));
  } // public void testValueReferencePair

  @Test
  public void testValueList() throws IOException {

    final ValueList instance = CommonJsonization.loadMaximalValueList();
    compareOrRerecordTrace(
        instance,
        Paths.get(Common.TEST_DATA_DIR, "DescendOnce", "ValueList", "maximal.json.trace"));
  } // public void testValueList

  @Test
  public void testLangStringPreferredNameTypeIec61360() throws IOException {

    final LangStringPreferredNameTypeIec61360 instance =
        CommonJsonization.loadMaximalLangStringPreferredNameTypeIec61360();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "LangStringPreferredNameTypeIec61360",
            "maximal.json.trace"));
  } // public void testLangStringPreferredNameTypeIec61360

  @Test
  public void testLangStringShortNameTypeIec61360() throws IOException {

    final LangStringShortNameTypeIec61360 instance =
        CommonJsonization.loadMaximalLangStringShortNameTypeIec61360();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "LangStringShortNameTypeIec61360",
            "maximal.json.trace"));
  } // public void testLangStringShortNameTypeIec61360

  @Test
  public void testLangStringDefinitionTypeIec61360() throws IOException {

    final LangStringDefinitionTypeIec61360 instance =
        CommonJsonization.loadMaximalLangStringDefinitionTypeIec61360();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "LangStringDefinitionTypeIec61360",
            "maximal.json.trace"));
  } // public void testLangStringDefinitionTypeIec61360

  @Test
  public void testDataSpecificationIec61360() throws IOException {

    final DataSpecificationIec61360 instance =
        CommonJsonization.loadMaximalDataSpecificationIec61360();
    compareOrRerecordTrace(
        instance,
        Paths.get(
            Common.TEST_DATA_DIR,
            "DescendOnce",
            "DataSpecificationIec61360",
            "maximal.json.trace"));
  } // public void testDataSpecificationIec61360
} // class TestDescendOnce

/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */
