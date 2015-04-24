package com.grandpasbrewing.beerxml.version1.enums;

public enum StyleType {
    Lager,
    Ale,
    Mead,
    Wheat,
    Mixed,
    Cider;

    public String getDescription() { return toString(); }

    public static StyleType fromDescription(String description) {
        for (StyleType styleType : StyleType.values()) {
            if (styleType.getDescription().equals(description)) {
                return styleType;
            }
        }

        return null;
    }
}

