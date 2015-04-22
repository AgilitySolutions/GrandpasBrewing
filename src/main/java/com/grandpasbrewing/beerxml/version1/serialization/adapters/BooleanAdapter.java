package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanAdapter extends XmlAdapter<String, Boolean> {

    @Override
    public Boolean unmarshal(String v) throws Exception {
        return v != null && Boolean.parseBoolean(v.toLowerCase());
    }

    @Override
    public String marshal(Boolean v) throws Exception {
        if (v == null)
            return Boolean.FALSE.toString();

        return v.toString();
    }
}
