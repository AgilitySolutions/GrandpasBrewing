package com.grandpasbrewing.beerxml.enums;

public enum StyleType {
    Lager,
    Ale,
    Mead,
    Wheat,
    Mixed,
    Cider;

    public String getDescription() { return toString(); }
}
