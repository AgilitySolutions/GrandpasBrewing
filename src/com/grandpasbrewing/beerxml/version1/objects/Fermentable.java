package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;

public class Fermentable extends BeerXmlObjectBase {
    public FermentableType getType() {
        return _type;
    }

    public void setType(FermentableType type) {
        _type = type;
    }

    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public double getYield() {
        return _yield;
    }

    public void setYield(double yield) {
        _yield = yield;
    }

    public double getColor() {
        return _color;
    }

    public void setColor(double color) {
        _color = color;
    }

    public boolean getAddAfterBoil() {
        return _addAfterBoil;
    }

    public void setAddAfterBoil(boolean addAfterBoil) {
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

    public double getCoarseFineDiff() {
        return _coarseFineDiff;
    }

    public void setCoarseFineDiff(double coarseFineDiff) {
        _coarseFineDiff = coarseFineDiff;
    }

    public double getMoisture() {
        return _moisture;
    }

    public void setMoisture(double moisture) {
        _moisture = moisture;
    }

    public double getDiastaticPower() {
        return _diastaticPower;
    }

    public void setDiastaticPower(double diastaticPower) {
        _diastaticPower = diastaticPower;
    }

    public double getProtein() {
        return _protein;
    }

    public void setProtein(double protein) {
        _protein = protein;
    }

    public double getMaximumInBatch() {
        return _maximumInBatch;
    }

    public void setMaximumInBatch(double maximumInBatch) {
        _maximumInBatch = maximumInBatch;
    }

    public boolean getRecommendMash() {
        return _recommendMash;
    }

    public void setRecommendMash(boolean recommendMash) {
        _recommendMash = recommendMash;
    }

    public double getIBUGallonsPerPound() {
        return _ibuGallonsPerPound;
    }

    public void setIBUGallonsPerPound(double ibuGallonsPerPound) {
        _ibuGallonsPerPound = ibuGallonsPerPound;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public double getPotential() {
        return _potential;
    }

    public void setPotential(double potential) {
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
    private double _amount;
    private double _yield;
    private double _color;
    private boolean _addAfterBoil;
    private String _placeOfOrigin;
    private String _supplier;
    private String _notes;
    private double _coarseFineDiff;
    private double _moisture;
    private double _diastaticPower;
    private double _protein;
    private double _maximumInBatch;
    private boolean _recommendMash;
    private double _ibuGallonsPerPound;
    private String _displayAmount;
    private double _potential;
    private String _inventory;
    private String _displayColor;
}
