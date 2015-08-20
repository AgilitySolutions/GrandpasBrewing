package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class FermentableTypeEnumConverter implements IEnumConverter<FermentableType, com.grandpasbrewing.objectmodel.enums.FermentableType> {
     public com.grandpasbrewing.objectmodel.enums.FermentableType toObjectModel(FermentableType enumValue) {
         switch (enumValue)
         {
             case Grain:
                 return com.grandpasbrewing.objectmodel.enums.FermentableType.Grain;
             case Sugar:
                 return com.grandpasbrewing.objectmodel.enums.FermentableType.Sugar;
             case Extract:
                 return com.grandpasbrewing.objectmodel.enums.FermentableType.Extract;
             case DryExtract:
                 return com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract;
             case Adjunct:
                 return com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct;
             default:
                 throw new IllegalArgumentException();
         }
    }

    public FermentableType fromObjectModel(com.grandpasbrewing.objectmodel.enums.FermentableType enumValue) {
        return null;
    }
}
