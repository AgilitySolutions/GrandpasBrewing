package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.FermentableType;

public class Fermentable extends ObjectModelBase {
    public FermentableType getType() {
        return _type;
    }

    public void setType(FermentableType type) {
        _type = type;
    }

    public Double getAmount() {
        return _amount;
    }

    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Double getYield() {
        return _yield;
    }

    public void setYield(Double yield) {
        _yield = yield;
    }

    public Double getColor() {
        return _color;
    }

    public void setColor(Double color) {
        _color = color;
    }

    public Boolean getAddAfterBoil() {
        return _addAfterBoil;
    }

    public void setAddAfterBoil(Boolean addAfterBoil) {
        _addAfterBoil = addAfterBoil;
    }

    public String getPlaceOfOrigin() {
        return _placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        _placeOfOrigin = placeOfOrigin;
    }

    public String getSupplier() {
        return _supplier;
    }

    public void setSupplier(String supplier) {
        _supplier = supplier;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public Double getCoarseFineDiff() {
        return _coarseFineDiff;
    }

    public void setCoarseFineDiff(Double coarseFineDiff) {
        _coarseFineDiff = coarseFineDiff;
    }

    public Double getMoisture() {
        return _moisture;
    }

    public void setMoisture(Double moisture) {
        _moisture = moisture;
    }

    public Double getDiastaticPower() {
        return _diastaticPower;
    }

    public void setDiastaticPower(Double diastaticPower) {
        _diastaticPower = diastaticPower;
    }

    public Double getProtein() {
        return _protein;
    }

    public void setProtein(Double protein) {
        _protein = protein;
    }

    public Double getMaximumInBatch() {
        return _maximumInBatch;
    }

    public void setMaximumInBatch(Double maximumInBatch) {
        _maximumInBatch = maximumInBatch;
    }

    public Boolean getRecommendMash() {
        return _recommendMash;
    }

    public void setRecommendMash(Boolean recommendMash) {
        _recommendMash = recommendMash;
    }

    public Double getIBUGallonsPerPound() {
        return _ibuGallonsPerPound;
    }

    public void setIBUGallonsPerPound(Double ibuGallonsPerPound) {
        _ibuGallonsPerPound = ibuGallonsPerPound;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public Double getPotential() {
        return _potential;
    }

    public void setPotential(Double potential) {
        _potential = potential;
    }

    public String getInventory() {
        return _inventory;
    }

    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getDisplayColor() {
        return _displayColor;
    }

    public void setDisplayColor(String displayColor) {
        _displayColor = displayColor;
    }

    private FermentableType _type;
    private Double _amount;
    private Double _yield;
    private Double _color;
    private Boolean _addAfterBoil;
    private String _placeOfOrigin;
    private String _supplier;
    private String _notes;
    private Double _coarseFineDiff;
    private Double _moisture;
    private Double _diastaticPower;
    private Double _protein;
    private Double _maximumInBatch;
    private Boolean _recommendMash;
    private Double _ibuGallonsPerPound;
    private String _displayAmount;
    private Double _potential;
    private String _inventory;
    private String _displayColor;
}
