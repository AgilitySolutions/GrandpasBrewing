package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.objects.Water

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class WaterSerializerTest  extends GroovyTestCase {
    private Serializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new Serializer<Water>();
    }

    void testStyleFromBeerXml() {
        Water water = new Water();
        water.setName(" Burton on Trent, UK ");
        water.setVersion(1);
        water.setAmount(20.0);
        water.setCalcium(295.0);
        water.setMagnesium(45.0);
        water.setSodium(55.0);
        water.setSulfate(725.0);
        water.setChloride(25.0);
        water.setBicarbonate(300.0);
        water.setPH(8.0);
        water.setNotes("Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale ");

        String xml = _serializer.fromBeerXml(water, water.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("WATER", documentElement.getTagName());
        assertEquals(11, documentElement.getChildNodes().getLength());
        assertEquals(" Burton on Trent, UK ", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("20.0", xpath.evaluate("//AMOUNT", document));
        assertEquals("295.0", xpath.evaluate("//CALCIUM", document));
        assertEquals("45.0", xpath.evaluate("//MAGNESIUM", document));
        assertEquals("55.0", xpath.evaluate("//SODIUM", document));
        assertEquals("725.0", xpath.evaluate("//SULFATE", document));
        assertEquals("25.0", xpath.evaluate("//CHLORIDE", document));
        assertEquals("300.0", xpath.evaluate("//BICARBONATE", document));
        assertEquals("8.0", xpath.evaluate("//PH", document));
        assertEquals("Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale ", xpath.evaluate("//NOTES", document));
    }
}
