package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.MashStepType;

public class MashStep extends ObjectModelBase {
    public MashStepType getType() {
        return _type;
    }

    public void setType(MashStepType type) {
        _type = type;
    }

    public Double getInfuseAmount() {
        return _infuseAmount;
    }

    public void setInfuseAmount(Double infuseAmount) {
        _infuseAmount = infuseAmount;
    }

    public Double getStepTemperature() {
        return _stepTemperature;
    }

    public void setStepTemperature(Double stepTemperature) {
        _stepTemperature = stepTemperature;
    }

    public Double getStepTime() {
        return _stepTime;
    }

    public void setStepTime(Double stepTime) {
        _stepTime = stepTime;
    }

    public Double getRampTime() {
        return _rampTime;
    }

    public void setRampTime(Double rampTime) {
        _rampTime = rampTime;
    }

    public Double getEndTemperature() {
        return _endTemperature;
    }

    public void setEndTemperature(Double endTemperature) {
        _endTemperature = endTemperature;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getWaterGrainRatio() {
        return _waterGrainRatio;
    }

    public void setWaterGrainRatio(String waterGrainRatio) {
        _waterGrainRatio = waterGrainRatio;
    }

    public String getDecoctionAmount() {
        return _decoctionAmount;
    }

    public void setDecoctionAmount(String decoctionAmount) {
        _decoctionAmount = decoctionAmount;
    }

    public String getInfuseTemperature() {
        return _infuseTemperature;
    }

    public void setInfuseTemperature(String infuseTemperature) {
        _infuseTemperature = infuseTemperature;
    }

    public String getDisplayStepTemperature() {
        return _displayStepTemperature;
    }

    public void setDisplayStepTemperature(String displayStepTemperature) {
        _displayStepTemperature = displayStepTemperature;
    }

    public String getDisplayInfuseAmount() {
        return _displayInfuseAmount;
    }

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
