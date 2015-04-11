package com.grandpasbrewing.beerxml.version1.objects

class EquipmentTest extends GroovyTestCase {
    private Equipment _equipment;

    void setUp() {
        super.setUp()

        _equipment = new Equipment();
    }

    void testSetGetBoilSize() {
        _equipment.setBoilSize(1);
        assertEquals(1, _equipment.getBoilSize());
    }

    void testSetGetBatchSize() {
        _equipment.setBatchSize(2);
        assertEquals(2, _equipment.getBatchSize());
    }

    void testSetGetTunVolume() {
        _equipment.setTunVolume(3);
        assertEquals(3, _equipment.getTunVolume());
    }

    void testSetGetTunWeight() {
        _equipment.setTunWeight(4);
        assertEquals(4, _equipment.getTunWeight());
    }

    void testSetGetTunSpecificHeat() {
        _equipment.setTunSpecificHeat(5);
        assertEquals(5, _equipment.getTunSpecificHeat());
    }

    void testSetGetTopUpWater() {
        _equipment.setTopUpWater(6);
        assertEquals(6, _equipment.getTopUpWater());
    }

    void testSetGetTrubChillerLoss() {
        _equipment.setTrubChillerLoss(7);
        assertEquals(7, _equipment.getTrubChillerLoss());
    }

    void testSetGetEvaporationRate() {
        _equipment.setEvaporationRate(8);
        assertEquals(8, _equipment.getEvaporationRate());
    }

    void testSetGetBoilTime() {
        _equipment.setBoilTime(9);
        assertEquals(9, _equipment.getBoilTime());
    }

    void testSetGetCalculateBoilVolume() {
        _equipment.setCalculateBoilVolume(true);
        assertTrue(_equipment.getCalculateBoilVolume());
    }

    void testSetGetLauterDeadspace() {
        _equipment.setLauterDeadspace(10);
        assertEquals(10, _equipment.getLauterDeadspace());
    }

    void testSetGetTopUpKettle() {
        _equipment.setTopUpKettle(11);
        assertEquals(11, _equipment.getTopUpKettle());
    }

    void testSetGetHopUtilization() {
        _equipment.setHopUtilization(12);
        assertEquals(12, _equipment.getHopUtilization());
    }

    void testSetGetNotes() {
        _equipment.setNotes("Test Notes");
        assertEquals("Test Notes", _equipment.getNotes());
    }

    void testSetGetDisplayBoilSize() {
        _equipment.setDisplayBoilSize("Test Display Boil Size");
        assertEquals("Test Display Boil Size", _equipment.getDisplayBoilSize());
    }

    void testSetGetDisplayBatchSize() {
        _equipment.setDisplayBatchSize("Test Display Batch Size");
        assertEquals("Test Display Batch Size", _equipment.getDisplayBatchSize());
    }

    void testSetGetDisplayTunVolume() {
        _equipment.setDisplayTunVolume("Test Display Tun Volume");
        assertEquals("Test Display Tun Volume", _equipment.getDisplayTunVolume());
    }

    void testSetGetDisplayTunWeight() {
        _equipment.setDisplayTunWeight("Test Display Tun Weight");
        assertEquals("Test Display Tun Weight", _equipment.getDisplayTunWeight());
    }

    void testSetGetDisplayTopUpWater() {
        _equipment.setDisplayTopUpWater("Test Display Top Up Water");
        assertEquals("Test Display Top Up Water", _equipment.getDisplayTopUpWater());
    }

    void testSetGetDisplayTrubChillerLoss() {
        _equipment.setDisplayTrubChillerLoss("Test Display Trub Chiller Loss");
        assertEquals("Test Display Trub Chiller Loss", _equipment.getDisplayTrubChillerLoss());
    }

    void testSetGetDisplayLauterDeadspace() {
        _equipment.setDisplayLauterDeadspace("Test Display Lauter Deadspace");
        assertEquals("Test Display Lauter Deadspace", _equipment.getDisplayLauterDeadspace());
    }

    void testSetGetDisplayTopUpKettle() {
        _equipment.setDisplayTopUpKettle("Test Display Top Up Kettle");
        assertEquals("Test Display Top Up Kettle", _equipment.getDisplayTopUpKettle());
    }

    void testSetGetName() {
        _equipment.setName("Test Name");
        assertEquals("Test Name", _equipment.getName());
    }

    void testSetGetVersion() {
        _equipment.setVersion(13);
        assertEquals(13, _equipment.getVersion());
    }
}
