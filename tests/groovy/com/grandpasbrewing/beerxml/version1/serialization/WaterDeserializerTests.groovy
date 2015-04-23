package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.objects.Style
import com.grandpasbrewing.beerxml.version1.objects.Water

class WaterDeserializerTests extends GroovyTestCase {
    private Deserializer _deserializer;
    private String _waterXml;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<Style>();

        _waterXml = "<WATER>" +
                "<NAME> Burton on Trent, UK </NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>20.0</AMOUNT>" +
                "<CALCIUM>295.0</CALCIUM>" +
                "<MAGNESIUM>45.0</MAGNESIUM>" +
                "<SODIUM>55.0</SODIUM>" +
                "<SULFATE>725.0</SULFATE>" +
                "<CHLORIDE>25.0</CHLORIDE>" +
                "<BICARBONATE>300.0</BICARBONATE>" +
                "<PH>8.0</PH>" +
                "<NOTES>" +
                "Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale " +
                "</NOTES>" +
                "</WATER>";
    }

    void testToBeerXml() {
        Water water = (Water) _deserializer.toBeerXml(_waterXml, Water.class);

        assertEquals(" Burton on Trent, UK ", water.getName());
        assertEquals(1, water.getVersion());
        assertEquals(20.0, water.getAmount());
        assertEquals(295.0, water.getCalcium());
        assertEquals(300.0, water.getBicarbonate());
        assertEquals(725.0, water.getSulfate());
        assertEquals(25.0, water.getChloride());
        assertEquals(55.0, water.getSodium());
        assertEquals(45.0, water.getMagnesium());
        assertEquals(8.0, water.getPH());
        assertEquals("Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale ", water.getNotes());
        assertNull(water.getDisplayAmount());
    }
}