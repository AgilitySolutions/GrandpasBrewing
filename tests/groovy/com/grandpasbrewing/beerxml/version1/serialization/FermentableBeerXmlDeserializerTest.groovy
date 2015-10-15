package com.grandpasbrewing.beerxml.version1.serialization
import com.grandpasbrewing.beerxml.version1.enums.FermentableType
import com.grandpasbrewing.beerxml.version1.objects.Fermentable

class FermentableBeerXmlDeserializerTest extends GroovyTestCase {
    private BeerXmlDeserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new BeerXmlDeserializer<Fermentable>();
    }

    void testToBeerFermentableRequiredFieldsOnly() {
        String xml = "<FERMENTABLE>" +
                "<NAME>Pale 2-row Malt</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>5.0</AMOUNT>" +
                "<TYPE>Grain</TYPE>" +
                "<YIELD>73.4</YIELD>" +
                "<COLOR>3.0</COLOR>" +
                "</FERMENTABLE>";

        Fermentable fermentable = (Fermentable) _deserializer.toBeerXml(xml, Fermentable.class);

        assertEquals("Pale 2-row Malt", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Grain, fermentable.getType());
        assertEquals(5.0, fermentable.getAmount());
        assertEquals(73.4, fermentable.getYield());
        assertEquals(3.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertNull(fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testToBeerFermentableHoppedExtract() {
        String xml = "<FERMENTABLE>" +
                "<NAME>Fustons Hopped Amber</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>0.50</AMOUNT>" +
                "<NOTES>Hopped amber extract suitable as a base for english ales." +
                "</NOTES>" +
                "<YIELD>78.0</YIELD>" +
                "<TYPE>Extract</TYPE>" +
                "<COLOR>13</COLOR>" +
                "<IBU_GAL_PER_LB>16.6</IBU_GAL_PER_LB>" +
                "</FERMENTABLE>";

        Fermentable fermentable = (Fermentable) _deserializer.toBeerXml(xml, Fermentable.class);

        assertEquals("Fustons Hopped Amber", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Extract, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(78.0, fermentable.getYield());
        assertEquals(13, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertEquals("Hopped amber extract suitable as a base for english ales.", fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertEquals(16.6, fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testToBeerCrystalMaltSpecialtyGrainWithAllApplicableFields() {
        String xml = "<FERMENTABLE>" +
                "<NAME>Crystal 40 L</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>0.50</AMOUNT>" +
                "<TYPE>Grain</TYPE>" +
                "<YIELD>74.0</YIELD>" +
                "<COLOR>40.0</COLOR>" +
                "<ORIGIN>United Kingdom</ORIGIN>" +
                "<SUPPLIER>Fussybrewer Malting</SUPPLIER>" +
                "<NOTES>Darker crystal malt.\n" +
                "Adds body and improves head retention.\n" +
                "Also called caramel malt." +
                "</NOTES>" +
                "<COARSE_FINE_DIFF>1.5</COARSE_FINE_DIFF>" +
                "<MOISTURE>4.0</MOISTURE>" +
                "<DIASTATIC_POWER>0.0</DIASTATIC_POWER>" +
                "<PROTEIN>13.2</PROTEIN>" +
                "<MAX_IN_BATCH>10.0</MAX_IN_BATCH>" +
                "<RECOMMEND_MASH>FALSE</RECOMMEND_MASH>" +
                "</FERMENTABLE>";

        Fermentable fermentable = (Fermentable) _deserializer.toBeerXml(xml, Fermentable.class);

        assertEquals("Crystal 40 L", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Grain, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(74.0, fermentable.getYield());
        assertEquals(40.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertEquals("United Kingdom", fermentable.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentable.getSupplier());
        assertEquals("Darker crystal malt.\n" +
                "Adds body and improves head retention.\n" +
                "Also called caramel malt.", fermentable.getNotes());
        assertEquals(1.5, fermentable.getCoarseFineDiff());
        assertEquals(4.0, fermentable.getMoisture());
        assertEquals(0.0, fermentable.getDiastaticPower());
        assertEquals(13.2, fermentable.getProtein());
        assertEquals(10.0, fermentable.getMaximumInBatch());
        assertEquals(false, fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }
}
