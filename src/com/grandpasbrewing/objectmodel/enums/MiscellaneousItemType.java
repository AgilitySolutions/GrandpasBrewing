package com.grandpasbrewing.objectmodel.enums;

public enum MiscellaneousItemType {
    Spice("Spice"),
    Fining("Fining"),
    WaterAgent("Water Agent"),
    Herb("Herb"),
    Flavor("Flavor"),
    Other("Other");

    private final String _description;

    MiscellaneousItemType(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
