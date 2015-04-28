package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.HopType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class HopTypeAdapter extends XmlAdapter<String, HopType> {
    @Override
    public HopType unmarshal(String v) throws Exception {
        return HopType.fromDescription(v);
    }

    @Override
    public String marshal(HopType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}
