package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.HopType

class HopTypeAdapterTest extends GroovyTestCase {
    private HopTypeAdapter _hopTypeAdapter;

    void setUp() {
        super.setUp()

        _hopTypeAdapter = new HopTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(HopType.Bittering, _hopTypeAdapter.unmarshal("Bittering"));
        assertEquals(HopType.Aroma, _hopTypeAdapter.unmarshal("Aroma"));
        assertEquals(HopType.Both, _hopTypeAdapter.unmarshal("Both"));
        assertEquals(null, _hopTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _hopTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Bittering", _hopTypeAdapter.marshal(HopType.Bittering));
        assertEquals("Aroma", _hopTypeAdapter.marshal(HopType.Aroma));
        assertEquals("Both", _hopTypeAdapter.marshal(HopType.Both));
        assertEquals(null, _hopTypeAdapter.marshal(null));
    }
}
