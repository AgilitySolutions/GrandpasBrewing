package com.grandpasbrewing.beerxml.version1.enums;

public enum YeastFlocculation {
    Low("Low"),
    Medium("Medium"),
    High("High"),
    VeryHigh("Very High");

    YeastFlocculation(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() { return _description; }

    public static YeastFlocculation fromDescription(String description) {
        for (YeastFlocculation yeastFlocculation : YeastFlocculation.values()) {
            if (yeastFlocculation.getDescription().equals(description)) {
                return yeastFlocculation;
            }
        }

        return null;
    }
}

