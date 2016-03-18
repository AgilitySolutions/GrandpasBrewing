package com.grandpasbrewing.objectmodel

import com.grandpasbrewing.objectmodel.enums.State

class AddressTest extends GroovyTestCase {
    private Address _address;

    void setUp() {
        super.setUp()

        _address = new Address();
    }

    void testSetGetLine1() {
        _address.setLine1("Test Line 1");
        assertEquals("Test Line 1", _address.getLine1());
    }

    void testSetGetLine2() {
        _address.setLine2("Test Line 2");
        assertEquals("Test Line 2", _address.getLine2());
    }

    void testSetGetCity() {
        _address.setCity("Test City");
        assertEquals("Test City", _address.getCity());
    }

    void testSetGetState() {
        _address.setState(State.Oklahoma);
        assertEquals(State.Oklahoma, _address.getState());
    }

    void testSetGetZipcode() {
        _address.setZipcode("Test Zipcode");
        assertEquals("Test Zipcode", _address.getZipcode());
    }

    void testSetGetLatitude() {
        _address.setLatitude(1.0);
        assertEquals(1.0, _address.getLatitude());
    }

    void testSetGetLongitude() {
        _address.setLongitude(2.0);
        assertEquals(2.0, _address.getLongitude());
    }

    void testSetGetId() {
        _address.setId(3);
        assertEquals(3, _address.getId());
    }
}
