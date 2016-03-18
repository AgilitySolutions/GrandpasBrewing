package com.grandpasbrewing.objectmodel

class SupplierTest extends GroovyTestCase {
    private Supplier _supplier;

    void setUp() {
        super.setUp()

        _supplier = new Supplier();
    }

    void testSetGetName() {
        _supplier.setName("Test Name");
        assertEquals("Test Name", _supplier.getName());
    }

    void testSetGetUrl() {
        _supplier.setUrl("Test Url");
        assertEquals("Test Url", _supplier.getUrl());
    }

    void testSetGetUsername() {
        _supplier.setUsername("Test Username");
        assertEquals("Test Username", _supplier.getUsername());
    }

    void testSetGetMailingAddress() {
        Address address = new Address();
        address.setLine1("Test Line 1");
        address.setLine2("Test Line 2");

        _supplier.setMailingAddress(address);
        assertEquals("Test Line 1", _supplier.getMailingAddress().getLine1());
        assertEquals("Test Line 2", _supplier.getMailingAddress().getLine2());
    }

    void testSetGetEmail() {
        _supplier.setEmail("Test Email");
        assertEquals("Test Email", _supplier.getEmail());
    }

    void testSetGetPhone() {
        _supplier.setPhone("Test Phone");
        assertEquals("Test Phone", _supplier.getPhone());
    }

    void testSetGetFax() {
        _supplier.setFax("Test Fax");
        assertEquals("Test Fax", _supplier.getFax());
    }

    void testSetGetContact() {
        _supplier.setContact("Test Contact");
        assertEquals("Test Contact", _supplier.getContact());
    }

    void testSetGetCustomerNumber() {
        _supplier.setCustomerNumber("Test Customer Number");
        assertEquals("Test Customer Number", _supplier.getCustomerNumber());
    }

    void testSetGetId() {
        _supplier.setId(1);
        assertEquals(1, _supplier.getId());
    }
}
