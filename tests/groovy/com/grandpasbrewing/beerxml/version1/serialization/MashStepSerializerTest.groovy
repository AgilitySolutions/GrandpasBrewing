package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.MashStep

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class MashStepSerializerTest extends GroovyTestCase {
    private Serializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new Serializer<MashStep>();
    }

    void testMashStepInfusionStep() {
        MashStep mashStep = new MashStep();
        mashStep.setName("Conversion step");
        mashStep.setVersion(1);
        mashStep.setType(MashStepType.Infusion);
        mashStep.setStepTemperature(68.0);
        mashStep.setStepTime(70.0);
        mashStep.setInfuseAmount(5.0);

        String xml = _serializer.fromBeerXml(mashStep, mashStep.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("MASH_STEP", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());
        assertEquals("Conversion step", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Infusion", xpath.evaluate("//TYPE", document));
        assertEquals("68.0", xpath.evaluate("//STEP_TEMP", document));
        assertEquals("70.0", xpath.evaluate("//STEP_TIME", document));
        assertEquals("5.0", xpath.evaluate("//INFUSE_AMOUNT", document));
    }

    void testMashSteptDecoctionStep() {
        MashStep mashStep = new MashStep();
        mashStep.setName("Conversion Decoction");
        mashStep.setVersion(1);
        mashStep.setType(MashStepType.Decoction);
        mashStep.setStepTemperature(68.0);
        mashStep.setStepTime(90.0);

        String xml = _serializer.fromBeerXml(mashStep, mashStep.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("MASH_STEP", documentElement.getTagName());
        assertEquals(5, documentElement.getChildNodes().getLength());
        assertEquals("Conversion Decoction", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Decoction", xpath.evaluate("//TYPE", document));
        assertEquals("68.0", xpath.evaluate("//STEP_TEMP", document));
        assertEquals("90.0", xpath.evaluate("//STEP_TIME", document));
    }
}
