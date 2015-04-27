package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YeastFlocculationAdapter extends XmlAdapter<String, YeastFlocculation> {
    @Override
    public YeastFlocculation unmarshal(String v) throws Exception {
        return YeastFlocculation.fromDescription(v);
    }

    @Override
    public String marshal(YeastFlocculation v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}