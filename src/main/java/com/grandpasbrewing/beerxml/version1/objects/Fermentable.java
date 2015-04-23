package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.FermentableType;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.BooleanAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "FERMENTABLE")
public class Fermentable extends BeerXmlObjectBase {
    public FermentableType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    public void setType(FermentableType type) {
        _type = type;
    }

    public Double getAmount() {
        return _amount;
    }

    @XmlElement(name = "AMOUNT")
    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Double getYield() {
        return _yield;
    }

    @XmlElement(name = "YIELD")
    public void setYield(Double yield) {
        _yield = yield;
    }

    public Double getColor() {
        return _color;
    }

    @XmlElement(name = "COLOR")
    public void setColor(Double color) {
        _color = color;
    }

    public Boolean getAddAfterBoil() {
        return _addAfterBoil;
    }

    @XmlElement(name = "ADD_AFTER_BOIL")
    @XmlJavaTypeAdapter( BooleanAdapter.class )
    public void setAddAfterBoil(Boolean addAfterBoil) {
        _addAfterBoil = addAfterBoil;
    }

    public String getPlaceOfOrigin() {
        return _placeOfOrigin;
    }

    @XmlElement(name = "ORIGIN")
    public void setPlaceOfOrigin(String placeOfOrigin) {
        _placeOfOrigin = placeOfOrigin;
    }

    public String getSupplier() {
        return _supplier;
    }

    @XmlElement(name = "SUPPLIER")
    public void setSupplier(String supplier) {
        _supplier = supplier;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public Double getCoarseFineDiff() {
        return _coarseFineDiff;
    }

    @XmlElement(name = "COARSE_FINE_DIFF")
    public void setCoarseFineDiff(Double coarseFineDiff) {
        _coarseFineDiff = coarseFineDiff;
    }

    public Double getMoisture() {
        return _moisture;
    }

    @XmlElement(name = "MOISTURE")
    public void setMoisture(Double moisture) {
        _moisture = moisture;
    }

    public Double getDiastaticPower() {
        return _diastaticPower;
    }

    @XmlElement(name = "DIASTATIC_POWER")
    public void setDiastaticPower(Double diastaticPower) {
        _diastaticPower = diastaticPower;
    }

    public Double getProtein() {
        return _protein;
    }

    @XmlElement(name = "PROTEIN")
    public void setProtein(Double protein) {
        _protein = protein;
    }

    public Double getMaximumInBatch() {
        return _maximumInBatch;
    }

    @XmlElement(name = "MAX_IN_BATCH")
    public void setMaximumInBatch(Double maximumInBatch) {
        _maximumInBatch = maximumInBatch;
    }

    public Boolean getRecommendMash() {
        return _recommendMash;
    }

    @XmlElement(name = "RECOMMEND_MASH")
    @XmlJavaTypeAdapter( BooleanAdapter.class )
    public void setRecommendMash(Boolean recommendMash) {
        _recommendMash = recommendMash;
    }

    public Double getIBUGallonsPerPound() {
        return _ibuGallonsPerPound;
    }

    @XmlElement(name = "IBU_GAL_PER_LB")
    public void setIBUGallonsPerPound(Double ibuGallonsPerPound) {
        _ibuGallonsPerPound = ibuGallonsPerPound;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    @XmlElement(name = "DISPLAY_AMOUNT")
    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public Double getPotential() {
        return _potential;
    }

    @XmlElement(name = "POTENTIAL")
    public void setPotential(Double potential) {
        _potential = potential;
    }

    public String getInventory() {
        return _inventory;
    }

    @XmlElement(name = "INVENTORY")
    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getDisplayColor() {
        return _displayColor;
    }

    @XmlElement(name = "DISPLAY_COLOR")
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
