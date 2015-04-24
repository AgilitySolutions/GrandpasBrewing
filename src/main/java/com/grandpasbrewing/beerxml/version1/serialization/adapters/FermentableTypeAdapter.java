package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FermentableTypeAdapter extends XmlAdapter<String, FermentableType> {
    @Override
    public FermentableType unmarshal(String v) throws Exception {
        return FermentableType.fromDescription(v);
    }

    @Override
    public String marshal(FermentableType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}