package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.serialization.adapters.BooleanAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "EQUIPMENT")
public class Equipment extends BeerXmlObjectBase {
    public Double getBoilSize() {
        return _boilSize;
    }

    @XmlElement(name = "BOIL_SIZE")
    public void setBoilSize(Double boilSize) {
        _boilSize = boilSize;
    }

    public Double getBatchSize() {
        return _batchSize;
    }

    @XmlElement(name = "BATCH_SIZE")
    public void setBatchSize(Double batchSize) {
        _batchSize = batchSize;
    }

    public Double getTunVolume() {
        return _tunVolume;
    }

    @XmlElement(name = "TUN_VOLUME")
    public void setTunVolume(Double tunVolume) {
        _tunVolume = tunVolume;
    }

    public Double getTunWeight() {
        return _tunWeight;
    }

    @XmlElement(name = "TUN_WEIGHT")
    public void setTunWeight(Double tunWeight) {
        _tunWeight = tunWeight;
    }

    public Double getTunSpecificHeat() {
        return _tunSpecificHeat;
    }

    @XmlElement(name = "TUN_SPECIFIC_HEAT")
    public void setTunSpecificHeat(Double tunSpecificHeat) {
        _tunSpecificHeat = tunSpecificHeat;
    }

    public Double getTopUpWater() {
        return _topUpWater;
    }

    @XmlElement(name = "TOP_UP_WATER")
    public void setTopUpWater(Double topUpWater) {
        _topUpWater = topUpWater;
    }

    public Double getTrubChillerLoss() {
        return _trubChillerLoss;
    }

    @XmlElement(name = "TRUB_CHILLER_LOSS")
    public void setTrubChillerLoss(Double trubChillerLoss) {
        _trubChillerLoss = trubChillerLoss;
    }

    public Double getEvaporationRate() {
        return _evaporationRate;
    }

    @XmlElement(name = "EVAP_RATE")
    public void setEvaporationRate(Double evaporationRate) {
        _evaporationRate = evaporationRate;
    }

    public Double getBoilTime() {
        return _boilTime;
    }

    @XmlElement(name = "BOIL_TIME")
    public void setBoilTime(Double boilTime) {
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

    public Double getLauterDeadspace() {
        return _lauterDeadspace;
    }

    @XmlElement(name = "LAUTER_DEADSPACE")
    public void setLauterDeadspace(Double lauterDeadspace) {
        _lauterDeadspace = lauterDeadspace;
    }

    public Double getTopUpKettle() {
        return _topUpKettle;
    }

    @XmlElement(name = "TOP_UP_KETTLE")
    public void setTopUpKettle(Double topUpKettle) {
        _topUpKettle = topUpKettle;
    }

    public Double getHopUtilization() {
        return _hopUtilization;
    }

    @XmlElement(name = "HOP_UTILIZATION")
    public void setHopUtilization(Double hopUtilization) {
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

    private Double _boilSize;
    private Double _batchSize;
    private Double _tunVolume;
    private Double _tunWeight;
    private Double _tunSpecificHeat;
    private Double _topUpWater;
    private Double _trubChillerLoss;
    private Double _evaporationRate;
    private Double _boilTime;
    private Boolean _calculateBoilVolume;
    private Double _lauterDeadspace;
    private Double _topUpKettle;
    private Double _hopUtilization;
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
