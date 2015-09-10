package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MashStepTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.MashStep;

public class MashStepConverter implements IBeerXmlConverter<MashStep, com.grandpasbrewing.objectmodel.MashStep> {
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;

    public MashStepConverter(MashStepTypeEnumConverter mashStepTypeEnumConverter) {
        if (mashStepTypeEnumConverter == null) throw new IllegalArgumentException("mashStepTypeEnumConverter");

        _mashStepTypeEnumConverter = mashStepTypeEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.MashStep toObjectModel(MashStep beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.MashStep mashStep = new com.grandpasbrewing.objectmodel.MashStep();

        mashStep.setDecoctionAmount(beerXmlObject.getDecoctionAmount());
        mashStep.setDescription(beerXmlObject.getDescription());
        mashStep.setDisplayInfuseAmount(beerXmlObject.getDisplayInfuseAmount());
        mashStep.setDisplayStepTemperature(beerXmlObject.getDisplayStepTemperature());
        mashStep.setEndTemperature(beerXmlObject.getEndTemperature());
        mashStep.setInfuseAmount(beerXmlObject.getInfuseAmount());
        mashStep.setInfuseTemperature(beerXmlObject.getInfuseTemperature());
        mashStep.setName(beerXmlObject.getName());
        mashStep.setRampTime(beerXmlObject.getRampTime());
        mashStep.setStepTemperature(beerXmlObject.getStepTemperature());
        mashStep.setStepTime(beerXmlObject.getStepTime());
        mashStep.setType(_mashStepTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        mashStep.setVersion(beerXmlObject.getVersion());
        mashStep.setWaterGrainRatio(beerXmlObject.getWaterGrainRatio());

        return mashStep;
    }

    public MashStep fromObjectModel(com.grandpasbrewing.objectmodel.MashStep objectModelObject) {
        return null;
    }
}
