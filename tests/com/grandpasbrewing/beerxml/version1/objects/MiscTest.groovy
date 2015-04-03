package com.grandpasbrewing.beerxml.version1.objects

import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.beerxml.version1.enums.MiscUse

class MiscTest extends GroovyTestCase {
    private Misc _misc;

    void setUp() {
        super.setUp()

        _misc = new Misc();
    }

    void testSetGetType() {
        _misc.setType(MiscType.Herb);
        assertEquals(MiscType.Herb, _misc.getType());
    }

    void testSetGetUse() {
        _misc.setUse(MiscUse.Primary);
        assertEquals(MiscUse.Primary, _misc.getUse());
    }

    void testSetGetTime() {
        _misc.setTime(1);
        assertEquals(1, _misc.getTime());
    }

    void testSetGetAmount() {
        _misc.setAmount(2);
        assertEquals(2, _misc.getAmount());
    }

    void testSetGetAmountIsWeight() {
        _misc.setAmountIsWeight(true);
        assertTrue(_misc.getAmountIsWeight());
    }

    void testSetGetUseFor() {
        _misc.setUseFor("Test Use For");
        assertEquals("Test Use For", _misc.getUseFor());
    }

    void testSetGetNotes() {
        _misc.setNotes("Test Notes");
        assertEquals("Test Notes", _misc.getNotes());
    }

    void testSetGetDisplayAmount() {
        _misc.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _misc.getDisplayAmount());
    }

    void testSetGetInventory() {
        _misc.setInventory("Test Inventory");
        assertEquals("Test Inventory", _misc.getInventory());
    }

    void testSetGetDisplayTime() {
        _misc.setDisplayTime("Test Display Time");
        assertEquals("Test Display Time", _misc.getDisplayTime());
    }

    void testSetGetName() {
        _misc.setName("Test Name");
        assertEquals("Test Name", _misc.getName());
    }

    void testSetGetVersion() {
        _misc.setVersion(3);
        assertEquals(3, _misc.getVersion());
    }
}
