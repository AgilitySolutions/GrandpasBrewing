package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MiscUse;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse;

public class MiscellaneousItemUseEnumConverter implements IEnumConverter<MiscUse, MiscellaneousItemUse> {
    public MiscellaneousItemUse toObjectModel(MiscUse enumValue) {
        if (enumValue == MiscUse.Boil) {
            return MiscellaneousItemUse.Boil;
        } else if (enumValue == MiscUse.Mash) {
            return MiscellaneousItemUse.Mash;
        } else if (enumValue == MiscUse.Primary) {
            return MiscellaneousItemUse.Primary;
        } else if (enumValue == MiscUse.Secondary) {
            return MiscellaneousItemUse.Secondary;
        } else if (enumValue == MiscUse.Bottle) {
            return MiscellaneousItemUse.Bottle;
        } else {
            return null;
        }
    }

    public MiscUse fromObjectModel(MiscellaneousItemUse enumValue) {
        if (enumValue == MiscellaneousItemUse.Boil) {
            return MiscUse.Boil;
        } else if (enumValue == MiscellaneousItemUse.Mash) {
            return MiscUse.Mash;
        } else if (enumValue == MiscellaneousItemUse.Primary) {
            return MiscUse.Primary;
        } else if (enumValue == MiscellaneousItemUse.Secondary) {
            return MiscUse.Secondary;
        } else if (enumValue == MiscellaneousItemUse.Bottle) {
            return MiscUse.Bottle;
        } else {
            return null;
        }
    }
}
