package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.MiscType

class MiscTypeAdapterTest extends GroovyTestCase {
    private MiscTypeAdapter _miscTypeAdapter;

    void setUp() {
        super.setUp()

        _miscTypeAdapter = new MiscTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(MiscType.Spice, _miscTypeAdapter.unmarshal("Spice"));
        assertEquals(MiscType.Fining, _miscTypeAdapter.unmarshal("Fining"));
        assertEquals(MiscType.WaterAgent, _miscTypeAdapter.unmarshal("Water Agent"));
        assertEquals(MiscType.Herb, _miscTypeAdapter.unmarshal("Herb"));
        assertEquals(MiscType.Flavor, _miscTypeAdapter.unmarshal("Flavor"));
        assertEquals(MiscType.Other, _miscTypeAdapter.unmarshal("Other"));
        assertEquals(null, _miscTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _miscTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Spice", _miscTypeAdapter.marshal(MiscType.Spice));
        assertEquals("Fining", _miscTypeAdapter.marshal(MiscType.Fining));
        assertEquals("Water Agent", _miscTypeAdapter.marshal(MiscType.WaterAgent));
        assertEquals("Herb", _miscTypeAdapter.marshal(MiscType.Herb));
        assertEquals("Flavor", _miscTypeAdapter.marshal(MiscType.Flavor));
        assertEquals("Other", _miscTypeAdapter.marshal(MiscType.Other));
        assertEquals(null, _miscTypeAdapter.marshal(null));
    }
}
