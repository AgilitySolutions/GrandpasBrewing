package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

import static com.grandpasbrewing.objectmodel.enums.FermentableType.*;

public class FermentableTypeEnumConverter implements IEnumConverter<FermentableType, com.grandpasbrewing.objectmodel.enums.FermentableType> {
     public com.grandpasbrewing.objectmodel.enums.FermentableType toObjectModel(FermentableType enumValue) {
         switch (enumValue)
         {
             case Grain:
                 return Grain;
             case Sugar:
                 return Sugar;
             case Extract:
                 return Extract;
             case DryExtract:
                 return DryExtract;
             case Adjunct:
                 return Adjunct;
             default:
                 throw new IllegalArgumentException();
         }
    }

    public FermentableType fromObjectModel(com.grandpasbrewing.objectmodel.enums.FermentableType enumValue) {
        switch (enumValue) {
            case Grain:
                return FermentableType.Grain;
            case Sugar:
                return FermentableType.Sugar;
            case Extract:
                return FermentableType.Extract;
            case DryExtract:
                return FermentableType.DryExtract;
            case Adjunct:
                return FermentableType.Adjunct;
            default:
                throw new IllegalArgumentException();
        }
    }
}
