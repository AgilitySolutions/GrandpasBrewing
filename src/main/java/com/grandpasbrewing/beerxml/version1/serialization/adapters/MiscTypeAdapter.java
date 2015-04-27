package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.MiscType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MiscTypeAdapter extends XmlAdapter<String, MiscType> {
    @Override
    public MiscType unmarshal(String v) throws Exception {
        return MiscType.fromDescription(v);
    }

    @Override
    public String marshal(MiscType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}