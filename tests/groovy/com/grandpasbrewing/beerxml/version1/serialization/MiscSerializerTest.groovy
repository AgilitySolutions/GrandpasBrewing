package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.objects.Misc

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class MiscSerializerTest extends GroovyTestCase {
    private Serializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new Serializer<Misc>();
    }

    void testMiscIrishMossWithMinimalFields() {
        Misc misc = new Misc();
        misc.setName("Irish Moss");
        misc.setVersion(1);
        misc.setType(MiscType.Fining);
        misc.setUse(MiscUse.Boil);
        misc.setTime(15.0);
        misc.setAmount(0.010);

        String xml = _serializer.fromBeerXml(misc, misc.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("MISC", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());
        assertEquals("Irish Moss", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Fining", xpath.evaluate("//TYPE", document));
        assertEquals("Boil", xpath.evaluate("//USE", document));
        assertEquals("15.0", xpath.evaluate("//TIME", document));
        assertEquals("0.01", xpath.evaluate("//AMOUNT", document));
    }

    void testMiscCorianderSpiceWithATypicalSetOfFields() {
        Misc misc = new Misc();
        misc.setName("Coriander");
        misc.setType(MiscType.Spice);
        misc.setVersion(1);
        misc.setUse(MiscUse.Boil);
        misc.setTime(5.0);
        misc.setAmount(0.025);
        misc.setUseFor("Belgian Wit Spice");
        misc.setNotes("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.");

        String xml = _serializer.fromBeerXml(misc, misc.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);
        assertEquals("MISC", documentElement.getTagName());
        assertEquals(8, documentElement.getChildNodes().getLength());
        assertEquals("Coriander", xpath.evaluate("//NAME", document));
        assertEquals("Spice", xpath.evaluate("//TYPE", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("Boil", xpath.evaluate("//USE", document));
        assertEquals("5.0", xpath.evaluate("//TIME", document));
        assertEquals("0.025", xpath.evaluate("//AMOUNT", document));
        assertEquals("Belgian Wit Spice", xpath.evaluate("//USE_FOR", document));
        assertEquals(
                "Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.",
                xpath.evaluate("//NOTES", document));
    }
}
