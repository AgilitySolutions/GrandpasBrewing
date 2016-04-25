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
        Misc beerXmlObjectMisc = new Misc();

        beerXmlObjectMisc.setName("Irish Moss");
        beerXmlObjectMisc.setVersion(1);
        beerXmlObjectMisc.setType(MiscType.Fining);
        beerXmlObjectMisc.setUse(MiscUse.Boil);
        beerXmlObjectMisc.setTime(15.0);
        beerXmlObjectMisc.setAmount(0.010);

        MiscellaneousItem miscellaneousItem = _miscellaneousItemConverter.toObjectModel(beerXmlObjectMisc);

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
        Misc beerXmlObjectMisc = new Misc();

        beerXmlObjectMisc.setName("Coriander");
        beerXmlObjectMisc.setType(MiscType.Spice);
        beerXmlObjectMisc.setVersion(1);
        beerXmlObjectMisc.setUse(MiscUse.Boil);
        beerXmlObjectMisc.setTime(5.0);
        beerXmlObjectMisc.setAmount(0.025);
        beerXmlObjectMisc.setUseFor("Belgian Wit Spice");
        beerXmlObjectMisc.setNotes("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.");

        MiscellaneousItem miscellaneousItem = _miscellaneousItemConverter.toObjectModel(beerXmlObjectMisc);

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

    void testFromObjectModelNull() {
        Misc misc = _miscellaneousItemConverter.fromObjectModel(null);

        assertNull(misc);
    }

    void testFromObjectModelIrishMossWithMinimalFields()
    {
        MiscellaneousItem objectModelMiscellaneousItem = new MiscellaneousItem();

        objectModelMiscellaneousItem.setName("Irish Moss");
        objectModelMiscellaneousItem.setVersion(1);
        objectModelMiscellaneousItem.setType(MiscellaneousItemType.Fining);
        objectModelMiscellaneousItem.setUse(MiscellaneousItemUse.Boil);
        objectModelMiscellaneousItem.setTime(15.0);
        objectModelMiscellaneousItem.setAmount(0.010);

        Misc misc = _miscellaneousItemConverter.fromObjectModel(objectModelMiscellaneousItem);

        assertEquals("Irish Moss", misc.getName());
        assertEquals(1, misc.getVersion());
        assertEquals(MiscType.Fining, misc.getType());
        assertEquals(MiscUse.Boil, misc.getUse());
        assertEquals(15.0, misc.getTime());
        assertEquals(0.010, misc.getAmount());
        assertNull(misc.getAmountIsWeight());
        assertNull(misc.getUseFor());
        assertNull(misc.getNotes());
        assertNull(misc.getDisplayAmount());
        assertNull(misc.getInventory());
        assertNull(misc.getDisplayTime());
    }

    void testFromObjectModelCorianderSpiceWithATypicalSetOfFields()
    {
        MiscellaneousItem objectModelMiscellaneousItem = new MiscellaneousItem();

        objectModelMiscellaneousItem.setName("Coriander");
        objectModelMiscellaneousItem.setType(MiscellaneousItemType.Spice);
        objectModelMiscellaneousItem.setVersion(1);
        objectModelMiscellaneousItem.setUse(MiscellaneousItemUse.Boil);
        objectModelMiscellaneousItem.setTime(5.0);
        objectModelMiscellaneousItem.setAmount(0.025);
        objectModelMiscellaneousItem.setUseFor("Belgian Wit Spice");
        objectModelMiscellaneousItem.setNotes("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.");

        Misc misc = _miscellaneousItemConverter.fromObjectModel(objectModelMiscellaneousItem);

        assertEquals("Coriander", misc.getName());
        assertEquals(1, misc.getVersion());
        assertEquals(MiscType.Spice, misc.getType());
        assertEquals(MiscUse.Boil, misc.getUse());
        assertEquals(5.0, misc.getTime());
        assertEquals(0.025, misc.getAmount());
        assertNull(misc.getAmountIsWeight());
        assertEquals("Belgian Wit Spice", misc.getUseFor());
        assertEquals("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.", misc.getNotes());
        assertNull(misc.getDisplayAmount());
        assertNull(misc.getInventory());
        assertNull(misc.getDisplayTime());
    }
}
