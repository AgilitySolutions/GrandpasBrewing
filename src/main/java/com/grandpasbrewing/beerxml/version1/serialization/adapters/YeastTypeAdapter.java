package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.YeastType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YeastTypeAdapter extends XmlAdapter<String, YeastType> {
    @Override
    public YeastType unmarshal(String v) throws Exception {
        return YeastType.fromDescription(v);
    }

    @Override
    public String marshal(YeastType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}