package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.YeastForm

class YeastFormAdapterTest extends GroovyTestCase {
    private YeastFormAdapter _yeastFormAdapter;

    void setUp() {
        super.setUp()

        _yeastFormAdapter = new YeastFormAdapter();
    }

    void testUnmarshal() {
        assertEquals(YeastForm.Liquid, _yeastFormAdapter.unmarshal("Liquid"));
        assertEquals(YeastForm.Dry, _yeastFormAdapter.unmarshal("Dry"));
        assertEquals(YeastForm.Slant, _yeastFormAdapter.unmarshal("Slant"));
        assertEquals(YeastForm.Culture, _yeastFormAdapter.unmarshal("Culture"));
        assertEquals(null, _yeastFormAdapter.unmarshal("unknown"));
        assertEquals(null, _yeastFormAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Liquid", _yeastFormAdapter.marshal(YeastForm.Liquid));
        assertEquals("Dry", _yeastFormAdapter.marshal(YeastForm.Dry));
        assertEquals("Slant", _yeastFormAdapter.marshal(YeastForm.Slant));
        assertEquals("Culture", _yeastFormAdapter.marshal(YeastForm.Culture));
        assertEquals(null, _yeastFormAdapter.marshal(null));
    }
}
