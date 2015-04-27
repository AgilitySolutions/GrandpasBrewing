package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.HopForm;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class HopFormAdapter extends XmlAdapter<String, HopForm> {
    @Override
    public HopForm unmarshal(String v) throws Exception {
        return HopForm.fromDescription(v);
    }

    @Override
    public String marshal(HopForm v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}
