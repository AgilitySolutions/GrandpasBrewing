package com.grandpasbrewing.beerxml.version1.enums;

public enum YeastType {
    Ale,
    Lager,
    Wheat,
    Wine,
    Champagne;

    public String getDescription() {
        return toString();
    }
}

