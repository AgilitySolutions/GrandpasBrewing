package com.grandpasbrewing.beerxml.version1.enums;

public enum HopForm {
    Pellet,
    Plug,
    Leaf;

    public String getDescription() {
        return toString();
    }

    public static HopForm fromDescription(String description) {
        for (HopForm hopForm : HopForm.values()) {
            if (hopForm.getDescription().equals(description)) {
                return hopForm;
            }
        }

        return null;
    }
}

