package com.grandpasbrewing.beerxml.version1.objects

import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopType
import com.grandpasbrewing.beerxml.version1.enums.HopUse

class HopTest extends GroovyTestCase {
    private Hop _hop;

    void setUp() {
        super.setUp()

        _hop = new Hop();
    }

    void testSetGetAlphaPercentage() {
        _hop.setAlphaPercentage(1);
        assertEquals(1, _hop.getAlphaPercentage());
    }

    void testSetGetAmount() {
        _hop.setAmount(2);
        assertEquals(2, _hop.getAmount());
    }

    void testSetGetUse() {
        _hop.setUse(HopUse.DryHop);
        assertEquals(HopUse.DryHop, _hop.getUse());
    }

    void testSetGetTime() {
        _hop.setTime(3);
        assertEquals(3, _hop.getTime());
    }

    void testSetGetNotes() {
        _hop.setNotes("Test Notes");
        assertEquals("Test Notes", _hop.getNotes());
    }

    void testSetGetType() {
        _hop.setType(HopType.Bittering);
        assertEquals(HopType.Bittering, _hop.getType());
    }

    void testSetGetForm() {
        _hop.setForm(HopForm.Pellet);
        assertEquals(HopForm.Pellet, _hop.getForm());
    }

    void testSetGetBetaPercentage() {
        _hop.setBetaPercentage(4);
        assertEquals(4, _hop.getBetaPercentage());
    }

    void testSetGetHopStabilityIndex() {
        _hop.setHopStabilityIndex(5);
        assertEquals(5, _hop.getHopStabilityIndex());
    }

    void testSetGetPlaceOfOrigin() {
        _hop.setPlaceOfOrigin("Test Place Of Origin");
        assertEquals("Test Place Of Origin", _hop.getPlaceOfOrigin());
    }

    void testSetGetSubstitutes() {
        _hop.setSubstitutes("Test Substitutes");
        assertEquals("Test Substitutes", _hop.getSubstitutes());
    }

    void testSetGetHumuleneLevel() {
        _hop.setHumuleneLevel(6);
        assertEquals(6, _hop.getHumuleneLevel());
    }

    void testSetGetCaryophylleneLevel() {
        _hop.setCaryophylleneLevel(7);
        assertEquals(7, _hop.getCaryophylleneLevel());
    }

    void testSetGetCohumuloneLevel() {
        _hop.setCohumuloneLevel(8);
        assertEquals(8, _hop.getCohumuloneLevel());
    }

    void testSetGetMyrceneLevel() {
        _hop.setMyrceneLevel(9);
        assertEquals(9, _hop.getMyrceneLevel());
    }

    void testSetGetDisplayAmount() {
        _hop.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _hop.getDisplayAmount());
    }

    void testSetGetInventory() {
        _hop.setInventory("Test Inventory");
        assertEquals("Test Inventory", _hop.getInventory());
    }

    void testSetGetDisplayTime() {
        _hop.setDisplayTime("Test Display Time");
        assertEquals("Test Display Time", _hop.getDisplayTime());
    }

    void testSetGetName() {
        _hop.setName("Test Name");
        assertEquals("Test Name", _hop.getName());
    }

    void testSetGetVersion() {
        _hop.setVersion(10);
        assertEquals(10, _hop.getVersion());
    }
}
