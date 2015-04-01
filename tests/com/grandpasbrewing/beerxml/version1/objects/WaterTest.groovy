package com.grandpasbrewing.beerxml.version1.objects

class WaterTest extends GroovyTestCase {
    private Water _water;

    void setUp() {
        super.setUp()

        _water = new Water();
    }

    void testSetGetAmount() {
        _water.setAmount(1);
        assertEquals(1, _water.getAmount());
    }

    void testSetGetCalcium() {
        _water.setCalcium(2);
        assertEquals(2, _water.getCalcium());
    }

    void testSetGetBicarbonate() {
        _water.setBicarbonate(3);
        assertEquals(3, _water.getBicarbonate());
    }

    void testSetGetSulfate() {
        _water.setSulfate(4);
        assertEquals(4, _water.getSulfate());
    }

    void testSetGetChloride() {
        _water.setChloride(5);
        assertEquals(5, _water.getChloride());
    }

    void testSetGetSodium() {
        _water.setSodium(6);
        assertEquals(6, _water.getSodium());
    }

    void testSetGetMagnesium() {
        _water.setMagnesium(7);
        assertEquals(7, _water.getMagnesium());
    }

    void testSetGetPH() {
        _water.setPH(8);
        assertEquals(8, _water.getPH());
    }

    void testSetGetNotes() {
        _water.setNotes("Test Notes");
        assertEquals("Test Notes", _water.getNotes());
    }

    void testSetGetDisplayAmount() {
        _water.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _water.getDisplayAmount());
    }

    void testSetGetName() {
        _water.setName("Test Name");
        assertEquals("Test Name", _water.getName());
    }

    void testSetGetVersion() {
        _water.setVersion(9);
        assertEquals(9, _water.getVersion());
    }
}
