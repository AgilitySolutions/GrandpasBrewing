package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopFormEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopUseEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.BeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Hop;

public class HopConverter implements BeerXmlConverter<Hop, com.grandpasbrewing.objectmodel.Hop> {
    private HopFormEnumConverter _hopFormEnumConverter;
    private HopTypeEnumConverter _hopTypeEnumConverter;
    private HopUseEnumConverter _hopUseEnumConverter;

    public HopConverter(HopFormEnumConverter hopFormEnumConverter,
                        HopTypeEnumConverter hopTypeEnumConverter,
                        HopUseEnumConverter hopUseEnumConverter) {
        _hopFormEnumConverter = hopFormEnumConverter;
        _hopTypeEnumConverter = hopTypeEnumConverter;
        _hopUseEnumConverter = hopUseEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.Hop toObjectModel(Hop beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Hop hop = new com.grandpasbrewing.objectmodel.Hop();

        hop.setAlphaPercentage(beerXmlObject.getAlphaPercentage());
        hop.setAmount(beerXmlObject.getAmount());
        hop.setBetaPercentage(beerXmlObject.getBetaPercentage());
        hop.setCaryophylleneLevel(beerXmlObject.getCaryophylleneLevel());
        hop.setCohumuloneLevel(beerXmlObject.getCohumuloneLevel());
        hop.setDisplayAmount(beerXmlObject.getDisplayAmount());
        hop.setDisplayTime(beerXmlObject.getDisplayTime());
        hop.setForm(_hopFormEnumConverter.toObjectModel(beerXmlObject.getForm()));
        hop.setHopStabilityIndex(beerXmlObject.getHopStabilityIndex());
        hop.setHumuleneLevel(beerXmlObject.getHumuleneLevel());
        hop.setInventory(beerXmlObject.getInventory());
        hop.setMyrceneLevel(beerXmlObject.getMyrceneLevel());
        hop.setName(beerXmlObject.getName());
        hop.setNotes(beerXmlObject.getNotes());
        hop.setPlaceOfOrigin(beerXmlObject.getPlaceOfOrigin());
        hop.setSubstitutes(beerXmlObject.getSubstitutes());
        hop.setTime(beerXmlObject.getTime());
        hop.setType(_hopTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        hop.setUse(_hopUseEnumConverter.toObjectModel(beerXmlObject.getUse()));
        hop.setVersion(beerXmlObject.getVersion());

        return hop;
    }

    public Hop fromObjectModel(com.grandpasbrewing.objectmodel.Hop objectModelObject) {
        if (objectModelObject == null)
            return null;

        Hop hop = new Hop();

        hop.setAlphaPercentage(objectModelObject.getAlphaPercentage());
        hop.setAmount(objectModelObject.getAmount());
        hop.setBetaPercentage(objectModelObject.getBetaPercentage());
        hop.setCaryophylleneLevel(objectModelObject.getCaryophylleneLevel());
        hop.setCohumuloneLevel(objectModelObject.getCohumuloneLevel());
        hop.setDisplayAmount(objectModelObject.getDisplayAmount());
        hop.setDisplayTime(objectModelObject.getDisplayTime());
        hop.setForm(_hopFormEnumConverter.fromObjectModel(objectModelObject.getForm()));
        hop.setHopStabilityIndex(objectModelObject.getHopStabilityIndex());
        hop.setHumuleneLevel(objectModelObject.getHumuleneLevel());
        hop.setInventory(objectModelObject.getInventory());
        hop.setMyrceneLevel(objectModelObject.getMyrceneLevel());
        hop.setName(objectModelObject.getName());
        hop.setNotes(objectModelObject.getNotes());
        hop.setPlaceOfOrigin(objectModelObject.getPlaceOfOrigin());
        hop.setSubstitutes(objectModelObject.getSubstitutes());
        hop.setTime(objectModelObject.getTime());
        hop.setType(_hopTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        hop.setUse(_hopUseEnumConverter.fromObjectModel(objectModelObject.getUse()));
        hop.setVersion(objectModelObject.getVersion());

        return hop;
    }
}