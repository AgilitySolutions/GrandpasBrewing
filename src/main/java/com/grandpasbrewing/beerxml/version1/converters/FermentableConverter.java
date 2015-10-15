package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.FermentableTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.BeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Fermentable;

public class FermentableConverter implements BeerXmlConverter<Fermentable, com.grandpasbrewing.objectmodel.Fermentable> {
    private FermentableTypeEnumConverter _fermentableTypeEnumConverter;

    public FermentableConverter(FermentableTypeEnumConverter fermentableTypeEnumConverter)
    {
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
        if (objectModelObject == null)
            return null;

        Fermentable fermentable = new Fermentable();

        fermentable.setName(objectModelObject.getName());
        fermentable.setVersion(objectModelObject.getVersion());
        fermentable.setAddAfterBoil(objectModelObject.getAddAfterBoil());
        fermentable.setAmount(objectModelObject.getAmount());
        fermentable.setCoarseFineDiff(objectModelObject.getCoarseFineDiff());
        fermentable.setColor(objectModelObject.getColor());
        fermentable.setDiastaticPower(objectModelObject.getDiastaticPower());
        fermentable.setDisplayAmount(objectModelObject.getDisplayAmount());
        fermentable.setDisplayColor(objectModelObject.getDisplayColor());
        fermentable.setIBUGallonsPerPound(objectModelObject.getIBUGallonsPerPound());
        fermentable.setInventory(objectModelObject.getInventory());
        fermentable.setMaximumInBatch(objectModelObject.getMaximumInBatch());
        fermentable.setMoisture(objectModelObject.getMoisture());
        fermentable.setName(objectModelObject.getName());
        fermentable.setNotes(objectModelObject.getNotes());
        fermentable.setPlaceOfOrigin(objectModelObject.getPlaceOfOrigin());
        fermentable.setPotential(objectModelObject.getPotential());
        fermentable.setProtein(objectModelObject.getProtein());
        fermentable.setRecommendMash(objectModelObject.getRecommendMash());
        fermentable.setSupplier(objectModelObject.getSupplier());
        fermentable.setType(_fermentableTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        fermentable.setYield(objectModelObject.getYield());

        return fermentable;
    }
}
