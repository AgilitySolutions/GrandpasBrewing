package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;

import java.util.ArrayList;

public class Mash extends ObjectModelBase {
    public double getGrainTemperature() {
        return _grainTemperature;
    }

    public void setGrainTemperature(double grainTemperature) {
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

    public double getTunTemperature() {
        return _tunTemperature;
    }

    public void setTunTemperature(double tunTemperature) {
        _tunTemperature = tunTemperature;
    }

    public double getSpargeTemperature() {
        return _spargeTemperature;
    }

    public void setSpargeTemperature(double spargeTemperature) {
        _spargeTemperature = spargeTemperature;
    }

    public double getPH() {
        return _ph;
    }

    public void setPH(double ph) {
        _ph = ph;
    }

    public double getTunWeight() {
        return _tunWeight;
    }

    public void setTunWeight(double tunWeight) {
        _tunWeight = tunWeight;
    }

    public double getTunSpecificHeat() {
        return _tunSpecificHeat;
    }

    public void setTunSpecificHeat(double tunSpecificHeat) {
        _tunSpecificHeat = tunSpecificHeat;
    }

    public boolean getEquipmentAdjust() {
        return _equipmentAdjust;
    }

    public void setEquipmentAdjust(boolean equipmentAdjust) {
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

    private double _grainTemperature;
    private ArrayList<MashStep> _mashSteps;
    private String _notes;
    private double _tunTemperature;
    private double _spargeTemperature;
    private double _ph;
    private double _tunWeight;
    private double _tunSpecificHeat;
    private boolean _equipmentAdjust;
    private String _displayGrainTemperature;
    private String _displayTunTemperature;
    private String _displaySpargeTemperature;
    private String _displayTunWeight;
}
