package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.RecipeType;

import java.util.ArrayList;

public class Recipe extends ObjectModelBase {
    public RecipeType getType() {
        return _type;
    }

    public void setType(RecipeType type) {
        _type = type;
    }

    public Style getStyle() {
        return _style;
    }

    public void setStyle(Style style) {
        _style = style;
    }

    public EquipmentItem getEquipment() {
        return _equipment;
    }

    public void setEquipment(EquipmentItem equipment) {
        _equipment = equipment;
    }

    public String getBrewer() {
        return _brewer;
    }

    public void setBrewer(String brewer) {
        _brewer = brewer;
    }

    public String getAssistantBrewer() {
        return _assistantBrewer;
    }

    public void setAssistantBrewer(String assistantBrewer) {
        _assistantBrewer = assistantBrewer;
    }

    public Double getBatchSize() {
        return _batchSize;
    }

    public void setBatchSize(Double batchSize) {
        _batchSize = batchSize;
    }

    public Double getBoilSize() {
        return _boilSize;
    }

    public void setBoilSize(Double boilSize) {
        _boilSize = boilSize;
    }

    public Double getBoilTime() {
        return _boilTime;
    }

    public void setBoilTime(Double boilTime) {
        _boilTime = boilTime;
    }

    public Double getEfficiency() {
        return _efficiency;
    }

    public void setEfficiency(Double efficiency) {
        _efficiency = efficiency;
    }

    public ArrayList<Hop> getHops() {
        return _hops;
    }

    public void setHops(ArrayList<Hop> hops) {
        _hops = hops;
    }

    public ArrayList<Fermentable> getFermentables() {
        return _fermentables;
    }

    public void setFermentables(ArrayList<Fermentable> fermentables) {
        _fermentables = fermentables;
    }

    public ArrayList<MiscellaneousItem> getMiscs() {
        return _miscs;
    }

    public void setMiscs(ArrayList<MiscellaneousItem> miscs) {
        _miscs = miscs;
    }

    public ArrayList<Yeast> getYeasts() {
        return _yeasts;
    }

    public void setYeasts(ArrayList<Yeast> yeasts) {
        _yeasts = yeasts;
    }

    public ArrayList<Water> getWaters() {
        return _waters;
    }

    public void setWaters(ArrayList<Water> waters) {
        _waters = waters;
    }

    public Mash getMash() {
        return _mash;
    }

    public void setMash(Mash mash) {
        _mash = mash;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getTasteNotes() {
        return _tasteNotes;
    }

    public void setTasteNotes(String tasteNotes) {
        _tasteNotes = tasteNotes;
    }

    public Double getRating() {
        return _rating;
    }

    public void setRating(Double rating) {
        _rating = rating;
    }

    public Double getOriginalGravity() {
        return _originalGravity;
    }

    public void setOriginalGravity(Double originalGravity) {
        _originalGravity = originalGravity;
    }

    public Double getFinalGravity() {
        return _finalGravity;
    }

    public void setFinalGravity(Double finalGravity) {
        _finalGravity = finalGravity;
    }

    public Integer getFermentationStages() {
        return _fermentationStages;
    }

    public void setFermentationStages(Integer fermentationStages) {
        _fermentationStages = fermentationStages;
    }

    public Double getPrimaryAge() {
        return _primaryAge;
    }

    public void setPrimaryAge(Double primaryAge) {
        _primaryAge = primaryAge;
    }

    public Double getPrimaryTemperature() {
        return _primaryTemperature;
    }

    public void setPrimaryTemperature(Double primaryTemperature) {
        _primaryTemperature = primaryTemperature;
    }

    public Double getSecondaryAge() {
        return _secondaryAge;
    }

    public void setSecondaryAge(Double secondaryAge) {
        _secondaryAge = secondaryAge;
    }

    public Double getSecondaryTemperature() {
        return _secondaryTemperature;
    }

    public void setSecondaryTemperature(Double secondaryTemperature) {
        _secondaryTemperature = secondaryTemperature;
    }

    public Double getTertiaryAge() {
        return _tertiaryAge;
    }

    public void setTertiaryAge(Double tertiaryAge) {
        _tertiaryAge = tertiaryAge;
    }

    public Double getTertiaryTemperature() {
        return _tertiaryTemperature;
    }

    public void setTertiaryTemperature(Double tertiaryTemperature) {
        _tertiaryTemperature = tertiaryTemperature;
    }

    public Double getAge() {
        return _age;
    }

    public void setAge(Double age) {
        _age = age;
    }

    public Double getAgeTemperature() {
        return _ageTemperature;
    }

    public void setAgeTemperature(Double ageTemperature) {
        _ageTemperature = ageTemperature;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String date) {
        _date = date;
    }

    public Double getCarbonation() {
        return _carbonation;
    }

    public void setCarbonation(Double carbonation) {
        _carbonation = carbonation;
    }

    public Boolean getForcedCarbonation() {
        return _forcedCarbonation;
    }

    public void setForcedCarbonation(Boolean forcedCarbonation) {
        _forcedCarbonation = forcedCarbonation;
    }

    public String getPrimingSugarName() {
        return _primingSugarName;
    }

    public void setPrimingSugarName(String primingSugarName) {
        _primingSugarName = primingSugarName;
    }

    public Double getCarbonationTemperature() {
        return _carbonationTemperature;
    }

    public void setCarbonationTemperature(Double carbonationTemperature) {
        _carbonationTemperature = carbonationTemperature;
    }

    public Double getPrimingSugarEquivalent() {
        return _primingSugarEquivalent;
    }

    public void setPrimingSugarEquivalent(Double primingSugarEquivalent) {
        _primingSugarEquivalent = primingSugarEquivalent;
    }

    public Double getKegPrimingFactor() {
        return _kegPrimingFactor;
    }

    public void setKegPrimingFactor(Double kegPrimingFactor) {
        _kegPrimingFactor = kegPrimingFactor;
    }

    public String getEstimatedOriginalGravity() {
        return _estimatedOriginalGravity;
    }

    public void setEstimatedOriginalGravity(String estimatedOriginalGravity) {
        _estimatedOriginalGravity = estimatedOriginalGravity;
    }

    public String getEstimatedFinalGravity() {
        return _estimatedFinalGravity;
    }

    public void setEstimatedFinalGravity(String estimatedFinalGravity) {
        _estimatedFinalGravity = estimatedFinalGravity;
    }

    public String getEstimatedColor() {
        return _estimatedColor;
    }

    public void setEstimatedColor(String estimatedColor) {
        _estimatedColor = estimatedColor;
    }

    public Double getIBU() {
        return _ibu;
    }

    public void setIBU(Double ibu) {
        _ibu = ibu;
    }

    public String getIBUMethod() {
        return _ibuMethod;
    }

    public void setIBUMethod(String ibuMethod) {
        _ibuMethod = ibuMethod;
    }

    public Double getEstimatedABV() {
        return _estimatedABV;
    }

    public void setEstimatedABV(Double estimatedABV) {
        _estimatedABV = estimatedABV;
    }

    public Double getABV() {
        return _abv;
    }

    public void setABV(Double abv) {
        _abv = abv;
    }

    public Double getActualEfficiency() {
        return _actualEfficiency;
    }

    public void setActualEfficiency(Double actualEfficiency) {
        _actualEfficiency = actualEfficiency;
    }

    public String getCalories() {
        return _calories;
    }

    public void setCalories(String calories) {
        _calories = calories;
    }

    public String getDisplayBatchSize() {
        return _displayBatchSize;
    }

    public void setDisplayBatchSize(String displayBatchSize) {
        _displayBatchSize = displayBatchSize;
    }

    public String getDisplayBoilSize() {
        return _displayBoilSize;
    }

    public void setDisplayBoilSize(String displayBoilSize) {
        _displayBoilSize = displayBoilSize;
    }

    public String getDisplayOriginalGravity() {
        return _displayOriginalGravity;
    }

    public void setDisplayOriginalGravity(String displayOriginalGravity) {
        _displayOriginalGravity = displayOriginalGravity;
    }

    public String getDisplayFinalGravity() {
        return _displayFinalGravity;
    }

    public void setDisplayFinalGravity(String displayFinalGravity) {
        _displayFinalGravity = displayFinalGravity;
    }

    public String getDisplayPrimaryTemperature() {
        return _displayPrimaryTemperature;
    }

    public void setDisplayPrimaryTemperature(String displayPrimaryTemperature) {
        _displayPrimaryTemperature = displayPrimaryTemperature;
    }

    public String getDisplaySecondaryTemperature() {
        return _displaySecondaryTemperature;
    }

    public void setDisplaySecondaryTemperature(String displaySecondaryTemperature) {
        _displaySecondaryTemperature = displaySecondaryTemperature;
    }

    public String getDisplayTertiaryTemperature() {
        return _displayTertiaryTemperature;
    }

    public void setDisplayTertiaryTemperature(String displayTertiaryTemperature) {
        _displayTertiaryTemperature = displayTertiaryTemperature;
    }

    public String getDisplayAgeTemperature() {
        return _displayAgeTemperature;
    }

    public void setDisplayAgeTemperature(String displayAgeTemperature) {
        _displayAgeTemperature = displayAgeTemperature;
    }

    public String getCarbonationUsed() {
        return _carbonationUsed;
    }

    public void setCarbonationUsed(String carbonationUsed) {
        _carbonationUsed = carbonationUsed;
    }

    public String getDisplayCarbTemperature() {
        return _displayCarbTemperature;
    }

    public void setDisplayCarbTemperature(String displayCarbTemperature) {
        _displayCarbTemperature = displayCarbTemperature;
    }

    private RecipeType _type;
    private Style _style;
    private EquipmentItem _equipment;
    private String _brewer;
    private String _assistantBrewer;
    private Double _batchSize;
    private Double _boilSize;
    private Double _boilTime;
    private Double _efficiency;
    private ArrayList<Hop> _hops;
    private ArrayList<Fermentable> _fermentables;
    private ArrayList<MiscellaneousItem> _miscs;
    private ArrayList<Yeast> _yeasts;
    private ArrayList<Water> _waters;
    private Mash _mash;
    private String _notes;
    private String _tasteNotes;
    private Double _rating;
    private Double _originalGravity;
    private Double _finalGravity;
    private Integer _fermentationStages;
    private Double _primaryAge;
    private Double _primaryTemperature;
    private Double _secondaryAge;
    private Double _secondaryTemperature;
    private Double _tertiaryAge;
    private Double _tertiaryTemperature;
    private Double _age;
    private Double _ageTemperature;
    private String _date;
    private Double _carbonation;
    private Boolean _forcedCarbonation;
    private String _primingSugarName;
    private Double _carbonationTemperature;
    private Double _primingSugarEquivalent;
    private Double _kegPrimingFactor;
    private String _estimatedOriginalGravity;
    private String _estimatedFinalGravity;
    private String _estimatedColor;
    private Double _ibu;
    private String _ibuMethod;
    private Double _estimatedABV;
    private Double _abv;
    private Double _actualEfficiency;
    private String _calories;
    private String _displayBatchSize;
    private String _displayBoilSize;
    private String _displayOriginalGravity;
    private String _displayFinalGravity;
    private String _displayPrimaryTemperature;
    private String _displaySecondaryTemperature;
    private String _displayTertiaryTemperature;
    private String _displayAgeTemperature;
    private String _carbonationUsed;
    private String _displayCarbTemperature;
}
