package com.grandpasbrewing.objectmodel.enums

class YeastTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Ale", YeastType.Ale.getDescription());
        assertEquals("Lager", YeastType.Lager.getDescription());
        assertEquals("Wheat", YeastType.Wheat.getDescription());
        assertEquals("Wine", YeastType.Wine.getDescription());
        assertEquals("Champagne", YeastType.Champagne.getDescription());
    }
}
