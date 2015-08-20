package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation

class YeastFlocculationEnumConverterTest extends GroovyTestCase {
    private YeastFlocculationEnumConverter _yeastFlocculationEnumConverter;

    void setUp() {
        super.setUp()

        _yeastFlocculationEnumConverter = new YeastFlocculationEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.High, _yeastFlocculationEnumConverter.toObjectModel(YeastFlocculation.High));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low, _yeastFlocculationEnumConverter.toObjectModel(YeastFlocculation.Low));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium, _yeastFlocculationEnumConverter.toObjectModel(YeastFlocculation.Medium));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.VeryHigh, _yeastFlocculationEnumConverter.toObjectModel(YeastFlocculation.VeryHigh));
    }

    void testFromObjectModel() {
        assertEquals(YeastFlocculation.High, _yeastFlocculationEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.High));
        assertEquals(YeastFlocculation.Low, _yeastFlocculationEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low));
        assertEquals(YeastFlocculation.Medium, _yeastFlocculationEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium));
        assertEquals(YeastFlocculation.VeryHigh, _yeastFlocculationEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.VeryHigh));
    }
}
