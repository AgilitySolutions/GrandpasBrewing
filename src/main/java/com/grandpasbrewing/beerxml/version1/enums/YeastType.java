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

    public static YeastType fromDescription(String description) {
        for (YeastType yeastType : YeastType.values()) {
            if (yeastType.getDescription().equals(description)) {
                return yeastType;
            }
        }

        return null;
    }
}

