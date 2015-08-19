package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.HopUse

class HopUseEnumConverterTest extends GroovyTestCase {
    private HopUseEnumConverter _hopUseEnumConverter;

    void setUp() {
        super.setUp()

        _hopUseEnumConverter = new HopUseEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Aroma, _hopUseEnumConverter.toObjectModel(HopUse.Aroma));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Boil, _hopUseEnumConverter.toObjectModel(HopUse.Boil));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.DryHop, _hopUseEnumConverter.toObjectModel(HopUse.DryHop));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.FirstWort, _hopUseEnumConverter.toObjectModel(HopUse.FirstWort));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Mash, _hopUseEnumConverter.toObjectModel(HopUse.Mash));
    }
}
