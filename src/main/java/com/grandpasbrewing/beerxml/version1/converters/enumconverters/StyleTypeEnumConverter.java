package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.StyleType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class StyleTypeEnumConverter implements IEnumConverter<StyleType, com.grandpasbrewing.objectmodel.enums.StyleType> {
    public com.grandpasbrewing.objectmodel.enums.StyleType toObjectModel(StyleType enumValue) {
        switch (enumValue)
        {
            case Lager:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Lager;
            case Ale:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Ale;
            case Mead:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Mead;
            case Wheat:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Wheat;
            case Mixed:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Mixed;
            case Cider:
                return com.grandpasbrewing.objectmodel.enums.StyleType.Cider;
            default:
                throw new IllegalArgumentException();
        }
    }

    public StyleType fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType enumValue) {
        return null;
    }
}
