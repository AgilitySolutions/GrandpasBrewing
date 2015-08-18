package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;

public class Supplier extends ObjectModelBase {
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String username) {
        _username = username;
    }

    public Address getMailingAddress() {
        return _mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        _mailingAddress = mailingAddress;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getFax() {
        return _fax;
    }

    public void setFax(String fax) {
        _fax = fax;
    }

    public String getContact() {
        return _contact;
    }

    public void setContact(String contact) {
        _contact = contact;
    }

    public String getCustomerNumber() {
        return _customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        _customerNumber = customerNumber;
    }

    private String _name;
    private String _url;
    private String _username;
    private Address _mailingAddress;
    private String _email;
    private String _phone;
    private String _fax;
    private String _contact;
    private String _customerNumber;
}
