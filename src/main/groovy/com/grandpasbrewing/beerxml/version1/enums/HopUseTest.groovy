package com.grandpasbrewing.beerxml.version1.enums

class HopUseTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Boil", HopUse.Boil.getDescription());
        assertEquals("Dry Hop", HopUse.DryHop.getDescription());
        assertEquals("Mash", HopUse.Mash.getDescription());
        assertEquals("First Wort", HopUse.FirstWort.getDescription());
        assertEquals("Aroma", HopUse.Aroma.getDescription());
    }

    void testFromDescription() {
        assertEquals(HopUse.Boil, HopUse.fromDescription("Boil"));
        assertEquals(HopUse.DryHop,  HopUse.fromDescription("Dry Hop"));
        assertEquals(HopUse.Mash,  HopUse.fromDescription("Mash"));
        assertEquals(HopUse.FirstWort,  HopUse.fromDescription("First Wort"));
        assertEquals(HopUse.Aroma,  HopUse.fromDescription("Aroma"));
        assertEquals(null,  HopUse.fromDescription("unknown"));
    }
}
