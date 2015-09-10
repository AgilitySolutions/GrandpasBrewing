package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.RecipeTypeEnumConverter;
import com.grandpasbrewing.beerxml.version1.interfaces.converters.IBeerXmlConverter;
import com.grandpasbrewing.beerxml.version1.objects.*;
import com.grandpasbrewing.beerxml.version1.objects.Fermentable;
import com.grandpasbrewing.beerxml.version1.objects.Hop;
import com.grandpasbrewing.beerxml.version1.objects.Recipe;
import com.grandpasbrewing.beerxml.version1.objects.Water;
import com.grandpasbrewing.beerxml.version1.objects.Yeast;
import com.grandpasbrewing.objectmodel.*;

import java.util.ArrayList;
import java.util.ListIterator;

public class RecipeConverter implements IBeerXmlConverter<Recipe, com.grandpasbrewing.objectmodel.Recipe> {
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
        if (equipmentConverter == null) throw new IllegalArgumentException("equipmentConverter");
        if (styleConverter == null) throw new IllegalArgumentException("styleConverter");
        if (mashConverter == null) throw new IllegalArgumentException("mashConverter");
        if (fermentableConverter == null) throw new IllegalArgumentException("fermentableConverter");
        if (hopConverter == null) throw new IllegalArgumentException("hopConverter");
        if (miscConverter == null) throw new IllegalArgumentException("miscConverter");
        if (waterConverter == null) throw new IllegalArgumentException("waterConverter");
        if (yeastConverter == null) throw new IllegalArgumentException("yeastConverter");
        if (recipeTypeEnumConverter == null) throw new IllegalArgumentException("recipeTypeEnumConverter");

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

        ListIterator<Fermentable> fermentableIterator = beerXmlObject.getFermentables().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.Fermentable> fermentableArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Fermentable>();

        while (fermentableIterator.hasNext())
        {
            Fermentable fermentable = fermentableIterator.next();
            fermentableArrayList.add(_fermentableConverter.toObjectModel(fermentable));
        }

        recipe.setFermentables(fermentableArrayList);

        ListIterator<Hop> hopIterator = beerXmlObject.getHops().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.Hop> hopArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Hop>();

        while (hopIterator.hasNext())
        {
            Hop hop = hopIterator.next();
            hopArrayList.add(_hopConverter.toObjectModel(hop));
        }

        recipe.setHops(hopArrayList);

        ListIterator<Misc> miscIterator = beerXmlObject.getMiscs().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.MiscellaneousItem> miscArrayList = new ArrayList<MiscellaneousItem>();

        while (miscIterator.hasNext())
        {
            Misc misc = miscIterator.next();
            miscArrayList.add(_miscConverter.toObjectModel(misc));
        }

        recipe.setMiscs(miscArrayList);

        ListIterator<Water> waterIterator = beerXmlObject.getWaters().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.Water> waterArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Water>();

        while (waterIterator.hasNext())
        {
            Water water = waterIterator.next();
            waterArrayList.add(_waterConverter.toObjectModel(water));
        }

        recipe.setWaters(waterArrayList);

        ListIterator<Yeast> yeastIterator = beerXmlObject.getYeasts().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.Yeast> yeastArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Yeast>();

        while (yeastIterator.hasNext())
        {
            Yeast yeast = yeastIterator.next();
            yeastArrayList.add(_yeastConverter.toObjectModel(yeast));
        }

        recipe.setYeasts(yeastArrayList);

        return recipe;
    }

    public Recipe fromObjectModel(com.grandpasbrewing.objectmodel.Recipe objectModelObject) {
        return null;
    }
}