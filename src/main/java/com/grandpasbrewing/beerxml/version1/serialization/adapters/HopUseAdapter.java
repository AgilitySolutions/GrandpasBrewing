package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.HopUse;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class HopUseAdapter extends XmlAdapter<String, HopUse> {
    @Override
    public HopUse unmarshal(String v) throws Exception {
        return HopUse.fromDescription(v);
    }

    @Override
    public String marshal(HopUse v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}
