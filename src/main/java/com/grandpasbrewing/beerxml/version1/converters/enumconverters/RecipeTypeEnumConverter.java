package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.RecipeType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

public class RecipeTypeEnumConverter implements EnumConverter<RecipeType, com.grandpasbrewing.objectmodel.enums.RecipeType> {
    public com.grandpasbrewing.objectmodel.enums.RecipeType toObjectModel(RecipeType enumValue) {
        if (enumValue == RecipeType.Extract) {
            return com.grandpasbrewing.objectmodel.enums.RecipeType.Extract;
        } else if (enumValue == RecipeType.PartialMash) {
            return com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash;
        } else if (enumValue == RecipeType.AllGrain) {
            return com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain;
        } else {
            return null;
        }
    }

    public RecipeType fromObjectModel(com.grandpasbrewing.objectmodel.enums.RecipeType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.RecipeType.Extract) {
            return RecipeType.Extract;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash) {
            return RecipeType.PartialMash;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain) {
            return RecipeType.AllGrain;
        } else {
            return null;
        }
    }
}
