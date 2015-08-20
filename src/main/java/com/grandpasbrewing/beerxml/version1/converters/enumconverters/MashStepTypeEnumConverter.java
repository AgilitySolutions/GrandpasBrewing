package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MashStepType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class MashStepTypeEnumConverter implements IEnumConverter<MashStepType, com.grandpasbrewing.objectmodel.enums.MashStepType> {
    public com.grandpasbrewing.objectmodel.enums.MashStepType toObjectModel(MashStepType enumValue) {
        switch (enumValue)
        {
            case Infusion:
                return com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion;
            case Temperature:
                return com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature;
            case Decoction:
                return com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction;
            default:
                throw new IllegalArgumentException();
        }
    }

    public MashStepType fromObjectModel(com.grandpasbrewing.objectmodel.enums.MashStepType enumValue) {
        switch (enumValue)
        {
            case Infusion:
                return MashStepType.Infusion;
            case Temperature:
                return MashStepType.Temperature;
            case Decoction:
                return MashStepType.Decoction;
            default:
                throw new IllegalArgumentException();
        }    }
}
