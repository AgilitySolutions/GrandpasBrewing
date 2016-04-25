package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.HopType

class HopTypeEnumConverterTest extends GroovyTestCase {
    private HopTypeEnumConverter _hopTypeEnumConverter;

    void setUp() {
        super.setUp()

        _hopTypeEnumConverter = new HopTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopType.Aroma, _hopTypeEnumConverter.toObjectModel(HopType.Aroma));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopType.Bittering, _hopTypeEnumConverter.toObjectModel(HopType.Bittering));
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopType.Both, _hopTypeEnumConverter.toObjectModel(HopType.Both));
        assertEquals(null, _hopTypeEnumConverter.toObjectModel(null));
    }

    void testFromObjectModel() {
        assertEquals(HopType.Aroma, _hopTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopType.Aroma));
        assertEquals(HopType.Bittering, _hopTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopType.Bittering));
        assertEquals(HopType.Both, _hopTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.HopType.Both));
        assertEquals(null, _hopTypeEnumConverter.fromObjectModel(null));
    }
}
