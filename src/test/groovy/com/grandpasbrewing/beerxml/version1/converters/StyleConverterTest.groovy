package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.StyleTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.StyleType
import com.grandpasbrewing.beerxml.version1.objects.Style

class StyleConverterTest extends GroovyTestCase {
    private StyleTypeEnumConverter _styleTypeEnumConverter;
    private StyleConverter _styleConverter;

    void setUp() {
        super.setUp()

        _styleTypeEnumConverter = new StyleTypeEnumConverter();
        _styleConverter = new StyleConverter(_styleTypeEnumConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Style style = _styleConverter.toObjectModel(null);

        assertNull(style);
    }

    void testToObjectModelStyle() {
        Style beerXmlStyle = new Style();

        beerXmlStyle.setName("Bohemian Pilsner");
        beerXmlStyle.setCategory("European Pale Ale");
        beerXmlStyle.setCategoryNumber("2");
        beerXmlStyle.setStyleLetter("A");
        beerXmlStyle.setStyleGuide("BJCP");
        beerXmlStyle.setVersion(1);
        beerXmlStyle.setType(StyleType.Lager);
        beerXmlStyle.setOriginalGravityMinimum(1.044);
        beerXmlStyle.setOriginalGravityMaximum(1.056);
        beerXmlStyle.setFinalGravityMinimum(1.013);
        beerXmlStyle.setFinalGravityMaximum( 1.017);
        beerXmlStyle.setIBUMinimum(35.0);
        beerXmlStyle.setIBUMaximum(45.0);
        beerXmlStyle.setColorMinimum("3.0");
        beerXmlStyle.setColorMaximum("5.0");
        beerXmlStyle.setNotes("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.");

        com.grandpasbrewing.objectmodel.Style style = _styleConverter.toObjectModel(beerXmlStyle);

        assertEquals("Bohemian Pilsner", style.getName());
        assertEquals("European Pale Ale", style.getCategory());
        assertEquals(1, style.getVersion());
        assertEquals("2", style.getCategoryNumber());
        assertEquals("A", style.getStyleLetter());
        assertEquals("BJCP", style.getStyleGuide());
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Lager, style.getType());
        assertEquals(1.044, style.getOriginalGravityMinimum());
        assertEquals(1.056, style.getOriginalGravityMaximum());
        assertEquals(1.013, style.getFinalGravityMinimum());
        assertEquals(1.017, style.getFinalGravityMaximum());
        assertEquals(35.0, style.getIBUMinimum());
        assertEquals(45.0, style.getIBUMaximum());
        assertEquals("3.0", style.getColorMinimum());
        assertEquals("5.0", style.getColorMaximum());
        assertNull(style.getCarbonationMinimum());
        assertNull(style.getCarbonationMaximum());
        assertNull(style.getABVMinimum());
        assertNull(style.getABVMaximum());
        assertEquals("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.", style.getNotes());
        assertNull(style.getProfile());
        assertNull(style.getIngredients());
        assertNull(style.getExamples());
        assertNull(style.getDisplayOriginalGravityMinimum());
        assertNull(style.getDisplayOriginalGravityMaximum());
        assertNull(style.getDisplayFinalGravityMinimum());
        assertNull(style.getDisplayFinalGravityMaximum());
        assertNull(style.getDisplayColorMinimum());
        assertNull(style.getDisplayColorMaximum());
        assertNull(style.getOriginalGravityRange());
        assertNull(style.getFinalGravityRange());
        assertNull(style.getIBURange());
        assertNull(style.getCarbonationRange());
        assertNull(style.getColorRange());
        assertNull(style.getABVRange());
    }

    void testToObjectModelDryIrishStoutWithAllFields() {
        Style beerXmlStyle = new Style();

        beerXmlStyle.setName("Dry Stout");
        beerXmlStyle.setCategory("Stout");
        beerXmlStyle.setCategoryNumber("16");
        beerXmlStyle.setStyleLetter("A");
        beerXmlStyle.setStyleGuide("BJCP");
        beerXmlStyle.setVersion(1);
        beerXmlStyle.setType(StyleType.Ale);
        beerXmlStyle.setOriginalGravityMinimum(1.035);
        beerXmlStyle.setOriginalGravityMaximum(1.050);
        beerXmlStyle.setFinalGravityMinimum(1.007);
        beerXmlStyle.setFinalGravityMaximum(1.011);
        beerXmlStyle.setIBUMinimum(30.0);
        beerXmlStyle.setIBUMaximum(50.0);
        beerXmlStyle.setColorMinimum("35.0");
        beerXmlStyle.setColorMaximum("200.0");
        beerXmlStyle.setABVMinimum(3.2);
        beerXmlStyle.setABVMaximum(5.5);
        beerXmlStyle.setCarbonationMinimum(1.6);
        beerXmlStyle.setCarbonationMaximum(2.1);
        beerXmlStyle.setNotes("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.");
        beerXmlStyle.setProfile("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.");
        beerXmlStyle.setIngredients("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.");
        beerXmlStyle.setExamples("Guinness");

        com.grandpasbrewing.objectmodel.Style style = _styleConverter.toObjectModel(beerXmlStyle);

        assertEquals("Dry Stout", style.getName());
        assertEquals("Stout", style.getCategory());
        assertEquals(1, style.getVersion());
        assertEquals("16", style.getCategoryNumber());
        assertEquals("A", style.getStyleLetter());
        assertEquals("BJCP", style.getStyleGuide());
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Ale, style.getType());
        assertEquals(1.035, style.getOriginalGravityMinimum());
        assertEquals(1.050, style.getOriginalGravityMaximum());
        assertEquals(1.007, style.getFinalGravityMinimum());
        assertEquals(1.011, style.getFinalGravityMaximum());
        assertEquals(30.0, style.getIBUMinimum());
        assertEquals(50.0, style.getIBUMaximum());
        assertEquals("35.0", style.getColorMinimum());
        assertEquals("200.0", style.getColorMaximum());
        assertEquals(1.6, style.getCarbonationMinimum());
        assertEquals(2.1, style.getCarbonationMaximum());
        assertEquals(3.2, style.getABVMinimum());
        assertEquals(5.5, style.getABVMaximum());
        assertEquals("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.", style.getNotes());
        assertEquals("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.", style.getProfile());
        assertEquals("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.", style.getIngredients());
        assertEquals("Guinness", style.getExamples());
        assertNull(style.getDisplayOriginalGravityMinimum());
        assertNull(style.getDisplayOriginalGravityMaximum());
        assertNull(style.getDisplayFinalGravityMinimum());
        assertNull(style.getDisplayFinalGravityMaximum());
        assertNull(style.getDisplayColorMinimum());
        assertNull(style.getDisplayColorMaximum());
        assertNull(style.getOriginalGravityRange());
        assertNull(style.getFinalGravityRange());
        assertNull(style.getIBURange());
        assertNull(style.getCarbonationRange());
        assertNull(style.getColorRange());
        assertNull(style.getABVRange());
    }

    void testFromObjectModelNull() {
        Style style = _styleConverter.fromObjectModel(null);

        assertNull(style);
    }

    void testFromObjectModelStyle() {
        com.grandpasbrewing.objectmodel.Style objectModelStyle = new com.grandpasbrewing.objectmodel.Style();

        objectModelStyle.setName("Bohemian Pilsner");
        objectModelStyle.setCategory("European Pale Ale");
        objectModelStyle.setCategoryNumber("2");
        objectModelStyle.setStyleLetter("A");
        objectModelStyle.setStyleGuide("BJCP");
        objectModelStyle.setVersion(1);
        objectModelStyle.setType(com.grandpasbrewing.objectmodel.enums.StyleType.Lager);
        objectModelStyle.setOriginalGravityMinimum(1.044);
        objectModelStyle.setOriginalGravityMaximum(1.056);
        objectModelStyle.setFinalGravityMinimum(1.013);
        objectModelStyle.setFinalGravityMaximum( 1.017);
        objectModelStyle.setIBUMinimum(35.0);
        objectModelStyle.setIBUMaximum(45.0);
        objectModelStyle.setColorMinimum("3.0");
        objectModelStyle.setColorMaximum("5.0");
        objectModelStyle.setNotes("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.");

        Style style = _styleConverter.fromObjectModel(objectModelStyle);

        assertEquals("Bohemian Pilsner", style.getName());
        assertEquals("European Pale Ale", style.getCategory());
        assertEquals(1, style.getVersion());
        assertEquals("2", style.getCategoryNumber());
        assertEquals("A", style.getStyleLetter());
        assertEquals("BJCP", style.getStyleGuide());
        assertEquals(StyleType.Lager, style.getType());
        assertEquals(1.044, style.getOriginalGravityMinimum());
        assertEquals(1.056, style.getOriginalGravityMaximum());
        assertEquals(1.013, style.getFinalGravityMinimum());
        assertEquals(1.017, style.getFinalGravityMaximum());
        assertEquals(35.0, style.getIBUMinimum());
        assertEquals(45.0, style.getIBUMaximum());
        assertEquals("3.0", style.getColorMinimum());
        assertEquals("5.0", style.getColorMaximum());
        assertNull(style.getCarbonationMinimum());
        assertNull(style.getCarbonationMaximum());
        assertNull(style.getABVMinimum());
        assertNull(style.getABVMaximum());
        assertEquals("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.", style.getNotes());
        assertNull(style.getProfile());
        assertNull(style.getIngredients());
        assertNull(style.getExamples());
        assertNull(style.getDisplayOriginalGravityMinimum());
        assertNull(style.getDisplayOriginalGravityMaximum());
        assertNull(style.getDisplayFinalGravityMinimum());
        assertNull(style.getDisplayFinalGravityMaximum());
        assertNull(style.getDisplayColorMinimum());
        assertNull(style.getDisplayColorMaximum());
        assertNull(style.getOriginalGravityRange());
        assertNull(style.getFinalGravityRange());
        assertNull(style.getIBURange());
        assertNull(style.getCarbonationRange());
        assertNull(style.getColorRange());
        assertNull(style.getABVRange());
    }

    void testFromObjectModelDryIrishStoutWithAllFields() {
        com.grandpasbrewing.objectmodel.Style objectModelStyle = new com.grandpasbrewing.objectmodel.Style();

        objectModelStyle.setName("Dry Stout");
        objectModelStyle.setCategory("Stout");
        objectModelStyle.setCategoryNumber("16");
        objectModelStyle.setStyleLetter("A");
        objectModelStyle.setStyleGuide("BJCP");
        objectModelStyle.setVersion(1);
        objectModelStyle.setType(com.grandpasbrewing.objectmodel.enums.StyleType.Ale);
        objectModelStyle.setOriginalGravityMinimum(1.035);
        objectModelStyle.setOriginalGravityMaximum(1.050);
        objectModelStyle.setFinalGravityMinimum(1.007);
        objectModelStyle.setFinalGravityMaximum(1.011);
        objectModelStyle.setIBUMinimum(30.0);
        objectModelStyle.setIBUMaximum(50.0);
        objectModelStyle.setColorMinimum("35.0");
        objectModelStyle.setColorMaximum("200.0");
        objectModelStyle.setABVMinimum(3.2);
        objectModelStyle.setABVMaximum(5.5);
        objectModelStyle.setCarbonationMinimum(1.6);
        objectModelStyle.setCarbonationMaximum(2.1);
        objectModelStyle.setNotes("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.");
        objectModelStyle.setProfile("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.");
        objectModelStyle.setIngredients("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.");
        objectModelStyle.setExamples("Guinness");

        Style style = _styleConverter.fromObjectModel(objectModelStyle);

        assertEquals("Dry Stout", style.getName());
        assertEquals("Stout", style.getCategory());
        assertEquals(1, style.getVersion());
        assertEquals("16", style.getCategoryNumber());
        assertEquals("A", style.getStyleLetter());
        assertEquals("BJCP", style.getStyleGuide());
        assertEquals(StyleType.Ale, style.getType());
        assertEquals(1.035, style.getOriginalGravityMinimum());
        assertEquals(1.050, style.getOriginalGravityMaximum());
        assertEquals(1.007, style.getFinalGravityMinimum());
        assertEquals(1.011, style.getFinalGravityMaximum());
        assertEquals(30.0, style.getIBUMinimum());
        assertEquals(50.0, style.getIBUMaximum());
        assertEquals("35.0", style.getColorMinimum());
        assertEquals("200.0", style.getColorMaximum());
        assertEquals(1.6, style.getCarbonationMinimum());
        assertEquals(2.1, style.getCarbonationMaximum());
        assertEquals(3.2, style.getABVMinimum());
        assertEquals(5.5, style.getABVMaximum());
        assertEquals("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.", style.getNotes());
        assertEquals("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.", style.getProfile());
        assertEquals("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.", style.getIngredients());
        assertEquals("Guinness", style.getExamples());
        assertNull(style.getDisplayOriginalGravityMinimum());
        assertNull(style.getDisplayOriginalGravityMaximum());
        assertNull(style.getDisplayFinalGravityMinimum());
        assertNull(style.getDisplayFinalGravityMaximum());
        assertNull(style.getDisplayColorMinimum());
        assertNull(style.getDisplayColorMaximum());
        assertNull(style.getOriginalGravityRange());
        assertNull(style.getFinalGravityRange());
        assertNull(style.getIBURange());
        assertNull(style.getCarbonationRange());
        assertNull(style.getColorRange());
        assertNull(style.getABVRange());
    }
}
