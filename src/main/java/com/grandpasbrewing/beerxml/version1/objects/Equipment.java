package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.serialization.adapters.BooleanAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "EQUIPMENT")
public class Equipment extends BeerXmlObjectBase {
    public double getBoilSize() {
        return _boilSize;
    }

    @XmlElement(name = "BOIL_SIZE")
    public void setBoilSize(double boilSize) {
        _boilSize = boilSize;
    }

    public double getBatchSize() {
        return _batchSize;
    }

    @XmlElement(name = "BATCH_SIZE")
    public void setBatchSize(double batchSize) {
        _batchSize = batchSize;
    }

    public double getTunVolume() {
        return _tunVolume;
    }

    @XmlElement(name = "TUN_VOLUME")
    public void setTunVolume(double tunVolume) {
        _tunVolume = tunVolume;
    }

    public double getTunWeight() {
        return _tunWeight;
    }

    @XmlElement(name = "TUN_WEIGHT")
    public void setTunWeight(double tunWeight) {
        _tunWeight = tunWeight;
    }

    public double getTunSpecificHeat() {
        return _tunSpecificHeat;
    }

    @XmlElement(name = "TUN_SPECIFIC_HEAT")
    public void setTunSpecificHeat(double tunSpecificHeat) {
        _tunSpecificHeat = tunSpecificHeat;
    }

    public double getTopUpWater() {
        return _topUpWater;
    }

    @XmlElement(name = "TOP_UP_WATER")
    public void setTopUpWater(double topUpWater) {
        _topUpWater = topUpWater;
    }

    public double getTrubChillerLoss() {
        return _trubChillerLoss;
    }

    @XmlElement(name = "TRUB_CHILLER_LOSS")
    public void setTrubChillerLoss(double trubChillerLoss) {
        _trubChillerLoss = trubChillerLoss;
    }

    public double getEvaporationRate() {
        return _evaporationRate;
    }

    @XmlElement(name = "EVAP_RATE")
    public void setEvaporationRate(double evaporationRate) {
        _evaporationRate = evaporationRate;
    }

    public double getBoilTime() {
        return _boilTime;
    }

    @XmlElement(name = "BOIL_TIME")
    public void setBoilTime(double boilTime) {
        _boilTime = boilTime;
    }

    public Boolean getCalculateBoilVolume() {
        return _calculateBoilVolume;
    }

    @XmlElement(name = "CALC_BOIL_VOLUME")
    @XmlJavaTypeAdapter( BooleanAdapter.class )
    public void setCalculateBoilVolume(Boolean calculateBoilVolume) {
        _calculateBoilVolume = calculateBoilVolume;
    }

    public double getLauterDeadspace() {
        return _lauterDeadspace;
    }

    @XmlElement(name = "LAUTER_DEADSPACE")
    public void setLauterDeadspace(double lauterDeadspace) {
        _lauterDeadspace = lauterDeadspace;
    }

    public double getTopUpKettle() {
        return _topUpKettle;
    }

    @XmlElement(name = "TOP_UP_KETTLE")
    public void setTopUpKettle(double topUpKettle) {
        _topUpKettle = topUpKettle;
    }

    public double getHopUtilization() {
        return _hopUtilization;
    }

    @XmlElement(name = "HOP_UTILIZATION")
    public void setHopUtilization(double hopUtilization) {
        _hopUtilization = hopUtilization;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getDisplayBoilSize() {
        return _displayBoilSize;
    }

    @XmlElement(name = "DISPLAY_BOIL_SIZE")
    public void setDisplayBoilSize(String displayBoilSize) {
        _displayBoilSize = displayBoilSize;
    }

    public String getDisplayBatchSize() {
        return _displayBatchSize;
    }

    @XmlElement(name = "DISPLAY_BATCH_SIZE")
    public void setDisplayBatchSize(String displayBatchSize) {
        _displayBatchSize = displayBatchSize;
    }

    public String getDisplayTunVolume() {
        return _displayTunVolume;
    }

    @XmlElement(name = "DISPLAY_TUN_VOLUME")
    public void setDisplayTunVolume(String displayTunVolume) {
        _displayTunVolume = displayTunVolume;
    }

    public String getDisplayTunWeight() {
        return _displayTunWeight;
    }

    @XmlElement(name = "DISPLAY_TUN_WEIGHT")
    public void setDisplayTunWeight(String displayTunWeight) {
        _displayTunWeight = displayTunWeight;
    }

    public String getDisplayTopUpWater() {
        return _displayTopUpWater;
    }

    @XmlElement(name = "DISPLAY_TOP_UP_WATER")
    public void setDisplayTopUpWater(String displayTopUpWater) {
        _displayTopUpWater = displayTopUpWater;
    }

    public String getDisplayTrubChillerLoss() {
        return _displayTrubChillerLoss;
    }

    @XmlElement(name = "DISPLAY_TRUB_CHILLER_LOSS")
    public void setDisplayTrubChillerLoss(String displayTrubChillerLoss) {
        _displayTrubChillerLoss = displayTrubChillerLoss;
    }

    public String getDisplayLauterDeadspace() {
        return _displayLauterDeadspace;
    }

    @XmlElement(name = "DISPLAY_LAUTER_DEADSPACE")
    public void setDisplayLauterDeadspace(String displayLauterDeadspace) {
        _displayLauterDeadspace = displayLauterDeadspace;
    }

    public String getDisplayTopUpKettle() {
        return _displayTopUpKettle;
    }

    @XmlElement(name = "DISPLAY_TOP_UP_KETTLE")
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
