package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemUseEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Misc;
import com.grandpasbrewing.objectmodel.MiscellaneousItem;

public class MiscellaneousItemConverter implements IBeerXmlConverter<Misc, com.grandpasbrewing.objectmodel.MiscellaneousItem> {
    private MiscellaneousItemTypeEnumConverter _miscellaneousItemTypeEnumConverter;
    private MiscellaneousItemUseEnumConverter _miscellaneousItemUseEnumConverter;

    public MiscellaneousItemConverter(MiscellaneousItemTypeEnumConverter miscellaneousItemTypeEnumConverter,
                                      MiscellaneousItemUseEnumConverter miscellaneousItemUseEnumConverter) {
        if (miscellaneousItemTypeEnumConverter == null) throw new IllegalArgumentException("miscellaneousItemTypeEnumConverter");
        if (miscellaneousItemUseEnumConverter == null) throw new IllegalArgumentException("miscellaneousItemUseEnumConverter");

        _miscellaneousItemTypeEnumConverter = miscellaneousItemTypeEnumConverter;
        _miscellaneousItemUseEnumConverter = miscellaneousItemUseEnumConverter;
    }

    public MiscellaneousItem toObjectModel(Misc beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        MiscellaneousItem miscellaneousItem = new MiscellaneousItem();

        miscellaneousItem.setAmount(beerXmlObject.getAmount());
        miscellaneousItem.setAmountIsWeight(beerXmlObject.getAmountIsWeight());
        miscellaneousItem.setDisplayAmount(beerXmlObject.getDisplayAmount());
        miscellaneousItem.setDisplayTime(beerXmlObject.getDisplayTime());
        miscellaneousItem.setInventory(beerXmlObject.getInventory());
        miscellaneousItem.setName(beerXmlObject.getName());
        miscellaneousItem.setNotes(beerXmlObject.getNotes());
        miscellaneousItem.setTime(beerXmlObject.getTime());
        miscellaneousItem.setType(_miscellaneousItemTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        miscellaneousItem.setUse(_miscellaneousItemUseEnumConverter.toObjectModel(beerXmlObject.getUse()));
        miscellaneousItem.setUseFor(beerXmlObject.getUseFor());
        miscellaneousItem.setVersion(beerXmlObject.getVersion());

        return miscellaneousItem;
    }

    public Misc fromObjectModel(MiscellaneousItem objectModelObject) {
        if (objectModelObject == null)
            return null;

        Misc misc = new Misc();

        misc.setAmount(objectModelObject.getAmount());
        misc.setAmountIsWeight(objectModelObject.getAmountIsWeight());
        misc.setDisplayAmount(objectModelObject.getDisplayAmount());
        misc.setDisplayTime(objectModelObject.getDisplayTime());
        misc.setInventory(objectModelObject.getInventory());
        misc.setName(objectModelObject.getName());
        misc.setNotes(objectModelObject.getNotes());
        misc.setTime(objectModelObject.getTime());
        misc.setType(_miscellaneousItemTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        misc.setUse(_miscellaneousItemUseEnumConverter.fromObjectModel(objectModelObject.getUse()));
        misc.setUseFor(objectModelObject.getUseFor());
        misc.setVersion(objectModelObject.getVersion());

        return misc;
    }
}
