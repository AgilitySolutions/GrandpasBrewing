package com.grandpasbrewing.objectmodel.enums;

public enum MashStepType {
    Infusion,
    Temperature,
    Decoction;

    public String getDescription() { return toString(); }
}
