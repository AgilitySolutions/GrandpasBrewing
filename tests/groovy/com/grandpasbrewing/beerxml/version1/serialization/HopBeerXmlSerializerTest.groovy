package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopType
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.objects.Hop

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class HopBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Hop>();
    }

    void testHopRequiredFieldsOnly() {
        Hop hop = new Hop();
        hop.setName("Cascade");
        hop.setVersion(1);
        hop.setAlphaPercentage(5.0);
        hop.setAmount(0.100);
        hop.setUse(HopUse.Boil);
        hop.setTime(60);

        String xml = _serializer.fromBeerXml(hop, hop.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("HOP", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());
        assertEquals("Cascade", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("5.0", xpath.evaluate("//ALPHA", document));
        assertEquals("0.1", xpath.evaluate("//AMOUNT", document));
        assertEquals("Boil", xpath.evaluate("//USE", document));
        assertEquals("60.0", xpath.evaluate("//TIME", document));
    }

    void testHopDryHopForThreeDays() {
        Hop hop = new Hop();
        hop.setName("Fuggles");
        hop.setVersion(1);
        hop.setAlphaPercentage(4.5);
        hop.setAmount(0.250);
        hop.setUse(HopUse.DryHop);
        hop.setTime(10080.0);

        String xml = _serializer.fromBeerXml(hop, hop.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("HOP", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());
        assertEquals("Fuggles", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("4.5", xpath.evaluate("//ALPHA", document));
        assertEquals("0.25", xpath.evaluate("//AMOUNT", document));
        assertEquals("Dry Hop", xpath.evaluate("//USE", document));
        assertEquals("10080.0", xpath.evaluate("//TIME", document));
    }

    void testHopMashHopsWithAllFieldsInShuffledOrder() {
        Hop hop = new Hop();
        hop.setAmount(0.050);
        hop.setVersion(1);
        hop.setUse(HopUse.Mash);
        hop.setAlphaPercentage(4.5);
        hop.setNotes("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.");
        hop.setTime(45.0);
        hop.setBetaPercentage(5.5);
        hop.setName("Super Hops");
        hop.setPlaceOfOrigin("Planet Krypton");
        hop.setSubstitutes("Goldings, Fuggles, Super Alpha");
        hop.setMyrceneLevel(24.4);
        hop.setHopStabilityIndex(30);
        hop.setForm(HopForm.Leaf);
        hop.setType(HopType.Bittering);
        hop.setCohumuloneLevel(13.2);

        String xml = _serializer.fromBeerXml(hop, hop.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("HOP", documentElement.getTagName());
        assertEquals(15, documentElement.getChildNodes().getLength());
        assertEquals("0.05", xpath.evaluate("//AMOUNT", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Mash", xpath.evaluate("//USE", document));
        assertEquals("4.5", xpath.evaluate("//ALPHA", document));
        assertEquals("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.", xpath.evaluate("//NOTES", document));
        assertEquals("45.0", xpath.evaluate("//TIME", document));
        assertEquals("5.5", xpath.evaluate("//BETA", document));
        assertEquals("Super Hops", xpath.evaluate("//NAME", document));
        assertEquals("Planet Krypton", xpath.evaluate("//ORIGIN", document));
        assertEquals("Goldings, Fuggles, Super Alpha", xpath.evaluate("//SUBSTITUTES", document));
        assertEquals("24.4", xpath.evaluate("//MYRCENE", document));
        assertEquals("30.0", xpath.evaluate("//HSI", document));
        assertEquals("Leaf", xpath.evaluate("//FORM", document));
        assertEquals("Bittering", xpath.evaluate("//TYPE", document));
        assertEquals("13.2", xpath.evaluate("//COHUMULONE", document));
    }
}
