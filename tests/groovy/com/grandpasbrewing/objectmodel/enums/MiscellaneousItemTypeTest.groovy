package com.grandpasbrewing.objectmodel.enums

class MiscellaneousItemTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Spice", MiscellaneousItemType.Spice.getDescription());
        assertEquals("Fining", MiscellaneousItemType.Fining.getDescription());
        assertEquals("Water Agent", MiscellaneousItemType.WaterAgent.getDescription());
        assertEquals("Herb", MiscellaneousItemType.Herb.getDescription());
        assertEquals("Flavor", MiscellaneousItemType.Flavor.getDescription());
        assertEquals("Other", MiscellaneousItemType.Other.getDescription());
    }
}
