package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopTypeEnumConverter implements IEnumConverter<HopType, com.grandpasbrewing.objectmodel.enums.HopType> {
    public com.grandpasbrewing.objectmodel.enums.HopType toObjectModel(HopType enumValue) {
        if (enumValue == HopType.Bittering) {
            return com.grandpasbrewing.objectmodel.enums.HopType.Bittering;
        } else if (enumValue == HopType.Aroma) {
            return com.grandpasbrewing.objectmodel.enums.HopType.Aroma;
        } else if (enumValue == HopType.Both) {
            return com.grandpasbrewing.objectmodel.enums.HopType.Both;
        } else {
            return null;
        }
    }

    public HopType fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.HopType.Bittering) {
            return HopType.Bittering;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopType.Aroma) {
            return HopType.Aroma;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopType.Both) {
            return HopType.Both;
        } else {
            return null;
        }
    }
}
