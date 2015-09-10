package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemUseEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.objects.Misc
import com.grandpasbrewing.objectmodel.MiscellaneousItem
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse

class MiscellaneousItemConverterTest extends GroovyTestCase {
    private MiscellaneousItemTypeEnumConverter _miscellaneousItemTypeEnumConverter;
    private MiscellaneousItemUseEnumConverter _miscellaneousItemUseEnumConverter;
    private MiscellaneousItemConverter _miscellaneousItemConverter;

    void setUp() {
        super.setUp()

        _miscellaneousItemTypeEnumConverter = new MiscellaneousItemTypeEnumConverter();
        _miscellaneousItemUseEnumConverter = new MiscellaneousItemUseEnumConverter();

        _miscellaneousItemConverter = new MiscellaneousItemConverter(_miscellaneousItemTypeEnumConverter,
                _miscellaneousItemUseEnumConverter);
    }

    void testToObjectModelNull() {
        MiscellaneousItem miscellaneousItem = _miscellaneousItemConverter.toObjectModel(null);

        assertNull(miscellaneousItem);
    }

    void testToObjectModelIrishMossWithMinimalFields()
    {
        Misc beerObjectModelMisc = new Misc();

        beerObjectModelMisc.setName("Irish Moss");
        beerObjectModelMisc.setVersion(1);
        beerObjectModelMisc.setType(MiscType.Fining);
        beerObjectModelMisc.setUse(MiscUse.Boil);
        beerObjectModelMisc.setTime(15.0);
        beerObjectModelMisc.setAmount(0.010);

        MiscellaneousItem miscellaneousItem = _miscellaneousItemConverter.toObjectModel(beerObjectModelMisc);

        assertEquals("Irish Moss", miscellaneousItem.getName());
        assertEquals(1, miscellaneousItem.getVersion());
        assertEquals(MiscellaneousItemType.Fining,miscellaneousItem.getType());
        assertEquals(MiscellaneousItemUse.Boil, miscellaneousItem.getUse());
        assertEquals(15.0, miscellaneousItem.getTime());
        assertEquals(0.010, miscellaneousItem.getAmount());
        assertNull(miscellaneousItem.getAmountIsWeight());
        assertNull(miscellaneousItem.getUseFor());
        assertNull(miscellaneousItem.getNotes());
        assertNull(miscellaneousItem.getDisplayAmount());
        assertNull(miscellaneousItem.getInventory());
        assertNull(miscellaneousItem.getDisplayTime());
    }

    void testToObjectModelCorianderSpiceWithATypicalSetOfFields()
    {
        Misc beerObjectModelMisc = new Misc();

        beerObjectModelMisc.setName("Coriander");
        beerObjectModelMisc.setType(MiscType.Spice);
        beerObjectModelMisc.setVersion(1);
        beerObjectModelMisc.setUse(MiscUse.Boil);
        beerObjectModelMisc.setTime(5.0);
        beerObjectModelMisc.setAmount(0.025);
        beerObjectModelMisc.setUseFor("Belgian Wit Spice");
        beerObjectModelMisc.setNotes("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.");

        MiscellaneousItem miscellaneousItem = _miscellaneousItemConverter.toObjectModel(beerObjectModelMisc);

        assertEquals("Coriander", miscellaneousItem.getName());
        assertEquals(1, miscellaneousItem.getVersion());
        assertEquals(MiscellaneousItemType.Spice, miscellaneousItem.getType());
        assertEquals(MiscellaneousItemUse.Boil, miscellaneousItem.getUse());
        assertEquals(5.0, miscellaneousItem.getTime());
        assertEquals(0.025, miscellaneousItem.getAmount());
        assertNull(miscellaneousItem.getAmountIsWeight());
        assertEquals("Belgian Wit Spice", miscellaneousItem.getUseFor());
        assertEquals("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.", miscellaneousItem.getNotes());
        assertNull(miscellaneousItem.getDisplayAmount());
        assertNull(miscellaneousItem.getInventory());
        assertNull(miscellaneousItem.getDisplayTime());
    }
}
