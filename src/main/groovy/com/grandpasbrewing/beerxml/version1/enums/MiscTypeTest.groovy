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

    void testFromDescription() {
        assertEquals(MiscType.Spice, MiscType.fromDescription("Spice"));
        assertEquals(MiscType.Fining,  MiscType.fromDescription("Fining"));
        assertEquals(MiscType.WaterAgent,  MiscType.fromDescription("Water Agent"));
        assertEquals(MiscType.Herb,  MiscType.fromDescription("Herb"));
        assertEquals(MiscType.Flavor,  MiscType.fromDescription("Flavor"));
        assertEquals(MiscType.Other,  MiscType.fromDescription("Other"));
        assertEquals(null,  MiscType.fromDescription("unknown"));
    }
}
