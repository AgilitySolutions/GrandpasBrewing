package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.StyleType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StyleTypeAdapter extends XmlAdapter<String, StyleType> {
    @Override
    public StyleType unmarshal(String v) throws Exception {
        return StyleType.fromDescription(v);
    }

    @Override
    public String marshal(StyleType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}
