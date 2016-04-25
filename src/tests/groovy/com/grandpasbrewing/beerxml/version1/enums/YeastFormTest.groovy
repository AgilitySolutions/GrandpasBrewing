package com.grandpasbrewing.beerxml.version1.enums

class YeastFormTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Liquid", YeastForm.Liquid.getDescription());
        assertEquals("Dry", YeastForm.Dry.getDescription());
        assertEquals("Slant", YeastForm.Slant.getDescription());
        assertEquals("Culture", YeastForm.Culture.getDescription());
    }

    void testFromDescription() {
        assertEquals(YeastForm.Liquid, YeastForm.fromDescription("Liquid"));
        assertEquals(YeastForm.Dry,  YeastForm.fromDescription("Dry"));
        assertEquals(YeastForm.Slant,  YeastForm.fromDescription("Slant"));
        assertEquals(YeastForm.Culture,  YeastForm.fromDescription("Culture"));
        assertEquals(null,  YeastForm.fromDescription("unknown"));
    }
}
