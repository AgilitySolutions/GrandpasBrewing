package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.BeerXmlSerialization;

import javax.xml.bind.annotation.XmlElement;

public abstract class BeerXmlObjectBase implements BeerXmlSerialization {

    public String getName() {
        return _name;
    }

    @XmlElement(name = "NAME")
    public void setName(String _name) {
        this._name = _name;
    }

    public Integer getVersion() {
        return _version;
    }

    @XmlElement(name = "VERSION")
    public void setVersion(Integer _version) {
        this._version = _version;
    }

    private String _name;
    private Integer _version;
}
