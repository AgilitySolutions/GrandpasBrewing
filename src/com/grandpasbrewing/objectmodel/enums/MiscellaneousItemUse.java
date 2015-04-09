package com.grandpasbrewing.objectmodel.enums;

public enum MiscellaneousItemUse {
    Boil,
    Mash,
    Primary,
    Secondary,
    Bottle;

    public String getDescription() { return toString(); }
}
