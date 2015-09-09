package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.objects.Water

class WaterConverterTest extends GroovyTestCase {
    private WaterConverter _waterConverter;

    void setUp() {
        super.setUp()

        _waterConverter = new WaterConverter();
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Water water = _waterConverter.toObjectModel(null);

        assertNull(water);
    }

    void testWater() {
        Water beerXmlWater = new Water();

        beerXmlWater.setName(" Burton on Trent, UK ");
        beerXmlWater.setVersion(1);
        beerXmlWater.setAmount(20.0);
        beerXmlWater.setCalcium(295.0);
        beerXmlWater.setMagnesium(45.0);
        beerXmlWater.setSodium(55.0);
        beerXmlWater.setSulfate(725.0);
        beerXmlWater.setChloride(25.0);
        beerXmlWater.setBicarbonate(300.0);
        beerXmlWater.setPH(8.0);
        beerXmlWater.setNotes("Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale ");

        com.grandpasbrewing.objectmodel.Water water = _waterConverter.toObjectModel(beerXmlWater);

        assertEquals(" Burton on Trent, UK ", water.getName());
        assertEquals(1, water.getVersion());
        assertEquals(20.0, water.getAmount());
        assertEquals(295.0, water.getCalcium());
        assertEquals(300.0, water.getBicarbonate());
        assertEquals(725.0, water.getSulfate());
        assertEquals(25.0, water.getChloride());
        assertEquals(55.0, water.getSodium());
        assertEquals(45.0, water.getMagnesium());
        assertEquals(8.0, water.getPH());
        assertEquals("Use for distinctive pale ales strongly hopped.Very hard water accentuates the hops flavor. Example: Bass Ale ", water.getNotes());
        assertNull(water.getDisplayAmount());
    }
}
