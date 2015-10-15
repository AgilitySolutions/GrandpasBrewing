package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.StyleTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Style;

public class StyleConverter implements IBeerXmlConverter<Style, com.grandpasbrewing.objectmodel.Style> {
    private StyleTypeEnumConverter _styleTypeEnumConverter;

    public StyleConverter(StyleTypeEnumConverter styleTypeEnumConverter) {
         _styleTypeEnumConverter = styleTypeEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.Style toObjectModel(Style beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Style style = new com.grandpasbrewing.objectmodel.Style();

        style.setABVMaximum(beerXmlObject.getABVMaximum());
        style.setABVMinimum(beerXmlObject.getABVMinimum());
        style.setABVRange(beerXmlObject.getABVRange());
        style.setCarbonationMaximum(beerXmlObject.getCarbonationMaximum());
        style.setCarbonationMinimum(beerXmlObject.getCarbonationMinimum());
        style.setCarbonationRange(beerXmlObject.getCarbonationRange());
        style.setCategory(beerXmlObject.getCategory());
        style.setCategoryNumber(beerXmlObject.getCategoryNumber());
        style.setColorMaximum(beerXmlObject.getColorMaximum());
        style.setColorMinimum(beerXmlObject.getColorMinimum());
        style.setColorRange(beerXmlObject.getColorRange());
        style.setDisplayColorMaximum(beerXmlObject.getDisplayColorMaximum());
        style.setDisplayColorMinimum(beerXmlObject.getDisplayColorMinimum());
        style.setDisplayFinalGravityMaximum(beerXmlObject.getDisplayFinalGravityMaximum());
        style.setDisplayFinalGravityMinimum(beerXmlObject.getDisplayFinalGravityMinimum());
        style.setDisplayOriginalGravityMaximum(beerXmlObject.getDisplayOriginalGravityMaximum());
        style.setDisplayOriginalGravityMinimum(beerXmlObject.getDisplayOriginalGravityMinimum());
        style.setExamples(beerXmlObject.getExamples());
        style.setFinalGravityMaximum(beerXmlObject.getFinalGravityMaximum());
        style.setFinalGravityMinimum(beerXmlObject.getFinalGravityMinimum());
        style.setFinalGravityRange(beerXmlObject.getFinalGravityRange());
        style.setIBUMaximum(beerXmlObject.getIBUMaximum());
        style.setIBUMinimum(beerXmlObject.getIBUMinimum());
        style.setIBURange(beerXmlObject.getIBURange());
        style.setIngredients(beerXmlObject.getIngredients());
        style.setName(beerXmlObject.getName());
        style.setNotes(beerXmlObject.getNotes());
        style.setOriginalGravityMaximum(beerXmlObject.getOriginalGravityMaximum());
        style.setOriginalGravityMinimum(beerXmlObject.getOriginalGravityMinimum());
        style.setOriginalGravityRange(beerXmlObject.getOriginalGravityRange());
        style.setProfile(beerXmlObject.getProfile());
        style.setStyleGuide(beerXmlObject.getStyleGuide());
        style.setStyleLetter(beerXmlObject.getStyleLetter());
        style.setType(_styleTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        style.setVersion(beerXmlObject.getVersion());

        return style;
    }

    public Style fromObjectModel(com.grandpasbrewing.objectmodel.Style objectModelObject) {
        if (objectModelObject == null)
            return null;

        Style style = new Style();

        style.setABVMaximum(objectModelObject.getABVMaximum());
        style.setABVMinimum(objectModelObject.getABVMinimum());
        style.setABVRange(objectModelObject.getABVRange());
        style.setCarbonationMaximum(objectModelObject.getCarbonationMaximum());
        style.setCarbonationMinimum(objectModelObject.getCarbonationMinimum());
        style.setCarbonationRange(objectModelObject.getCarbonationRange());
        style.setCategory(objectModelObject.getCategory());
        style.setCategoryNumber(objectModelObject.getCategoryNumber());
        style.setColorMaximum(objectModelObject.getColorMaximum());
        style.setColorMinimum(objectModelObject.getColorMinimum());
        style.setColorRange(objectModelObject.getColorRange());
        style.setDisplayColorMaximum(objectModelObject.getDisplayColorMaximum());
        style.setDisplayColorMinimum(objectModelObject.getDisplayColorMinimum());
        style.setDisplayFinalGravityMaximum(objectModelObject.getDisplayFinalGravityMaximum());
        style.setDisplayFinalGravityMinimum(objectModelObject.getDisplayFinalGravityMinimum());
        style.setDisplayOriginalGravityMaximum(objectModelObject.getDisplayOriginalGravityMaximum());
        style.setDisplayOriginalGravityMinimum(objectModelObject.getDisplayOriginalGravityMinimum());
        style.setExamples(objectModelObject.getExamples());
        style.setFinalGravityMaximum(objectModelObject.getFinalGravityMaximum());
        style.setFinalGravityMinimum(objectModelObject.getFinalGravityMinimum());
        style.setFinalGravityRange(objectModelObject.getFinalGravityRange());
        style.setIBUMaximum(objectModelObject.getIBUMaximum());
        style.setIBUMinimum(objectModelObject.getIBUMinimum());
        style.setIBURange(objectModelObject.getIBURange());
        style.setIngredients(objectModelObject.getIngredients());
        style.setName(objectModelObject.getName());
        style.setNotes(objectModelObject.getNotes());
        style.setOriginalGravityMaximum(objectModelObject.getOriginalGravityMaximum());
        style.setOriginalGravityMinimum(objectModelObject.getOriginalGravityMinimum());
        style.setOriginalGravityRange(objectModelObject.getOriginalGravityRange());
        style.setProfile(objectModelObject.getProfile());
        style.setStyleGuide(objectModelObject.getStyleGuide());
        style.setStyleLetter(objectModelObject.getStyleLetter());
        style.setType(_styleTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        style.setVersion(objectModelObject.getVersion());

        return style;
    }
}
