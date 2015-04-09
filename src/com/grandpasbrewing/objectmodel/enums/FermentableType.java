package com.grandpasbrewing.objectmodel.enums;

public enum FermentableType {
    Grain("Grain"),
    Sugar("Sugar"),
    Extract("Extract"),
    DryExtract("Dry Extract"),
    Adjunct("Adjunct");

    private final String _description;

    FermentableType(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
