package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class YeastTypeEnumConverter implements IEnumConverter<YeastType, com.grandpasbrewing.objectmodel.enums.YeastType> {
    public com.grandpasbrewing.objectmodel.enums.YeastType toObjectModel(YeastType enumValue) {
        switch (enumValue)
        {
            case Ale:
                return com.grandpasbrewing.objectmodel.enums.YeastType.Ale;
            case Lager:
                return com.grandpasbrewing.objectmodel.enums.YeastType.Lager;
            case Wheat:
                return com.grandpasbrewing.objectmodel.enums.YeastType.Wheat;
            case Wine:
                return com.grandpasbrewing.objectmodel.enums.YeastType.Wine;
            case Champagne:
                return com.grandpasbrewing.objectmodel.enums.YeastType.Champagne;
            default:
                throw new IllegalArgumentException();
        }
    }
}
