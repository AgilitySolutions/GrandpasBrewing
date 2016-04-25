package com.grandpasbrewing.beerxml.version1.enums

class StyleTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Lager", StyleType.Lager.getDescription());
        assertEquals("Ale", StyleType.Ale.getDescription());
        assertEquals("Mead", StyleType.Mead.getDescription());
        assertEquals("Wheat", StyleType.Wheat.getDescription());
        assertEquals("Mixed", StyleType.Mixed.getDescription());
        assertEquals("Cider", StyleType.Cider.getDescription());
    }

    void testFromDescription() {
        assertEquals(StyleType.Lager, StyleType.fromDescription("Lager"));
        assertEquals(StyleType.Ale,  StyleType.fromDescription("Ale"));
        assertEquals(StyleType.Mead,  StyleType.fromDescription("Mead"));
        assertEquals(StyleType.Wheat,  StyleType.fromDescription("Wheat"));
        assertEquals(StyleType.Mixed,  StyleType.fromDescription("Mixed"));
        assertEquals(StyleType.Cider,  StyleType.fromDescription("Cider"));
        assertEquals(null,  StyleType.fromDescription("unknown"));
    }
}

