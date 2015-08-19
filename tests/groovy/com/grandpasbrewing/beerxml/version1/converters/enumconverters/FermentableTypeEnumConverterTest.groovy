package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.FermentableType

class FermentableTypeEnumConverterTest extends GroovyTestCase {
    private FermentableTypeEnumConverter _fermentableTypeEnumConverter;

    void setUp() {
        super.setUp()

        _fermentableTypeEnumConverter = new FermentableTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct, _fermentableTypeEnumConverter.toObjectModel(FermentableType.Adjunct));
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract, _fermentableTypeEnumConverter.toObjectModel(FermentableType.DryExtract));
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Extract, _fermentableTypeEnumConverter.toObjectModel(FermentableType.Extract));
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, _fermentableTypeEnumConverter.toObjectModel(FermentableType.Grain));
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Sugar, _fermentableTypeEnumConverter.toObjectModel(FermentableType.Sugar));
    }
}