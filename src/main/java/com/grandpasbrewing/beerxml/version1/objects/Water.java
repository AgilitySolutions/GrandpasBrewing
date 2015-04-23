package com.grandpasbrewing.beerxml.version1.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WATER")
public class Water extends BeerXmlObjectBase {
    public Double getAmount() {
        return _amount;
    }

    @XmlElement(name = "AMOUNT")
    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Double getCalcium() {
        return _calcium;
    }

    @XmlElement(name = "CALCIUM")
    public void setCalcium(Double calcium) {
        _calcium = calcium;
    }

    public Double getBicarbonate() {
        return _bicarbonate;
    }

    @XmlElement(name = "BICARBONATE")
    public void setBicarbonate(Double bicarbonate) {
        _bicarbonate = bicarbonate;
    }

    public Double getSulfate() {
        return _sulfate;
    }

    @XmlElement(name = "SULFATE")
    public void setSulfate(Double sulfate) {
        _sulfate = sulfate;
    }

    public Double getChloride() {
        return _chloride;
    }

    @XmlElement(name = "CHLORIDE")
    public void setChloride(Double chloride) {
        _chloride = chloride;
    }

    public Double getSodium() {
        return _sodium;
    }

    @XmlElement(name = "SODIUM")
    public void setSodium(Double sodium) {
        _sodium = sodium;
    }

    public Double getMagnesium() {
        return _magnesium;
    }

    @XmlElement(name = "MAGNESIUM")
    public void setMagnesium(Double magnesium) {
        _magnesium = magnesium;
    }

    public Double getPH() {
        return _ph;
    }

    @XmlElement(name = "PH")
    public void setPH(Double ph) {
        _ph = ph;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    @XmlElement(name = "DISPLAY_AMOUNT")
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
