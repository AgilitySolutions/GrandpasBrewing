package com.grandpasbrewing.beerxml.enums;

public enum HopType {
    Bittering,
    Aroma,
    Both;

    public String getDescription() {
        return toString();
    }
}
