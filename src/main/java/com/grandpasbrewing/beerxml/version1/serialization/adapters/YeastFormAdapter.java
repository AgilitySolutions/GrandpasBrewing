package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.YeastForm;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class YeastFormAdapter extends XmlAdapter<String, YeastForm> {
    @Override
    public YeastForm unmarshal(String v) throws Exception {
        return YeastForm.fromDescription(v);
    }

    @Override
    public String marshal(YeastForm v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}