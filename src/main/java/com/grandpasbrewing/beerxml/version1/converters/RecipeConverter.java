package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.RecipeTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.BeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.*;
import com.grandpasbrewing.beerxml.version1.objects.Fermentable;
import com.grandpasbrewing.beerxml.version1.objects.Hop;
import com.grandpasbrewing.beerxml.version1.objects.Recipe;
import com.grandpasbrewing.beerxml.version1.objects.Water;
import com.grandpasbrewing.beerxml.version1.objects.Yeast;
import com.grandpasbrewing.objectmodel.*;

import java.util.ArrayList;
import java.util.ListIterator;

public class RecipeConverter implements BeerXmlConverter<Recipe, com.grandpasbrewing.objectmodel.Recipe> {
    private EquipmentConverter _equipmentConverter;
    private StyleConverter _styleConverter;
    private MashConverter _mashConverter;
    private FermentableConverter _fermentableConverter;
    private HopConverter _hopConverter;
    private MiscellaneousItemConverter _miscConverter;
    private WaterConverter _waterConverter;
    private YeastConverter _yeastConverter;
    private RecipeTypeEnumConverter _recipeTypeEnumConverter;

    public RecipeConverter(EquipmentConverter equipmentConverter,
                           StyleConverter styleConverter,
                           MashConverter mashConverter,
                           FermentableConverter fermentableConverter,
                           HopConverter hopConverter,
                           MiscellaneousItemConverter miscConverter,
                           WaterConverter waterConverter,
                           YeastConverter yeastConverter,
                           RecipeTypeEnumConverter recipeTypeEnumConverter)
    {
        _equipmentConverter = equipmentConverter;
        _styleConverter = styleConverter;
        _mashConverter = mashConverter;
        _fermentableConverter = fermentableConverter;
        _hopConverter = hopConverter;
        _miscConverter = miscConverter;
        _waterConverter = waterConverter;
        _yeastConverter = yeastConverter;
        _recipeTypeEnumConverter = recipeTypeEnumConverter;
    }

    public com.grandpasbrewing.objectmodel.Recipe toObjectModel(Recipe beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.Recipe recipe = new com.grandpasbrewing.objectmodel.Recipe();

        recipe.setABV(beerXmlObject.getABV());
        recipe.setActualEfficiency(beerXmlObject.getActualEfficiency());
        recipe.setAge(beerXmlObject.getAge());
        recipe.setAgeTemperature(beerXmlObject.getAgeTemperature());
        recipe.setAssistantBrewer(beerXmlObject.getAssistantBrewer());
        recipe.setBatchSize(beerXmlObject.getBatchSize());
        recipe.setBoilSize(beerXmlObject.getBoilSize());
        recipe.setBoilTime(beerXmlObject.getBoilTime());
        recipe.setBrewer(beerXmlObject.getBrewer());
        recipe.setCalories(beerXmlObject.getCalories());
        recipe.setCarbonation(beerXmlObject.getCarbonation());
        recipe.setCarbonationTemperature(beerXmlObject.getCarbonationTemperature());
        recipe.setCarbonationUsed(beerXmlObject.getCarbonationUsed());
        recipe.setDate(beerXmlObject.getDate());
        recipe.setDisplayAgeTemperature(beerXmlObject.getDisplayAgeTemperature());
        recipe.setDisplayBatchSize(beerXmlObject.getDisplayBatchSize());
        recipe.setDisplayBoilSize(beerXmlObject.getDisplayBoilSize());
        recipe.setDisplayCarbTemperature(beerXmlObject.getDisplayCarbTemperature());
        recipe.setDisplayFinalGravity(beerXmlObject.getDisplayFinalGravity());
        recipe.setDisplayOriginalGravity(beerXmlObject.getDisplayOriginalGravity());
        recipe.setDisplayPrimaryTemperature(beerXmlObject.getDisplayPrimaryTemperature());
        recipe.setDisplaySecondaryTemperature(beerXmlObject.getDisplaySecondaryTemperature());
        recipe.setDisplayTertiaryTemperature(beerXmlObject.getDisplayTertiaryTemperature());
        recipe.setEfficiency(beerXmlObject.getEfficiency());
        recipe.setEquipment(_equipmentConverter.toObjectModel(beerXmlObject.getEquipment()));
        recipe.setEstimatedABV(beerXmlObject.getEstimatedABV());
        recipe.setEstimatedColor(beerXmlObject.getEstimatedColor());
        recipe.setEstimatedFinalGravity(beerXmlObject.getEstimatedFinalGravity());
        recipe.setEstimatedOriginalGravity(beerXmlObject.getEstimatedOriginalGravity());
        recipe.setFermentationStages(beerXmlObject.getFermentationStages());
        recipe.setFinalGravity(beerXmlObject.getFinalGravity());
        recipe.setForcedCarbonation(beerXmlObject.getForcedCarbonation());
        recipe.setIBU(beerXmlObject.getIBU());
        recipe.setIBUMethod(beerXmlObject.getIBUMethod());
        recipe.setKegPrimingFactor(beerXmlObject.getKegPrimingFactor());
        recipe.setMash(_mashConverter.toObjectModel(beerXmlObject.getMash()));
        recipe.setName(beerXmlObject.getName());
        recipe.setNotes(beerXmlObject.getNotes());
        recipe.setOriginalGravity(beerXmlObject.getOriginalGravity());
        recipe.setPrimaryAge(beerXmlObject.getPrimaryAge());
        recipe.setPrimaryTemperature(beerXmlObject.getPrimaryTemperature());
        recipe.setPrimingSugarEquivalent(beerXmlObject.getPrimingSugarEquivalent());
        recipe.setPrimingSugarName(beerXmlObject.getPrimingSugarName());
        recipe.setRating(beerXmlObject.getRating());
        recipe.setSecondaryAge(beerXmlObject.getSecondaryAge());
        recipe.setSecondaryTemperature(beerXmlObject.getSecondaryTemperature());
        recipe.setStyle(_styleConverter.toObjectModel(beerXmlObject.getStyle()));
        recipe.setTasteNotes(beerXmlObject.getTasteNotes());
        recipe.setTertiaryAge(beerXmlObject.getTertiaryAge());
        recipe.setTertiaryTemperature(beerXmlObject.getTertiaryTemperature());
        recipe.setType(_recipeTypeEnumConverter.toObjectModel(beerXmlObject.getType()));
        recipe.setVersion(beerXmlObject.getVersion());

        if (beerXmlObject.getFermentables() != null) {
            ListIterator<Fermentable> fermentableIterator = beerXmlObject.getFermentables().listIterator();
            ArrayList<com.grandpasbrewing.objectmodel.Fermentable> fermentableArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Fermentable>();

            while (fermentableIterator.hasNext()) {
                Fermentable fermentable = fermentableIterator.next();
                fermentableArrayList.add(_fermentableConverter.toObjectModel(fermentable));
            }

            recipe.setFermentables(fermentableArrayList);
        }

        if (beerXmlObject.getHops() != null) {
            ListIterator<Hop> hopIterator = beerXmlObject.getHops().listIterator();
            ArrayList<com.grandpasbrewing.objectmodel.Hop> hopArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Hop>();

            while (hopIterator.hasNext()) {
                Hop hop = hopIterator.next();
                hopArrayList.add(_hopConverter.toObjectModel(hop));
            }

            recipe.setHops(hopArrayList);
        }

        if (beerXmlObject.getMiscs() != null) {
            ListIterator<Misc> miscIterator = beerXmlObject.getMiscs().listIterator();
            ArrayList<com.grandpasbrewing.objectmodel.MiscellaneousItem> miscArrayList = new ArrayList<MiscellaneousItem>();

            while (miscIterator.hasNext()) {
                Misc misc = miscIterator.next();
                miscArrayList.add(_miscConverter.toObjectModel(misc));
            }

            recipe.setMiscs(miscArrayList);
        }

        if (beerXmlObject.getWaters() != null) {
            ListIterator<Water> waterIterator = beerXmlObject.getWaters().listIterator();
            ArrayList<com.grandpasbrewing.objectmodel.Water> waterArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Water>();

            while (waterIterator.hasNext()) {
                Water water = waterIterator.next();
                waterArrayList.add(_waterConverter.toObjectModel(water));
            }

            recipe.setWaters(waterArrayList);
        }

        if (beerXmlObject.getYeasts() != null) {
            ListIterator<Yeast> yeastIterator = beerXmlObject.getYeasts().listIterator();
            ArrayList<com.grandpasbrewing.objectmodel.Yeast> yeastArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Yeast>();

            while (yeastIterator.hasNext()) {
                Yeast yeast = yeastIterator.next();
                yeastArrayList.add(_yeastConverter.toObjectModel(yeast));
            }

            recipe.setYeasts(yeastArrayList);
        }

        return recipe;
    }

    public Recipe fromObjectModel(com.grandpasbrewing.objectmodel.Recipe objectModelObject) {
        if (objectModelObject == null)
            return null;

        Recipe recipe = new Recipe();

        recipe.setABV(objectModelObject.getABV());
        recipe.setActualEfficiency(objectModelObject.getActualEfficiency());
        recipe.setAge(objectModelObject.getAge());
        recipe.setAgeTemperature(objectModelObject.getAgeTemperature());
        recipe.setAssistantBrewer(objectModelObject.getAssistantBrewer());
        recipe.setBatchSize(objectModelObject.getBatchSize());
        recipe.setBoilSize(objectModelObject.getBoilSize());
        recipe.setBoilTime(objectModelObject.getBoilTime());
        recipe.setBrewer(objectModelObject.getBrewer());
        recipe.setCalories(objectModelObject.getCalories());
        recipe.setCarbonation(objectModelObject.getCarbonation());
        recipe.setCarbonationTemperature(objectModelObject.getCarbonationTemperature());
        recipe.setCarbonationUsed(objectModelObject.getCarbonationUsed());
        recipe.setDate(objectModelObject.getDate());
        recipe.setDisplayAgeTemperature(objectModelObject.getDisplayAgeTemperature());
        recipe.setDisplayBatchSize(objectModelObject.getDisplayBatchSize());
        recipe.setDisplayBoilSize(objectModelObject.getDisplayBoilSize());
        recipe.setDisplayCarbTemperature(objectModelObject.getDisplayCarbTemperature());
        recipe.setDisplayFinalGravity(objectModelObject.getDisplayFinalGravity());
        recipe.setDisplayOriginalGravity(objectModelObject.getDisplayOriginalGravity());
        recipe.setDisplayPrimaryTemperature(objectModelObject.getDisplayPrimaryTemperature());
        recipe.setDisplaySecondaryTemperature(objectModelObject.getDisplaySecondaryTemperature());
        recipe.setDisplayTertiaryTemperature(objectModelObject.getDisplayTertiaryTemperature());
        recipe.setEfficiency(objectModelObject.getEfficiency());
        recipe.setEquipment(_equipmentConverter.fromObjectModel(objectModelObject.getEquipment()));
        recipe.setEstimatedABV(objectModelObject.getEstimatedABV());
        recipe.setEstimatedColor(objectModelObject.getEstimatedColor());
        recipe.setEstimatedFinalGravity(objectModelObject.getEstimatedFinalGravity());
        recipe.setEstimatedOriginalGravity(objectModelObject.getEstimatedOriginalGravity());
        recipe.setFermentationStages(objectModelObject.getFermentationStages());
        recipe.setFinalGravity(objectModelObject.getFinalGravity());
        recipe.setForcedCarbonation(objectModelObject.getForcedCarbonation());
        recipe.setIBU(objectModelObject.getIBU());
        recipe.setIBUMethod(objectModelObject.getIBUMethod());
        recipe.setKegPrimingFactor(objectModelObject.getKegPrimingFactor());
        recipe.setMash(_mashConverter.fromObjectModel(objectModelObject.getMash()));
        recipe.setName(objectModelObject.getName());
        recipe.setNotes(objectModelObject.getNotes());
        recipe.setOriginalGravity(objectModelObject.getOriginalGravity());
        recipe.setPrimaryAge(objectModelObject.getPrimaryAge());
        recipe.setPrimaryTemperature(objectModelObject.getPrimaryTemperature());
        recipe.setPrimingSugarEquivalent(objectModelObject.getPrimingSugarEquivalent());
        recipe.setPrimingSugarName(objectModelObject.getPrimingSugarName());
        recipe.setRating(objectModelObject.getRating());
        recipe.setSecondaryAge(objectModelObject.getSecondaryAge());
        recipe.setSecondaryTemperature(objectModelObject.getSecondaryTemperature());
        recipe.setStyle(_styleConverter.fromObjectModel(objectModelObject.getStyle()));
        recipe.setTasteNotes(objectModelObject.getTasteNotes());
        recipe.setTertiaryAge(objectModelObject.getTertiaryAge());
        recipe.setTertiaryTemperature(objectModelObject.getTertiaryTemperature());
        recipe.setType(_recipeTypeEnumConverter.fromObjectModel(objectModelObject.getType()));
        recipe.setVersion(objectModelObject.getVersion());

        if (objectModelObject.getFermentables() != null) {
            ListIterator<com.grandpasbrewing.objectmodel.Fermentable> fermentableIterator = objectModelObject.getFermentables().listIterator();
            ArrayList<Fermentable> fermentableArrayList = new ArrayList<Fermentable>();

            while (fermentableIterator.hasNext()) {
                com.grandpasbrewing.objectmodel.Fermentable fermentable = fermentableIterator.next();
                fermentableArrayList.add(_fermentableConverter.fromObjectModel(fermentable));
            }

            recipe.setFermentables(fermentableArrayList);
        }

        if (objectModelObject.getHops() != null) {
            ListIterator<com.grandpasbrewing.objectmodel.Hop> hopIterator = objectModelObject.getHops().listIterator();
            ArrayList<Hop> hopArrayList = new ArrayList<Hop>();

            while (hopIterator.hasNext()) {
                com.grandpasbrewing.objectmodel.Hop hop = hopIterator.next();
                hopArrayList.add(_hopConverter.fromObjectModel(hop));
            }

            recipe.setHops(hopArrayList);
        }

        if (objectModelObject.getMiscs() != null) {
            ListIterator<com.grandpasbrewing.objectmodel.MiscellaneousItem> miscIterator = objectModelObject.getMiscs().listIterator();
            ArrayList<Misc> miscArrayList = new ArrayList<Misc>();

            while (miscIterator.hasNext()) {
                com.grandpasbrewing.objectmodel.MiscellaneousItem misc = miscIterator.next();
                miscArrayList.add(_miscConverter.fromObjectModel(misc));
            }

            recipe.setMiscs(miscArrayList);
        }

        if (objectModelObject.getWaters() != null) {
            ListIterator<com.grandpasbrewing.objectmodel.Water> waterIterator = objectModelObject.getWaters().listIterator();
            ArrayList<Water> waterArrayList = new ArrayList<Water>();

            while (waterIterator.hasNext()) {
                com.grandpasbrewing.objectmodel.Water water = waterIterator.next();
                waterArrayList.add(_waterConverter.fromObjectModel(water));
            }

            recipe.setWaters(waterArrayList);
        }

        if (objectModelObject.getYeasts() != null) {
            ListIterator<com.grandpasbrewing.objectmodel.Yeast> yeastIterator = objectModelObject.getYeasts().listIterator();
            ArrayList<Yeast> yeastArrayList = new ArrayList<Yeast>();

            while (yeastIterator.hasNext()) {
                com.grandpasbrewing.objectmodel.Yeast yeast = yeastIterator.next();
                yeastArrayList.add(_yeastConverter.fromObjectModel(yeast));
            }

            recipe.setYeasts(yeastArrayList);
        }
        return recipe;
    }
}
