package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.FermentableType

class FermentableTypeAdapterTest extends GroovyTestCase {
    private FermentableTypeAdapter _fermentableTypeAdapter;

    void setUp() {
        super.setUp()

        _fermentableTypeAdapter = new FermentableTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(FermentableType.Grain, _fermentableTypeAdapter.unmarshal("Grain"));
        assertEquals(FermentableType.Sugar, _fermentableTypeAdapter.unmarshal("Sugar"));
        assertEquals(FermentableType.Extract, _fermentableTypeAdapter.unmarshal("Extract"));
        assertEquals(FermentableType.DryExtract, _fermentableTypeAdapter.unmarshal("Dry Extract"));
        assertEquals(FermentableType.Adjunct, _fermentableTypeAdapter.unmarshal("Adjunct"));
        assertEquals(null, _fermentableTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _fermentableTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Grain", _fermentableTypeAdapter.marshal(FermentableType.Grain));
        assertEquals("Sugar", _fermentableTypeAdapter.marshal(FermentableType.Sugar));
        assertEquals("Extract", _fermentableTypeAdapter.marshal(FermentableType.Extract));
        assertEquals("Dry Extract", _fermentableTypeAdapter.marshal(FermentableType.DryExtract));
        assertEquals("Adjunct", _fermentableTypeAdapter.marshal(FermentableType.Adjunct));
        assertEquals(null, _fermentableTypeAdapter.marshal(null));
    }
}
