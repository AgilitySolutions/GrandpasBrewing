package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType;
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse;

public class MiscellaneousItem extends ObjectModelBase {
    public MiscellaneousItemType getType() {
        return _type;
    }

    public void setType(MiscellaneousItemType type) {
        _type = type;
    }

    public MiscellaneousItemUse getUse() {
        return _use;
    }

    public void setUse(MiscellaneousItemUse use) {
        _use = use;
    }

    public Double getTime() {
        return _time;
    }

    public void setTime(Double time) {
        _time = time;
    }

    public Double getAmount() {
        return _amount;
    }

    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Boolean getAmountIsWeight() {
        return _amountIsWeight;
    }

    public void setAmountIsWeight(Boolean amountIsWeight) {
        _amountIsWeight = amountIsWeight;
    }

    public String getUseFor() {
        return _useFor;
    }

    public void setUseFor(String useFor) {
        _useFor = useFor;
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

    private MiscellaneousItemType _type;
    private MiscellaneousItemUse _use;
    private Double _time;
    private Double _amount;
    private Boolean _amountIsWeight;
    private String _useFor;
    private String _notes;
    private String _displayAmount;
    private String _inventory;
    private String _displayTime;
}
