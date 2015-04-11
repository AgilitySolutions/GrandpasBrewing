package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation;
import com.grandpasbrewing.beerxml.version1.enums.YeastForm;
import com.grandpasbrewing.beerxml.version1.enums.YeastType;

public class Yeast extends BeerXmlObjectBase {
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

    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public boolean getAmountIsWeight() {
        return _amountIsWeight;
    }

    public void setAmountIsWeight(boolean amountIsWeight) {
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

    public double getMinimumTemperature() {
        return _minimumTemperature;
    }

    public void setMinimumTemperature(double minimumTemperature) {
        _minimumTemperature = minimumTemperature;
    }

    public double getMaximumTemperature() {
        return _maximumTemperature;
    }

    public void setMaximumTemperature(double maximumTemperature) {
        _maximumTemperature = maximumTemperature;
    }

    public YeastFlocculation getFlocculation() {
        return _flocculation;
    }

    public void setFlocculation(YeastFlocculation flocculation) {
        _flocculation = flocculation;
    }

    public double getAttenuation() {
        return _attenuation;
    }

    public void setAttenuation(double attenuation) {
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

    public int getTimesCultured() {
        return _timesCultured;
    }

    public void setTimesCultured(int timesCultured) {
        _timesCultured = timesCultured;
    }

    public int getMaximumReuse() {
        return _maximumReuse;
    }

    public void setMaximumReuse(int maximumReuse) {
        _maximumReuse = maximumReuse;
    }

    public boolean getAddToSecondary() {
        return _addToSecondary;
    }

    public void setAddToSecondary(boolean addToSecondary) {
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
    private double _amount;
    private boolean _amountIsWeight;
    private String _laboratory;
    private String _manufacturerProductId;
    private double _minimumTemperature;
    private double _maximumTemperature;
    private YeastFlocculation _flocculation;
    private double _attenuation;
    private String _notes;
    private String _bestFor;
    private int _timesCultured;
    private int _maximumReuse;
    private boolean _addToSecondary;
    private String _displayAmount;
    private String _displayMinimumTemperature;
    private String _displayMaximumTemperature;
    private String _inventory;
    private String _cultureDate;
}
