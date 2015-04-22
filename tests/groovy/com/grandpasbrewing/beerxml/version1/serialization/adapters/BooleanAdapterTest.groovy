package com.grandpasbrewing.beerxml.version1.serialization.adapters

class BooleanAdapterTest extends GroovyTestCase {
    private BooleanAdapter _booleanAdapter;

    void setUp() {
        super.setUp()

        _booleanAdapter = new BooleanAdapter();
    }

    void testUnmarshal() {
        assertEquals(true, _booleanAdapter.unmarshal("true"));
        assertEquals(true, _booleanAdapter.unmarshal("True"));
        assertEquals(true, _booleanAdapter.unmarshal("TRUE"));
        assertEquals(false, _booleanAdapter.unmarshal("false"));
        assertEquals(false, _booleanAdapter.unmarshal("False"));
        assertEquals(false, _booleanAdapter.unmarshal("FALSE"));
        assertEquals(false, _booleanAdapter.unmarshal("invalid"));
        assertEquals(false, _booleanAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("true", _booleanAdapter.marshal(true));
        assertEquals("false", _booleanAdapter.marshal(false));
        assertEquals("false", _booleanAdapter.marshal(null));
    }
}
