package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MiscType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType;

public class MiscellaneousItemTypeEnumConverter implements EnumConverter<MiscType, MiscellaneousItemType> {
    public MiscellaneousItemType toObjectModel(MiscType enumValue) {
        if (enumValue == MiscType.Spice) {
            return MiscellaneousItemType.Spice;
        } else if (enumValue == MiscType.Fining) {
            return MiscellaneousItemType.Fining;
        } else if (enumValue == MiscType.WaterAgent) {
            return MiscellaneousItemType.WaterAgent;
        } else if (enumValue == MiscType.Herb) {
            return MiscellaneousItemType.Herb;
        } else if (enumValue == MiscType.Flavor) {
            return MiscellaneousItemType.Flavor;
        } else if (enumValue == MiscType.Other) {
            return MiscellaneousItemType.Other;
        } else {
            return null;
        }
    }

    public MiscType fromObjectModel(MiscellaneousItemType enumValue) {
        if (enumValue == MiscellaneousItemType.Spice) {
            return MiscType.Spice;
        } else if (enumValue == MiscellaneousItemType.Fining) {
            return MiscType.Fining;
        } else if (enumValue == MiscellaneousItemType.WaterAgent) {
            return MiscType.WaterAgent;
        } else if (enumValue == MiscellaneousItemType.Herb) {
            return MiscType.Herb;
        } else if (enumValue == MiscellaneousItemType.Flavor) {
            return MiscType.Flavor;
        } else if (enumValue == MiscellaneousItemType.Other) {
            return MiscType.Other;
        } else {
            return null;
        }
    }
}
