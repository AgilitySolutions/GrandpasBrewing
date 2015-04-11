package com.grandpasbrewing.beerxml.version1.enums;

public enum MashStepType {
    Infusion,
    Temperature,
    Decoction;

    public String getDescription() {
        return toString();
    }
}

