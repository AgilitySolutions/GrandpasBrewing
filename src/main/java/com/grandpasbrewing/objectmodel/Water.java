package com.grandpasbrewing.objectmodel;

public class Water extends ObjectModelBase {
    public Double getAmount() {
        return _amount;
    }

    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Double getCalcium() {
        return _calcium;
    }

    public void setCalcium(Double calcium) {
        _calcium = calcium;
    }

    public Double getBicarbonate() {
        return _bicarbonate;
    }

    public void setBicarbonate(Double bicarbonate) {
        _bicarbonate = bicarbonate;
    }

    public Double getSulfate() {
        return _sulfate;
    }

    public void setSulfate(Double sulfate) {
        _sulfate = sulfate;
    }

    public Double getChloride() {
        return _chloride;
    }

    public void setChloride(Double chloride) {
        _chloride = chloride;
    }

    public Double getSodium() {
        return _sodium;
    }

    public void setSodium(Double sodium) {
        _sodium = sodium;
    }

    public Double getMagnesium() {
        return _magnesium;
    }

    public void setMagnesium(Double magnesium) {
        _magnesium = magnesium;
    }

    public Double getPH() {
        return _ph;
    }

    public void setPH(Double ph) {
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

    private Double _amount;
    private Double _calcium;
    private Double _bicarbonate;
    private Double _sulfate;
    private Double _chloride;
    private Double _sodium;
    private Double _magnesium;
    private Double _ph;
    private String _notes;
    private String _displayAmount;
}
