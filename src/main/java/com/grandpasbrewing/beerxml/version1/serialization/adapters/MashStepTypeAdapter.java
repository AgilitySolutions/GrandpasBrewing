package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.MashStepType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MashStepTypeAdapter extends XmlAdapter<String, MashStepType> {
    @Override
    public MashStepType unmarshal(String v) throws Exception {
        return MashStepType.fromDescription(v);
    }

    @Override
    public String marshal(MashStepType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}