package com.grandpasbrewing.beerxml.version1.serialization.adapters;

import com.grandpasbrewing.beerxml.version1.enums.RecipeType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class RecipeTypeAdapter extends XmlAdapter<String, RecipeType> {
    @Override
    public RecipeType unmarshal(String v) throws Exception {
        return RecipeType.fromDescription(v);
    }

    @Override
    public String marshal(RecipeType v) throws Exception {
        return v == null ? null : v.getDescription();
    }
}