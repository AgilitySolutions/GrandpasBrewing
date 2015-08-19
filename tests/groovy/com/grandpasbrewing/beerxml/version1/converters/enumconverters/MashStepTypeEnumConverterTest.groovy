package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.MashStepType

class MashStepTypeEnumConverterTest extends GroovyTestCase {
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;

    void setUp() {
        super.setUp()

        _mashStepTypeEnumConverter = new MashStepTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction, _mashStepTypeEnumConverter.toObjectModel(MashStepType.Decoction));
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion, _mashStepTypeEnumConverter.toObjectModel(MashStepType.Infusion));
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature, _mashStepTypeEnumConverter.toObjectModel(MashStepType.Temperature));
    }
}
