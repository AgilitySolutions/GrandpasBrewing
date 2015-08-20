package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType

class MiscellaneousItemTypeEnumConverterTest extends GroovyTestCase {
    private MiscellaneousItemTypeEnumConverter _miscellaneousItemTypeEnumConverter;

    void setUp() {
        super.setUp()

        _miscellaneousItemTypeEnumConverter = new MiscellaneousItemTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(MiscellaneousItemType.Spice, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.Spice));
        assertEquals(MiscellaneousItemType.Fining, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.Fining));
        assertEquals(MiscellaneousItemType.WaterAgent, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.WaterAgent));
        assertEquals(MiscellaneousItemType.Herb, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.Herb));
        assertEquals(MiscellaneousItemType.Flavor, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.Flavor));
        assertEquals(MiscellaneousItemType.Other, _miscellaneousItemTypeEnumConverter.toObjectModel(MiscType.Other));
    }
}
