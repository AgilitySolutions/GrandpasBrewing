package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.YeastForm;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.EnumConverter;

public class YeastFormEnumConverter implements EnumConverter<YeastForm, com.grandpasbrewing.objectmodel.enums.YeastForm> {
    public com.grandpasbrewing.objectmodel.enums.YeastForm toObjectModel(YeastForm enumValue) {
        if (enumValue == YeastForm.Liquid) {
            return com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid;
        } else if (enumValue == YeastForm.Dry) {
            return com.grandpasbrewing.objectmodel.enums.YeastForm.Dry;
        } else if (enumValue == YeastForm.Slant) {
            return com.grandpasbrewing.objectmodel.enums.YeastForm.Slant;
        } else if (enumValue == YeastForm.Culture) {
            return com.grandpasbrewing.objectmodel.enums.YeastForm.Culture;
        } else {
            return null;
        }
    }

    public YeastForm fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid) {
            return YeastForm.Liquid;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastForm.Dry) {
            return YeastForm.Dry;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastForm.Slant) {
            return YeastForm.Slant;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.YeastForm.Culture) {
            return YeastForm.Culture;
        } else {
            return null;
        }
    }
}
