package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.StyleType;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.StyleTypeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "STYLE")
public class Style extends BeerXmlObjectBase {
    public String getCategory() {
        return _category;
    }

    @XmlElement(name = "CATEGORY")
    public void setCategory(String category) {
        _category = category;
    }

    public String getCategoryNumber() {
        return _categoryNumber;
    }

    @XmlElement(name = "CATEGORY_NUMBER")
    public void setCategoryNumber(String categoryNumber) {
        _categoryNumber = categoryNumber;
    }

    public String getStyleLetter() {
        return _styleLetter;
    }

    @XmlElement(name = "STYLE_LETTER")
    public void setStyleLetter(String styleLetter) {
        _styleLetter = styleLetter;
    }

    public String getStyleGuide() {
        return _styleGuide;
    }

    @XmlElement(name = "STYLE_GUIDE")
    public void setStyleGuide(String styleGuide) {
        _styleGuide = styleGuide;
    }

    public StyleType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    @XmlJavaTypeAdapter( StyleTypeAdapter.class )
    public void setType(StyleType type) {
        _type = type;
    }

    public Double getOriginalGravityMinimum() {
        return _originalGravityMinimum;
    }

    @XmlElement(name = "OG_MIN")
    public void setOriginalGravityMinimum(Double originalGravityMinimum) {
        _originalGravityMinimum = originalGravityMinimum;
    }

    public Double getOriginalGravityMaximum() {
        return _originalGravityMaximum;
    }

    @XmlElement(name = "OG_MAX")
    public void setOriginalGravityMaximum(Double originalGravityMaximum) {
        _originalGravityMaximum = originalGravityMaximum;
    }

    public Double getFinalGravityMinimum() {
        return _finalGravityMinimum;
    }

    @XmlElement(name = "FG_MIN")
    public void setFinalGravityMinimum(Double finalGravityMinimum) {
        _finalGravityMinimum = finalGravityMinimum;
    }

    public Double getFinalGravityMaximum() {
        return _finalGravityMaximum;
    }

    @XmlElement(name = "FG_MAX")
    public void setFinalGravityMaximum(Double finalGravityMaximum) {
        _finalGravityMaximum = finalGravityMaximum;
    }

    public Double getIBUMinimum() {
        return _ibuMinimum;
    }

    @XmlElement(name = "IBU_MIN")
    public void setIBUMinimum(Double ibuMinimum) {
        _ibuMinimum = ibuMinimum;
    }

    public Double getIBUMaximum() {
        return _ibuMaximum;
    }

    @XmlElement(name = "IBU_MAX")
    public void setIBUMaximum(Double ibuMaximum) {
        _ibuMaximum = ibuMaximum;
    }

    public String getColorMinimum() {
        return _colorMinimum;
    }

    @XmlElement(name = "COLOR_MIN")
    public void setColorMinimum(String colorMinimum) {
        _colorMinimum = colorMinimum;
    }

    public String getColorMaximum() {
        return _colorMaximum;
    }

    @XmlElement(name = "COLOR_MAX")
    public void setColorMaximum(String colorMaximum) {
        _colorMaximum = colorMaximum;
    }

    public Double getCarbonationMinimum() {
        return _carbonationMinimum;
    }

    @XmlElement(name = "CARB_MIN")
    public void setCarbonationMinimum(Double carbonationMinimum) {
        _carbonationMinimum = carbonationMinimum;
    }

    public Double getCarbonationMaximum() {
        return _carbonationMaximum;
    }

    @XmlElement(name = "CARB_MAX")
    public void setCarbonationMaximum(Double carbonationMaximum) {
        _carbonationMaximum = carbonationMaximum;
    }

    public Double getABVMinimum() {
        return _abvMinimum;
    }

    @XmlElement(name = "ABV_MIN")
    public void setABVMinimum(Double abvMinimum) {
        _abvMinimum = abvMinimum;
    }

    public Double getABVMaximum() {
        return _abvMaximum;
    }

    @XmlElement(name = "ABV_MAX")
    public void setABVMaximum(Double abvMaximum) {
        _abvMaximum = abvMaximum;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getProfile() {
        return _profile;
    }

    @XmlElement(name = "PROFILE")
    public void setProfile(String profile) {
        _profile = profile;
    }

    public String getIngredients() {
        return _ingredients;
    }

    @XmlElement(name = "INGREDIENTS")
    public void setIngredients(String ingredients) {
        _ingredients = ingredients;
    }

    public String getExamples() {
        return _examples;
    }

    @XmlElement(name = "EXAMPLES")
    public void setExamples(String examples) {
        _examples = examples;
    }

    public String getDisplayOriginalGravityMinimum() {
        return _displayOriginalGravityMinimum;
    }

    @XmlElement(name = "DISPLAY_OG_MIN")
    public void setDisplayOriginalGravityMinimum(String displayOriginalGravityMinimum) {
        _displayOriginalGravityMinimum = displayOriginalGravityMinimum;
    }

    public String getDisplayOriginalGravityMaximum() {
        return _displayOriginalGravityMaximum;
    }

    @XmlElement(name = "DISPLAY_OG_MAX")
    public void setDisplayOriginalGravityMaximum(String displayOriginalGravityMaximum) {
        _displayOriginalGravityMaximum = displayOriginalGravityMaximum;
    }

    public String getDisplayFinalGravityMinimum() {
        return _displayFinalGravityMinimum;
    }

    @XmlElement(name = "DISPLAY_FG_MIN")
    public void setDisplayFinalGravityMinimum(String displayFinalGravityMinimum) {
        _displayFinalGravityMinimum = displayFinalGravityMinimum;
    }

    public String getDisplayFinalGravityMaximum() {
        return _displayFinalGravityMaximum;
    }

    @XmlElement(name = "DISPLAY_FG_MAX")
    public void setDisplayFinalGravityMaximum(String displayFinalGravityMaximum) {
        _displayFinalGravityMaximum = displayFinalGravityMaximum;
    }

    public String getDisplayColorMinimum() {
        return _displayColorMinimum;
    }

    @XmlElement(name = "DISPLAY_COLOR_MIN")
    public void setDisplayColorMinimum(String displayColorMinimum) {
        _displayColorMinimum = displayColorMinimum;
    }

    public String getDisplayColorMaximum() {
        return _displayColorMaximum;
    }

    @XmlElement(name = "DISPLAY_COLOR_MAX")
    public void setDisplayColorMaximum(String displayColorMaximum) {
        _displayColorMaximum = displayColorMaximum;
    }

    public String getOriginalGravityRange() {
        return _originalGravityRange;
    }

    @XmlElement(name = "OG_RANGE")
    public void setOriginalGravityRange(String originalGravityRange) {
        _originalGravityRange = originalGravityRange;
    }

    public String getFinalGravityRange() {
        return _finalGravityRange;
    }

    @XmlElement(name = "FG_RANGE")
    public void setFinalGravityRange(String finalGravityRange) {
        _finalGravityRange = finalGravityRange;
    }

    public String getIBURange() {
        return _ibuRange;
    }

    @XmlElement(name = "IBU_RANGE")
    public void setIBURange(String ibuRange) {
        _ibuRange = ibuRange;
    }

    public String getCarbonationRange() {
        return _carbonationRange;
    }

    @XmlElement(name = "CARB_RANGE")
    public void setCarbonationRange(String carbonationRange) {
        _carbonationRange = carbonationRange;
    }

    public String getColorRange() {
        return _colorRange;
    }

    @XmlElement(name = "COLOR_RANGE")
    public void setColorRange(String colorRange) {
        _colorRange = colorRange;
    }

    public String getABVRange() {
        return _abvRange;
    }

    @XmlElement(name = "ABV_RANGE")
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
