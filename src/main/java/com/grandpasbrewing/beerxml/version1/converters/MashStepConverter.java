package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MashStepTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.MashStep;

public class MashStepConverter implements IBeerXmlConverter<MashStep, com.grandpasbrewing.objectmodel.MashStep> {
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;

    public MashStepConverter(MashStepTypeEnumConverter mashStepTypeEnumConverter) {
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
        if (objectModelObject == null)
            return null;

        MashStep mashStep = new MashStep();

        mashStep.setDecoctionAmount(objectModelObject.getDecoctionAmount());
        mashStep.setDescription(objectModelObject.getDescription());
        mashStep.setDisplayInfuseAmount(objectModelObject.getDisplayInfuseAmount());
        mashStep.setDisplayStepTemperature(objectModelObject.getDisplayStepTemperature());
        mashStep.setEndTemperature(objectModelObject.getEndTemperature());
        mashStep.setInfuseAmount(objectModelObject.getInfuseAmount());
        mashStep.setInfuseTemperature(objectModelObject.getInfuseTemperature());
        mashStep.setName(objectModelObject.getName());
        mashStep.setRampTime(objectModelObject.getRampTime());
        mashStep.setStepTemperature(objectModelObject.getStepTemperature());
        mashStep.setStepTime(objectModelObject.getStepTime());
        mashStep.setType(_mashStepTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        mashStep.setVersion(objectModelObject.getVersion());
        mashStep.setWaterGrainRatio(objectModelObject.getWaterGrainRatio());

        return mashStep;
    }
}
