package com.grandpasbrewing.beerxml.version1.enums

class MiscTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Spice", MiscType.Spice.getDescription());
        assertEquals("Fining", MiscType.Fining.getDescription());
        assertEquals("Water Agent", MiscType.WaterAgent.getDescription());
        assertEquals("Herb", MiscType.Herb.getDescription());
        assertEquals("Flavor", MiscType.Flavor.getDescription());
        assertEquals("Other", MiscType.Other.getDescription());
    }
}
