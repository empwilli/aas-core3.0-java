/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */

import aas_core.aas3_0.jsonization.Jsonization;
import aas_core.aas3_0.types.impl.*;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import javax.annotation.Generated;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
* Test de/serialization of classes contained in a container outside 
* of that container.
*
* This is necessary so that we also test the methods that directly de/serialize
* an instance in rare use cases where it does not reside within a container such
* as {@link Environment}.
*/
@Generated("Generated by aas-test-gen")
public class TestJsonizationOfConcreteClassesOutsideContainer {

        final static ObjectMapper mapper = new ObjectMapper();

        @Test
        public void testRoundTripExtension() throws IOException {
          final Extension instance = CommonJsonization.loadMaximalExtension();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Extension anotherInstance = Jsonization.Deserialize.deserializeExtension(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripExtension

        @Test
        public void testRoundTripAdministrativeInformation() throws IOException {
          final AdministrativeInformation instance = CommonJsonization.loadMaximalAdministrativeInformation();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final AdministrativeInformation anotherInstance = Jsonization.Deserialize.deserializeAdministrativeInformation(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripAdministrativeInformation

        @Test
        public void testRoundTripQualifier() throws IOException {
          final Qualifier instance = CommonJsonization.loadMaximalQualifier();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Qualifier anotherInstance = Jsonization.Deserialize.deserializeQualifier(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripQualifier

        @Test
        public void testRoundTripAssetAdministrationShell() throws IOException {
          final AssetAdministrationShell instance = CommonJsonization.loadMaximalAssetAdministrationShell();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final AssetAdministrationShell anotherInstance = Jsonization.Deserialize.deserializeAssetAdministrationShell(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripAssetAdministrationShell

        @Test
        public void testRoundTripAssetInformation() throws IOException {
          final AssetInformation instance = CommonJsonization.loadMaximalAssetInformation();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final AssetInformation anotherInstance = Jsonization.Deserialize.deserializeAssetInformation(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripAssetInformation

        @Test
        public void testRoundTripResource() throws IOException {
          final Resource instance = CommonJsonization.loadMaximalResource();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Resource anotherInstance = Jsonization.Deserialize.deserializeResource(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripResource

        @Test
        public void testRoundTripSpecificAssetId() throws IOException {
          final SpecificAssetId instance = CommonJsonization.loadMaximalSpecificAssetId();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final SpecificAssetId anotherInstance = Jsonization.Deserialize.deserializeSpecificAssetId(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripSpecificAssetId

        @Test
        public void testRoundTripSubmodel() throws IOException {
          final Submodel instance = CommonJsonization.loadMaximalSubmodel();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Submodel anotherInstance = Jsonization.Deserialize.deserializeSubmodel(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripSubmodel

        @Test
        public void testRoundTripRelationshipElement() throws IOException {
          final RelationshipElement instance = CommonJsonization.loadMaximalRelationshipElement();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final RelationshipElement anotherInstance = Jsonization.Deserialize.deserializeRelationshipElement(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripRelationshipElement

        @Test
        public void testRoundTripSubmodelElementList() throws IOException {
          final SubmodelElementList instance = CommonJsonization.loadMaximalSubmodelElementList();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final SubmodelElementList anotherInstance = Jsonization.Deserialize.deserializeSubmodelElementList(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripSubmodelElementList

        @Test
        public void testRoundTripSubmodelElementCollection() throws IOException {
          final SubmodelElementCollection instance = CommonJsonization.loadMaximalSubmodelElementCollection();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final SubmodelElementCollection anotherInstance = Jsonization.Deserialize.deserializeSubmodelElementCollection(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripSubmodelElementCollection

        @Test
        public void testRoundTripProperty() throws IOException {
          final Property instance = CommonJsonization.loadMaximalProperty();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Property anotherInstance = Jsonization.Deserialize.deserializeProperty(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripProperty

        @Test
        public void testRoundTripMultiLanguageProperty() throws IOException {
          final MultiLanguageProperty instance = CommonJsonization.loadMaximalMultiLanguageProperty();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final MultiLanguageProperty anotherInstance = Jsonization.Deserialize.deserializeMultiLanguageProperty(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripMultiLanguageProperty

        @Test
        public void testRoundTripRange() throws IOException {
          final Range instance = CommonJsonization.loadMaximalRange();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Range anotherInstance = Jsonization.Deserialize.deserializeRange(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripRange

        @Test
        public void testRoundTripReferenceElement() throws IOException {
          final ReferenceElement instance = CommonJsonization.loadMaximalReferenceElement();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final ReferenceElement anotherInstance = Jsonization.Deserialize.deserializeReferenceElement(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripReferenceElement

        @Test
        public void testRoundTripBlob() throws IOException {
          final Blob instance = CommonJsonization.loadMaximalBlob();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Blob anotherInstance = Jsonization.Deserialize.deserializeBlob(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripBlob

        @Test
        public void testRoundTripFile() throws IOException {
          final File instance = CommonJsonization.loadMaximalFile();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final File anotherInstance = Jsonization.Deserialize.deserializeFile(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripFile

        @Test
        public void testRoundTripAnnotatedRelationshipElement() throws IOException {
          final AnnotatedRelationshipElement instance = CommonJsonization.loadMaximalAnnotatedRelationshipElement();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final AnnotatedRelationshipElement anotherInstance = Jsonization.Deserialize.deserializeAnnotatedRelationshipElement(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripAnnotatedRelationshipElement

        @Test
        public void testRoundTripEntity() throws IOException {
          final Entity instance = CommonJsonization.loadMaximalEntity();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Entity anotherInstance = Jsonization.Deserialize.deserializeEntity(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripEntity

        @Test
        public void testRoundTripBasicEventElement() throws IOException {
          final BasicEventElement instance = CommonJsonization.loadMaximalBasicEventElement();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final BasicEventElement anotherInstance = Jsonization.Deserialize.deserializeBasicEventElement(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripBasicEventElement

        @Test
        public void testRoundTripOperation() throws IOException {
          final Operation instance = CommonJsonization.loadMaximalOperation();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Operation anotherInstance = Jsonization.Deserialize.deserializeOperation(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripOperation

        @Test
        public void testRoundTripOperationVariable() throws IOException {
          final OperationVariable instance = CommonJsonization.loadMaximalOperationVariable();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final OperationVariable anotherInstance = Jsonization.Deserialize.deserializeOperationVariable(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripOperationVariable

        @Test
        public void testRoundTripCapability() throws IOException {
          final Capability instance = CommonJsonization.loadMaximalCapability();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Capability anotherInstance = Jsonization.Deserialize.deserializeCapability(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripCapability

        @Test
        public void testRoundTripConceptDescription() throws IOException {
          final ConceptDescription instance = CommonJsonization.loadMaximalConceptDescription();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final ConceptDescription anotherInstance = Jsonization.Deserialize.deserializeConceptDescription(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripConceptDescription

        @Test
        public void testRoundTripReference() throws IOException {
          final Reference instance = CommonJsonization.loadMaximalReference();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Reference anotherInstance = Jsonization.Deserialize.deserializeReference(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripReference

        @Test
        public void testRoundTripKey() throws IOException {
          final Key instance = CommonJsonization.loadMaximalKey();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final Key anotherInstance = Jsonization.Deserialize.deserializeKey(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripKey

        @Test
        public void testRoundTripLangStringNameType() throws IOException {
          final LangStringNameType instance = CommonJsonization.loadMaximalLangStringNameType();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LangStringNameType anotherInstance = Jsonization.Deserialize.deserializeLangStringNameType(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLangStringNameType

        @Test
        public void testRoundTripLangStringTextType() throws IOException {
          final LangStringTextType instance = CommonJsonization.loadMaximalLangStringTextType();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LangStringTextType anotherInstance = Jsonization.Deserialize.deserializeLangStringTextType(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLangStringTextType

        @Test
        public void testRoundTripEmbeddedDataSpecification() throws IOException {
          final EmbeddedDataSpecification instance = CommonJsonization.loadMaximalEmbeddedDataSpecification();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final EmbeddedDataSpecification anotherInstance = Jsonization.Deserialize.deserializeEmbeddedDataSpecification(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripEmbeddedDataSpecification

        @Test
        public void testRoundTripLevelType() throws IOException {
          final LevelType instance = CommonJsonization.loadMaximalLevelType();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LevelType anotherInstance = Jsonization.Deserialize.deserializeLevelType(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLevelType

        @Test
        public void testRoundTripValueReferencePair() throws IOException {
          final ValueReferencePair instance = CommonJsonization.loadMaximalValueReferencePair();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final ValueReferencePair anotherInstance = Jsonization.Deserialize.deserializeValueReferencePair(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripValueReferencePair

        @Test
        public void testRoundTripValueList() throws IOException {
          final ValueList instance = CommonJsonization.loadMaximalValueList();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final ValueList anotherInstance = Jsonization.Deserialize.deserializeValueList(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripValueList

        @Test
        public void testRoundTripLangStringPreferredNameTypeIec61360() throws IOException {
          final LangStringPreferredNameTypeIec61360 instance = CommonJsonization.loadMaximalLangStringPreferredNameTypeIec61360();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LangStringPreferredNameTypeIec61360 anotherInstance = Jsonization.Deserialize.deserializeLangStringPreferredNameTypeIec61360(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLangStringPreferredNameTypeIec61360

        @Test
        public void testRoundTripLangStringShortNameTypeIec61360() throws IOException {
          final LangStringShortNameTypeIec61360 instance = CommonJsonization.loadMaximalLangStringShortNameTypeIec61360();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LangStringShortNameTypeIec61360 anotherInstance = Jsonization.Deserialize.deserializeLangStringShortNameTypeIec61360(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLangStringShortNameTypeIec61360

        @Test
        public void testRoundTripLangStringDefinitionTypeIec61360() throws IOException {
          final LangStringDefinitionTypeIec61360 instance = CommonJsonization.loadMaximalLangStringDefinitionTypeIec61360();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final LangStringDefinitionTypeIec61360 anotherInstance = Jsonization.Deserialize.deserializeLangStringDefinitionTypeIec61360(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripLangStringDefinitionTypeIec61360

        @Test
        public void testRoundTripDataSpecificationIec61360() throws IOException {
          final DataSpecificationIec61360 instance = CommonJsonization.loadMaximalDataSpecificationIec61360();
          final JsonNode jsonObject = Jsonization.Serialize.toJsonObject(instance);
          final DataSpecificationIec61360 anotherInstance = Jsonization.Deserialize.deserializeDataSpecificationIec61360(jsonObject);
          final JsonNode anotherJsonObject = Jsonization.Serialize.toJsonObject(anotherInstance);
          assertEquals(mapper.readTree(jsonObject.toString()), mapper.readTree(anotherJsonObject.toString()));
        }  // public void testRoundTripDataSpecificationIec61360
}  // class TestJsonizationOfConcreteClassesOutsideContainer

/*
 * This code has been automatically generated by testgen.
 * Do NOT edit or append.
 */