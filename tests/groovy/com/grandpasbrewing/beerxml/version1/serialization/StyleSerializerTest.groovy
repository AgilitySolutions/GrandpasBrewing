package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.StyleType
import com.grandpasbrewing.beerxml.version1.objects.Style

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class StyleSerializerTest  extends GroovyTestCase {
    private Serializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new Serializer<Style>();
    }

    void testStyleFromBeerXml() {
        Style style = new Style();
        style.setName("Bohemian Pilsner");
        style.setCategory("European Pale Ale");
        style.setCategoryNumber("2");
        style.setStyleLetter("A");
        style.setStyleGuide("BJCP");
        style.setVersion(1);
        style.setType(StyleType.Lager);
        style.setOriginalGravityMinimum(1.044);
        style.setOriginalGravityMaximum(1.056);
        style.setFinalGravityMinimum(1.013);
        style.setFinalGravityMaximum(1.017);
        style.setIBUMinimum(35.0);
        style.setIBUMaximum(45.0);
        style.setColorMinimum("3.0");
        style.setColorMaximum("5.0");
        style.setNotes("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.");

        String xml = _serializer.fromBeerXml(style, style.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("STYLE", documentElement.getTagName());
        assertEquals(16, documentElement.getChildNodes().getLength());
        assertEquals("Bohemian Pilsner", xpath.evaluate("//NAME", document));
        assertEquals("European Pale Ale", xpath.evaluate("//CATEGORY", document));
        assertEquals("2", xpath.evaluate("//CATEGORY_NUMBER", document));
        assertEquals("A", xpath.evaluate("//STYLE_LETTER", document));
        assertEquals("BJCP", xpath.evaluate("//STYLE_GUIDE", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Lager", xpath.evaluate("//TYPE", document));
        assertEquals("1.044", xpath.evaluate("//OG_MIN", document));
        assertEquals("1.056", xpath.evaluate("//OG_MAX", document));
        assertEquals("1.013", xpath.evaluate("//FG_MIN", document));
        assertEquals("1.017", xpath.evaluate("//FG_MAX", document));
        assertEquals("35.0", xpath.evaluate("//IBU_MIN", document));
        assertEquals("45.0", xpath.evaluate("//IBU_MAX", document));
        assertEquals("3.0", xpath.evaluate("//COLOR_MIN", document));
        assertEquals("5.0", xpath.evaluate("//COLOR_MAX", document));
        assertEquals("Famous beer of Pilsen, Czech republic .Light to medium body with some sweetness. Saaz hop flavor and aroma with no lingering bitterness.", xpath.evaluate("//NOTES", document));
    }

    void testStyleDryIrishStoutWithAllFields() {
        Style style = new Style();
        style.setName("Dry Stout");
        style.setCategory("Stout");
        style.setCategoryNumber("16");
        style.setStyleLetter("A");
        style.setStyleGuide("BJCP");
        style.setVersion(1);
        style.setType(StyleType.Ale);
        style.setOriginalGravityMinimum(1.035);
        style.setOriginalGravityMaximum(1.050);
        style.setFinalGravityMinimum(1.007);
        style.setFinalGravityMaximum(1.011);
        style.setIBUMinimum(30.0);
        style.setIBUMaximum(50.0);
        style.setColorMinimum("35.0");
        style.setColorMaximum("200.0");
        style.setABVMinimum(3.2);
        style.setABVMaximum(5.5);
        style.setCarbonationMinimum(1.6);
        style.setCarbonationMaximum(2.1);
        style.setNotes("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.");
        style.setProfile("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.");
        style.setIngredients("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.");
        style.setExamples("Guinness");

        String xml = _serializer.fromBeerXml(style, style.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertEquals("STYLE", documentElement.getTagName());
        assertEquals(23, documentElement.getChildNodes().getLength());
        assertEquals("Dry Stout", xpath.evaluate("//NAME", document));
        assertEquals("Stout", xpath.evaluate("//CATEGORY", document));
        assertEquals("16", xpath.evaluate("//CATEGORY_NUMBER", document));
        assertEquals("A", xpath.evaluate("//STYLE_LETTER", document));
        assertEquals("BJCP", xpath.evaluate("//STYLE_GUIDE", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Ale", xpath.evaluate("//TYPE", document));
        assertEquals("1.035", xpath.evaluate("//OG_MIN", document));
        assertEquals("1.05", xpath.evaluate("//OG_MAX", document));
        assertEquals("1.007", xpath.evaluate("//FG_MIN", document));
        assertEquals("1.011", xpath.evaluate("//FG_MAX", document));
        assertEquals("30.0", xpath.evaluate("//IBU_MIN", document));
        assertEquals("50.0", xpath.evaluate("//IBU_MAX", document));
        assertEquals("35.0", xpath.evaluate("//COLOR_MIN", document));
        assertEquals("200.0", xpath.evaluate("//COLOR_MAX", document));
        assertEquals("3.2", xpath.evaluate("//ABV_MIN", document));
        assertEquals("5.5", xpath.evaluate("//ABV_MAX", document));
        assertEquals("1.6", xpath.evaluate("//CARB_MIN", document));
        assertEquals("2.1", xpath.evaluate("//CARB_MAX", document));
        assertEquals("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer.", xpath.evaluate("//NOTES", document));
        assertEquals("Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.", xpath.evaluate("//PROFILE", document));
        assertEquals("Made with black barley and flaked barley, Hard water.Irish Ale Yeast.", xpath.evaluate("//INGREDIENTS", document));
        assertEquals("Guinness", xpath.evaluate("//EXAMPLES", document));
    }
}
