package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MiscType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType;

public class MiscellaneousItemTypeEnumConverter implements IEnumConverter<MiscType, MiscellaneousItemType> {
    public MiscellaneousItemType toObjectModel(MiscType enumValue) {
        switch (enumValue)
        {
            case Spice:
                return MiscellaneousItemType.Spice;
            case Fining:
                return MiscellaneousItemType.Fining;
            case WaterAgent:
                return MiscellaneousItemType.WaterAgent;
            case Herb:
                return MiscellaneousItemType.Herb;
            case Flavor:
                return MiscellaneousItemType.Flavor;
            case Other:
                return MiscellaneousItemType.Other;
            default:
                throw new IllegalArgumentException();
        }
    }

    public MiscType fromObjectModel(MiscellaneousItemType enumValue) {
        return null;
    }
}
