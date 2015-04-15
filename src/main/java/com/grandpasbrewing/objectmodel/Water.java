package com.grandpasbrewing.objectmodel;

public class Water extends ObjectModelBase {
    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public double getCalcium() {
        return _calcium;
    }

    public void setCalcium(double calcium) {
        _calcium = calcium;
    }

    public double getBicarbonate() {
        return _bicarbonate;
    }

    public void setBicarbonate(double bicarbonate) {
        _bicarbonate = bicarbonate;
    }

    public double getSulfate() {
        return _sulfate;
    }

    public void setSulfate(double sulfate) {
        _sulfate = sulfate;
    }

    public double getChloride() {
        return _chloride;
    }

    public void setChloride(double chloride) {
        _chloride = chloride;
    }

    public double getSodium() {
        return _sodium;
    }

    public void setSodium(double sodium) {
        _sodium = sodium;
    }

    public double getMagnesium() {
        return _magnesium;
    }

    public void setMagnesium(double magnesium) {
        _magnesium = magnesium;
    }

    public double getPH() {
        return _ph;
    }

    public void setPH(double ph) {
        _ph = ph;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    private double _amount;
    private double _calcium;
    private double _bicarbonate;
    private double _sulfate;
    private double _chloride;
    private double _sodium;
    private double _magnesium;
    private double _ph;
    private String _notes;
    private String _displayAmount;
}
