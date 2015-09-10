package com.grandpasbrewing.objectmodel;

import java.util.ArrayList;

public class Mash extends ObjectModelBase {
    public Double getGrainTemperature() {
        return _grainTemperature;
    }

    public void setGrainTemperature(Double grainTemperature) {
        _grainTemperature = grainTemperature;
    }

    public ArrayList<MashStep> getMashSteps() {
        return _mashSteps;
    }

    public void setMashSteps(ArrayList<MashStep> mashSteps) {
        _mashSteps = mashSteps;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public Double getTunTemperature() {
        return _tunTemperature;
    }

    public void setTunTemperature(Double tunTemperature) {
        _tunTemperature = tunTemperature;
    }

    public Double getSpargeTemperature() {
        return _spargeTemperature;
    }

    public void setSpargeTemperature(Double spargeTemperature) {
        _spargeTemperature = spargeTemperature;
    }

    public Double getPH() {
        return _ph;
    }

    public void setPH(Double ph) {
        _ph = ph;
    }

    public Double getTunWeight() {
        return _tunWeight;
    }

    public void setTunWeight(Double tunWeight) {
        _tunWeight = tunWeight;
    }

    public Double getTunSpecificHeat() {
        return _tunSpecificHeat;
    }

    public void setTunSpecificHeat(Double tunSpecificHeat) {
        _tunSpecificHeat = tunSpecificHeat;
    }

    public Boolean getEquipmentAdjust() {
        return _equipmentAdjust;
    }

    public void setEquipmentAdjust(Boolean equipmentAdjust) {
        _equipmentAdjust = equipmentAdjust;
    }

    public String getDisplayGrainTemperature() {
        return _displayGrainTemperature;
    }

    public void setDisplayGrainTemperature(String displayGrainTemperature) {
        _displayGrainTemperature = displayGrainTemperature;
    }

    public String getDisplayTunTemperature() {
        return _displayTunTemperature;
    }

    public void setDisplayTunTemperature(String displayTunTemperature) {
        _displayTunTemperature = displayTunTemperature;
    }

    public String getDisplaySpargeTemperature() {
        return _displaySpargeTemperature;
    }

    public void setDisplaySpargeTemperature(String displaySpargeTemperature) {
        _displaySpargeTemperature = displaySpargeTemperature;
    }

    public String getDisplayTunWeight() {
        return _displayTunWeight;
    }

    public void setDisplayTunWeight(String displayTunWeight) {
        _displayTunWeight = displayTunWeight;
    }

    private Double _grainTemperature;
    private ArrayList<MashStep> _mashSteps;
    private String _notes;
    private Double _tunTemperature;
    private Double _spargeTemperature;
    private Double _ph;
    private Double _tunWeight;
    private Double _tunSpecificHeat;
    private Boolean _equipmentAdjust;
    private String _displayGrainTemperature;
    private String _displayTunTemperature;
    private String _displaySpargeTemperature;
    private String _displayTunWeight;
}
