package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.StyleTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Style;

public class StyleConverter implements IBeerXmlConverter<Style, com.grandpasbrewing.objectmodel.Style> {
    private StyleTypeEnumConverter _styleTypeEnumConverter;

    public StyleConverter(StyleTypeEnumConverter styleTypeEnumConverter) {
        if (styleTypeEnumConverter == null) throw new IllegalArgumentException("styleTypeEnumConverter");

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
        return null;
    }
}
