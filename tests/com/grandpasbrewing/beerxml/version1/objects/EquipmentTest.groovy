package com.grandpasbrewing.beerxml.version1.objects

class EquipmentTest extends GroovyTestCase {
    private Equipment _equipment;

    void setUp() {
        super.setUp()

        _equipment = new Equipment();
    }

    void testGetBoilSize() {
        _equipment.setBoilSize(1);
        assertEquals(1, _equipment.getBoilSize());
    }

    void testGetBatchSize() {
        _equipment.setBatchSize(2);
        assertEquals(2, _equipment.getBatchSize());
    }

    void testGetTunVolume() {
        _equipment.setTunVolume(3);
        assertEquals(3, _equipment.getTunVolume());
    }

    void testGetTunWeight() {
        _equipment.setTunWeight(4);
        assertEquals(4, _equipment.getTunWeight());
    }

    void testGetTunSpecificHeat() {
        _equipment.setTunSpecificHeat(5);
        assertEquals(5, _equipment.getTunSpecificHeat());
    }

    void testGetTopUpWater() {
        _equipment.setTopUpWater(6);
        assertEquals(6, _equipment.getTopUpWater());
    }

    void testGetTrubChillerLoss() {
        _equipment.setTrubChillerLoss(7);
        assertEquals(7, _equipment.getTrubChillerLoss());
    }

    void testGetEvaporationRate() {
        _equipment.setEvaporationRate(8);
        assertEquals(8, _equipment.getEvaporationRate());
    }

    void testGetBoilTime() {
        _equipment.setBoilTime(9);
        assertEquals(9, _equipment.getBoilTime());
    }

    void testGetCalculateBoilVolume() {
        _equipment.setCalculateBoilVolume(true);
        assertTrue(_equipment.getCalculateBoilVolume());
    }

    void testGetLauterDeadspace() {
        _equipment.setLauterDeadspace(10);
        assertEquals(10, _equipment.getLauterDeadspace());
    }

    void testGetTopUpKettle() {
        _equipment.setTopUpKettle(11);
        assertEquals(11, _equipment.getTopUpKettle());
    }

    void testGetHopUtilization() {
        _equipment.setHopUtilization(12);
        assertEquals(12, _equipment.getHopUtilization());
    }

    void testGetNotes() {
        _equipment.setNotes("Test Notes");
        assertEquals("Test Notes", _equipment.getNotes());
    }

    void testGetDisplayBoilSize() {
        _equipment.setDisplayBoilSize("Test Display Boil Size");
        assertEquals("Test Display Boil Size", _equipment.getDisplayBoilSize());
    }

    void testGetDisplayBatchSize() {
        _equipment.setDisplayBatchSize("Test Display Batch Size");
        assertEquals("Test Display Batch Size", _equipment.getDisplayBatchSize());
    }

    void testGetDisplayTunVolume() {
        _equipment.setDisplayTunVolume("Test Display Tun Volume");
        assertEquals("Test Display Tun Volume", _equipment.getDisplayTunVolume());
    }

    void testGetDisplayTunWeight() {
        _equipment.setDisplayTunWeight("Test Display Tun Weight");
        assertEquals("Test Display Tun Weight", _equipment.getDisplayTunWeight());
    }

    void testGetDisplayTopUpWater() {
        _equipment.setDisplayTopUpWater("Test Display Top Up Water");
        assertEquals("Test Display Top Up Water", _equipment.getDisplayTopUpWater());
    }

    void testGetDisplayTrubChillerLoss() {
        _equipment.setDisplayTrubChillerLoss("Test Display Trub Chiller Loss");
        assertEquals("Test Display Trub Chiller Loss", _equipment.getDisplayTrubChillerLoss());
    }

    void testGetDisplayLauterDeadspace() {
        _equipment.setDisplayLauterDeadspace("Test Display Lauter Deadspace");
        assertEquals("Test Display Lauter Deadspace", _equipment.getDisplayLauterDeadspace());
    }

    void testGetDisplayTopUpKettle() {
        _equipment.setDisplayTopUpKettle("Test Display Top Up Kettle");
        assertEquals("Test Display Top Up Kettle", _equipment.getDisplayTopUpKettle());
    }

    void testGetName() {
        _equipment.setName("Test Name");
        assertEquals("Test Name", _equipment.getName());
    }

    void testGetVersion() {
        _equipment.setVersion(13);
        assertEquals(13, _equipment.getVersion());
    }
}
