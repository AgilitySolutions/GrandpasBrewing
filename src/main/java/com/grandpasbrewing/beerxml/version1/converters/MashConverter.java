package com.grandpasbrewing.beerxml.version1.converters;


import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Mash;
import com.grandpasbrewing.beerxml.version1.objects.MashStep;

import java.util.ArrayList;
import java.util.ListIterator;

public class MashConverter implements IBeerXmlConverter<Mash, com.grandpasbrewing.objectmodel.Mash> {
    private MashStepConverter _mashStepConverter;

    public MashConverter(MashStepConverter mashStepConverter) {
        if (mashStepConverter == null) throw new IllegalArgumentException("mashStepConverter");

        _mashStepConverter = mashStepConverter;
    }

    public com.grandpasbrewing.objectmodel.Mash toObjectModel(Mash beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Mash mash = new com.grandpasbrewing.objectmodel.Mash();

        mash.setDisplayGrainTemperature(beerXmlObject.getDisplayGrainTemperature());
        mash.setDisplaySpargeTemperature(beerXmlObject.getDisplaySpargeTemperature());
        mash.setDisplayTunTemperature(beerXmlObject.getDisplayTunTemperature());
        mash.setDisplayTunWeight(beerXmlObject.getDisplayTunWeight());
        mash.setEquipmentAdjust(beerXmlObject.getEquipmentAdjust());
        mash.setGrainTemperature(beerXmlObject.getGrainTemperature());
        mash.setName(beerXmlObject.getName());
        mash.setNotes(beerXmlObject.getNotes());
        mash.setPH(beerXmlObject.getPH());
        mash.setSpargeTemperature(beerXmlObject.getSpargeTemperature());
        mash.setTunSpecificHeat(beerXmlObject.getTunSpecificHeat());
        mash.setTunTemperature(beerXmlObject.getTunTemperature());
        mash.setTunWeight(beerXmlObject.getTunWeight());
        mash.setVersion(beerXmlObject.getVersion());

        ListIterator<MashStep> iterator = beerXmlObject.getMashSteps().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.MashStep> mashStepArrayList = new ArrayList<com.grandpasbrewing.objectmodel.MashStep>();

        while (iterator.hasNext())
        {
            MashStep mashStep = iterator.next();
            mashStepArrayList.add(_mashStepConverter.toObjectModel(mashStep));
        }

        mash.setMashSteps(mashStepArrayList);

        return mash;
    }

    public Mash fromObjectModel(com.grandpasbrewing.objectmodel.Mash objectModelObject) {
        return null;
    }
}
