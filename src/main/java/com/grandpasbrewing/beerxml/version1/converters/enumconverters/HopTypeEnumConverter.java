package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopTypeEnumConverter implements IEnumConverter<HopType, com.grandpasbrewing.objectmodel.enums.HopType> {
    public com.grandpasbrewing.objectmodel.enums.HopType toObjectModel(HopType enumValue) {
        switch (enumValue)
        {
            case Bittering:
                return com.grandpasbrewing.objectmodel.enums.HopType.Bittering;
            case Aroma:
                return com.grandpasbrewing.objectmodel.enums.HopType.Aroma;
            case Both:
                return com.grandpasbrewing.objectmodel.enums.HopType.Both;
            default:
                throw new IllegalArgumentException();
        }
    }
}
