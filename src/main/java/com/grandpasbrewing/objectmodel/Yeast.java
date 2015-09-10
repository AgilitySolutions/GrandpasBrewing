package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.YeastFlocculation;
import com.grandpasbrewing.objectmodel.enums.YeastForm;
import com.grandpasbrewing.objectmodel.enums.YeastType;

public class Yeast extends ObjectModelBase {
    public YeastType getType() {
        return _type;
    }

    public void setType(YeastType type) {
        _type = type;
    }

    public YeastForm getForm() {
        return _form;
    }

    public void setForm(YeastForm form) {
        _form = form;
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

    public String getLaboratory() {
        return _laboratory;
    }

    public void setLaboratory(String laboratory) {
        _laboratory = laboratory;
    }

    public String getManufacturerProductId() {
        return _manufacturerProductId;
    }

    public void setManufacturerProductId(String manufacturerProductId) {
        _manufacturerProductId = manufacturerProductId;
    }

    public Double getMinimumTemperature() {
        return _minimumTemperature;
    }

    public void setMinimumTemperature(Double minimumTemperature) {
        _minimumTemperature = minimumTemperature;
    }

    public Double getMaximumTemperature() {
        return _maximumTemperature;
    }

    public void setMaximumTemperature(Double maximumTemperature) {
        _maximumTemperature = maximumTemperature;
    }

    public YeastFlocculation getFlocculation() {
        return _flocculation;
    }

    public void setFlocculation(YeastFlocculation flocculation) {
        _flocculation = flocculation;
    }

    public Double getAttenuation() {
        return _attenuation;
    }

    public void setAttenuation(Double attenuation) {
        _attenuation = attenuation;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getBestFor() {
        return _bestFor;
    }

    public void setBestFor(String bestFor) {
        _bestFor = bestFor;
    }

    public Integer getTimesCultured() {
        return _timesCultured;
    }

    public void setTimesCultured(Integer timesCultured) {
        _timesCultured = timesCultured;
    }

    public Integer getMaximumReuse() {
        return _maximumReuse;
    }

    public void setMaximumReuse(Integer maximumReuse) {
        _maximumReuse = maximumReuse;
    }

    public Boolean getAddToSecondary() {
        return _addToSecondary;
    }

    public void setAddToSecondary(Boolean addToSecondary) {
        _addToSecondary = addToSecondary;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public String getDisplayMinimumTemperature() {
        return _displayMinimumTemperature;
    }

    public void setDisplayMinimumTemperature(String displayMinimumTemperature) {
        _displayMinimumTemperature = displayMinimumTemperature;
    }

    public String getDisplayMaximumTemperature() {
        return _displayMaximumTemperature;
    }

    public void setDisplayMaximumTemperature(String displayMaximumTemperature) {
        _displayMaximumTemperature = displayMaximumTemperature;
    }

    public String getInventory() {
        return _inventory;
    }

    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getCultureDate() {
        return _cultureDate;
    }

    public void setCultureDate(String cultureDate) {
        _cultureDate = cultureDate;
    }

    private YeastType _type;
    private YeastForm _form;
    private Double _amount;
    private Boolean _amountIsWeight;
    private String _laboratory;
    private String _manufacturerProductId;
    private Double _minimumTemperature;
    private Double _maximumTemperature;
    private YeastFlocculation _flocculation;
    private Double _attenuation;
    private String _notes;
    private String _bestFor;
    private Integer _timesCultured;
    private Integer _maximumReuse;
    private Boolean _addToSecondary;
    private String _displayAmount;
    private String _displayMinimumTemperature;
    private String _displayMaximumTemperature;
    private String _inventory;
    private String _cultureDate;
}
