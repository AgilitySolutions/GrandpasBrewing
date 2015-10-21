package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.interfaces.converters.BeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.Equipment;
import com.grandpasbrewing.objectmodel.EquipmentItem;

public class EquipmentConverter implements BeerXmlConverter<Equipment, EquipmentItem> {
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
        if (objectModelObject == null)
            return null;

        Equipment equipment = new Equipment();

        equipment.setBatchSize(objectModelObject.getBatchSize());
        equipment.setBoilSize(objectModelObject.getBoilSize());
        equipment.setBoilTime(objectModelObject.getBoilTime());
        equipment.setCalculateBoilVolume(objectModelObject.getCalculateBoilVolume());
        equipment.setDisplayBatchSize(objectModelObject.getDisplayBatchSize());
        equipment.setDisplayBoilSize(objectModelObject.getDisplayBoilSize());
        equipment.setDisplayLauterDeadspace(objectModelObject.getDisplayLauterDeadspace());
        equipment.setDisplayTopUpKettle(objectModelObject.getDisplayTopUpKettle());
        equipment.setDisplayTopUpWater(objectModelObject.getDisplayTopUpWater());
        equipment.setDisplayTrubChillerLoss(objectModelObject.getDisplayTrubChillerLoss());
        equipment.setDisplayTunVolume(objectModelObject.getDisplayTunVolume());
        equipment.setDisplayTunWeight(objectModelObject.getDisplayTunWeight());
        equipment.setEvaporationRate(objectModelObject.getEvaporationRate());
        equipment.setHopUtilization(objectModelObject.getHopUtilization());
        equipment.setLauterDeadspace(objectModelObject.getLauterDeadspace());
        equipment.setName(objectModelObject.getName());
        equipment.setNotes(objectModelObject.getNotes());
        equipment.setTopUpKettle(objectModelObject.getTopUpKettle());
        equipment.setTopUpWater(objectModelObject.getTopUpWater());
        equipment.setTrubChillerLoss(objectModelObject.getTrubChillerLoss());
        equipment.setTunSpecificHeat(objectModelObject.getTunSpecificHeat());
        equipment.setTunVolume(objectModelObject.getTunVolume());
        equipment.setTunWeight(objectModelObject.getTunWeight());
        equipment.setVersion(objectModelObject.getVersion());

        return equipment;
    }
}
