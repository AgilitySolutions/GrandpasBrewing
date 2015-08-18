package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.State;

public class Address extends ObjectModelBase {
    public String getLine1() {
        return _line1;
    }

    public void setLine1(String _line1) {
        this._line1 = _line1;
    }

    public String getLine2() {
        return _line2;
    }

    public void setLine2(String _line2) {
        this._line2 = _line2;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String _city) {
        this._city = _city;
    }

    public State getState() {
        return _state;
    }

    public void setState(State _state) {
        this._state = _state;
    }

    public String getZipcode() {
        return _zipcode;
    }

    public void setZipcode(String _zipcode) {
        this._zipcode = _zipcode;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double _latitude) {
        this._latitude = _latitude;
    }

    public double getLongitude() {
        return _longitude;
    }

    public void setLongitude(double _longitude) {
        this._longitude = _longitude;
    }

    private String _line1;
    private String _line2;
    private String _city;
    private State _state;
    private String _zipcode;
    private double _latitude;
    private double _longitude;
}
