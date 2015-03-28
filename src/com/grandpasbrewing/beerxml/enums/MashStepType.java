package com.grandpasbrewing.beerxml.enums;

public enum MashStepType {
    Infusion,
    Temperature,
    Decoction;

    public String getDescription() {
        return toString();
    }
}
