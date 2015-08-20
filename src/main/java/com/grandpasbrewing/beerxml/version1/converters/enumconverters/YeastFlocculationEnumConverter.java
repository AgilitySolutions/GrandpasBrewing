package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class YeastFlocculationEnumConverter implements IEnumConverter<YeastFlocculation, com.grandpasbrewing.objectmodel.enums.YeastFlocculation> {
    public com.grandpasbrewing.objectmodel.enums.YeastFlocculation toObjectModel(YeastFlocculation enumValue) {
        switch (enumValue)
        {
            case Low:
                return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low;
            case Medium:
                return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium;
            case High:
                return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.High;
            case VeryHigh:
                return com.grandpasbrewing.objectmodel.enums.YeastFlocculation.VeryHigh;
            default:
                throw new IllegalArgumentException();
        }
    }

    public YeastFlocculation fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation enumValue) {
        switch (enumValue)
        {
            case Low:
                return YeastFlocculation.Low;
            case Medium:
                return YeastFlocculation.Medium;
            case High:
                return YeastFlocculation.High;
            case VeryHigh:
                return YeastFlocculation.VeryHigh;
            default:
                throw new IllegalArgumentException();
        }
    }
}
