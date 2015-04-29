package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation;
import com.grandpasbrewing.beerxml.version1.enums.YeastForm;
import com.grandpasbrewing.beerxml.version1.enums.YeastType;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.YeastFlocculationAdapter;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.YeastFormAdapter;
import com.grandpasbrewing.beerxml.version1.serialization.adapters.YeastTypeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "YEAST")
public class Yeast extends BeerXmlObjectBase {
    public YeastType getType() {
        return _type;
    }

    @XmlElement(name = "TYPE")
    @XmlJavaTypeAdapter( YeastTypeAdapter.class )
    public void setType(YeastType type) {
        _type = type;
    }

    public YeastForm getForm() {
        return _form;
    }

    @XmlElement(name = "FORM")
    @XmlJavaTypeAdapter( YeastFormAdapter.class )
    public void setForm(YeastForm form) {
        _form = form;
    }

    public Double getAmount() {
        return _amount;
    }

    @XmlElement(name = "AMOUNT")
    public void setAmount(Double amount) {
        _amount = amount;
    }

    public Boolean getAmountIsWeight() {
        return _amountIsWeight;
    }

    @XmlElement(name = "AMOUNT_IS_WEIGHT")
    public void setAmountIsWeight(Boolean amountIsWeight) {
        _amountIsWeight = amountIsWeight;
    }

    public String getLaboratory() {
        return _laboratory;
    }

    @XmlElement(name = "LABORATORY")
    public void setLaboratory(String laboratory) {
        _laboratory = laboratory;
    }

    public String getManufacturerProductId() {
        return _manufacturerProductId;
    }

    @XmlElement(name = "PRODUCT_ID")
    public void setManufacturerProductId(String manufacturerProductId) {
        _manufacturerProductId = manufacturerProductId;
    }

    public Double getMinimumTemperature() {
        return _minimumTemperature;
    }

    @XmlElement(name = "MIN_TEMPERATURE")
    public void setMinimumTemperature(Double minimumTemperature) {
        _minimumTemperature = minimumTemperature;
    }

    public Double getMaximumTemperature() {
        return _maximumTemperature;
    }

    @XmlElement(name = "MAX_TEMPERATURE")
    public void setMaximumTemperature(Double maximumTemperature) {
        _maximumTemperature = maximumTemperature;
    }

    public YeastFlocculation getFlocculation() {
        return _flocculation;
    }

    @XmlElement(name = "FLOCCULATION")
    @XmlJavaTypeAdapter( YeastFlocculationAdapter.class )
    public void setFlocculation(YeastFlocculation flocculation) {
        _flocculation = flocculation;
    }

    public Double getAttenuation() {
        return _attenuation;
    }

    @XmlElement(name = "ATTENUATION")
    public void setAttenuation(Double attenuation) {
        _attenuation = attenuation;
    }

    public String getNotes() {
        return _notes;
    }

    @XmlElement(name = "NOTES")
    public void setNotes(String notes) {
        _notes = notes;
    }

    public String getBestFor() {
        return _bestFor;
    }

    @XmlElement(name = "BEST_FOR")
    public void setBestFor(String bestFor) {
        _bestFor = bestFor;
    }

    public Integer getTimesCultured() {
        return _timesCultured;
    }

    @XmlElement(name = "TIMES_CULTURED")
    public void setTimesCultured(Integer timesCultured) {
        _timesCultured = timesCultured;
    }

    public Integer getMaximumReuse() {
        return _maximumReuse;
    }

    @XmlElement(name = "MAX_REUSE")
    public void setMaximumReuse(Integer maximumReuse) {
        _maximumReuse = maximumReuse;
    }

    public Boolean getAddToSecondary() {
        return _addToSecondary;
    }

    @XmlElement(name = "ADD_TO_SECONDARY")
    public void setAddToSecondary(Boolean addToSecondary) {
        _addToSecondary = addToSecondary;
    }

    public String getDisplayAmount() {
        return _displayAmount;
    }

    @XmlElement(name = "DISPLAY_AMOUNT")
    public void setDisplayAmount(String displayAmount) {
        _displayAmount = displayAmount;
    }

    public String getDisplayMinimumTemperature() {
        return _displayMinimumTemperature;
    }

    @XmlElement(name = "DISP_MIN_TEMP")
    public void setDisplayMinimumTemperature(String displayMinimumTemperature) {
        _displayMinimumTemperature = displayMinimumTemperature;
    }

    public String getDisplayMaximumTemperature() {
        return _displayMaximumTemperature;
    }

    @XmlElement(name = "DISP_MAX_TEMP")
    public void setDisplayMaximumTemperature(String displayMaximumTemperature) {
        _displayMaximumTemperature = displayMaximumTemperature;
    }

    public String getInventory() {
        return _inventory;
    }

    @XmlElement(name = "INVENTORY")
    public void setInventory(String inventory) {
        _inventory = inventory;
    }

    public String getCultureDate() {
        return _cultureDate;
    }

    @XmlElement(name = "CULTURE_DATE")
    public void setCultureDate(String cultureDate) {
        _cultureDate = cultureDate;
    }

    private YeastType _type;
    private YeastForm _form;
    private Double _amount;
    private Boolean _amountIsWeight;
    private String _laboratory;
    private String _manufacturerProductId;
    private Double _minimumTemperature;
    private Double _maximumTemperature;
    private YeastFlocculation _flocculation;
    private Double _attenuation;
    private String _notes;
    private String _bestFor;
    private Integer _timesCultured;
    private Integer _maximumReuse;
    private Boolean _addToSecondary;
    private String _displayAmount;
    private String _displayMinimumTemperature;
    private String _displayMaximumTemperature;
    private String _inventory;
    private String _cultureDate;
}
