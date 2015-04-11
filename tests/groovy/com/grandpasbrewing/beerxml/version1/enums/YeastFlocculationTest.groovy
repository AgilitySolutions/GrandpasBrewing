package com.grandpasbrewing.beerxml.version1.enums

class YeastFlocculationTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Low", YeastFlocculation.Low.getDescription());
        assertEquals("Medium", YeastFlocculation.Medium.getDescription());
        assertEquals("High", YeastFlocculation.High.getDescription());
        assertEquals("Very High", YeastFlocculation.VeryHigh.getDescription());
    }
}

