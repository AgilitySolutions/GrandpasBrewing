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

    public static MiscUse fromDescription(String description) {
        for (MiscUse miscUse : MiscUse.values()) {
            if (miscUse.getDescription().equals(description)) {
                return miscUse;
            }
        }

        return null;
    }
}

