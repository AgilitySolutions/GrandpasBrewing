package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.MiscUse

class MiscUseAdapterTest extends GroovyTestCase {
    private MiscUseAdapter _miscUseAdapter;

    void setUp() {
        super.setUp()

        _miscUseAdapter = new MiscUseAdapter();
    }

    void testUnmarshal() {
        assertEquals(MiscUse.Boil, _miscUseAdapter.unmarshal("Boil"));
        assertEquals(MiscUse.Mash, _miscUseAdapter.unmarshal("Mash"));
        assertEquals(MiscUse.Primary, _miscUseAdapter.unmarshal("Primary"));
        assertEquals(MiscUse.Secondary, _miscUseAdapter.unmarshal("Secondary"));
        assertEquals(MiscUse.Bottle, _miscUseAdapter.unmarshal("Bottle"));
        assertEquals(null, _miscUseAdapter.unmarshal("unknown"));
        assertEquals(null, _miscUseAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Boil", _miscUseAdapter.marshal(MiscUse.Boil));
        assertEquals("Mash", _miscUseAdapter.marshal(MiscUse.Mash));
        assertEquals("Primary", _miscUseAdapter.marshal(MiscUse.Primary));
        assertEquals("Secondary", _miscUseAdapter.marshal(MiscUse.Secondary));
        assertEquals("Bottle", _miscUseAdapter.marshal(MiscUse.Bottle));
        assertEquals(null, _miscUseAdapter.marshal(null));
    }
}
