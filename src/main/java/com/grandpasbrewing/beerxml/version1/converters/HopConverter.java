package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopFormEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopUseEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Hop;

public class HopConverter implements IBeerXmlConverter<Hop, com.grandpasbrewing.objectmodel.Hop> {
    private HopFormEnumConverter _hopFormEnumConverter;
    private HopTypeEnumConverter _hopTypeEnumConverter;
    private HopUseEnumConverter _hopUseEnumConverter;

    public HopConverter(HopFormEnumConverter hopFormEnumConverter,
                        HopTypeEnumConverter hopTypeEnumConverter,
                        HopUseEnumConverter hopUseEnumConverter) {
        if (hopFormEnumConverter == null) throw new IllegalArgumentException("hopFormEnumConverter");
        if (hopTypeEnumConverter == null) throw new IllegalArgumentException("hopTypeEnumConverter");
        if (hopUseEnumConverter == null) throw new IllegalArgumentException("hopUseEnumConverter");

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
        return null;
    }
}
