package com.grandpasbrewing.beerxml.version1.enums

class HopFormTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Pellet", HopForm.Pellet.getDescription());
        assertEquals("Plug", HopForm.Plug.getDescription());
        assertEquals("Leaf", HopForm.Leaf.getDescription());
    }

    void testFromDescription() {
        assertEquals(HopForm.Pellet, HopForm.fromDescription("Pellet"));
        assertEquals(HopForm.Plug,  HopForm.fromDescription("Plug"));
        assertEquals(HopForm.Leaf,  HopForm.fromDescription("Leaf"));
        assertEquals(null,  HopForm.fromDescription("unknown"));
    }
}

