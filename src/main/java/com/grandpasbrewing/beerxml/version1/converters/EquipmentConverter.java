package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Equipment;
import com.grandpasbrewing.objectmodel.EquipmentItem;

public class EquipmentConverter implements IBeerXmlConverter<Equipment, com.grandpasbrewing.objectmodel.EquipmentItem> {
    public EquipmentItem toObjectModel(Equipment beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.EquipmentItem equipmentItem = new com.grandpasbrewing.objectmodel.EquipmentItem();

        equipmentItem.setBatchSize(beerXmlObject.getBatchSize());
        equipmentItem.setBoilSize(beerXmlObject.getBoilSize());
        equipmentItem.setBoilTime(beerXmlObject.getBoilTime());
        equipmentItem.setCalculateBoilVolume(beerXmlObject.getCalculateBoilVolume());
        equipmentItem.setDisplayBatchSize(beerXmlObject.getDisplayBatchSize());
        equipmentItem.setDisplayBoilSize(beerXmlObject.getDisplayBoilSize());
        equipmentItem.setDisplayLauterDeadspace(beerXmlObject.getDisplayLauterDeadspace());
        equipmentItem.setDisplayTopUpKettle(beerXmlObject.getDisplayTopUpKettle());
        equipmentItem.setDisplayTopUpWater(beerXmlObject.getDisplayTopUpWater());
        equipmentItem.setDisplayTrubChillerLoss(beerXmlObject.getDisplayTrubChillerLoss());
        equipmentItem.setDisplayTunVolume(beerXmlObject.getDisplayTunVolume());
        equipmentItem.setDisplayTunWeight(beerXmlObject.getDisplayTunWeight());
        equipmentItem.setEvaporationRate(beerXmlObject.getEvaporationRate());
        equipmentItem.setHopUtilization(beerXmlObject.getHopUtilization());
        equipmentItem.setLauterDeadspace(beerXmlObject.getLauterDeadspace());
        equipmentItem.setName(beerXmlObject.getName());
        equipmentItem.setNotes(beerXmlObject.getNotes());
        equipmentItem.setTopUpKettle(beerXmlObject.getTopUpKettle());
        equipmentItem.setTopUpWater(beerXmlObject.getTopUpWater());
        equipmentItem.setTrubChillerLoss(beerXmlObject.getTrubChillerLoss());
        equipmentItem.setTunSpecificHeat(beerXmlObject.getTunSpecificHeat());
        equipmentItem.setTunVolume(beerXmlObject.getTunVolume());
        equipmentItem.setTunWeight(beerXmlObject.getTunWeight());
        equipmentItem.setVersion(beerXmlObject.getVersion());

        return equipmentItem;
    }

    public Equipment fromObjectModel(EquipmentItem objectModelObject) {
        return null;
    }
}
