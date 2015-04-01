package com.grandpasbrewing.beerxml.version1.enums;

public enum MiscUse {
    Boil,
    Mash,
    Primary,
    Secondary,
    Bottle;

    public String getDescription() {
        return toString();
    }
}

