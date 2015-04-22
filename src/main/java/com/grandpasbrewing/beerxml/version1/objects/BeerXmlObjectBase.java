package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.IBeerXmlSerialization;

import javax.xml.bind.annotation.XmlElement;

public abstract class BeerXmlObjectBase implements IBeerXmlSerialization {

    public String getName() {
        return _name;
    }

    @XmlElement(name = "NAME")
    public void setName(String _name) {
        this._name = _name;
    }

    public int getVersion() {
        return _version;
    }

    @XmlElement(name = "VERSION")
    public void setVersion(int _version) {
        this._version = _version;
    }

    private String _name;
    private int _version;
}
