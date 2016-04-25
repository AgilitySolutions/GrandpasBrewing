package com.grandpasbrewing.objectmodel

class BrewerTest extends GroovyTestCase {
    private Brewer _brewer;

    void setUp() {
        super.setUp()

        _brewer = new Brewer();
    }

    void testSetGetName() {
        _brewer.setName("Test Name");
        assertEquals("Test Name", _brewer.getName());
    }

    void testSetGetId() {
        _brewer.setId(1);
        assertEquals(1, _brewer.getId());
    }
}
