package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;

public class EquipmentItem extends ObjectModelBase {
    public double getBoilSize() {
        return _boilSize;
    }

    public void setBoilSize(double boilSize) {
        _boilSize = boilSize;
    }

    public double getBatchSize() {
        return _batchSize;
    }

    public void setBatchSize(double batchSize) {
        _batchSize = batchSize;
    }

    public double getTunVolume() {
        return _tunVolume;
    }

    public void setTunVolume(double tunVolume) {
        _tunVolume = tunVolume;
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

    public double getTopUpWater() {
        return _topUpWater;
    }

    public void setTopUpWater(double topUpWater) {
        _topUpWater = topUpWater;
    }

    public double getTrubChillerLoss() {
        return _trubChillerLoss;
    }

    public void setTrubChillerLoss(double trubChillerLoss) {
        _trubChillerLoss = trubChillerLoss;
    }

    public double getEvaporationRate() {
        return _evaporationRate;
    }

    public void setEvaporationRate(double evaporationRate) {
        _evaporationRate = evaporationRate;
    }

    public double getBoilTime() {
        return _boilTime;
    }

    public void setBoilTime(double boilTime) {
        _boilTime = boilTime;
    }

    public boolean getCalculateBoilVolume() {
        return _calculateBoilVolume;
    }

    public void setCalculateBoilVolume(boolean calculateBoilVolume) {
        _calculateBoilVolume = calculateBoilVolume;
    }

    public double getLauterDeadspace() {
        return _lauterDeadspace;
    }

    public void setLauterDeadspace(double lauterDeadspace) {
        _lauterDeadspace = lauterDeadspace;
    }

    public double getTopUpKettle() {
        return _topUpKettle;
    }

    public void setTopUpKettle(double topUpKettle) {
        _topUpKettle = topUpKettle;
    }

    public double getHopUtilization() {
        return _hopUtilization;
    }

    public void setHopUtilization(double hopUtilization) {
        _hopUtilization = hopUtilization;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getDisplayBoilSize() {
        return _displayBoilSize;
    }

    public void setDisplayBoilSize(String displayBoilSize) {
        _displayBoilSize = displayBoilSize;
    }

    public String getDisplayBatchSize() {
        return _displayBatchSize;
    }

    public void setDisplayBatchSize(String displayBatchSize) {
        _displayBatchSize = displayBatchSize;
    }

    public String getDisplayTunVolume() {
        return _displayTunVolume;
    }

    public void setDisplayTunVolume(String displayTunVolume) {
        _displayTunVolume = displayTunVolume;
    }

    public String getDisplayTunWeight() {
        return _displayTunWeight;
    }

    public void setDisplayTunWeight(String displayTunWeight) {
        _displayTunWeight = displayTunWeight;
    }

    public String getDisplayTopUpWater() {
        return _displayTopUpWater;
    }

    public void setDisplayTopUpWater(String displayTopUpWater) {
        _displayTopUpWater = displayTopUpWater;
    }

    public String getDisplayTrubChillerLoss() {
        return _displayTrubChillerLoss;
    }

    public void setDisplayTrubChillerLoss(String displayTrubChillerLoss) {
        _displayTrubChillerLoss = displayTrubChillerLoss;
    }

    public String getDisplayLauterDeadspace() {
        return _displayLauterDeadspace;
    }

    public void setDisplayLauterDeadspace(String displayLauterDeadspace) {
        _displayLauterDeadspace = displayLauterDeadspace;
    }

    public String getDisplayTopUpKettle() {
        return _displayTopUpKettle;
    }

    public void setDisplayTopUpKettle(String displayTopUpKettle) {
        _displayTopUpKettle = displayTopUpKettle;
    }

    private double _boilSize;
    private double _batchSize;
    private double _tunVolume;
    private double _tunWeight;
    private double _tunSpecificHeat;
    private double _topUpWater;
    private double _trubChillerLoss;
    private double _evaporationRate;
    private double _boilTime;
    private boolean _calculateBoilVolume;
    private double _lauterDeadspace;
    private double _topUpKettle;
    private double _hopUtilization;
    private String _notes;
    private String _displayBoilSize;
    private String _displayBatchSize;
    private String _displayTunVolume;
    private String _displayTunWeight;
    private String _displayTopUpWater;
    private String _displayTrubChillerLoss;
    private String _displayLauterDeadspace;
    private String _displayTopUpKettle;
}
