package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse

class MiscellaneousItemUseEnumConverterTest extends GroovyTestCase {
    private MiscellaneousItemUseEnumConverter _miscellaneousItemUseEnumConverter;

    void setUp() {
        super.setUp()

        _miscellaneousItemUseEnumConverter = new MiscellaneousItemUseEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(MiscellaneousItemUse.Boil, _miscellaneousItemUseEnumConverter.toObjectModel(MiscUse.Boil));
        assertEquals(MiscellaneousItemUse.Mash, _miscellaneousItemUseEnumConverter.toObjectModel(MiscUse.Mash));
        assertEquals(MiscellaneousItemUse.Primary, _miscellaneousItemUseEnumConverter.toObjectModel(MiscUse.Primary));
        assertEquals(MiscellaneousItemUse.Secondary, _miscellaneousItemUseEnumConverter.toObjectModel(MiscUse.Secondary));
        assertEquals(MiscellaneousItemUse.Bottle, _miscellaneousItemUseEnumConverter.toObjectModel(MiscUse.Bottle));
    }
}
