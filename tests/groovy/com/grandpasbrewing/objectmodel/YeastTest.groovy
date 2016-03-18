package com.grandpasbrewing.objectmodel

import com.grandpasbrewing.objectmodel.enums.YeastFlocculation
import com.grandpasbrewing.objectmodel.enums.YeastForm
import com.grandpasbrewing.objectmodel.enums.YeastType

class YeastTest extends GroovyTestCase {
    private Yeast _yeast;

    void setUp() {
        super.setUp()

        _yeast = new Yeast();
    }

    void testSetGetType() {
        _yeast.setType(YeastType.Wheat);
        assertEquals(YeastType.Wheat, _yeast.getType());
    }

    void testSetGetForm() {
        _yeast.setForm(YeastForm.Culture);
        assertEquals(YeastForm.Culture, _yeast.getForm());
    }

    void testSetGetAmount() {
        _yeast.setAmount(1);
        assertEquals(1, _yeast.getAmount());
    }

    void testSetGetAmountIsWeight() {
        _yeast.setAmountIsWeight(true);
        assertEquals(true, _yeast.getAmountIsWeight());
    }

    void testSetGetLaboratory() {
        _yeast.setLaboratory("Test Laboratory");
        assertEquals("Test Laboratory", _yeast.getLaboratory());
    }

    void testSetGetManufacturerProductId() {
        _yeast.setManufacturerProductId("Test Manufacturer Product Id");
        assertEquals("Test Manufacturer Product Id", _yeast.getManufacturerProductId());
    }

    void testSetGetMinimumTemperature() {
        _yeast.setMinimumTemperature(2);
        assertEquals(2, _yeast.getMinimumTemperature());
    }

    void testSetGetMaximumTemperature() {
        _yeast.setMaximumTemperature(3);
        assertEquals(3, _yeast.getMaximumTemperature());
    }

    void testSetGetFlocculation() {
        _yeast.setFlocculation(YeastFlocculation.Low);
        assertEquals(YeastFlocculation.Low, _yeast.getFlocculation());
    }

    void testSetGetAttenuation() {
        _yeast.setAttenuation(4);
        assertEquals(4, _yeast.getAttenuation());
    }

    void testSetGetNotes() {
        _yeast.setNotes("Test Notes");
        assertEquals("Test Notes", _yeast.getNotes());
    }

    void testSetGetBestFor() {
        _yeast.setBestFor("Test Best For");
        assertEquals("Test Best For", _yeast.getBestFor());
    }

    void testSetGetTimesCultured() {
        _yeast.setTimesCultured(5);
        assertEquals(5, _yeast.getTimesCultured());
    }

    void testSetGetMaximumReuse() {
        _yeast.setMaximumReuse(6);
        assertEquals(6, _yeast.getMaximumReuse());
    }

    void testSetGetAddToSecondary() {
        _yeast.setAddToSecondary(true);
        assertEquals(true, _yeast.getAddToSecondary());
    }

    void testSetGetDisplayAmount() {
        _yeast.setDisplayAmount("Test Display Amount");
        assertEquals("Test Display Amount", _yeast.getDisplayAmount());
    }

    void testSetGetDisplayMinimumTemperature() {
        _yeast.setDisplayMinimumTemperature("Test Display Minimum Temperature");
        assertEquals("Test Display Minimum Temperature", _yeast.getDisplayMinimumTemperature());
    }

    void testSetGetDisplayMaximumTemperature() {
        _yeast.setDisplayMaximumTemperature("Test Display Maximum Temperature");
        assertEquals("Test Display Maximum Temperature", _yeast.getDisplayMaximumTemperature())
    }

    void testSetGetInventory() {
        _yeast.setInventory("Test Inventory");
        assertEquals("Test Inventory", _yeast.getInventory());
    }

    void testSetGetCultureDate() {
        _yeast.setCultureDate("Test Culture Date");
        assertEquals("Test Culture Date", _yeast.getCultureDate());
    }

    void testSetGetId() {
        _yeast.setId(7)
        assertEquals(7, _yeast.getId());
    }
}
