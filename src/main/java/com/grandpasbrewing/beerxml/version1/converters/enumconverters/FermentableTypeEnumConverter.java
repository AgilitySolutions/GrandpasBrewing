package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

import static com.grandpasbrewing.objectmodel.enums.FermentableType.*;

public class FermentableTypeEnumConverter implements EnumConverter<FermentableType, com.grandpasbrewing.objectmodel.enums.FermentableType> {
     public com.grandpasbrewing.objectmodel.enums.FermentableType toObjectModel(FermentableType enumValue) {
         if (enumValue == FermentableType.Grain) {
             return Grain;
         } else if (enumValue == FermentableType.Sugar) {
             return Sugar;
         } else if (enumValue == FermentableType.Extract) {
             return Extract;
         } else if (enumValue == FermentableType.DryExtract) {
             return DryExtract;
         } else if (enumValue == FermentableType.Adjunct) {
             return Adjunct;
         } else {
             return null;
         }
    }

    public FermentableType fromObjectModel(com.grandpasbrewing.objectmodel.enums.FermentableType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.FermentableType.Grain) {
            return FermentableType.Grain;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.FermentableType.Sugar) {
            return FermentableType.Sugar;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.FermentableType.Extract) {
            return FermentableType.Extract;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract) {
            return FermentableType.DryExtract;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct) {
            return FermentableType.Adjunct;
        }

        return null;
    }
}
