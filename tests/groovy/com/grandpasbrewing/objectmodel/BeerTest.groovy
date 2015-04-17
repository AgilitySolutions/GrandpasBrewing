package com.grandpasbrewing.objectmodel

class BeerTest extends GroovyTestCase {
    private Beer _beer;

    void setUp() {
        super.setUp()

        _beer = new Beer();
    }

    void testSetGetBrewer() {
        Brewer brewer = new Brewer();
        brewer.setName("Test Brewer");

        _beer.setBrewer(brewer);
        assertEquals("Test Brewer", _beer.getBrewer().getName());
    }

    void testSetGetName() {
        _beer.setName("Test Name");
        assertEquals("Test Name", _beer.getName());
    }

    void testSetGetId() {
        _beer.setId(1);
        assertEquals(1, _beer.getId());
    }
}
