package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.Yeast

class YeastDeserializerTest  extends GroovyTestCase {
    private Deserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<Yeast>();
    }

    void testToBeerXmlYeastRequiredFieldsOnly() {
        String xml = "<YEAST>" +
                "<NAME>Ole English Ale Yeast</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Ale</TYPE>" +
                "<FORM>Liquid</FORM>" +
                "<AMOUNT>0.100</AMOUNT>" +
                "</YEAST>";

        Yeast yeast = (Yeast) _deserializer.toBeerXml(xml, Yeast.class);

        assertEquals("Ole English Ale Yeast", yeast.getName());
        assertEquals(1, yeast.getVersion());
        assertEquals(YeastType.Ale, yeast.getType());
        assertEquals(YeastForm.Liquid, yeast.getForm());
        assertEquals(0.100, yeast.getAmount());
        assertNull(yeast.getAmountIsWeight());
        assertNull(yeast.getLaboratory());
        assertNull(yeast.getManufacturerProductId());
        assertNull(yeast.getMinimumTemperature());
        assertNull(yeast.getMaximumTemperature());
        assertNull(yeast.getFlocculation());
        assertNull(yeast.getAttenuation());
        assertNull(yeast.getNotes());
        assertNull(yeast.getBestFor());
        assertNull(yeast.getTimesCultured());
        assertNull(yeast.getMaximumReuse());
        assertNull(yeast.getAddToSecondary());
        assertNull(yeast.getDisplayAmount());
        assertNull(yeast.getDisplayMinimumTemperature());
        assertNull(yeast.getDisplayMaximumTemperature());
        assertNull(yeast.getInventory());
        assertNull(yeast.getCultureDate());
    }

    void testToBeerXmlYeastMorePopularFields() {
        String xml = "<YEAST>" +
                "<NAME>German Ale</NAME>" +
                "<TYPE>Ale</TYPE>" +
                "<VERSION>1</VERSION>" +
                "<FORM>Liquid</FORM>" +
                "<AMOUNT>0.250</AMOUNT>" +
                "<LABORATORY>Wyeast Labs</LABORATORY>" +
                "<PRODUCT_ID>1007</PRODUCT_ID>" +
                "<MIN_TEMPERATURE>12.8</MIN_TEMPERATURE>" +
                "<MAX_TEMPERATURE>20.0</MAX_TEMPERATURE>" +
                "<ATTENUATION>75.0</ATTENUATION>" +
                "<NOTES>Crisp dry flavor with a hint of mild flavor.\n" +
                "Great for many continental ales. \n" +
                "</NOTES>" +
                "<BEST_FOR>German Ales, Alts, Kolsch, Dry Stouts </BEST_FOR>" +
                "<FLOCCULATION>Low</FLOCCULATION>" +
                "</YEAST>";

        Yeast yeast = (Yeast) _deserializer.toBeerXml(xml, Yeast.class);

        assertEquals("German Ale", yeast.getName());
        assertEquals(1, yeast.getVersion());
        assertEquals(YeastType.Ale, yeast.getType());
        assertEquals(YeastForm.Liquid, yeast.getForm());
        assertEquals(0.250, yeast.getAmount());
        assertNull(yeast.getAmountIsWeight());
        assertEquals("Wyeast Labs", yeast.getLaboratory());
        assertEquals("1007", yeast.getManufacturerProductId());
        assertEquals(12.8, yeast.getMinimumTemperature());
        assertEquals(20.0, yeast.getMaximumTemperature());
        assertEquals(YeastFlocculation.Low, yeast.getFlocculation());
        assertEquals(75.0, yeast.getAttenuation());
        assertEquals("Crisp dry flavor with a hint of mild flavor.\n" +
                "Great for many continental ales. \n" , yeast.getNotes());
        assertEquals("German Ales, Alts, Kolsch, Dry Stouts ", yeast.getBestFor());
        assertNull(yeast.getTimesCultured());
        assertNull(yeast.getMaximumReuse());
        assertNull(yeast.getAddToSecondary());
        assertNull(yeast.getDisplayAmount());
        assertNull(yeast.getDisplayMinimumTemperature());
        assertNull(yeast.getDisplayMaximumTemperature());
        assertNull(yeast.getInventory());
        assertNull(yeast.getCultureDate());
    }
}
