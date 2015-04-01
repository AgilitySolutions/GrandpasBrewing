package com.grandpasbrewing.beerxml.version1.enums;

public enum FermentableType {
    Grain("Grain"),
    Sugar("Sugar"),
    Extract("Extract"),
    DryExtract("Dry Extract"),
    Adjunct("Adjunct");

    FermentableType(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() {
        return _description;
    }
}

