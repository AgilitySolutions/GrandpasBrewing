package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.objects.Equipment
import com.grandpasbrewing.objectmodel.EquipmentItem


class EquipmentConverterTest extends GroovyTestCase {
    private EquipmentConverter _equipmentConverter;

    void setUp() {
        super.setUp()

        _equipmentConverter = new EquipmentConverter();
    }

    void testToObjectModelNull() {
        EquipmentItem equipmentItem = _equipmentConverter.toObjectModel(null);

        assertNull(equipmentItem);
    }

    void testToObjectModelEquipment() {
        Equipment beerXmlEquipment = new Equipment();

        beerXmlEquipment.setName("8 Gal pot with 5 gal Igloo Cooler");
        beerXmlEquipment.setVersion(1);
        beerXmlEquipment.setTunVolume(18.93);
        beerXmlEquipment.setTunWeight(2.0);
        beerXmlEquipment.setTunSpecificHeat(0.3);
        beerXmlEquipment.setBatchSize(18.93);
        beerXmlEquipment.setBoilSize(22.71);
        beerXmlEquipment.setTopUpWater(0.0);
        beerXmlEquipment.setTrubChillerLoss(0.95);
        beerXmlEquipment.setEvaporationRate(9.0);
        beerXmlEquipment.setBoilTime(60.0);
        beerXmlEquipment.setCalculateBoilVolume(true);
        beerXmlEquipment.setLauterDeadspace(0.95);
        beerXmlEquipment.setTopUpKettle(0.0);
        beerXmlEquipment.setHopUtilization(100.0);
        beerXmlEquipment.setNotes("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.");

        EquipmentItem equipmentItem = _equipmentConverter.toObjectModel(beerXmlEquipment);

        assertEquals("8 Gal pot with 5 gal Igloo Cooler", equipmentItem.getName());
        assertEquals(1,  equipmentItem.getVersion());
        assertEquals(22.71, equipmentItem.getBoilSize());
        assertEquals(18.93, equipmentItem.getBatchSize());
        assertEquals(18.93, equipmentItem.getTunVolume());
        assertEquals(2.0, equipmentItem.getTunWeight());
        assertEquals(0.3, equipmentItem.getTunSpecificHeat());
        assertEquals(0.0, equipmentItem.getTopUpWater());
        assertEquals(0.95, equipmentItem.getTrubChillerLoss());
        assertEquals(9.0, equipmentItem.getEvaporationRate());
        assertEquals(60.0, equipmentItem.getBoilTime());
        assertEquals(true, equipmentItem.getCalculateBoilVolume());
        assertEquals(0.95, equipmentItem.getLauterDeadspace());
        assertEquals(0.0, equipmentItem.getTopUpKettle());
        assertEquals(100.0, equipmentItem.getHopUtilization());
        assertEquals("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.", equipmentItem.getNotes());
        assertNull(equipmentItem.getDisplayBoilSize());
        assertNull(equipmentItem.getDisplayBatchSize());
        assertNull(equipmentItem.getDisplayTunVolume());
        assertNull(equipmentItem.getDisplayTunWeight());
        assertNull(equipmentItem.getDisplayTopUpWater());
        assertNull(equipmentItem.getDisplayTrubChillerLoss());
        assertNull(equipmentItem.getDisplayLauterDeadspace());
        assertNull(equipmentItem.getDisplayTopUpKettle());
    }

    void testFromObjectModelNull() {
        Equipment equipment = _equipmentConverter.fromObjectModel(null);

        assertNull(equipment);
    }

    void testFrombjectModelEquipment() {
        EquipmentItem objectModelEquipmentItem = new EquipmentItem();

        objectModelEquipmentItem.setName("8 Gal pot with 5 gal Igloo Cooler");
        objectModelEquipmentItem.setVersion(1);
        objectModelEquipmentItem.setTunVolume(18.93);
        objectModelEquipmentItem.setTunWeight(2.0);
        objectModelEquipmentItem.setTunSpecificHeat(0.3);
        objectModelEquipmentItem.setBatchSize(18.93);
        objectModelEquipmentItem.setBoilSize(22.71);
        objectModelEquipmentItem.setTopUpWater(0.0);
        objectModelEquipmentItem.setTrubChillerLoss(0.95);
        objectModelEquipmentItem.setEvaporationRate(9.0);
        objectModelEquipmentItem.setBoilTime(60.0);
        objectModelEquipmentItem.setCalculateBoilVolume(true);
        objectModelEquipmentItem.setLauterDeadspace(0.95);
        objectModelEquipmentItem.setTopUpKettle(0.0);
        objectModelEquipmentItem.setHopUtilization(100.0);
        objectModelEquipmentItem.setNotes("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.");

        Equipment equipment = _equipmentConverter.fromObjectModel(objectModelEquipmentItem);

        assertEquals("8 Gal pot with 5 gal Igloo Cooler", equipment.getName());
        assertEquals(1,  equipment.getVersion());
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
        assertEquals("Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes.", equipment.getNotes());
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
