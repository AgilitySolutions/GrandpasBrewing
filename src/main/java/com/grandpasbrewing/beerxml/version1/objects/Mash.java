package com.grandpasbrewing.beerxml.version1.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "MASH")
public class Mash extends BeerXmlObjectBase {
    public Double getGrainTemperature() {
        return _grainTemperature;
    }

    @XmlElement(name = "GRAIN_TEMP")
    public void setGrainTemperature(Double grainTemperature) {
        _grainTemperature = grainTemperature;
    }

    public ArrayList<MashStep> getMashSteps() {
        return _mashSteps;
    }

    @XmlElementWrapper(name = "MASH_STEPS")
    @XmlElement(name = "MASH_STEP")
    public void setMashSteps(ArrayList<MashStep> mashSteps) {
        _mashSteps = mashSteps;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public Double getTunTemperature() {
        return _tunTemperature;
    }

    @XmlElement(name = "TUN_TEMP")
    public void setTunTemperature(Double tunTemperature) {
        _tunTemperature = tunTemperature;
    }

    public Double getSpargeTemperature() {
        return _spargeTemperature;
    }

    @XmlElement(name = "SPARGE_TEMP")
    public void setSpargeTemperature(Double spargeTemperature) {
        _spargeTemperature = spargeTemperature;
    }

    public Double getPH() {
        return _ph;
    }

    @XmlElement(name = "PH")
    public void setPH(Double ph) {
        _ph = ph;
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

    public Boolean getEquipmentAdjust() {
        return _equipmentAdjust;
    }

    @XmlElement(name = "EQUIP_ADJUST")
    public void setEquipmentAdjust(Boolean equipmentAdjust) {
        _equipmentAdjust = equipmentAdjust;
    }

    public String getDisplayGrainTemperature() {
        return _displayGrainTemperature;
    }

    @XmlElement(name = "DISPLAY_GRAIN_TEMP")
    public void setDisplayGrainTemperature(String displayGrainTemperature) {
        _displayGrainTemperature = displayGrainTemperature;
    }

    public String getDisplayTunTemperature() {
        return _displayTunTemperature;
    }

    @XmlElement(name = "DISPLAY_TUN_TEMP")
    public void setDisplayTunTemperature(String displayTunTemperature) {
        _displayTunTemperature = displayTunTemperature;
    }

    public String getDisplaySpargeTemperature() {
        return _displaySpargeTemperature;
    }

    @XmlElement(name = "DISPLAY_SPARGE_TEMP")
    public void setDisplaySpargeTemperature(String displaySpargeTemperature) {
        _displaySpargeTemperature = displaySpargeTemperature;
    }

    public String getDisplayTunWeight() {
        return _displayTunWeight;
    }

    @XmlElement(name = "DISPLAY_TUN_WEIGHT")
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
