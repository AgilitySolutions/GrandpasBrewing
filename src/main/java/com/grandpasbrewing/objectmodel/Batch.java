package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;

import java.util.ArrayList;
import java.util.Date;

public class Batch extends ObjectModelBase {
    public Date getStartDate() {
        return _startDate;
    }

    public void setStartDate(Date startDate) {
        _startDate = startDate;
    }

    public ArrayList<Ingredient> getIngredients() {
        return _ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        _ingredients = ingredients;
    }

    public double getOriginalGravity() {
        return _originalGravity;
    }

    public void setOriginalGravity(double originalGravity) {
        _originalGravity = originalGravity;
    }

    public double getFinalGravity() {
        return _finalGravity;
    }

    public void setFinalGravity(double finalGravity) {
        _finalGravity = finalGravity;
    }

    public String getTesting() {
        return _testing;
    }

    public void setTesting(String testing) {
        _testing = testing;
    }

    public String getRecipeInformation() {
        return _recipeInformation;
    }

    public void setRecipeInformation(String recipeInformation) {
        _recipeInformation = recipeInformation;
    }

    public String getStyle() {
        return _style;
    }

    public void setStyle(String style) {
        _style = style;
    }

    public double getAlcoholByVolume() {
        return _alcoholByVolume;
    }

    public void setAlcoholByVolume(double alcoholByVolume) {
        _alcoholByVolume = alcoholByVolume;
    }

    public String getAvailability() {
        return _availability;
    }

    public void setAvailability(String availability) {
        _availability = availability;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getPicture() {
        return _picture;
    }

    public void setPicture(String picture) {
        _picture = picture;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getTypeOfProduct() {
        return _typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        _typeOfProduct = typeOfProduct;
    }

    public Date getDateOfBrewing() {
        return _dateOfBrewing;
    }

    public void setDateOfBrewing(Date dateOfBrewing) {
        _dateOfBrewing = dateOfBrewing;
    }

    public double getWaterVolume() {
        return _waterVolume;
    }

    public void setWaterVolume(double waterVolume) {
        _waterVolume = waterVolume;
    }

    public String getTypeOfSugarsAdded() {
        return _typeOfSugarsAdded;
    }

    public void setTypeOfSugarsAdded(String typeOfSugarsAdded) {
        _typeOfSugarsAdded = typeOfSugarsAdded;
    }

    public double getAmountOfSugarsAdded() {
        return _amountOfSugarsAdded;
    }

    public void setAmountOfSugarsAdded(double amountOfSugarsAdded) {
        _amountOfSugarsAdded = amountOfSugarsAdded;
    }

    public Date getBestBeforeDate() {
        return _bestBeforeDate;
    }

    public void setBestBeforeDate(Date bestBeforeDate) {
        _bestBeforeDate = bestBeforeDate;
    }

    public String getYeastCodeOnSachet() {
        return _yeastCodeOnSachet;
    }

    public void setYeastCodeOnSachet(String yeastCodeOnSachet) {
        _yeastCodeOnSachet = yeastCodeOnSachet;
    }

    public int getTemperatureOfWortBeforeAddingYeast() {
        return _temperatureOfWortBeforeAddingYeast;
    }

    public void setTemperatureOfWortBeforeAddingYeast(int temperatureOfWortBeforeAddingYeast) {
        _temperatureOfWortBeforeAddingYeast = temperatureOfWortBeforeAddingYeast;
    }

    public Date getDateOfBottling() {
        return _dateOfBottling;
    }

    public void setDateOfBottling(Date dateOfBottling) {
        _dateOfBottling = dateOfBottling;
    }

    public String getSanitizing() {
        return _sanitizing;
    }

    public void setSanitizing(String sanitizing) {
        _sanitizing = sanitizing;
    }

    public String getYield() {
        return _yield;
    }

    public void setYield(String yield) {
        _yield = yield;
    }

    private Date _startDate;
    private ArrayList<Ingredient> _ingredients;
    private double _originalGravity;
    private double _finalGravity;
    private String _testing;
    private String _recipeInformation;
    private String _style;
    private double _alcoholByVolume;
    private String _availability;
    private String _notes;
    private String _picture;
    private String _description;
    private String _typeOfProduct;
    private Date _dateOfBrewing;
    private double _waterVolume;
    private String _typeOfSugarsAdded;
    private double _amountOfSugarsAdded;
    private Date _bestBeforeDate;
    private String _yeastCodeOnSachet;
    private int _temperatureOfWortBeforeAddingYeast;
    private Date _dateOfBottling;
    private String _sanitizing;
    private String _yield;
}
