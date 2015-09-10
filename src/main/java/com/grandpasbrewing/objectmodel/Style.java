package com.grandpasbrewing.objectmodel;

import com.grandpasbrewing.objectmodel.enums.StyleType;

public class Style extends ObjectModelBase {
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

    public Double getOriginalGravityMinimum() {
        return _originalGravityMinimum;
    }

    public void setOriginalGravityMinimum(Double originalGravityMinimum) {
        _originalGravityMinimum = originalGravityMinimum;
    }

    public Double getOriginalGravityMaximum() {
        return _originalGravityMaximum;
    }

    public void setOriginalGravityMaximum(Double originalGravityMaximum) {
        _originalGravityMaximum = originalGravityMaximum;
    }

    public Double getFinalGravityMinimum() {
        return _finalGravityMinimum;
    }

    public void setFinalGravityMinimum(Double finalGravityMinimum) {
        _finalGravityMinimum = finalGravityMinimum;
    }

    public Double getFinalGravityMaximum() {
        return _finalGravityMaximum;
    }

    public void setFinalGravityMaximum(Double finalGravityMaximum) {
        _finalGravityMaximum = finalGravityMaximum;
    }

    public Double getIBUMinimum() {
        return _ibuMinimum;
    }

    public void setIBUMinimum(Double ibuMinimum) {
        _ibuMinimum = ibuMinimum;
    }

    public Double getIBUMaximum() {
        return _ibuMaximum;
    }

    public void setIBUMaximum(Double ibuMaximum) {
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

    public Double getCarbonationMinimum() {
        return _carbonationMinimum;
    }

    public void setCarbonationMinimum(Double carbonationMinimum) {
        _carbonationMinimum = carbonationMinimum;
    }

    public Double getCarbonationMaximum() {
        return _carbonationMaximum;
    }

    public void setCarbonationMaximum(Double carbonationMaximum) {
        _carbonationMaximum = carbonationMaximum;
    }

    public Double getABVMinimum() {
        return _abvMinimum;
    }

    public void setABVMinimum(Double abvMinimum) {
        _abvMinimum = abvMinimum;
    }

    public Double getABVMaximum() {
        return _abvMaximum;
    }

    public void setABVMaximum(Double abvMaximum) {
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
    private Double _originalGravityMinimum;
    private Double _originalGravityMaximum;
    private Double _finalGravityMinimum;
    private Double _finalGravityMaximum;
    private Double _ibuMinimum;
    private Double _ibuMaximum;
    private String _colorMinimum;
    private String _colorMaximum;
    private Double _carbonationMinimum;
    private Double _carbonationMaximum;
    private Double _abvMinimum;
    private Double _abvMaximum;
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
