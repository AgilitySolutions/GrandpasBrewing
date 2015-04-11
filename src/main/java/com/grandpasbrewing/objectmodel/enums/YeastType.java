package com.grandpasbrewing.objectmodel.enums;

public enum YeastType {
    Ale,
    Lager,
    Wheat,
    Wine,
    Champagne;

    public String getDescription() { return toString(); }
}
