package com.grandpasbrewing.objectmodel.enums

class ServingTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Bottle", ServingType.Bottle.getDescription());
        assertEquals("On Tap", ServingType.OnTap.getDescription());
        assertEquals("Nitro Tap", ServingType.NitroTap.getDescription());
        assertEquals("Nitro Bottle", ServingType.NitroBottle.getDescription());
        assertEquals("Nitro Can", ServingType.NitroCan.getDescription());
        assertEquals("Can", ServingType.Can.getDescription());
        assertEquals("Cask", ServingType.Cask.getDescription());
        assertEquals("Growler", ServingType.Growler.getDescription());
    }
}
