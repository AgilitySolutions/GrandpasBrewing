package com.grandpasbrewing.objectmodel.enums;

public enum HopUse {
    Boil("Boil"),
    DryHop("Dry Hop"),
    Mash("Mash"),
    FirstWort("First Wort"),
    Aroma("Aroma");

    private final String _description;

    HopUse(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
