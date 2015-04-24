package com.grandpasbrewing.beerxml.version1.enums;

public enum HopType {
    Bittering,
    Aroma,
    Both;

    public String getDescription() {
        return toString();
    }

    public static HopType fromDescription(String description) {
        for (HopType hopType : HopType.values()) {
            if (hopType.getDescription().equals(description)) {
                return hopType;
            }
        }

        return null;
    }
}

