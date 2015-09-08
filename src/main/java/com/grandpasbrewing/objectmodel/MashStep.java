package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.MashStepType;

public class MashStep extends ObjectModelBase {
    public MashStepType getType() {
        return _type;
    }

    public void setType(MashStepType type) {
        _type = type;
    }

    public double getInfuseAmount() {
        return _infuseAmount;
    }

    public void setInfuseAmount(double infuseAmount) {
        _infuseAmount = infuseAmount;
    }

    public double getStepTemperature() {
        return _stepTemperature;
    }

    public void setStepTemperature(double stepTemperature) {
        _stepTemperature = stepTemperature;
    }

    public double getStepTime() {
        return _stepTime;
    }

    public void setStepTime(double stepTime) {
        _stepTime = stepTime;
    }

    public double getRampTime() {
        return _rampTime;
    }

    public void setRampTime(double rampTime) {
        _rampTime = rampTime;
    }

    public double getEndTemperature() {
        return _endTemperature;
    }

    public void setEndTemperature(double endTemperature) {
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
    private double _infuseAmount;
    private double _stepTemperature;
    private double _stepTime;
    private double _rampTime;
    private double _endTemperature;
    private String _description;
    private String _waterGrainRatio;
    private String _decoctionAmount;
    private String _infuseTemperature;
    private String _displayStepTemperature;
    private String _displayInfuseAmount;
}
