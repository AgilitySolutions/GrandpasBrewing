package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.MashStepType

class MashStepTypeAdapterTest extends GroovyTestCase {
    private MashStepTypeAdapter _mashStepTypeAdapter;

    void setUp() {
        super.setUp()

        _mashStepTypeAdapter = new MashStepTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(MashStepType.Infusion, _mashStepTypeAdapter.unmarshal("Infusion"));
        assertEquals(MashStepType.Temperature, _mashStepTypeAdapter.unmarshal("Temperature"));
        assertEquals(MashStepType.Decoction, _mashStepTypeAdapter.unmarshal("Decoction"));
        assertEquals(null, _mashStepTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _mashStepTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Infusion", _mashStepTypeAdapter.marshal(MashStepType.Infusion));
        assertEquals("Temperature", _mashStepTypeAdapter.marshal(MashStepType.Temperature));
        assertEquals("Decoction", _mashStepTypeAdapter.marshal(MashStepType.Decoction));
        assertEquals(null, _mashStepTypeAdapter.marshal(null));
    }
}
