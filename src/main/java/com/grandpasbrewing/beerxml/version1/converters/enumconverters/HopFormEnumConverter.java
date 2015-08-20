package com.grandpasbrewing.beerxml.version1.converters.enumconverters;

import com.grandpasbrewing.beerxml.version1.enums.HopForm;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters.IEnumConverter;

public class HopFormEnumConverter implements IEnumConverter<HopForm, com.grandpasbrewing.objectmodel.enums.HopForm> {
    public com.grandpasbrewing.objectmodel.enums.HopForm toObjectModel(HopForm enumValue) {
        switch (enumValue)
        {
            case Pellet:
                return com.grandpasbrewing.objectmodel.enums.HopForm.Pellet;
            case Plug:
                return com.grandpasbrewing.objectmodel.enums.HopForm.Plug;
            case Leaf:
                return com.grandpasbrewing.objectmodel.enums.HopForm.Leaf;
            default:
                throw new IllegalArgumentException();
        }
    }

    public HopForm fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopForm enumValue) {
        switch (enumValue)
        {
            case Pellet:
                return HopForm.Pellet;
            case Plug:
                return HopForm.Plug;
            case Leaf:
                return HopForm.Leaf;
            default:
                throw new IllegalArgumentException();
        }
    }
}
