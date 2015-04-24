package com.grandpasbrewing.beerxml.version1.enums;

public enum MashStepType {
    Infusion,
    Temperature,
    Decoction;

    public String getDescription() {
        return toString();
    }

    public static MashStepType fromDescription(String description) {
        for (MashStepType mashStepType : MashStepType.values()) {
            if (mashStepType.getDescription().equals(description)) {
                return mashStepType;
            }
        }

        return null;
    }
}

