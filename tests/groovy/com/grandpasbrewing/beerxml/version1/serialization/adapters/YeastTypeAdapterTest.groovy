package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation
import com.grandpasbrewing.beerxml.version1.enums.YeastType

class YeastTypeAdapterTest extends GroovyTestCase {
    private YeastTypeAdapter _yeastTypeAdapter;

    void setUp() {
        super.setUp()

        _yeastTypeAdapter = new YeastTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(YeastType.Ale, _yeastTypeAdapter.unmarshal("Ale"));
        assertEquals(YeastType.Lager, _yeastTypeAdapter.unmarshal("Lager"));
        assertEquals(YeastType.Wheat, _yeastTypeAdapter.unmarshal("Wheat"));
        assertEquals(YeastType.Wine, _yeastTypeAdapter.unmarshal("Wine"));
        assertEquals(YeastType.Champagne, _yeastTypeAdapter.unmarshal("Champagne"));
        assertEquals(null, _yeastTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _yeastTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Ale", _yeastTypeAdapter.marshal(YeastType.Ale));
        assertEquals("Lager", _yeastTypeAdapter.marshal(YeastType.Lager));
        assertEquals("Wheat", _yeastTypeAdapter.marshal(YeastType.Wheat));
        assertEquals("Wine", _yeastTypeAdapter.marshal(YeastType.Wine));
        assertEquals("Champagne", _yeastTypeAdapter.marshal(YeastType.Champagne));
        assertEquals(null, _yeastTypeAdapter.marshal(null));
    }
}
