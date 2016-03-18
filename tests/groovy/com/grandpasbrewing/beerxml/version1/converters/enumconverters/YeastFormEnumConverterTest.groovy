package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.YeastForm

class YeastFormEnumConverterTest extends GroovyTestCase {
    private YeastFormEnumConverter _yeastFormEnumConverter;

    void setUp() {
        super.setUp()

        _yeastFormEnumConverter = new YeastFormEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Culture, _yeastFormEnumConverter.toObjectModel(YeastForm.Culture));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Dry, _yeastFormEnumConverter.toObjectModel(YeastForm.Dry));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid, _yeastFormEnumConverter.toObjectModel(YeastForm.Liquid));
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Slant, _yeastFormEnumConverter.toObjectModel(YeastForm.Slant));
        assertEquals(null, _yeastFormEnumConverter.toObjectModel(null));
    }

    void testFromObjectModel() {
        assertEquals(YeastForm.Culture, _yeastFormEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm.Culture));
        assertEquals(YeastForm.Dry, _yeastFormEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm.Dry));
        assertEquals(YeastForm.Liquid, _yeastFormEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid));
        assertEquals(YeastForm.Slant, _yeastFormEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.YeastForm.Slant));
        assertEquals(null, _yeastFormEnumConverter.fromObjectModel(null));
    }
}
