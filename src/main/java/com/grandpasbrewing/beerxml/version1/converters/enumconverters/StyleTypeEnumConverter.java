package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.StyleType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class StyleTypeEnumConverter implements IEnumConverter<StyleType, com.grandpasbrewing.objectmodel.enums.StyleType> {
    public com.grandpasbrewing.objectmodel.enums.StyleType toObjectModel(StyleType enumValue) {
        if (enumValue == StyleType.Lager) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Lager;
        } else if (enumValue == StyleType.Ale) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Ale;
        } else if (enumValue == StyleType.Mead) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Mead;
        } else if (enumValue == StyleType.Wheat) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Wheat;
        } else if (enumValue == StyleType.Mixed) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Mixed;
        } else if (enumValue == StyleType.Cider) {
            return com.grandpasbrewing.objectmodel.enums.StyleType.Cider;
        } else {
            return null;
        }
    }

    public StyleType fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Lager) {
            return StyleType.Lager;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Ale) {
            return StyleType.Ale;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Mead) {
            return StyleType.Mead;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Wheat) {
            return StyleType.Wheat;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Mixed) {
            return StyleType.Mixed;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.StyleType.Cider) {
            return StyleType.Cider;
        } else {
            return null;
        }
    }
}
