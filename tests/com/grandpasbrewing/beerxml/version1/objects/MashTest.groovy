package com.grandpasbrewing.beerxml.version1.objects

class MashTest extends GroovyTestCase {
    private Mash _mash;

    void setUp() {
        super.setUp()

        _mash = new Mash();
    }

    void testSetGetGrainTemperature() {
        _mash.setGrainTemperature(1);
        assertEquals(1, _mash.getGrainTemperature());
    }

    void testSetGetMashSteps() {
        ArrayList<MashStep> list = new ArrayList<MashStep>()
        list.add(new MashStep());
        list.add(new MashStep());
        list.add(new MashStep());

        _mash.setMashSteps(list);
        assertEquals(3, _mash.getMashSteps().size());
    }

    void testSetGetNotes() {
        _mash.setNotes("Test Notes");
        assertEquals("Test Notes", _mash.getNotes());
    }

    void testSetGetTunTemperature() {
        _mash.setTunTemperature(2);
        assertEquals(2, _mash.getTunTemperature());
    }

    void testSetGetSpargeTemperature() {
        _mash.setSpargeTemperature(3);
        assertEquals(3, _mash.getSpargeTemperature());
    }

    void testSetGetPH() {
        _mash.setPH(4);
        assertEquals(4, _mash.getPH());
    }

    void testSetGetTunWeight() {
        _mash.setTunWeight(5);
        assertEquals(5, _mash.getTunWeight());
    }

    void testSetGetTunSpecificHeat() {
        _mash.setTunSpecificHeat(6);
        assertEquals(6, _mash.getTunSpecificHeat());
    }

    void testSetGetEquipmentAdjust() {
        _mash.setEquipmentAdjust(true);
        assertEquals(true, _mash.getEquipmentAdjust());
    }

    void testSetGetDisplayGrainTemperature() {
        _mash.setDisplayGrainTemperature("Test Display Grain Temperature");
        assertEquals("Test Display Grain Temperature", _mash.getDisplayGrainTemperature());
    }

    void testSetGetDisplayTunTemperature() {
        _mash.setDisplayTunTemperature("Test Display Tun Temperature");
        assertEquals("Test Display Tun Temperature", _mash.getDisplayTunTemperature());
    }

    void testSetGetDisplaySpargeTemperature() {
        _mash.setDisplaySpargeTemperature("Test Display Sparge Temperature");
        assertEquals("Test Display Sparge Temperature", _mash.getDisplaySpargeTemperature());
    }

    void testSetGetDisplayTunWeight() {
        _mash.setDisplayTunWeight("Test Display Tun Weight");
        assertEquals("Test Display Tun Weight", _mash.getDisplayTunWeight());
    }

    void testSetName() {
        _mash.setName("Test Name");
        assertEquals("Test Name", _mash.getName());
    }

    void testSetVersion() {
        _mash.setVersion(7);
        assertEquals(7, _mash.getVersion());
    }
}
