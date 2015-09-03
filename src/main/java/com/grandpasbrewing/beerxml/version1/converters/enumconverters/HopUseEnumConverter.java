package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopUse;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopUseEnumConverter implements IEnumConverter<HopUse, com.grandpasbrewing.objectmodel.enums.HopUse> {
    public com.grandpasbrewing.objectmodel.enums.HopUse toObjectModel(HopUse enumValue) {
        if (enumValue == HopUse.Boil) {
            return com.grandpasbrewing.objectmodel.enums.HopUse.Boil;
        } else if (enumValue == HopUse.DryHop) {
            return com.grandpasbrewing.objectmodel.enums.HopUse.DryHop;
        } else if (enumValue == HopUse.Mash) {
            return com.grandpasbrewing.objectmodel.enums.HopUse.Mash;
        } else if (enumValue == HopUse.FirstWort) {
            return com.grandpasbrewing.objectmodel.enums.HopUse.FirstWort;
        } else if (enumValue == HopUse.Aroma) {
            return com.grandpasbrewing.objectmodel.enums.HopUse.Aroma;
        } else {
            return null;
        }
    }

    public HopUse fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopUse enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.HopUse.Boil) {
            return HopUse.Boil;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopUse.DryHop) {
            return HopUse.DryHop;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopUse.Mash) {
            return HopUse.Mash;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopUse.FirstWort) {
            return HopUse.FirstWort;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopUse.Aroma) {
            return HopUse.Aroma;
        } else {
            return null;
        }
    }
}
