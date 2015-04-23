package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.StyleType
import com.grandpasbrewing.beerxml.version1.objects.Style

class StyleDeserializerTests extends GroovyTestCase {
    private Deserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<Style>();
    }

    void testToBeerXml() {
        String xml = "<STYLE>" +
                "<NAME>Bohemian Pilsner</NAME>" +
                "<CATEGORY>European Pale Ale</CATEGORY>" +
                "<CATEGORY_NUMBER>2</CATEGORY_NUMBER>" +
                "<STYLE_LETTER>A</STYLE_LETTER>" +
                "<STYLE_GUIDE>BJCP</STYLE_GUIDE>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Lager</TYPE>" +
                "<OG_MIN>1.044</OG_MIN>" +
                "<OG_MAX>1.056</OG_MAX>" +
                "<FG_MIN>1.013</FG_MIN>" +
                "<FG_MAX>1.017</FG_MAX>" +
                "<IBU_MIN>35.0</IBU_MIN>" +
                "<IBU_MAX>45.0</IBU_MAX>" +
                "<COLOR_MIN>3.0</COLOR_MIN>" +
                "<COLOR_MAX>5.0</COLOR_MAX>" +
                "<NOTES>Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness." +
                "</NOTES>" +
                "</STYLE>";

        Style style = (Style) _deserializer.toBeerXml(xml, Style.class);

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

    void testToBeerXmlDryIrishStoutWithAllFields() {
        String xml = "<STYLE>" +
                "<NAME>Dry Stout</NAME>" +
                "<CATEGORY>Stout</CATEGORY>" +
                "<CATEGORY_NUMBER>16</CATEGORY_NUMBER>" +
                "<STYLE_LETTER>A</STYLE_LETTER>" +
                "<STYLE_GUIDE>BJCP</STYLE_GUIDE>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Ale</TYPE>" +
                "<OG_MIN>1.035</OG_MIN>" +
                "<OG_MAX>1.050</OG_MAX>" +
                "<FG_MIN>1.007</FG_MIN>" +
                "<FG_MAX>1.011</FG_MAX>" +
                "<IBU_MIN>30.0</IBU_MIN>" +
                "<IBU_MAX>50.0</IBU_MAX>" +
                "<COLOR_MIN>35.0</COLOR_MIN>" +
                "<COLOR_MAX>200.0</COLOR_MAX>" +
                "<ABV_MIN>3.2</ABV_MIN>" +
                "<ABV_MAX>5.5</ABV_MAX>" +
                "<CARB_MIN>1.6</CARB_MIN>" +
                "<CARB_MAX>2.1</CARB_MAX>" +
                "<NOTES>Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer." +
                "</NOTES>" +
                "<PROFILE>Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor." +
                "</PROFILE>" +
                "<INGREDIENTS>Made with black barley and flaked barley, Hard water.Irish Ale Yeast." +
                "</INGREDIENTS>" +
                "<EXAMPLES>Guinness</EXAMPLES>" +
                "</STYLE>";

        Style style = (Style) _deserializer.toBeerXml(xml, Style.class);

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
