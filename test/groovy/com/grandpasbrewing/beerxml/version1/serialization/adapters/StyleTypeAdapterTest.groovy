package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.StyleType

class StyleTypeAdapterTest extends GroovyTestCase {
    private StyleTypeAdapter _styleTypeAdapter;

    void setUp() {
        super.setUp()

        _styleTypeAdapter = new StyleTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(StyleType.Lager, _styleTypeAdapter.unmarshal("Lager"));
        assertEquals(StyleType.Ale, _styleTypeAdapter.unmarshal("Ale"));
        assertEquals(StyleType.Mead, _styleTypeAdapter.unmarshal("Mead"));
        assertEquals(StyleType.Wheat, _styleTypeAdapter.unmarshal("Wheat"));
        assertEquals(StyleType.Mixed, _styleTypeAdapter.unmarshal("Mixed"));
        assertEquals(StyleType.Cider, _styleTypeAdapter.unmarshal("Cider"));
        assertEquals(null, _styleTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _styleTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Lager", _styleTypeAdapter.marshal(StyleType.Lager));
        assertEquals("Ale", _styleTypeAdapter.marshal(StyleType.Ale));
        assertEquals("Mead", _styleTypeAdapter.marshal(StyleType.Mead));
        assertEquals("Wheat", _styleTypeAdapter.marshal(StyleType.Wheat));
        assertEquals("Mixed", _styleTypeAdapter.marshal(StyleType.Mixed));
        assertEquals("Cider", _styleTypeAdapter.marshal(StyleType.Cider));
        assertEquals(null, _styleTypeAdapter.marshal(null));
    }
}
