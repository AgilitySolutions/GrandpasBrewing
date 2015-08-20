package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopUse;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopUseEnumConverter implements IEnumConverter<HopUse, com.grandpasbrewing.objectmodel.enums.HopUse> {
    public com.grandpasbrewing.objectmodel.enums.HopUse toObjectModel(HopUse enumValue) {
        switch (enumValue)
        {
            case Boil:
                return com.grandpasbrewing.objectmodel.enums.HopUse.Boil;
            case DryHop:
                return com.grandpasbrewing.objectmodel.enums.HopUse.DryHop;
            case Mash:
                return com.grandpasbrewing.objectmodel.enums.HopUse.Mash;
            case FirstWort:
                return com.grandpasbrewing.objectmodel.enums.HopUse.FirstWort;
            case Aroma:
                return com.grandpasbrewing.objectmodel.enums.HopUse.Aroma;
            default:
                throw new IllegalArgumentException();
        }
    }

    public HopUse fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopUse enumValue) {
        switch (enumValue)
        {
            case Boil:
                return HopUse.Boil;
            case DryHop:
                return HopUse.DryHop;
            case Mash:
                return HopUse.Mash;
            case FirstWort:
                return HopUse.FirstWort;
            case Aroma:
                return HopUse.Aroma;
            default:
                throw new IllegalArgumentException();
        }
    }
}
