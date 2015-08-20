package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.StyleType

class StyleTypeEnumConverterTest extends GroovyTestCase {
    private StyleTypeEnumConverter _styleTypeEnumConverter;

    void setUp() {
        super.setUp()

        _styleTypeEnumConverter = new StyleTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Ale, _styleTypeEnumConverter.toObjectModel(StyleType.Ale));
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Cider, _styleTypeEnumConverter.toObjectModel(StyleType.Cider));
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Lager, _styleTypeEnumConverter.toObjectModel(StyleType.Lager));
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Mead, _styleTypeEnumConverter.toObjectModel(StyleType.Mead));
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Mixed, _styleTypeEnumConverter.toObjectModel(StyleType.Mixed));
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Wheat, _styleTypeEnumConverter.toObjectModel(StyleType.Wheat));
    }

    void testFromObjectModel() {
        assertEquals(StyleType.Ale, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Ale));
        assertEquals(StyleType.Cider, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Cider));
        assertEquals(StyleType.Lager, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Lager));
        assertEquals(StyleType.Mead, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Mead));
        assertEquals(StyleType.Mixed, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Mixed));
        assertEquals(StyleType.Wheat, _styleTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.StyleType.Wheat));
    }
}
