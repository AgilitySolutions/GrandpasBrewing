package com.grandpasbrewing.beerxml.version1.objects

import com.grandpasbrewing.beerxml.version1.enums.FermentableType

class FermentableTest extends GroovyTestCase {
    private Fermentable _fermentable;

    void setUp() {
        super.setUp()

        _fermentable = new Fermentable();
    }

    void testSetGetType() {
        _fermentable.setType(FermentableType.DryExtract);
        assertEquals(FermentableType.DryExtract, _fermentable.getType());
    }

    void testSetGetAmount() {
        _fermentable.setAmount(1);
        assertEquals(1, _fermentable.getAmount());
    }

    void testSetGetYield() {
        _fermentable.setYield(2);
        assertEquals(2, _fermentable.getYield());
    }

    void testSetGetColor() {
        _fermentable.setColor(3);
        assertEquals(3, _fermentable.getColor());
    }

    void testSetGetAddAfterBoil() {
        _fermentable.setAddAfterBoil(true);
        assertEquals(true, _fermentable.getAddAfterBoil());
    }

    void testSetGetPlaceOfOrigin() {
        _fermentable.setPlaceOfOrigin("Test Place Of Origin");
        assertEquals("Test Place Of Origin", _fermentable.getPlaceOfOrigin());
    }

    void testSetGetSupplier() {
        _fermentable.setSupplier("Test Supplier");
        assertEquals("Test Supplier", _fermentable.getSupplier());
    }

    void testSetGetNotes() {
        _fermentable.setNotes("Test Notes");
        assertEquals("Test Notes", _fermentable.getNotes());
    }

    void testSetGetCoarseFineDiff() {
        _fermentable.setCoarseFineDiff(4);
        assertEquals(4, _fermentable.getCoarseFineDiff());
    }

    void testSetGetMoisture() {
        _fermentable.setMoisture(5);
        assertEquals(5, _fermentable.getMoisture());
    }

    void testSetGetDiastaticPower() {
        _fermentable.setDiastaticPower(6);
        assertEquals(6, _fermentable.getDiastaticPower());
    }

    void testSetGetProtein() {
        _fermentable.setProtein(7);
        assertEquals(7, _fermentable.getProtein());
    }

    void testSetGetMaximumInBatch() {
        _fermentable.setMaximumInBatch(8);
        assertEquals(8, _fermentable.getMaximumInBatch());
    }

    void testSetGetRecommendMash() {
        _fermentable.setRecommendMash(true);
        assertEquals(true, _fermentable.getRecommendMash());
    }

    void testSetGetIBUGallonsPerPound() {
        _fermentable.setIBUGallonsPerPound(9);
        assertEquals(9, _fermentable.getIBUGallonsPerPound());
    }

    void testSetGetDisplayAmount() {
        _fermentable.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _fermentable.getDisplayAmount());
    }

    void testSetGetPotential() {
        _fermentable.setPotential(10);
        assertEquals(10, _fermentable.getPotential());
    }

    void testSetGetInventory() {
        _fermentable.setInventory("Test Inventory");
        assertEquals("Test Inventory", _fermentable.getInventory());
    }

    void testSetGetDisplayColor() {
        _fermentable.setDisplayColor("Test Display Color");
        assertEquals("Test Display Color", _fermentable.getDisplayColor());
    }

    void testSetGetName() {
        _fermentable.setName("Test Name");
        assertEquals("Test Name", _fermentable.getName());
    }

    void testSetGetVersion() {
        _fermentable.setVersion(11);
        assertEquals(11, _fermentable.getVersion());
    }
}
