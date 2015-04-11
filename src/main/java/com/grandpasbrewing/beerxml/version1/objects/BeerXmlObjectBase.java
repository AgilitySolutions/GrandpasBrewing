package com.grandpasbrewing.beerxml.version1.objects;

public abstract class BeerXmlObjectBase {

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getVersion() {
        return _version;
    }

    public void setVersion(int _version) {
        this._version = _version;
    }

    private String _name;
    private int _version;
}
