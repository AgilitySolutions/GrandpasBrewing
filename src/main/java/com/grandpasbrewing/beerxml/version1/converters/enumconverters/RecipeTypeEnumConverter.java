package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.RecipeType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class RecipeTypeEnumConverter implements IEnumConverter<RecipeType, com.grandpasbrewing.objectmodel.enums.RecipeType> {
    public com.grandpasbrewing.objectmodel.enums.RecipeType toObjectModel(RecipeType enumValue) {
        switch (enumValue)
        {
            case Extract:
                return com.grandpasbrewing.objectmodel.enums.RecipeType.Extract;
            case PartialMash:
                return com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash;
            case AllGrain:
                return com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain;
            default:
                throw new IllegalArgumentException();
        }
    }

    public RecipeType fromObjectModel(com.grandpasbrewing.objectmodel.enums.RecipeType enumValue) {
        return null;
    }
}
