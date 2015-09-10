package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFlocculationEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFormEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Yeast;

public class YeastConverter implements IBeerXmlConverter<Yeast, com.grandpasbrewing.objectmodel.Yeast> {
    private YeastFlocculationEnumConverter _yeastFlocculationEnumConverter;
    private YeastFormEnumConverter _yeastFormEnumConverter;
    private YeastTypeEnumConverter _yeastTypeEnumConverter;

    public YeastConverter(YeastFlocculationEnumConverter yeastFlocculationEnumConverter,
                          YeastFormEnumConverter yeastFormEnumConverter,
                          YeastTypeEnumConverter yeastTypeEnumConverter) {
        if (yeastFlocculationEnumConverter == null) throw new IllegalArgumentException("yeastFlocculationEnumConverter");
        if (yeastFormEnumConverter == null) throw new IllegalArgumentException("yeastFormEnumConverter");
        if (yeastTypeEnumConverter == null) throw new IllegalArgumentException("yeastTypeEnumConverter");

        _yeastFlocculationEnumConverter = yeastFlocculationEnumConverter;
        _yeastFormEnumConverter = yeastFormEnumConverter;
        _yeastTypeEnumConverter = yeastTypeEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.Yeast toObjectModel(Yeast beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Yeast yeast = new com.grandpasbrewing.objectmodel.Yeast();

        yeast.setAddToSecondary(beerXmlObject.getAddToSecondary());
        yeast.setAmount(beerXmlObject.getAmount());
        yeast.setAmountIsWeight(beerXmlObject.getAmountIsWeight());
        yeast.setAttenuation(beerXmlObject.getAttenuation());
        yeast.setBestFor(beerXmlObject.getBestFor());
        yeast.setCultureDate(beerXmlObject.getCultureDate());
        yeast.setDisplayAmount(beerXmlObject.getDisplayAmount());
        yeast.setDisplayMaximumTemperature(beerXmlObject.getDisplayMaximumTemperature());
        yeast.setDisplayMinimumTemperature(beerXmlObject.getDisplayMinimumTemperature());
        yeast.setFlocculation(_yeastFlocculationEnumConverter.toObjectModel(beerXmlObject.getFlocculation()));
        yeast.setForm(_yeastFormEnumConverter.toObjectModel(beerXmlObject.getForm()));
        yeast.setInventory(beerXmlObject.getInventory());
        yeast.setLaboratory(beerXmlObject.getLaboratory());
        yeast.setManufacturerProductId(beerXmlObject.getManufacturerProductId());
        yeast.setMaximumReuse(beerXmlObject.getMaximumReuse());
        yeast.setMaximumTemperature(beerXmlObject.getMaximumTemperature());
        yeast.setMinimumTemperature(beerXmlObject.getMinimumTemperature());
        yeast.setName(beerXmlObject.getName());
        yeast.setNotes(beerXmlObject.getNotes());
        yeast.setTimesCultured(beerXmlObject.getTimesCultured());
        yeast.setType(_yeastTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        yeast.setVersion(beerXmlObject.getVersion());

        return yeast;
    }

    public Yeast fromObjectModel(com.grandpasbrewing.objectmodel.Yeast objectModelObject) {
        return null;
    }
}
