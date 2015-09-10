package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.HopForm;
import com.grandpasbrewing.objectmodel.enums.HopType;
import com.grandpasbrewing.objectmodel.enums.HopUse;

public class Hop extends ObjectModelBase {
    public Double getAlphaPercentage() {
        return _alphaPercentage;
    }

    public void setAlphaPercentage(Double alphaPercentage) {
        _alphaPercentage = alphaPercentage;
    }

    public Double getAmount() {
        return _amount;
    }

    public void setAmount(Double amount) {
        _amount = amount;
    }

    public HopUse getUse() {
        return _use;
    }

    public void setUse(HopUse use) {
        _use = use;
    }

    public Double getTime() {
        return _time;
    }

    public void setTime(Double time) {
        _time = time;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public HopType getType() {
        return _type;
    }

    public void setType(HopType type) {
        _type = type;
    }

    public HopForm getForm() {
        return _form;
    }

    public void setForm(HopForm form) {
        _form = form;
    }

    public Double getBetaPercentage() {
        return _betaPercentage;
    }

    public void setBetaPercentage(Double betaPercentage) {
        _betaPercentage = betaPercentage;
    }

    public Double getHopStabilityIndex() {
        return _hopStabilityIndex;
    }

    public void setHopStabilityIndex(Double hopStabilityIndex) {
        _hopStabilityIndex = hopStabilityIndex;
    }

    public String getPlaceOfOrigin() {
        return _placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        _placeOfOrigin = placeOfOrigin;
    }

    public String getSubstitutes() {
        return _substitutes;
    }

    public void setSubstitutes(String substitutes) {
        _substitutes = substitutes;
    }

    public Double getHumuleneLevel() {
        return _humuleneLevel;
    }

    public void setHumuleneLevel(Double humuleneLevel) {
        _humuleneLevel = humuleneLevel;
    }

    public Double getCaryophylleneLevel() {
        return _caryophylleneLevel;
    }

    public void setCaryophylleneLevel(Double caryophylleneLevel) {
        _caryophylleneLevel = caryophylleneLevel;
    }

    public Double getCohumuloneLevel() {
        return _cohumuloneLevel;
    }

    public void setCohumuloneLevel(Double cohumuloneLevel) {
        _cohumuloneLevel = cohumuloneLevel;
    }

    public Double getMyrceneLevel() {
        return _myrceneLevel;
    }

    public void setMyrceneLevel(Double myrceneLevel) {
        _myrceneLevel = myrceneLevel;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public String getInventory() {
        return _inventory;
    }

    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getDisplayTime() {
        return _displayTime;
    }

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
