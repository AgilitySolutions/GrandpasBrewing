package com.grandpasbrewing.objectmodel

import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse

class MiscellaneousItemTest extends GroovyTestCase {
    private MiscellaneousItem _miscellaneousItem;

    void setUp() {
        super.setUp()

        _miscellaneousItem = new MiscellaneousItem();
    }

    void testSetGetType() {
        _miscellaneousItem.setType(MiscellaneousItemType.Fining);
        assertEquals(MiscellaneousItemType.Fining, _miscellaneousItem.getType());
    }

    void testSetGetUse() {
        _miscellaneousItem.setUse(MiscellaneousItemUse.Boil);
        assertEquals(MiscellaneousItemUse.Boil, _miscellaneousItem.getUse());
    }

    void testSetGetTime() {
        _miscellaneousItem.setTime(1);
        assertEquals(1, _miscellaneousItem.getTime());
    }

    void testSetGetAmount() {
        _miscellaneousItem.setAmount(2);
        assertEquals(2, _miscellaneousItem.getAmount());
    }

    void testSetGetAmountIsWeight() {
        _miscellaneousItem.setAmountIsWeight(true);
        assertEquals(true, _miscellaneousItem.getAmountIsWeight());
    }

    void testSetGetUseFor() {
        _miscellaneousItem.setUseFor("Test Use For");
        assertEquals("Test Use For", _miscellaneousItem.getUseFor());
    }

    void testSetGetNotes() {
        _miscellaneousItem.setNotes("Test Notes");
        assertEquals("Test Notes", _miscellaneousItem.getNotes());
    }

    void testSetGetDisplayAmount() {
        _miscellaneousItem.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _miscellaneousItem.getDisplayAmount());
    }

    void testSetGetInventory() {
        _miscellaneousItem.setInventory("Test Inventory");
        assertEquals("Test Inventory", _miscellaneousItem.getInventory());
    }

    void testSetGetDisplayTime() {
        _miscellaneousItem.setDisplayTime("Test Display Time");
        assertEquals("Test Display Time", _miscellaneousItem.getDisplayTime());
    }

    void testSetGetId() {
        _miscellaneousItem.setId(3);
        assertEquals(3, _miscellaneousItem.getId());
    }
}
