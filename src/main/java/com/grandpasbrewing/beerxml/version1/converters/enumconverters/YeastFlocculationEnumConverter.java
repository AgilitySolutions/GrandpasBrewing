package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

public class YeastFlocculationEnumConverter implements EnumConverter<YeastFlocculation, com.grandpasbrewing.objectmodel.enums.YeastFlocculation> {
    public com.grandpasbrewing.objectmodel.enums.YeastFlocculation toObjectModel(YeastFlocculation enumValue) {
        if (enumValue == YeastFlocculation.Low) {
            return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low;
        } else if (enumValue == YeastFlocculation.Medium) {
            return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium;
        } else if (enumValue == YeastFlocculation.High) {
            return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.High;
        } else if (enumValue == YeastFlocculation.VeryHigh) {
            return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.VeryHigh;
        } else {
            return null;
        }
    }

    public YeastFlocculation fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low) {
            return YeastFlocculation.Low;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium) {
            return YeastFlocculation.Medium;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastFlocculation.High) {
            return YeastFlocculation.High;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastFlocculation.VeryHigh) {
            return YeastFlocculation.VeryHigh;
        } else {
            return null;
        }
    }
}
