package com.grandpasbrewing.beerxml.version1.enums

class YeastFormTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Liquid", YeastForm.Liquid.getDescription());
        assertEquals("Dry", YeastForm.Dry.getDescription());
        assertEquals("Slant", YeastForm.Slant.getDescription());
        assertEquals("Culture", YeastForm.Culture.getDescription());
    }
}

