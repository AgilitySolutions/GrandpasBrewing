package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MiscUse;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse;

public class MiscellaneousItemUseEnumConverter implements IEnumConverter<MiscUse, MiscellaneousItemUse> {
    public MiscellaneousItemUse toObjectModel(MiscUse enumValue) {
        switch (enumValue)
        {
            case Boil:
                return MiscellaneousItemUse.Boil;
            case Mash:
                return MiscellaneousItemUse.Mash;
            case Primary:
                return MiscellaneousItemUse.Primary;
            case Secondary:
                return MiscellaneousItemUse.Secondary;
            case Bottle:
                return MiscellaneousItemUse.Bottle;
            default:
                throw new IllegalArgumentException();
        }
    }

    public MiscUse fromObjectModel(MiscellaneousItemUse enumValue) {
        switch (enumValue)
        {
            case Boil:
                return MiscUse.Boil;
            case Mash:
                return MiscUse.Mash;
            case Primary:
                return MiscUse.Primary;
            case Secondary:
                return MiscUse.Secondary;
            case Bottle:
                return MiscUse.Bottle;
            default:
                throw new IllegalArgumentException();
        }
    }
}
