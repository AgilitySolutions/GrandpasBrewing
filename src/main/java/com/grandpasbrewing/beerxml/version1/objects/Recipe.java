package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.RecipeType;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.RecipeTypeAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;

public class Recipe extends BeerXmlObjectBase {
    public RecipeType getType() {
        return _type;
    }

    @XmlJavaTypeAdapter( RecipeTypeAdapter.class )
    public void setType(RecipeType type) {
        _type = type;
    }

    public com.grandpasbrewing.beerxml.version1.objects.Style getStyle() {
        return _style;
    }

    public void setStyle(com.grandpasbrewing.beerxml.version1.objects.Style style) {
        _style = style;
    }

    public com.grandpasbrewing.beerxml.version1.objects.Equipment getEquipment() {
        return _equipment;
    }

    public void setEquipment(com.grandpasbrewing.beerxml.version1.objects.Equipment equipment) {
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

    public double getBatchSize() {
        return _batchSize;
    }

    public void setBatchSize(double batchSize) {
        _batchSize = batchSize;
    }

    public double getBoilSize() {
        return _boilSize;
    }

    public void setBoilSize(double boilSize) {
        _boilSize = boilSize;
    }

    public double getBoilTime() {
        return _boilTime;
    }

    public void setBoilTime(double boilTime) {
        _boilTime = boilTime;
    }

    public double getEfficiency() {
        return _efficiency;
    }

    public void setEfficiency(double efficiency) {
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

    public ArrayList<Misc> getMiscs() {
        return _miscs;
    }

    public void setMiscs(ArrayList<Misc> miscs) {
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

    public com.grandpasbrewing.beerxml.version1.objects.Mash getMash() {
        return _mash;
    }

    public void setMash(com.grandpasbrewing.beerxml.version1.objects.Mash mash) {
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

    public double getRating() {
        return _rating;
    }

    public void setRating(double rating) {
        _rating = rating;
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

    public int getFermentationStages() {
        return _fermentationStages;
    }

    public void setFermentationStages(int fermentationStages) {
        _fermentationStages = fermentationStages;
    }

    public double getPrimaryAge() {
        return _primaryAge;
    }

    public void setPrimaryAge(double primaryAge) {
        _primaryAge = primaryAge;
    }

    public double getPrimaryTemperature() {
        return _primaryTemperature;
    }

    public void setPrimaryTemperature(double primaryTemperature) {
        _primaryTemperature = primaryTemperature;
    }

    public double getSecondaryAge() {
        return _secondaryAge;
    }

    public void setSecondaryAge(double secondaryAge) {
        _secondaryAge = secondaryAge;
    }

    public double getSecondaryTemperature() {
        return _secondaryTemperature;
    }

    public void setSecondaryTemperature(double secondaryTemperature) {
        _secondaryTemperature = secondaryTemperature;
    }

    public double getTertiaryAge() {
        return _tertiaryAge;
    }

    public void setTertiaryAge(double tertiaryAge) {
        _tertiaryAge = tertiaryAge;
    }

    public double getTertiaryTemperature() {
        return _tertiaryTemperature;
    }

    public void setTertiaryTemperature(double tertiaryTemperature) {
        _tertiaryTemperature = tertiaryTemperature;
    }

    public double getAge() {
        return _age;
    }

    public void setAge(double age) {
        _age = age;
    }

    public double getAgeTemperature() {
        return _ageTemperature;
    }

    public void setAgeTemperature(double ageTemperature) {
        _ageTemperature = ageTemperature;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String date) {
        _date = date;
    }

    public double getCarbonation() {
        return _carbonation;
    }

    public void setCarbonation(double carbonation) {
        _carbonation = carbonation;
    }

    public boolean getForcedCarbonation() {
        return _forcedCarbonation;
    }

    public void setForcedCarbonation(boolean forcedCarbonation) {
        _forcedCarbonation = forcedCarbonation;
    }

    public String getPrimingSugarName() {
        return _primingSugarName;
    }

    public void setPrimingSugarName(String primingSugarName) {
        _primingSugarName = primingSugarName;
    }

    public double getCarbonationTemperature() {
        return _carbonationTemperature;
    }

    public void setCarbonationTemperature(double carbonationTemperature) {
        _carbonationTemperature = carbonationTemperature;
    }

    public double getPrimingSugarEquivalent() {
        return _primingSugarEquivalent;
    }

    public void setPrimingSugarEquivalent(double primingSugarEquivalent) {
        _primingSugarEquivalent = primingSugarEquivalent;
    }

    public double getKegPrimingFactor() {
        return _kegPrimingFactor;
    }

    public void setKegPrimingFactor(double kegPrimingFactor) {
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

    public double getIBU() {
        return _ibu;
    }

    public void setIBU(double ibu) {
        _ibu = ibu;
    }

    public String getIBUMethod() {
        return _ibuMethod;
    }

    public void setIBUMethod(String ibuMethod) {
        _ibuMethod = ibuMethod;
    }

    public double getEstimatedABV() {
        return _estimatedABV;
    }

    public void setEstimatedABV(double estimatedABV) {
        _estimatedABV = estimatedABV;
    }

    public double getABV() {
        return _abv;
    }

    public void setABV(double abv) {
        _abv = abv;
    }

    public double getActualEfficiency() {
        return _actualEfficiency;
    }

    public void setActualEfficiency(double actualEfficiency) {
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
    private Equipment _equipment;
    private String _brewer;
    private String _assistantBrewer;
    private double _batchSize;
    private double _boilSize;
    private double _boilTime;
    private double _efficiency;
    private ArrayList<Hop> _hops;
    private ArrayList<Fermentable> _fermentables;
    private ArrayList<Misc> _miscs;
    private ArrayList<Yeast> _yeasts;
    private ArrayList<Water> _waters;
    private Mash _mash;
    private String _notes;
    private String _tasteNotes;
    private double _rating;
    private double _originalGravity;
    private double _finalGravity;
    private int _fermentationStages;
    private double _primaryAge;
    private double _primaryTemperature;
    private double _secondaryAge;
    private double _secondaryTemperature;
    private double _tertiaryAge;
    private double _tertiaryTemperature;
    private double _age;
    private double _ageTemperature;
    private String _date;
    private double _carbonation;
    private boolean _forcedCarbonation;
    private String _primingSugarName;
    private double _carbonationTemperature;
    private double _primingSugarEquivalent;
    private double _kegPrimingFactor;
    private String _estimatedOriginalGravity;
    private String _estimatedFinalGravity;
    private String _estimatedColor;
    private double _ibu;
    private String _ibuMethod ;
    private double _estimatedABV;
    private double _abv;
    private double _actualEfficiency;
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
