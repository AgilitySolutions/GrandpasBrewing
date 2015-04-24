package com.grandpasbrewing.beerxml.version1.enums

class YeastFlocculationTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Low", YeastFlocculation.Low.getDescription());
        assertEquals("Medium", YeastFlocculation.Medium.getDescription());
        assertEquals("High", YeastFlocculation.High.getDescription());
        assertEquals("Very High", YeastFlocculation.VeryHigh.getDescription());
    }

    void testFromDescription() {
        assertEquals(YeastFlocculation.Low, YeastFlocculation.fromDescription("Low"));
        assertEquals(YeastFlocculation.Medium,  YeastFlocculation.fromDescription("Medium"));
        assertEquals(YeastFlocculation.High,  YeastFlocculation.fromDescription("High"));
        assertEquals(YeastFlocculation.VeryHigh,  YeastFlocculation.fromDescription("Very High"));
        assertEquals(null,  YeastFlocculation.fromDescription("unknown"));
    }
}

