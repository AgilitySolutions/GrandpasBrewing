package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.MiscType;
import com.grandpasbrewing.beerxml.version1.enums.MiscUse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MISC")
public class Misc extends BeerXmlObjectBase {
    public MiscType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    public void setType(MiscType type) {
        _type = type;
    }

    public MiscUse getUse() {
        return _use;
    }

    @XmlElement(name = "USE")
    public void setUse(MiscUse use) {
        _use = use;
    }

    public Double getTime() {
        return _time;
    }

    @XmlElement(name = "TIME")
    public void setTime(Double time) {
        _time = time;
    }

    public Double getAmount() {
        return _amount;
    }

    @XmlElement(name = "AMOUNT")
    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Boolean getAmountIsWeight() {
        return _amountIsWeight;
    }

    @XmlElement(name = "AMOUNT_IS_WEIGHT")
    public void setAmountIsWeight(Boolean amountIsWeight) {
        _amountIsWeight = amountIsWeight;
    }

    public String getUseFor() {
        return _useFor;
    }

    @XmlElement(name = "USE_FOR")
    public void setUseFor(String useFor) {
        _useFor = useFor;
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

    private MiscType _type;
    private MiscUse _use;
    private Double _time;
    private Double _amount;
    private Boolean _amountIsWeight;
    private String _useFor;
    private String _notes;
    private String _displayAmount;
    private String _inventory;
    private String _displayTime;
}
