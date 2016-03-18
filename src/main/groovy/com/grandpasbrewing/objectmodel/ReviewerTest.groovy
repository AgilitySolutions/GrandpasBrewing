package com.grandpasbrewing.objectmodel

class ReviewerTest extends GroovyTestCase {
    private Reviewer _reviewer;

    void setUp() {
        super.setUp()

        _reviewer = new Reviewer();
    }

    void testSetGetName() {
        _reviewer.setName("Test Name");
        assertEquals("Test Name", _reviewer.getName());
    }

    void testSetGetId() {
        _reviewer.setId(1);
        assertEquals(1, _reviewer.getId());
    }
}
