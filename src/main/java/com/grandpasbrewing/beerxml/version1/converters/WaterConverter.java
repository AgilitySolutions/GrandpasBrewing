package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Water;

public class WaterConverter implements IBeerXmlConverter<Water, com.grandpasbrewing.objectmodel.Water> {
    public com.grandpasbrewing.objectmodel.Water toObjectModel(Water beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Water water = new com.grandpasbrewing.objectmodel.Water();

        water.setAmount(beerXmlObject.getAmount());
        water.setBicarbonate(beerXmlObject.getBicarbonate());
        water.setCalcium(beerXmlObject.getCalcium());
        water.setChloride(beerXmlObject.getChloride());
        water.setDisplayAmount(beerXmlObject.getDisplayAmount());
        water.setMagnesium(beerXmlObject.getMagnesium());
        water.setName(beerXmlObject.getName());
        water.setNotes(beerXmlObject.getNotes());
        water.setPH(beerXmlObject.getPH());
        water.setSodium(beerXmlObject.getSodium());
        water.setSulfate(beerXmlObject.getSulfate());
        water.setVersion(beerXmlObject.getVersion());

        return water;
    }

    public Water fromObjectModel(com.grandpasbrewing.objectmodel.Water objectModelObject) {
        return null;
    }
}
