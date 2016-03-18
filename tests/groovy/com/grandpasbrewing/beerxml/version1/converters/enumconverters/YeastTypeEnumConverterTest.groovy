package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.YeastType

class YeastTypeEnumConverterTest extends GroovyTestCase {
    private YeastTypeEnumConverter _yeastTypeEnumConverter;

    void setUp() {
        super.setUp()

        _yeastTypeEnumConverter = new YeastTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Ale, _yeastTypeEnumConverter.toObjectModel(YeastType.Ale));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Champagne, _yeastTypeEnumConverter.toObjectModel(YeastType.Champagne));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Lager, _yeastTypeEnumConverter.toObjectModel(YeastType.Lager));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Wheat, _yeastTypeEnumConverter.toObjectModel(YeastType.Wheat));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Wine, _yeastTypeEnumConverter.toObjectModel(YeastType.Wine));
        assertEquals(null, _yeastTypeEnumConverter.toObjectModel(null));
    }

    void testFromObjectModel() {
        assertEquals(YeastType.Ale, _yeastTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType.Ale));
        assertEquals(YeastType.Champagne, _yeastTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType.Champagne));
        assertEquals(YeastType.Lager, _yeastTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType.Lager));
        assertEquals(YeastType.Wheat, _yeastTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType.Wheat));
        assertEquals(YeastType.Wine, _yeastTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastType.Wine));
        assertEquals(null, _yeastTypeEnumConverter.fromObjectModel(null));
    }
}
