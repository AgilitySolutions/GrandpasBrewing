package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.FermentableType
import com.grandpasbrewing.beerxml.version1.objects.Fermentable
import com.grandpasbrewing.beerxml.version1.serialization.BeerXmlSerializer

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class FermentableBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Fermentable>();
    }

    void testFermentableRequiredFieldsOnly() {
        Fermentable fermentable = new Fermentable();
        fermentable.setName("Pale 2-row Malt");
        fermentable.setVersion(1);
        fermentable.setAmount(5.0);
        fermentable.setType(FermentableType.Grain);
        fermentable.setYield(73.4);
        fermentable.setColor(3.0);

        String xml = _serializer.fromBeerXml(fermentable, fermentable.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("FERMENTABLE", documentElement.getTagName());
        assertEquals(6, documentElement.getChildNodes().getLength());
        assertEquals("Pale 2-row Malt", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("5.0", xpath.evaluate("//AMOUNT", document));
        assertEquals("Grain", xpath.evaluate("//TYPE", document));
        assertEquals("73.4", xpath.evaluate("//YIELD", document));
        assertEquals("3.0", xpath.evaluate("//COLOR", document));
    }

    void testFermentableFermentableHoppedExtract() {
        Fermentable fermentable = new Fermentable();
        fermentable.setName("Fustons Hopped Amber");
        fermentable.setVersion(1);
        fermentable.setAmount(0.50);
        fermentable.setNotes("Hopped amber extract suitable as a base for english ales.");
        fermentable.setYield(78.0);
        fermentable.setType(FermentableType.Extract);
        fermentable.setColor(13);
        fermentable.setIBUGallonsPerPound(16.6);

        String xml = _serializer.fromBeerXml(fermentable, fermentable.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("FERMENTABLE", documentElement.getTagName());
        assertEquals(8, documentElement.getChildNodes().getLength());
        assertEquals("Fustons Hopped Amber", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("0.5", xpath.evaluate("//AMOUNT", document));
        assertEquals("Hopped amber extract suitable as a base for english ales.", xpath.evaluate("//NOTES", document));
        assertEquals("78.0", xpath.evaluate("//YIELD", document));
        assertEquals("Extract", xpath.evaluate("//TYPE", document));
        assertEquals("13.0", xpath.evaluate("//COLOR", document));
        assertEquals("16.6", xpath.evaluate("//IBU_GAL_PER_LB", document));
    }

    void testFermentableCrystalMaltSpecialtyGrainWithAllApplicableFields() {
        Fermentable fermentable = new Fermentable();
        fermentable.setName("Crystal 40 L");
        fermentable.setVersion(1);
        fermentable.setAmount(0.50);
        fermentable.setType(FermentableType.Grain);
        fermentable.setYield(74.0);
        fermentable.setColor(40.0);
        fermentable.setPlaceOfOrigin("United Kingdom");
        fermentable.setSupplier("Fussybrewer Malting");
        fermentable.setNotes("Darker crystal malt. Adds body and improves head retention. Also called caramel malt.");
        fermentable.setCoarseFineDiff(1.5);
        fermentable.setMoisture(4.0);
        fermentable.setDiastaticPower(0.0);
        fermentable.setProtein(13.2);
        fermentable.setMaximumInBatch(10.0);
        fermentable.setRecommendMash(false);

        String xml = _serializer.fromBeerXml(fermentable, fermentable.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("FERMENTABLE", documentElement.getTagName());
        assertEquals(15, documentElement.getChildNodes().getLength());
        assertEquals("Crystal 40 L", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("0.5", xpath.evaluate("//AMOUNT", document));
        assertEquals("Grain", xpath.evaluate("//TYPE", document));
        assertEquals("74.0", xpath.evaluate("//YIELD", document));
        assertEquals("40.0", xpath.evaluate("//COLOR", document));
        assertEquals("United Kingdom", xpath.evaluate("//ORIGIN", document));
        assertEquals("Fussybrewer Malting", xpath.evaluate("//SUPPLIER", document));
        assertEquals("Darker crystal malt. Adds body and improves head retention. Also called caramel malt.", xpath.evaluate("//NOTES", document));
        assertEquals("1.5", xpath.evaluate("//COARSE_FINE_DIFF", document));
        assertEquals("4.0", xpath.evaluate("//MOISTURE", document));
        assertEquals("0.0", xpath.evaluate("//DIASTATIC_POWER", document));
        assertEquals("13.2", xpath.evaluate("//PROTEIN", document));
        assertEquals("10.0", xpath.evaluate("//MAX_IN_BATCH", document));
        assertEquals("false", xpath.evaluate("//RECOMMEND_MASH", document));
    }
}
