package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopForm;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopFormEnumConverter implements IEnumConverter<HopForm, com.grandpasbrewing.objectmodel.enums.HopForm> {
    public com.grandpasbrewing.objectmodel.enums.HopForm toObjectModel(HopForm enumValue) {
        if (enumValue == HopForm.Pellet) {
            return com.grandpasbrewing.objectmodel.enums.HopForm.Pellet;
        } else if (enumValue == HopForm.Plug) {
            return com.grandpasbrewing.objectmodel.enums.HopForm.Plug;
        } else if (enumValue == HopForm.Leaf) {
            return com.grandpasbrewing.objectmodel.enums.HopForm.Leaf;
        } else {
            return null;
        }
    }

    public HopForm fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopForm enumValue) {
        if (enumValue == com.grandpasbrewing.objectmodel.enums.HopForm.Pellet) {
            return HopForm.Pellet;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopForm.Plug) {
            return HopForm.Plug;
        } else if (enumValue == com.grandpasbrewing.objectmodel.enums.HopForm.Leaf) {
            return HopForm.Leaf;
        } else {
            return null;
        }
    }
}
