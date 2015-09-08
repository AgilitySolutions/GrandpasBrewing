package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.HopForm;
import com.grandpasbrewing.objectmodel.enums.HopType;
import com.grandpasbrewing.objectmodel.enums.HopUse;

public class Hop extends ObjectModelBase {
    public double getAlphaPercentage() {
        return _alphaPercentage;
    }

    public void setAlphaPercentage(double alphaPercentage) {
        _alphaPercentage = alphaPercentage;
    }

    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public HopUse getUse() {
        return _use;
    }

    public void setUse(HopUse use) {
        _use = use;
    }

    public double getTime() {
        return _time;
    }

    public void setTime(double time) {
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

    public double getBetaPercentage() {
        return _betaPercentage;
    }

    public void setBetaPercentage(double betaPercentage) {
        _betaPercentage = betaPercentage;
    }

    public double getHopStabilityIndex() {
        return _hopStabilityIndex;
    }

    public void setHopStabilityIndex(double hopStabilityIndex) {
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

    public double getHumuleneLevel() {
        return _humuleneLevel;
    }

    public void setHumuleneLevel(double humuleneLevel) {
        _humuleneLevel = humuleneLevel;
    }

    public double getCaryophylleneLevel() {
        return _caryophylleneLevel;
    }

    public void setCaryophylleneLevel(double caryophylleneLevel) {
        _caryophylleneLevel = caryophylleneLevel;
    }

    public double getCohumuloneLevel() {
        return _cohumuloneLevel;
    }

    public void setCohumuloneLevel(double cohumuloneLevel) {
        _cohumuloneLevel = cohumuloneLevel;
    }

    public double getMyrceneLevel() {
        return _myrceneLevel;
    }

    public void setMyrceneLevel(double myrceneLevel) {
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

    private double _alphaPercentage;
    private double _amount;
    private HopUse _use;
    private double _time;
    private String _notes;
    private HopType _type;
    private HopForm _form;
    private double _betaPercentage;
    private double _hopStabilityIndex;
    private String _placeOfOrigin;
    private String _substitutes;
    private double _humuleneLevel;
    private double _caryophylleneLevel;
    private double _cohumuloneLevel;
    private double _myrceneLevel;
    private String _displayAmount;
    private String _inventory;
    private String _displayTime;
}
