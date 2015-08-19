package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.HopForm

class HopFormEnumConverterTest extends GroovyTestCase {
    private HopFormEnumConverter _hopFormEnumConverter;

    void setUp() {
        super.setUp()

        _hopFormEnumConverter = new HopFormEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf, _hopFormEnumConverter.toObjectModel(HopForm.Leaf));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Pellet, _hopFormEnumConverter.toObjectModel(HopForm.Pellet));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Plug, _hopFormEnumConverter.toObjectModel(HopForm.Plug));
    }
}
