package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.StyleType;

public class Style extends BeerXmlObjectBase {
    public String getCategory() {
        return _category;
    }

    public void setCategory(String category) {
        _category = category;
    }

    public String getCategoryNumber() {
        return _categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        _categoryNumber = categoryNumber;
    }

    public String getStyleLetter() {
        return _styleLetter;
    }

    public void setStyleLetter(String styleLetter) {
        _styleLetter = styleLetter;
    }

    public String getStyleGuide() {
        return _styleGuide;
    }

    public void setStyleGuide(String styleGuide) {
        _styleGuide = styleGuide;
    }

    public StyleType getType() {
        return _type;
    }

    public void setType(StyleType type) {
        _type = type;
    }

    public double getOriginalGravityMinimum() {
        return _originalGravityMinimum;
    }

    public void setOriginalGravityMinimum(double originalGravityMinimum) {
        _originalGravityMinimum = originalGravityMinimum;
    }

    public double getOriginalGravityMaximum() {
        return _originalGravityMaximum;
    }

    public void setOriginalGravityMaximum(double originalGravityMaximum) {
        _originalGravityMaximum = originalGravityMaximum;
    }

    public double getFinalGravityMinimum() {
        return _finalGravityMinimum;
    }

    public void setFinalGravityMinimum(double finalGravityMinimum) {
        _finalGravityMinimum = finalGravityMinimum;
    }

    public double getFinalGravityMaximum() {
        return _finalGravityMaximum;
    }

    public void setFinalGravityMaximum(double finalGravityMaximum) {
        _finalGravityMaximum = finalGravityMaximum;
    }

    public double getIBUMinimum() {
        return _ibuMinimum;
    }

    public void setIBUMinimum(double ibuMinimum) {
        _ibuMinimum = ibuMinimum;
    }

    public double getIBUMaximum() {
        return _ibuMaximum;
    }

    public void setIBUMaximum(double ibuMaximum) {
        _ibuMaximum = ibuMaximum;
    }

    public String getColorMinimum() {
        return _colorMinimum;
    }

    public void setColorMinimum(String colorMinimum) {
        _colorMinimum = colorMinimum;
    }

    public String getColorMaximum() {
        return _colorMaximum;
    }

    public void setColorMaximum(String colorMaximum) {
        _colorMaximum = colorMaximum;
    }

    public double getCarbonationMinimum() {
        return _carbonationMinimum;
    }

    public void setCarbonationMinimum(double carbonationMinimum) {
        _carbonationMinimum = carbonationMinimum;
    }

    public double getCarbonationMaximum() {
        return _carbonationMaximum;
    }

    public void setCarbonationMaximum(double carbonationMaximum) {
        _carbonationMaximum = carbonationMaximum;
    }

    public double getABVMinimum() {
        return _abvMinimum;
    }

    public void setABVMinimum(double abvMinimum) {
        _abvMinimum = abvMinimum;
    }

    public double getABVMaximum() {
        return _abvMaximum;
    }

    public void setABVMaximum(double abvMaximum) {
        _abvMaximum = abvMaximum;
    }

    public String getNotes() {
        return _notes;
    }

    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getProfile() {
        return _profile;
    }

    public void setProfile(String profile) {
        _profile = profile;
    }

    public String getIngredients() {
        return _ingredients;
    }

    public void setIngredients(String ingredients) {
        _ingredients = ingredients;
    }

    public String getExamples() {
        return _examples;
    }

    public void setExamples(String examples) {
        _examples = examples;
    }

    public String getDisplayOriginalGravityMinimum() {
        return _displayOriginalGravityMinimum;
    }

    public void setDisplayOriginalGravityMinimum(String displayOriginalGravityMinimum) {
        _displayOriginalGravityMinimum = displayOriginalGravityMinimum;
    }

    public String getDisplayOriginalGravityMaximum() {
        return _displayOriginalGravityMaximum;
    }

    public void setDisplayOriginalGravityMaximum(String displayOriginalGravityMaximum) {
        _displayOriginalGravityMaximum = displayOriginalGravityMaximum;
    }

    public String getDisplayFinalGravityMinimum() {
        return _displayFinalGravityMinimum;
    }

    public void setDisplayFinalGravityMinimum(String displayFinalGravityMinimum) {
        _displayFinalGravityMinimum = displayFinalGravityMinimum;
    }

    public String getDisplayFinalGravityMaximum() {
        return _displayFinalGravityMaximum;
    }

    public void setDisplayFinalGravityMaximum(String displayFinalGravityMaximum) {
        _displayFinalGravityMaximum = displayFinalGravityMaximum;
    }

    public String getDisplayColorMinimum() {
        return _displayColorMinimum;
    }

    public void setDisplayColorMinimum(String displayColorMinimum) {
        _displayColorMinimum = displayColorMinimum;
    }

    public String getDisplayColorMaximum() {
        return _displayColorMaximum;
    }

    public void setDisplayColorMaximum(String displayColorMaximum) {
        _displayColorMaximum = displayColorMaximum;
    }

    public String getOriginalGravityRange() {
        return _originalGravityRange;
    }

    public void setOriginalGravityRange(String originalGravityRange) {
        _originalGravityRange = originalGravityRange;
    }

    public String getFinalGravityRange() {
        return _finalGravityRange;
    }

    public void setFinalGravityRange(String finalGravityRange) {
        _finalGravityRange = finalGravityRange;
    }

    public String getIBURange() {
        return _ibuRange;
    }

    public void setIBURange(String ibuRange) {
        _ibuRange = ibuRange;
    }

    public String getCarbonationRange() {
        return _carbonationRange;
    }

    public void setCarbonationRange(String carbonationRange) {
        _carbonationRange = carbonationRange;
    }

    public String getColorRange() {
        return _colorRange;
    }

    public void setColorRange(String colorRange) {
        _colorRange = colorRange;
    }

    public String getABVRange() {
        return _abvRange;
    }

    public void setABVRange(String abvRange) {
        _abvRange = abvRange;
    }

    private String _category;
    private String _categoryNumber;
    private String _styleLetter;
    private String _styleGuide;
    private StyleType _type;
    private double _originalGravityMinimum;
    private double _originalGravityMaximum;
    private double _finalGravityMinimum;
    private double _finalGravityMaximum;
    private double _ibuMinimum;
    private double _ibuMaximum;
    private String _colorMinimum;
    private String _colorMaximum;
    private double _carbonationMinimum;
    private double _carbonationMaximum;
    private double _abvMinimum;
    private double _abvMaximum;
    private String _notes;
    private String _profile;
    private String _ingredients;
    private String _examples;
    private String _displayOriginalGravityMinimum;
    private String _displayOriginalGravityMaximum;
    private String _displayFinalGravityMinimum;
    private String _displayFinalGravityMaximum;
    private String _displayColorMinimum;
    private String _displayColorMaximum;
    private String _originalGravityRange;
    private String _finalGravityRange;
    private String _ibuRange;
    private String _carbonationRange;
    private String _colorRange;
    private String _abvRange;
}
