package com.grandpasbrewing.beerxml.enums

class HopUseTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Boil", HopUse.Boil.getDescription());
        assertEquals("Dry Hop", HopUse.DryHop.getDescription());
        assertEquals("Mash", HopUse.Mash.getDescription());
        assertEquals("First Wort", HopUse.FirstWort.getDescription());
        assertEquals("Aroma", HopUse.Aroma.getDescription());
    }
}