package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.RecipeType;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.RecipeTypeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;

@XmlRootElement(name = "RECIPE")
public class Recipe extends BeerXmlObjectBase {
    public RecipeType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    @XmlJavaTypeAdapter( RecipeTypeAdapter.class )
    public void setType(RecipeType type) {
        _type = type;
    }

    public Style getStyle() {
        return _style;
    }

    @XmlElement(name = "STYLE")
    public void setStyle(Style style) {
        _style = style;
    }

    public Equipment getEquipment() {
        return _equipment;
    }

    @XmlElement(name = "EQUIPMENT")
    public void setEquipment(Equipment equipment) {
        _equipment = equipment;
    }

    public String getBrewer() {
        return _brewer;
    }

    @XmlElement(name = "BREWER")
    public void setBrewer(String brewer) {
        _brewer = brewer;
    }

    public String getAssistantBrewer() {
        return _assistantBrewer;
    }

    @XmlElement(name = "ASST_BREWER")
    public void setAssistantBrewer(String assistantBrewer) {
        _assistantBrewer = assistantBrewer;
    }

    public Double getBatchSize() {
        return _batchSize;
    }

    @XmlElement(name = "BATCH_SIZE")
    public void setBatchSize(Double batchSize) {
        _batchSize = batchSize;
    }

    public Double getBoilSize() {
        return _boilSize;
    }

    @XmlElement(name = "BOIL_SIZE")
    public void setBoilSize(Double boilSize) {
        _boilSize = boilSize;
    }

    public Double getBoilTime() {
        return _boilTime;
    }

    @XmlElement(name = "BOIL_TIME")
    public void setBoilTime(Double boilTime) {
        _boilTime = boilTime;
    }

    public Double getEfficiency() {
        return _efficiency;
    }

    @XmlElement(name = "EFFICIENCY")
    public void setEfficiency(Double efficiency) {
        _efficiency = efficiency;
    }

    public ArrayList<Hop> getHops() {
        return _hops;
    }

    @XmlElementWrapper(name = "HOPS")
    @XmlElement(name = "HOP")
    public void setHops(ArrayList<Hop> hops) {
        _hops = hops;
    }

    public ArrayList<Fermentable> getFermentables() {
        return _fermentables;
    }

    @XmlElementWrapper(name = "FERMENTABLES")
    @XmlElement(name = "FERMENTABLE")
    public void setFermentables(ArrayList<Fermentable> fermentables) {
        _fermentables = fermentables;
    }

    public ArrayList<Misc> getMiscs() {
        return _miscs;
    }

    @XmlElementWrapper(name = "MISCS")
    @XmlElement(name = "MISC")
    public void setMiscs(ArrayList<Misc> miscs) {
        _miscs = miscs;
    }

    public ArrayList<Yeast> getYeasts() {
        return _yeasts;
    }

    @XmlElementWrapper(name = "YEASTS")
    @XmlElement(name = "YEAST")
    public void setYeasts(ArrayList<Yeast> yeasts) {
        _yeasts = yeasts;
    }

    public ArrayList<Water> getWaters() {
        return _waters;
    }

    @XmlElementWrapper(name = "WATERS")
    @XmlElement(name = "WATER")
    public void setWaters(ArrayList<Water> waters) {
        _waters = waters;
    }

    public Mash getMash() {
        return _mash;
    }

    @XmlElement(name = "MASH")
    public void setMash(Mash mash) {
        _mash = mash;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getTasteNotes() {
        return _tasteNotes;
    }

    @XmlElement(name = "TASTE_NOTES")
    public void setTasteNotes(String tasteNotes) {
        _tasteNotes = tasteNotes;
    }

    public Double getRating() {
        return _rating;
    }

    @XmlElement(name = "RATING")
    public void setRating(Double rating) {
        _rating = rating;
    }

    public Double getOriginalGravity() {
        return _originalGravity;
    }

    @XmlElement(name = "OG")
    public void setOriginalGravity(Double originalGravity) {
        _originalGravity = originalGravity;
    }

    public Double getFinalGravity() {
        return _finalGravity;
    }

    @XmlElement(name = "FG")
    public void setFinalGravity(Double finalGravity) {
        _finalGravity = finalGravity;
    }

    public int getFermentationStages() {
        return _fermentationStages;
    }

    @XmlElement(name = "FERMENTATION_STAGES")
    public void setFermentationStages(int fermentationStages) {
        _fermentationStages = fermentationStages;
    }

    public Double getPrimaryAge() {
        return _primaryAge;
    }

    @XmlElement(name = "PRIMARY_AGE")
    public void setPrimaryAge(Double primaryAge) {
        _primaryAge = primaryAge;
    }

    public Double getPrimaryTemperature() {
        return _primaryTemperature;
    }

    @XmlElement(name = "PRIMARY_TEMP")
    public void setPrimaryTemperature(Double primaryTemperature) {
        _primaryTemperature = primaryTemperature;
    }

    public Double getSecondaryAge() {
        return _secondaryAge;
    }

    @XmlElement(name = "SECONDARY_AGE")
    public void setSecondaryAge(Double secondaryAge) {
        _secondaryAge = secondaryAge;
    }

    public Double getSecondaryTemperature() {
        return _secondaryTemperature;
    }

    @XmlElement(name = "SECONDARY_TEMP")
    public void setSecondaryTemperature(Double secondaryTemperature) {
        _secondaryTemperature = secondaryTemperature;
    }

    public Double getTertiaryAge() {
        return _tertiaryAge;
    }

    @XmlElement(name = "TERTIARY_AGE")
    public void setTertiaryAge(Double tertiaryAge) {
        _tertiaryAge = tertiaryAge;
    }

    public Double getTertiaryTemperature() {
        return _tertiaryTemperature;
    }

    @XmlElement(name = "TERTIARY_TEMP")
    public void setTertiaryTemperature(Double tertiaryTemperature) {
        _tertiaryTemperature = tertiaryTemperature;
    }

    public Double getAge() {
        return _age;
    }

    @XmlElement(name = "AGE")
    public void setAge(Double age) {
        _age = age;
    }

    public Double getAgeTemperature() {
        return _ageTemperature;
    }

    @XmlElement(name = "AGE_TEMP")
    public void setAgeTemperature(Double ageTemperature) {
        _ageTemperature = ageTemperature;
    }

    public String getDate() {
        return _date;
    }

    @XmlElement(name = "DATE")
    public void setDate(String date) {
        _date = date;
    }

    public Double getCarbonation() {
        return _carbonation;
    }

    @XmlElement(name = "CARBONATION")
    public void setCarbonation(Double carbonation) {
        _carbonation = carbonation;
    }

    public Boolean getForcedCarbonation() {
        return _forcedCarbonation;
    }

    @XmlElement(name = "FORCED_CARBONATION")
    public void setForcedCarbonation(Boolean forcedCarbonation) {
        _forcedCarbonation = forcedCarbonation;
    }

    public String getPrimingSugarName() {
        return _primingSugarName;
    }

    @XmlElement(name = "PRIMING_SUGAR_NAME")
    public void setPrimingSugarName(String primingSugarName) {
        _primingSugarName = primingSugarName;
    }

    public Double getCarbonationTemperature() {
        return _carbonationTemperature;
    }

    @XmlElement(name = "CARBONATION_TEMP")
    public void setCarbonationTemperature(Double carbonationTemperature) {
        _carbonationTemperature = carbonationTemperature;
    }

    public Double getPrimingSugarEquivalent() {
        return _primingSugarEquivalent;
    }

    @XmlElement(name = "PRIMING_SUGAR_EQUIV")
    public void setPrimingSugarEquivalent(Double primingSugarEquivalent) {
        _primingSugarEquivalent = primingSugarEquivalent;
    }

    public Double getKegPrimingFactor() {
        return _kegPrimingFactor;
    }

    @XmlElement(name = "KEG_PRIMING_FACTOR")
    public void setKegPrimingFactor(Double kegPrimingFactor) {
        _kegPrimingFactor = kegPrimingFactor;
    }

    public String getEstimatedOriginalGravity() {
        return _estimatedOriginalGravity;
    }

    @XmlElement(name = "EST_OG")
    public void setEstimatedOriginalGravity(String estimatedOriginalGravity) {
        _estimatedOriginalGravity = estimatedOriginalGravity;
    }

    public String getEstimatedFinalGravity() {
        return _estimatedFinalGravity;
    }

    @XmlElement(name = "EST_FG")
    public void setEstimatedFinalGravity(String estimatedFinalGravity) {
        _estimatedFinalGravity = estimatedFinalGravity;
    }

    public String getEstimatedColor() {
        return _estimatedColor;
    }

    @XmlElement(name = "EST_COLOR")
    public void setEstimatedColor(String estimatedColor) {
        _estimatedColor = estimatedColor;
    }

    public Double getIBU() {
        return _ibu;
    }

    @XmlElement(name = "IBU")
    public void setIBU(Double ibu) {
        _ibu = ibu;
    }

    public String getIBUMethod() {
        return _ibuMethod;
    }

    @XmlElement(name = "IBU_METHOD")
    public void setIBUMethod(String ibuMethod) {
        _ibuMethod = ibuMethod;
    }

    public Double getEstimatedABV() {
        return _estimatedABV;
    }

    @XmlElement(name = "EST_ABV")
    public void setEstimatedABV(Double estimatedABV) {
        _estimatedABV = estimatedABV;
    }

    public Double getABV() {
        return _abv;
    }

    @XmlElement(name = "ABV")
    public void setABV(Double abv) {
        _abv = abv;
    }

    public Double getActualEfficiency() {
        return _actualEfficiency;
    }

    @XmlElement(name = "ACTUAL_EFFICIENCY")
    public void setActualEfficiency(Double actualEfficiency) {
        _actualEfficiency = actualEfficiency;
    }

    public String getCalories() {
        return _calories;
    }

    @XmlElement(name = "CALORIES")
    public void setCalories(String calories) {
        _calories = calories;
    }

    public String getDisplayBatchSize() {
        return _displayBatchSize;
    }

    @XmlElement(name = "DISPLAY_BATCH_SIZE")
    public void setDisplayBatchSize(String displayBatchSize) {
        _displayBatchSize = displayBatchSize;
    }

    public String getDisplayBoilSize() {
        return _displayBoilSize;
    }

    @XmlElement(name = "DISPLAY_BOIL_SIZE")
    public void setDisplayBoilSize(String displayBoilSize) {
        _displayBoilSize = displayBoilSize;
    }

    public String getDisplayOriginalGravity() {
        return _displayOriginalGravity;
    }

    @XmlElement(name = "DISPLAY_OG")
    public void setDisplayOriginalGravity(String displayOriginalGravity) {
        _displayOriginalGravity = displayOriginalGravity;
    }

    public String getDisplayFinalGravity() {
        return _displayFinalGravity;
    }

    @XmlElement(name = "DISPLAY_FG")
    public void setDisplayFinalGravity(String displayFinalGravity) {
        _displayFinalGravity = displayFinalGravity;
    }

    public String getDisplayPrimaryTemperature() {
        return _displayPrimaryTemperature;
    }

    @XmlElement(name = "DISPLAY_PRIMARY_TEMP")
    public void setDisplayPrimaryTemperature(String displayPrimaryTemperature) {
        _displayPrimaryTemperature = displayPrimaryTemperature;
    }

    public String getDisplaySecondaryTemperature() {
        return _displaySecondaryTemperature;
    }

    @XmlElement(name = "DISPLAY_SECONDARY_TEMP")
    public void setDisplaySecondaryTemperature(String displaySecondaryTemperature) {
        _displaySecondaryTemperature = displaySecondaryTemperature;
    }

    public String getDisplayTertiaryTemperature() {
        return _displayTertiaryTemperature;
    }

    @XmlElement(name = "DISPLAY_TERTIARY_TEMP")
    public void setDisplayTertiaryTemperature(String displayTertiaryTemperature) {
        _displayTertiaryTemperature = displayTertiaryTemperature;
    }

    public String getDisplayAgeTemperature() {
        return _displayAgeTemperature;
    }

    @XmlElement(name = "DISPLAY_AGE_TEMP")
    public void setDisplayAgeTemperature(String displayAgeTemperature) {
        _displayAgeTemperature = displayAgeTemperature;
    }

    public String getCarbonationUsed() {
        return _carbonationUsed;
    }

    @XmlElement(name = "CARBONATION_USED")
    public void setCarbonationUsed(String carbonationUsed) {
        _carbonationUsed = carbonationUsed;
    }

    public String getDisplayCarbTemperature() {
        return _displayCarbTemperature;
    }

    @XmlElement(name = "DISPLAY_CARB_TEMP")
    public void setDisplayCarbTemperature(String displayCarbTemperature) {
        _displayCarbTemperature = displayCarbTemperature;
    }

    private RecipeType _type;
    private Style _style;
    private Equipment _equipment;
    private String _brewer;
    private String _assistantBrewer;
    private Double _batchSize;
    private Double _boilSize;
    private Double _boilTime;
    private Double _efficiency;
    private ArrayList<Hop> _hops;
    private ArrayList<Fermentable> _fermentables;
    private ArrayList<Misc> _miscs;
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
    private String _ibuMethod ;
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
