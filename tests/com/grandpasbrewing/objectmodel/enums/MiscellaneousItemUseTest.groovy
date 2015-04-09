package com.grandpasbrewing.objectmodel.enums

class MiscellaneousItemUseTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Boil", MiscellaneousItemUse.Boil.getDescription());
        assertEquals("Mash", MiscellaneousItemUse.Mash.getDescription());
        assertEquals("Primary", MiscellaneousItemUse.Primary.getDescription());
        assertEquals("Secondary", MiscellaneousItemUse.Secondary.getDescription());
        assertEquals("Bottle", MiscellaneousItemUse.Bottle.getDescription());
    }
}
