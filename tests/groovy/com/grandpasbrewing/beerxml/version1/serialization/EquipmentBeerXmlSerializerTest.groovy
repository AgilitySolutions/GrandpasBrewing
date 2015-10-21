package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.objects.Equipment

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathFactory

class EquipmentBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Equipment>();
    }

    void testStyleFromBeerXml() {
        Equipment equipment = new Equipment();
        equipment.setName("8 Gal pot with 5 gal Igloo Cooler");
        equipment.setVersion(1);
        equipment.setTunVolume(18.93);
        equipment.setTunWeight(2.0);
        equipment.setTunSpecificHeat(0.3);
        equipment.setBatchSize(18.93);
        equipment.setBoilSize(22.71);
        equipment.setTopUpWater(0.0);
        equipment.setTrubChillerLoss(0.95);
        equipment.setEvaporationRate(9.0);
        equipment.setBoilTime(60.0);
        equipment.setCalculateBoilVolume(true);
        equipment.setLauterDeadspace(0.95);
        equipment.setTopUpKettle(0.0);
        equipment.setHopUtilization(100.0);
        equipment.setNotes("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.");

        String xml = _serializer.fromBeerXml(equipment, equipment.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("EQUIPMENT", documentElement.getTagName());
        assertEquals(16, documentElement.getChildNodes().getLength());
        assertEquals("8 Gal pot with 5 gal Igloo Cooler", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("18.93", xpath.evaluate("//TUN_VOLUME", document));
        assertEquals("2.0", xpath.evaluate("//TUN_WEIGHT", document));
        assertEquals("0.3", xpath.evaluate("//TUN_SPECIFIC_HEAT", document));
        assertEquals("18.93", xpath.evaluate("//BATCH_SIZE", document));
        assertEquals("22.71", xpath.evaluate("//BOIL_SIZE", document));
        assertEquals("0.0", xpath.evaluate("//TOP_UP_WATER", document));
        assertEquals("0.95", xpath.evaluate("//TRUB_CHILLER_LOSS", document));
        assertEquals("9.0", xpath.evaluate("//EVAP_RATE", document));
        assertEquals("60.0", xpath.evaluate("//BOIL_TIME", document));
        assertEquals("true", xpath.evaluate("//CALC_BOIL_VOLUME", document));
        assertEquals("0.95", xpath.evaluate("//LAUTER_DEADSPACE", document));
        assertEquals("0.0", xpath.evaluate("//TOP_UP_KETTLE", document));
        assertEquals("100.0", xpath.evaluate("//HOP_UTILIZATION", document));
        assertEquals("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.", xpath.evaluate("//NOTES", document));
    }
}
