package com.grandpasbrewing.beerxml.version1.enums;

public enum RecipeType {
    Extract("Extract"),
    PartialMash("Partial Mash"),
    AllGrain("All Grain");

    RecipeType(String description)
    {
        _description = description;
    }

    private final String _description;

    public String getDescription() {
        return _description;
    }

    public static RecipeType fromDescription(String description) {
        for (RecipeType recipeType : RecipeType.values()) {
            if (recipeType.getDescription().equals(description)) {
                return recipeType;
            }
        }

        return null;
    }
}

