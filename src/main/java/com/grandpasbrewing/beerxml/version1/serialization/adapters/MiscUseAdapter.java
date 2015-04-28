package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.MiscUse;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MiscUseAdapter extends XmlAdapter<String, MiscUse> {
    @Override
    public MiscUse unmarshal(String v) throws Exception {
        return MiscUse.fromDescription(v);
    }

    @Override
    public String marshal(MiscUse v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}
