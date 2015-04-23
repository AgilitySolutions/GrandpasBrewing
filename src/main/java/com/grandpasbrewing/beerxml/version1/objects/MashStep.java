package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.MashStepType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MASH_STEP")
public class MashStep extends BeerXmlObjectBase {
    public MashStepType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    public void setType(MashStepType type) {
        _type = type;
    }

    public Double getInfuseAmount() {
        return _infuseAmount;
    }

    @XmlElement(name = "INFUSE_AMOUNT")
    public void setInfuseAmount(Double infuseAmount) {
        _infuseAmount = infuseAmount;
    }

    public Double getStepTemperature() {
        return _stepTemperature;
    }

    @XmlElement(name = "STEP_TEMP")
    public void setStepTemperature(Double stepTemperature) {
        _stepTemperature = stepTemperature;
    }

    public Double getStepTime() {
        return _stepTime;
    }

    @XmlElement(name = "STEP_TIME")
    public void setStepTime(Double stepTime) {
        _stepTime = stepTime;
    }

    public Double getRampTime() {
        return _rampTime;
    }

    @XmlElement(name = "RAMP_TIME")
    public void setRampTime(Double rampTime) {
        _rampTime = rampTime;
    }

    public Double getEndTemperature() {
        return _endTemperature;
    }

    @XmlElement(name = "END_TEMP")
    public void setEndTemperature(Double endTemperature) {
        _endTemperature = endTemperature;
    }

    public String getDescription() {
        return _description;
    }

    @XmlElement(name = "DESCRIPTION")
    public void setDescription(String description) {
        _description = description;
    }

    public String getWaterGrainRatio() {
        return _waterGrainRatio;
    }

    @XmlElement(name = "WATER_GRAIN_RATIO")
    public void setWaterGrainRatio(String waterGrainRatio) {
        _waterGrainRatio = waterGrainRatio;
    }

    public String getDecoctionAmount() {
        return _decoctionAmount;
    }

    @XmlElement(name = "DECOCTION_AMT")
    public void setDecoctionAmount(String decoctionAmount) {
        _decoctionAmount = decoctionAmount;
    }

    public String getInfuseTemperature() {
        return _infuseTemperature;
    }

    @XmlElement(name = "INFUSE_TEMP")
    public void setInfuseTemperature(String infuseTemperature) {
        _infuseTemperature = infuseTemperature;
    }

    public String getDisplayStepTemperature() {
        return _displayStepTemperature;
    }

    @XmlElement(name = "DISPLAY_STEP_TEMP")
    public void setDisplayStepTemperature(String displayStepTemperature) {
        _displayStepTemperature = displayStepTemperature;
    }

    public String getDisplayInfuseAmount() {
        return _displayInfuseAmount;
    }

    @XmlElement(name = "DISPLAY_INFUSE_AMT")
    public void setDisplayInfuseAmount(String displayInfuseAmount) {
        _displayInfuseAmount = displayInfuseAmount;
    }

    private MashStepType _type;
    private Double _infuseAmount;
    private Double _stepTemperature;
    private Double _stepTime;
    private Double _rampTime;
    private Double _endTemperature;
    private String _description;
    private String _waterGrainRatio;
    private String _decoctionAmount;
    private String _infuseTemperature;
    private String _displayStepTemperature;
    private String _displayInfuseAmount;
}
