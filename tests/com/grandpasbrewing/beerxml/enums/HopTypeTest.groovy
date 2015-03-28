package com.grandpasbrewing.beerxml.enums

class HopTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Bittering", HopType.Bittering.getDescription());
        assertEquals("Aroma", HopType.Aroma.getDescription());
        assertEquals("Both", HopType.Both.getDescription());
    }
}
