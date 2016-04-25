package com.grandpasbrewing.beerxml.version1.enums

class YeastTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Ale", YeastType.Ale.getDescription());
        assertEquals("Lager", YeastType.Lager.getDescription());
        assertEquals("Wheat", YeastType.Wheat.getDescription());
        assertEquals("Wine", YeastType.Wine.getDescription());
        assertEquals("Champagne", YeastType.Champagne.getDescription());
    }

    void testFromDescription() {
        assertEquals(YeastType.Ale, YeastType.fromDescription("Ale"));
        assertEquals(YeastType.Lager,  YeastType.fromDescription("Lager"));
        assertEquals(YeastType.Wheat,  YeastType.fromDescription("Wheat"));
        assertEquals(YeastType.Wine,  YeastType.fromDescription("Wine"));
        assertEquals(YeastType.Champagne,  YeastType.fromDescription("Champagne"));
        assertEquals(null,  YeastType.fromDescription("unknown"));
    }
}
