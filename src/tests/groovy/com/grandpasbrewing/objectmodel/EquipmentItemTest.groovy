package com.grandpasbrewing.objectmodel

class EquipmentItemTest extends GroovyTestCase {
    private EquipmentItem _equipmentItem;

    void setUp() {
        super.setUp()

        _equipmentItem = new EquipmentItem();
    }

    void testSetGetBoilSize() {
        _equipmentItem.setBoilSize(1);
        assertEquals(1, _equipmentItem.getBoilSize());
    }

    void testSetGetBatchSize() {
        _equipmentItem.setBatchSize(2);
        assertEquals(2, _equipmentItem.getBatchSize());
    }

    void testSetGetTunVolume() {
        _equipmentItem.setTunVolume(3);
        assertEquals(3, _equipmentItem.getTunVolume());
    }

    void testSetGetTunWeight() {
        _equipmentItem.setTunWeight(4);
        assertEquals(4, _equipmentItem.getTunWeight());
    }

    void testSetGetTunSpecificHeat() {
        _equipmentItem.setTunSpecificHeat(5);
        assertEquals(5, _equipmentItem.getTunSpecificHeat());
    }

    void testSetGetTopUpWater() {
        _equipmentItem.setTopUpWater(6);
        assertEquals(6, _equipmentItem.getTopUpWater());
    }

    void testSetGetTrubChillerLoss() {
        _equipmentItem.setTrubChillerLoss(7);
        assertEquals(7, _equipmentItem.getTrubChillerLoss());
    }

    void testSetGetEvaporationRate() {
        _equipmentItem.setEvaporationRate(8);
        assertEquals(8, _equipmentItem.getEvaporationRate());
    }

    void testSetGetBoilTime() {
        _equipmentItem.setBoilTime(9);
        assertEquals(9, _equipmentItem.getBoilTime());
    }

    void testSetGetCalculateBoilVolume() {
        _equipmentItem.setCalculateBoilVolume(true);
        assertEquals(true, _equipmentItem.getCalculateBoilVolume());
    }

    void testSetGetLauterDeadspace() {
        _equipmentItem.setLauterDeadspace(10);
        assertEquals(10, _equipmentItem.getLauterDeadspace());
    }

    void testSetGetTopUpKettle() {
        _equipmentItem.setTopUpKettle(11);
        assertEquals(11, _equipmentItem.getTopUpKettle());
    }

    void testSetGetHopUtilization() {
        _equipmentItem.setHopUtilization(12);
        assertEquals(12, _equipmentItem.getHopUtilization());
    }

    void testSetGetNotes() {
        _equipmentItem.setNotes("Test Notes");
        assertEquals("Test Notes", _equipmentItem.getNotes());
    }

    void testSetGetDisplayBoilSize() {
        _equipmentItem.setDisplayBoilSize("Test Display Boil Size");
        assertEquals("Test Display Boil Size", _equipmentItem.getDisplayBoilSize());
    }

    void testSetGetDisplayBatchSize() {
        _equipmentItem.setDisplayBatchSize("Test Display Batch Size");
        assertEquals("Test Display Batch Size", _equipmentItem.getDisplayBatchSize());
    }

    void testSetGetDisplayTunVolume() {
        _equipmentItem.setDisplayTunVolume("Test Display Tun Volume");
        assertEquals("Test Display Tun Volume", _equipmentItem.getDisplayTunVolume());
    }

    void testSetGetDisplayTunWeight() {
        _equipmentItem.setDisplayTunWeight("Test Display Tun Weight");
        assertEquals("Test Display Tun Weight", _equipmentItem.getDisplayTunWeight());
    }

    void testSetGetDisplayTopUpWater() {
        _equipmentItem.setDisplayTopUpWater("Test Display Top Up Water");
        assertEquals("Test Display Top Up Water", _equipmentItem.getDisplayTopUpWater());
    }

    void testSetGetDisplayTrubChillerLoss() {
        _equipmentItem.setDisplayTrubChillerLoss("Test Display Trub Chiller Loss");
        assertEquals("Test Display Trub Chiller Loss", _equipmentItem.getDisplayTrubChillerLoss());
    }

    void testSetGetDisplayLauterDeadspace() {
        _equipmentItem.setDisplayLauterDeadspace("Test Display Lauter Deadspace");
        assertEquals("Test Display Lauter Deadspace", _equipmentItem.getDisplayLauterDeadspace());
    }

    void testSetGetDisplayTopUpKettle() {
        _equipmentItem.setDisplayTopUpKettle("Test Display Top Up Kettle");
        assertEquals("Test Display Top Up Kettle", _equipmentItem.getDisplayTopUpKettle());
    }

    void testSetGetId() {
        _equipmentItem.setId(13);
        assertEquals(13, _equipmentItem.getId());
    }
}
