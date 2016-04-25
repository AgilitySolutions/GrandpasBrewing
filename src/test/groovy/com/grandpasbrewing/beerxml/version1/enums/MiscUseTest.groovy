package com.grandpasbrewing.beerxml.version1.enums

class MiscUseTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Boil", MiscUse.Boil.getDescription());
        assertEquals("Mash", MiscUse.Mash.getDescription());
        assertEquals("Primary", MiscUse.Primary.getDescription());
        assertEquals("Secondary", MiscUse.Secondary.getDescription());
        assertEquals("Bottle", MiscUse.Bottle.getDescription());
    }

    void testFromDescription() {
        assertEquals(MiscUse.Boil, MiscUse.fromDescription("Boil"));
        assertEquals(MiscUse.Mash,  MiscUse.fromDescription("Mash"));
        assertEquals(MiscUse.Primary,  MiscUse.fromDescription("Primary"));
        assertEquals(MiscUse.Secondary,  MiscUse.fromDescription("Secondary"));
        assertEquals(MiscUse.Bottle,  MiscUse.fromDescription("Bottle"));
        assertEquals(null,  MiscUse.fromDescription("unknown"));
    }
}

