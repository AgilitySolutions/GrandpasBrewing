package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.HopUse

class HopUseAdapterTest extends GroovyTestCase {
    private HopUseAdapter _hopUseAdapter;

    void setUp() {
        super.setUp()

        _hopUseAdapter = new HopUseAdapter();
    }

    void testUnmarshal() {
        assertEquals(HopUse.Boil, _hopUseAdapter.unmarshal("Boil"));
        assertEquals(HopUse.DryHop, _hopUseAdapter.unmarshal("Dry Hop"));
        assertEquals(HopUse.Mash, _hopUseAdapter.unmarshal("Mash"));
        assertEquals(HopUse.FirstWort, _hopUseAdapter.unmarshal("First Wort"));
        assertEquals(HopUse.Aroma, _hopUseAdapter.unmarshal("Aroma"));
        assertEquals(null, _hopUseAdapter.unmarshal("unknown"));
        assertEquals(null, _hopUseAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Boil", _hopUseAdapter.marshal(HopUse.Boil));
        assertEquals("Dry Hop", _hopUseAdapter.marshal(HopUse.DryHop));
        assertEquals("Mash", _hopUseAdapter.marshal(HopUse.Mash));
        assertEquals("First Wort", _hopUseAdapter.marshal(HopUse.FirstWort));
        assertEquals("Aroma", _hopUseAdapter.marshal(HopUse.Aroma));
        assertEquals(null, _hopUseAdapter.marshal(null));
    }
}
