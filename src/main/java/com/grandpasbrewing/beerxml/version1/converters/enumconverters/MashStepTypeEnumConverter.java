package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.MashStepType;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

public class MashStepTypeEnumConverter implements EnumConverter<MashStepType, com.grandpasbrewing.objectmodel.enums.MashStepType> {
    public com.grandpasbrewing.objectmodel.enums.MashStepType toObjectModel(MashStepType enumValue) {
        if (enumValue == MashStepType.Infusion) {
            return com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion;
        } else if (enumValue == MashStepType.Temperature) {
            return com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature;
        } else if (enumValue == MashStepType.Decoction) {
            return com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction;
        } else {
            return null;
        }
    }

    public MashStepType fromObjectModel(com.grandpasbrewing.objectmodel.enums.MashStepType enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion) {
            return MashStepType.Infusion;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature) {
            return MashStepType.Temperature;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction) {
            return MashStepType.Decoction;
        } else {
            return null;
        }
    }
}
