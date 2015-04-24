package com.grandpasbrewing.beerxml.version1.enums;

public enum YeastForm {
    Liquid,
    Dry,
    Slant,
    Culture;

    public String getDescription() {
        return toString();
    }

    public static YeastForm fromDescription(String description) {
        for (YeastForm yeastForm : YeastForm.values()) {
            if (yeastForm.getDescription().equals(description)) {
                return yeastForm;
            }
        }

        return null;
    }
}

