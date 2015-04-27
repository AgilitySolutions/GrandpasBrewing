package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation

class YeastFlocculationAdapterTestextends extends GroovyTestCase {
    private  YeastFlocculationAdapter _yeastFlocculationAdapter;

    void setUp() {
        super.setUp()

        _yeastFlocculationAdapter = new YeastFlocculationAdapter();
    };

    void testUnmarshal() {
        assertEquals(YeastFlocculation.Low, _yeastFlocculationAdapter.unmarshal("Low"));
        assertEquals(YeastFlocculation.Medium, _yeastFlocculationAdapter.unmarshal("Medium"));
        assertEquals(YeastFlocculation.High, _yeastFlocculationAdapter.unmarshal("High"));
        assertEquals(YeastFlocculation.VeryHigh, _yeastFlocculationAdapter.unmarshal("Very High"));
        assertEquals(null, _yeastFlocculationAdapter.unmarshal("unknown"));
        assertEquals(null, _yeastFlocculationAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Low", _yeastFlocculationAdapter.marshal(YeastFlocculation.Low));
        assertEquals("Medium", _yeastFlocculationAdapter.marshal(YeastFlocculation.Medium));
        assertEquals("High", _yeastFlocculationAdapter.marshal(YeastFlocculation.High));
        assertEquals("Very High", _yeastFlocculationAdapter.marshal(YeastFlocculation.VeryHigh));
        assertEquals(null, _yeastFlocculationAdapter.marshal(null));
    }
}
