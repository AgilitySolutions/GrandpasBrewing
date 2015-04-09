package com.grandpasbrewing.objectmodel.enums;

public enum StyleType {
    Lager,
    Ale,
    Mead,
    Wheat,
    Mixed,
    Cider;

    public String getDescription() {
        return toString();
    }
}
