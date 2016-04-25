package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.Yeast

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class YeastBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Yeast>();
    }

    void testYeastRequiredFieldsOnly() {
        Yeast yeast = new Yeast();
        yeast.setName("Ole English Ale Yeast");
        yeast.setVersion(1);
        yeast.setType(YeastType.Ale);
        yeast.setForm(YeastForm.Liquid);
        yeast.setAmount(0.100);

        String xml = _serializer.fromBeerXml(yeast, yeast.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("YEAST", documentElement.getTagName());
        assertEquals(5, documentElement.getChildNodes().getLength());
        assertEquals("Ole English Ale Yeast", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Ale", xpath.evaluate("//TYPE", document));
        assertEquals("Liquid", xpath.evaluate("//FORM", document));
        assertEquals("0.1", xpath.evaluate("//AMOUNT", document));
    }

    void testYeastMorePopulareFields() {
        Yeast yeast = new Yeast();
        yeast.setName("German Ale");
        yeast.setType(YeastType.Ale);
        yeast.setVersion(1);
        yeast.setForm(YeastForm.Liquid);
        yeast.setAmount(0.250);
        yeast.setLaboratory("Wyeast Labs");
        yeast.setManufacturerProductId("1007");
        yeast.setMinimumTemperature(12.8);
        yeast.setMaximumTemperature(20.0);
        yeast.setAttenuation(75.0);
        yeast.setNotes("Crisp dry flavor with a hint of mild flavor.  Great for many continental ales.");
        yeast.setBestFor("German Ales, Alts, Kolsch, Dry Stouts ");
        yeast.setFlocculation(YeastFlocculation.Low);

        String xml = _serializer.fromBeerXml(yeast, yeast.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("YEAST", documentElement.getTagName());
        assertEquals(13, documentElement.getChildNodes().getLength());
        assertEquals("German Ale", xpath.evaluate("//NAME", document));
        assertEquals("Ale", xpath.evaluate("//TYPE", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Liquid", xpath.evaluate("//FORM", document));
        assertEquals("0.25", xpath.evaluate("//AMOUNT", document));
        assertEquals("Wyeast Labs", xpath.evaluate("//LABORATORY", document));
        assertEquals("1007", xpath.evaluate("//PRODUCT_ID", document));
        assertEquals("12.8", xpath.evaluate("//MIN_TEMPERATURE", document));
        assertEquals("20.0", xpath.evaluate("//MAX_TEMPERATURE", document));
        assertEquals("75.0", xpath.evaluate("//ATTENUATION", document));
        assertEquals("Crisp dry flavor with a hint of mild flavor.  Great for many continental ales.", xpath.evaluate("//NOTES", document));
        assertEquals("German Ales, Alts, Kolsch, Dry Stouts ", xpath.evaluate("//BEST_FOR", document));
        assertEquals("Low", xpath.evaluate("//FLOCCULATION", document));
    }
}
