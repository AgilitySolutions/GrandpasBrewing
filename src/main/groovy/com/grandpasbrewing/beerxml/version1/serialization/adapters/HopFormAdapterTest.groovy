package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.HopForm

class HopFormAdapterTest extends GroovyTestCase {
    private HopFormAdapter _hopFormAdapter;

    void setUp() {
        super.setUp()

        _hopFormAdapter = new HopFormAdapter();
    }

    void testUnmarshal() {
        assertEquals(HopForm.Pellet, _hopFormAdapter.unmarshal("Pellet"));
        assertEquals(HopForm.Plug, _hopFormAdapter.unmarshal("Plug"));
        assertEquals(HopForm.Leaf, _hopFormAdapter.unmarshal("Leaf"));
        assertEquals(null, _hopFormAdapter.unmarshal("unknown"));
        assertEquals(null, _hopFormAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Pellet", _hopFormAdapter.marshal(HopForm.Pellet));
        assertEquals("Plug", _hopFormAdapter.marshal(HopForm.Plug));
        assertEquals("Leaf", _hopFormAdapter.marshal(HopForm.Leaf));
        assertEquals(null, _hopFormAdapter.marshal(null));
    }
}
