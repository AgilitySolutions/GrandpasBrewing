package com.grandpasbrewing.beerxml.version1.enums

class HopTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Bittering", HopType.Bittering.getDescription());
        assertEquals("Aroma", HopType.Aroma.getDescription());
        assertEquals("Both", HopType.Both.getDescription());
    }

    void testFromDescription() {
        assertEquals(HopType.Bittering, HopType.fromDescription("Bittering"));
        assertEquals(HopType.Aroma,  HopType.fromDescription("Aroma"));
        assertEquals(HopType.Both,  HopType.fromDescription("Both"));
        assertEquals(null,  HopType.fromDescription("unknown"));
    }
}