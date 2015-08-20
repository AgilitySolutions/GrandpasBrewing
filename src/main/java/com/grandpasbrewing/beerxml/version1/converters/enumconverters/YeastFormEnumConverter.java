package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastForm;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class YeastFormEnumConverter implements IEnumConverter<YeastForm, com.grandpasbrewing.objectmodel.enums.YeastForm> {
    public com.grandpasbrewing.objectmodel.enums.YeastForm toObjectModel(YeastForm enumValue) {
        switch (enumValue)
        {
            case Liquid:
                return com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid;
            case Dry:
                return com.grandpasbrewing.objectmodel.enums.YeastForm.Dry;
            case Slant:
                return com.grandpasbrewing.objectmodel.enums.YeastForm.Slant;
            case Culture:
                return com.grandpasbrewing.objectmodel.enums.YeastForm.Culture;
            default:
                throw new IllegalArgumentException();
        }
    }

    public YeastForm fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm enumValue) {
        return null;
    }
}
