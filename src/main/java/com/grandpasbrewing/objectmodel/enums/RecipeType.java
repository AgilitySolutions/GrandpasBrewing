package com.grandpasbrewing.objectmodel.enums;

public enum RecipeType {
    Extract("Extract"),
    PartialMash("Partial Mash"),
    AllGrain("All Grain");

    private final String _description;

    RecipeType(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
