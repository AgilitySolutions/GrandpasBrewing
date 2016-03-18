package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.objects.Equipment

class EquipmentBeerXmlDeserializerTest extends GroovyTestCase {
    private BeerXmlDeserializer _deserializer;
    private String _equipmentXml;

    void setUp() {
        super.setUp()

        _deserializer = new BeerXmlDeserializer<Equipment>();

        _equipmentXml = "<EQUIPMENT>" +
                "<NAME>8 Gal pot with 5 gal Igloo Cooler</NAME>" +
                 "<VERSION>1</VERSION>" +
                "<TUN_VOLUME>18.93</TUN_VOLUME>" +
                "<TUN_WEIGHT>2.0</TUN_WEIGHT>" +
                "<TUN_SPECIFIC_HEAT>0.3</TUN_SPECIFIC_HEAT>" +
                "<BATCH_SIZE>18.93</BATCH_SIZE>" +
                "<BOIL_SIZE>22.71</BOIL_SIZE>" +
                "<TOP_UP_WATER>0.0</TOP_UP_WATER>" +
                "<TRUB_CHILLER_LOSS>0.95</TRUB_CHILLER_LOSS>" +
                "<EVAP_RATE>9.0</EVAP_RATE>" +
                "<BOIL_TIME>60.0</BOIL_TIME>" +
                "<CALC_BOIL_VOLUME>TRUE</CALC_BOIL_VOLUME>" +
                "<LAUTER_DEADSPACE>0.95</LAUTER_DEADSPACE>" +
                "<TOP_UP_KETTLE>0.0</TOP_UP_KETTLE>" +
                "<HOP_UTILIZATION>100.0</HOP_UTILIZATION>" +
                "<NOTES>Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.</NOTES>" +
                "</EQUIPMENT>";
    }

    void testToBeerXml() {
        Equipment equipment = (Equipment) _deserializer.toBeerXml(_equipmentXml, Equipment.class);

        assertEquals("8 Gal pot with 5 gal Igloo Cooler", equipment.getName());
        assertEquals(1, equipment.getVersion());
        assertEquals(22.71, equipment.getBoilSize());
        assertEquals(18.93, equipment.getBatchSize());
        assertEquals(18.93, equipment.getTunVolume());
        assertEquals(2.0, equipment.getTunWeight());
        assertEquals(0.3, equipment.getTunSpecificHeat());
        assertEquals(0.0, equipment.getTopUpWater());
        assertEquals(0.95, equipment.getTrubChillerLoss());
        assertEquals(9.0, equipment.getEvaporationRate());
        assertEquals(60.0, equipment.getBoilTime());
        assertEquals(true, equipment.getCalculateBoilVolume());
        assertEquals(0.95, equipment.getLauterDeadspace());
        assertEquals(0.0, equipment.getTopUpKettle());
        assertEquals(100.0, equipment.getHopUtilization());
        assertEquals(
                "Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.",
                equipment.getNotes());
        assertNull(equipment.getDisplayBoilSize());
        assertNull(equipment.getDisplayBatchSize());
        assertNull(equipment.getDisplayTunVolume());
        assertNull(equipment.getDisplayTunWeight());
        assertNull(equipment.getDisplayTopUpWater());
        assertNull(equipment.getDisplayTrubChillerLoss());
        assertNull(equipment.getDisplayLauterDeadspace());
        assertNull(equipment.getDisplayTopUpKettle());
    }
}
