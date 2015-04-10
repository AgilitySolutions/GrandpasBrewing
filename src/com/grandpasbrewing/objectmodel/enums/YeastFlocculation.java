package com.grandpasbrewing.objectmodel.enums;

public enum YeastFlocculation {
    Low("Low"),
    Medium("Medium"),
    High("High"),
    VeryHigh("Very High");

    private final String _description;

    YeastFlocculation(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
