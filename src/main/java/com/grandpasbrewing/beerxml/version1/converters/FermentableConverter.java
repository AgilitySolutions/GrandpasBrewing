package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.FermentableTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Fermentable;

public class FermentableConverter implements IBeerXmlConverter<Fermentable, com.grandpasbrewing.objectmodel.Fermentable> {
    private FermentableTypeEnumConverter _fermentableTypeEnumConverter;

    public FermentableConverter(FermentableTypeEnumConverter fermentableTypeEnumConverter)
    {
        if (fermentableTypeEnumConverter == null) throw new IllegalArgumentException("fermentableTypeEnumConverter");

        _fermentableTypeEnumConverter = fermentableTypeEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.Fermentable toObjectModel(Fermentable beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Fermentable fermentable = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable.setName(beerXmlObject.getName());
        fermentable.setVersion(beerXmlObject.getVersion());
        fermentable.setAddAfterBoil(beerXmlObject.getAddAfterBoil());
        fermentable.setAmount(beerXmlObject.getAmount());
        fermentable.setCoarseFineDiff(beerXmlObject.getCoarseFineDiff());
        fermentable.setColor(beerXmlObject.getColor());
        fermentable.setDiastaticPower(beerXmlObject.getDiastaticPower());
        fermentable.setDisplayAmount(beerXmlObject.getDisplayAmount());
        fermentable.setDisplayColor(beerXmlObject.getDisplayColor());
        fermentable.setIBUGallonsPerPound(beerXmlObject.getIBUGallonsPerPound());
        fermentable.setInventory(beerXmlObject.getInventory());
        fermentable.setMaximumInBatch(beerXmlObject.getMaximumInBatch());
        fermentable.setMoisture(beerXmlObject.getMoisture());
        fermentable.setName(beerXmlObject.getName());
        fermentable.setNotes(beerXmlObject.getNotes());
        fermentable.setPlaceOfOrigin(beerXmlObject.getPlaceOfOrigin());
        fermentable.setPotential(beerXmlObject.getPotential());
        fermentable.setProtein(beerXmlObject.getProtein());
        fermentable.setRecommendMash(beerXmlObject.getRecommendMash());
        fermentable.setSupplier(beerXmlObject.getSupplier());
        fermentable.setType(_fermentableTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        fermentable.setYield(beerXmlObject.getYield());

        return fermentable;
    }

    public Fermentable fromObjectModel(com.grandpasbrewing.objectmodel.Fermentable objectModelObject) {
        return null;
    }
}
