package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.HopForm;
import com.grandpasbrewing.beerxml.version1.enums.HopType;
import com.grandpasbrewing.beerxml.version1.enums.HopUse;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.HopUseAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "HOP")
public class Hop extends BeerXmlObjectBase {
    public Double getAlphaPercentage() {
        return _alphaPercentage;
    }

    @XmlElement(name = "ALPHA")
    public void setAlphaPercentage(Double alphaPercentage) {
        _alphaPercentage = alphaPercentage;
    }

    public Double getAmount() {
        return _amount;
    }

    @XmlElement(name = "AMOUNT")
    public void setAmount(Double amount) {
        _amount = amount;
    }

    public HopUse getUse() {
        return _use;
    }

    @XmlElement(name = "USE")
    @XmlJavaTypeAdapter( HopUseAdapter.class )
    public void setUse(HopUse use) {
        _use = use;
    }

    public Double getTime() {
        return _time;
    }

    @XmlElement(name = "TIME")
    public void setTime(Double time) {
        _time = time;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public HopType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    public void setType(HopType type) {
        _type = type;
    }

    public HopForm getForm() {
        return _form;
    }

    @XmlElement(name = "FORM")
    public void setForm(HopForm form) {
        _form = form;
    }

    public Double getBetaPercentage() {
        return _betaPercentage;
    }

    @XmlElement(name = "BETA")
    public void setBetaPercentage(Double betaPercentage) {
        _betaPercentage = betaPercentage;
    }

    public Double getHopStabilityIndex() {
        return _hopStabilityIndex;
    }

    @XmlElement(name = "HSI")
    public void setHopStabilityIndex(Double hopStabilityIndex) {
        _hopStabilityIndex = hopStabilityIndex;
    }

    public String getPlaceOfOrigin() {
        return _placeOfOrigin;
    }

    @XmlElement(name = "ORIGIN")
    public void setPlaceOfOrigin(String placeOfOrigin) {
        _placeOfOrigin = placeOfOrigin;
    }

    public String getSubstitutes() {
        return _substitutes;
    }

    @XmlElement(name = "SUBSTITUTES")
    public void setSubstitutes(String substitutes) {
        _substitutes = substitutes;
    }

    public Double getHumuleneLevel() {
        return _humuleneLevel;
    }

    @XmlElement(name = "HUMULENE")
    public void setHumuleneLevel(Double humuleneLevel) {
        _humuleneLevel = humuleneLevel;
    }

    public Double getCaryophylleneLevel() {
        return _caryophylleneLevel;
    }

    @XmlElement(name = "CARYOPHYLLENE")
    public void setCaryophylleneLevel(Double caryophylleneLevel) {
        _caryophylleneLevel = caryophylleneLevel;
    }

    public Double getCohumuloneLevel() {
        return _cohumuloneLevel;
    }

    @XmlElement(name = "COHUMULONE")
    public void setCohumuloneLevel(Double cohumuloneLevel) {
        _cohumuloneLevel = cohumuloneLevel;
    }

    public Double getMyrceneLevel() {
        return _myrceneLevel;
    }

    @XmlElement(name = "MYRCENE")
    public void setMyrceneLevel(Double myrceneLevel) {
        _myrceneLevel = myrceneLevel;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    @XmlElement(name = "DISPLAY_AMOUNT")
    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public String getInventory() {
        return _inventory;
    }

    @XmlElement(name = "INVENTORY")
    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getDisplayTime() {
        return _displayTime;
    }

    @XmlElement(name = "DISPLAY_TIME")
    public void setDisplayTime(String displayTime) {
        _displayTime = displayTime;
    }

    private Double _alphaPercentage;
    private Double _amount;
    private HopUse _use;
    private Double _time;
    private String _notes;
    private HopType _type;
    private HopForm _form;
    private Double _betaPercentage;
    private Double _hopStabilityIndex;
    private String _placeOfOrigin;
    private String _substitutes;
    private Double _humuleneLevel;
    private Double _caryophylleneLevel;
    private Double _cohumuloneLevel;
    private Double _myrceneLevel;
    private String _displayAmount;
    private String _inventory;
    private String _displayTime;
}
