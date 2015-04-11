package com.grandpasbrewing.objectmodel.enums;

public enum ServingType {
    NotSet("Select One"),
    Bottle("Bottle"),
    OnTap("On Tap"),
    NitroTap("Nitro Tap"),
    NitroBottle("Nitro Bottle"),
    NitroCan("Nitro Can"),
    Can("Can"),
    Cask("Cask"),
    Growler("Growler");

    private final String _description;

    ServingType(String description) {
        _description = description;
    }

    public String getDescription() { return _description; }
}
