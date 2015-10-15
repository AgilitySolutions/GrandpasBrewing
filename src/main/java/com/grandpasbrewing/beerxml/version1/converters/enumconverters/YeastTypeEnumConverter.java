package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

public class YeastTypeEnumConverter implements EnumConverter<YeastType, com.grandpasbrewing.objectmodel.enums.YeastType> {
    public com.grandpasbrewing.objectmodel.enums.YeastType toObjectModel(YeastType enumValue) {
        if (enumValue == YeastType.Ale) {
            return com.grandpasbrewing.objectmodel.enums.YeastType.Ale;
        } else if (enumValue == YeastType.Lager) {
            return com.grandpasbrewing.objectmodel.enums.YeastType.Lager;
        } else if (enumValue == YeastType.Wheat) {
            return com.grandpasbrewing.objectmodel.enums.YeastType.Wheat;
        } else if (enumValue == YeastType.Wine) {
            return com.grandpasbrewing.objectmodel.enums.YeastType.Wine;
        } else if (enumValue == YeastType.Champagne) {
            return com.grandpasbrewing.objectmodel.enums.YeastType.Champagne;
        } else {
            return null;
        }
    }

    public YeastType fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastType.Ale) {
            return YeastType.Ale;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastType.Lager) {
            return YeastType.Lager;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastType.Wheat) {
            return YeastType.Wheat;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastType.Wine) {
            return YeastType.Wine;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastType.Champagne) {
            return YeastType.Champagne;
        } else {
            return null;
        }
    }
}
