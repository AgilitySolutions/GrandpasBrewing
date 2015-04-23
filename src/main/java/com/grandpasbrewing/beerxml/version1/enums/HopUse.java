package com.grandpasbrewing.beerxml.version1.enums;

public enum HopUse {
    Boil("Boil"),
    DryHop("Dry Hop"),
    Mash("Mash"),
    FirstWort("First Wort"),
    Aroma("Aroma");

    HopUse(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() {
        return _description;
    }

    public static HopUse fromDescription(String description) {
        for (HopUse hopUse : HopUse.values()) {
            if (hopUse.getDescription().equals(description)) {
                return hopUse;
            }
        }

        return null;
    }
}

