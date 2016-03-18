package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.Mash
import com.grandpasbrewing.beerxml.version1.objects.MashStep
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

class MashBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Mash>();
    }

    void testMashSingleStepInfusionMash() {
        Mash mash = new Mash();
        mash.setName("Single Step Infusion, 68 C");
        mash.setVersion(1);
        mash.setGrainTemperature(22.0);

        ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

        MashStep mashStep = new MashStep();
        mashStep.setName("Conversion Step, 68C ");
        mashStep.setVersion(1);
        mashStep.setType(MashStepType.Infusion);
        mashStep.setStepTemperature(68.0);
        mashStep.setStepTime(60.0);
        mashStep.setInfuseAmount(10.0);

        mashSteps.add(mashStep);

        mash.setMashSteps(mashSteps);

        String xml = _serializer.fromBeerXml(mash, mash.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("MASH", documentElement.getTagName());
        assertEquals(4, documentElement.getChildNodes().getLength());

        assertEquals("Single Step Infusion, 68 C", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("22.0", xpath.evaluate("//GRAIN_TEMP", document));

        NodeList mashStepNodes = (NodeList) xpath.evaluate("//MASH_STEPS/MASH_STEP", document, XPathConstants.NODESET);
        assertNotNull(mashStepNodes);
        assertEquals(1, mashStepNodes.getLength());

        def mashStepNode = mashStepNodes.item(0);

        assertEquals("Conversion Step, 68C ", xpath.evaluate("NAME", mashStepNode));
        assertEquals("1", xpath.evaluate("VERSION", mashStepNode));
        assertEquals("Infusion", xpath.evaluate("TYPE", mashStepNode));
        assertEquals("68.0", xpath.evaluate("STEP_TEMP", mashStepNode));
        assertEquals("60.0", xpath.evaluate("STEP_TIME", mashStepNode));
        assertEquals("10.0", xpath.evaluate("INFUSE_AMOUNT", mashStepNode));
    }

    void testMashTwoStepTemperatureMash() {
        Mash mash = new Mash();
        mash.setName("Two Step Temperature, 68C ");
        mash.setVersion(1);
        mash.setGrainTemperature(22.0);
        mash.setTunTemperature(22.0);
        mash.setSpargeTemperature(78.0);

        ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

        MashStep mashStep1 = new MashStep();
        mashStep1.setName("Protein Rest");
        mashStep1.setVersion(1);
        mashStep1.setType(MashStepType.Temperature);
        mashStep1.setStepTemperature(49.0);
        mashStep1.setStepTime(20.0);
        mashStep1.setRampTime(10.0);
        mashStep1.setInfuseAmount(15.0);

        mashSteps.add(mashStep1);

        MashStep mashStep2 = new MashStep();
        mashStep2.setName("Conversion Step, 68 C");
        mashStep2.setVersion(1);
        mashStep2.setType(MashStepType.Temperature);
        mashStep2.setStepTemperature(68.0);
        mashStep2.setRampTime(20.0);
        mashStep2.setStepTime(60.0);

        mashSteps.add(mashStep2);

        mash.setMashSteps(mashSteps);

        String xml = _serializer.fromBeerXml(mash, mash.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("MASH", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());

        assertEquals("Two Step Temperature, 68C ", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("22.0", xpath.evaluate("//GRAIN_TEMP", document));
        assertEquals("22.0", xpath.evaluate("//TUN_TEMP", document));
        assertEquals("78.0", xpath.evaluate("//SPARGE_TEMP", document));

        NodeList mashStepNodes = (NodeList) xpath.evaluate("//MASH_STEPS/MASH_STEP", document, XPathConstants.NODESET);
        assertNotNull(mashStepNodes);
        assertEquals(2, mashStepNodes.getLength());

        def mashStepNode = mashStepNodes.item(0);

        assertEquals("Protein Rest", xpath.evaluate("NAME", mashStepNode));
        assertEquals("1", xpath.evaluate("VERSION", mashStepNode));
        assertEquals("Temperature", xpath.evaluate("TYPE", mashStepNode));
        assertEquals("49.0", xpath.evaluate("STEP_TEMP", mashStepNode));
        assertEquals("20.0", xpath.evaluate("STEP_TIME", mashStepNode));
        assertEquals("10.0", xpath.evaluate("RAMP_TIME", mashStepNode));
        assertEquals("15.0", xpath.evaluate("INFUSE_AMOUNT", mashStepNode));

        mashStepNode = mashStepNodes.item(1);

        assertEquals("Conversion Step, 68 C", xpath.evaluate("NAME", mashStepNode));
        assertEquals("1", xpath.evaluate("VERSION", mashStepNode));
        assertEquals("Temperature", xpath.evaluate("TYPE", mashStepNode));
        assertEquals("68.0", xpath.evaluate("STEP_TEMP", mashStepNode));
        assertEquals("20.0", xpath.evaluate("RAMP_TIME", mashStepNode));
        assertEquals("60.0", xpath.evaluate("STEP_TIME", mashStepNode));
    }
}
