package com.grandpasbrewing.beerxml.version1.objects

import com.grandpasbrewing.beerxml.version1.enums.RecipeType

class RecipeTest extends GroovyTestCase {
    private Recipe _recipe;

    void setUp() {
        super.setUp()

        _recipe = new Recipe();
    }

    void testSetGetType() {
        _recipe.setType(RecipeType.Extract);
        assertEquals(RecipeType.Extract, _recipe.getType());
    }

    void testSetGetStyle() {
        Style style = new Style();
        style.setName("Test Style");

        _recipe.setStyle(style);
        assertEquals("Test Style", _recipe.getStyle().getName());
    }

    void testSetGetEquipment() {
        Equipment equipment = new Equipment();
        equipment.setName("Test Equipment");

        _recipe.setEquipment(equipment);
        assertEquals("Test Equipment", _recipe.getEquipment().getName());
    }

    void testSetGetBrewer() {
        _recipe.setBrewer("Test Brewer");
        assertEquals("Test Brewer", _recipe.getBrewer());
    }

    void testSetGetAssistantBrewer() {
        _recipe.setAssistantBrewer("Test Assistant Brewer");
        assertEquals("Test Assistant Brewer", _recipe.getAssistantBrewer());
    }

    void testSetGetBatchSize() {
        _recipe.setBatchSize(1);
        assertEquals(1, _recipe.getBatchSize());
    }

    void testSetGetBoilSize() {
        _recipe.setBoilSize(2);
        assertEquals(2, _recipe.getBoilSize());
    }

    void testSetGetBoilTime() {
        _recipe.setBoilTime(3);
        assertEquals(3, _recipe.getBoilTime());
    }

    void testSetGetEfficiency() {
        _recipe.setEfficiency(4);
        assertEquals(4, _recipe.getEfficiency());
    }

    void testSetGetHops() {
        ArrayList<Hop> hops = new ArrayList<Hop>();
        hops.add(new Hop());

        _recipe.setHops(hops);
        assertEquals(1, _recipe.getHops().size());
    }

    void testSetGetFermentables() {
        ArrayList<Fermentable> fermentables = new ArrayList<Fermentable>();
        fermentables.add(new Fermentable());
        fermentables.add(new Fermentable());

        _recipe.setFermentables(fermentables);
        assertEquals(2, _recipe.getFermentables().size());
    }

    void testSetGetMiscs() {
        ArrayList<Misc> miscs = new ArrayList<Misc>();
        miscs.add(new Misc());
        miscs.add(new Misc());
        miscs.add(new Misc());

        _recipe.setMiscs(miscs);
        assertEquals(3, _recipe.getMiscs().size());
    }

    void testSetGetYeasts() {
        ArrayList<Yeast> yeasts = new ArrayList<Yeast>();
        yeasts.add(new Yeast());
        yeasts.add(new Yeast());
        yeasts.add(new Yeast());
        yeasts.add(new Yeast());

        _recipe.setYeasts(yeasts);
        assertEquals(4, _recipe.getYeasts().size());
    }

    void testSetGetWaters() {
        ArrayList<Water> waters = new ArrayList<Water>();
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());

        _recipe.setWaters(waters);
        assertEquals(5, _recipe.getWaters().size());
    }

    void testSetGetMash() {
        Mash mash = new Mash();
        mash.setName("Test Mash");

        _recipe.setMash(mash);
        assertEquals("Test Mash", _recipe.getMash().getName());
    }

    void testSetGetNotes() {
        _recipe.setNotes("Test Notes");
        assertEquals("Test Notes", _recipe.getNotes());
    }

    void testSetGetTasteNotes() {
        _recipe.setTasteNotes("Test Taste Notes");
        assertEquals("Test Taste Notes", _recipe.getTasteNotes());
    }

    void testSetGetRating() {
        _recipe.setRating(5);
        assertEquals(5, _recipe.getRating());
    }

    void testSetGetOriginalGravity() {
        _recipe.setOriginalGravity(6);
        assertEquals(6, _recipe.getOriginalGravity());
    }

    void testSetGetFinalGravity() {
        _recipe.setFinalGravity(7);
        assertEquals(7, _recipe.getFinalGravity());
    }

    void testSetGetFermentationStages() {
        _recipe.setFermentationStages(8);
        assertEquals(8, _recipe.getFermentationStages());
    }

    void testSetGetPrimaryAge() {
        _recipe.setPrimaryAge(9);
        assertEquals(9, _recipe.getPrimaryAge());
    }

    void testSetGetPrimaryTemperature() {
        _recipe.setPrimaryTemperature(10);
        assertEquals(10, _recipe.getPrimaryTemperature());
    }

    void testSetGetSecondaryAge() {
        _recipe.setSecondaryAge(11);
        assertEquals(11, _recipe.getSecondaryAge());
    }

    void testSetGetSecondaryTemperature() {
        _recipe.setSecondaryTemperature(12);
        assertEquals(12, _recipe.getSecondaryTemperature());
    }

    void testSetGetTertiaryAge() {
        _recipe.setTertiaryAge(13);
        assertEquals(13, _recipe.getTertiaryAge());
    }

    void testSetGetTertiaryTemperature() {
        _recipe.setTertiaryTemperature(14);
        assertEquals(14, _recipe.getTertiaryTemperature());
    }

    void testSetGetAge() {
        _recipe.setAge(15);
        assertEquals(15, _recipe.getAge());
    }

    void testSetGetAgeTemperature() {
        _recipe.setAgeTemperature(16);
        assertEquals(16, _recipe.getAgeTemperature());
    }

    void testSetGetDate() {
        _recipe.setDate("Test Date");
        assertEquals("Test Date", _recipe.getDate());
    }

    void testSetGetCarbonation() {
        _recipe.setCarbonation(17);
        assertEquals(17, _recipe.getCarbonation());
    }

    void testSetGetForcedCarbonation() {
        _recipe.setForcedCarbonation(true);
        assertEquals(true, _recipe.getForcedCarbonation());
    }

    void testSetGetPrimingSugarName() {
        _recipe.setPrimingSugarName("Test Priming Sugar Name");
        assertEquals("Test Priming Sugar Name", _recipe.getPrimingSugarName());
    }

    void testSetGetCarbonationTemperature() {
        _recipe.setCarbonationTemperature(18);
        assertEquals(18, _recipe.getCarbonationTemperature());
    }

    void testSetGetPrimingSugarEquivalent() {
        _recipe.setPrimingSugarEquivalent(19);
        assertEquals(19, _recipe.getPrimingSugarEquivalent());
    }

    void testSetGetKegPrimingFactor() {
        _recipe.setKegPrimingFactor(20);
        assertEquals(20, _recipe.getKegPrimingFactor());
    }

    void testSetGetEstimatedOriginalGravity() {
        _recipe.setEstimatedOriginalGravity("Test Estimated Original Gravity");
        assertEquals("Test Estimated Original Gravity", _recipe.getEstimatedOriginalGravity());
    }

    void testSetGetEstimatedFinalGravity() {
        _recipe.setEstimatedFinalGravity("Test Estimated Final Gravity");
        assertEquals("Test Estimated Final Gravity", _recipe.getEstimatedFinalGravity());
    }

    void testSetGetEstimatedColor() {
        _recipe.setEstimatedColor("Test Estimated Color");
        assertEquals("Test Estimated Color", _recipe.getEstimatedColor());
    }

    void testSetGetIBU() {
        _recipe.setIBU(21);
        assertEquals(21, _recipe.getIBU());
    }

    void testSetGetIBUMethod() {
        _recipe.setIBUMethod("Test IBU Method");
        assertEquals("Test IBU Method", _recipe.getIBUMethod());
    }

    void testSetGetEstimatedABV() {
        _recipe.setEstimatedABV(22);
        assertEquals(22, _recipe.getEstimatedABV());
    }

    void testSetGetABV() {
        _recipe.setABV(23);
        assertEquals(23, _recipe.getABV());
    }

    void testSetGetActualEfficiency() {
        _recipe.setActualEfficiency(24);
        assertEquals(24, _recipe.getActualEfficiency());
    }

    void testSetGetCalories() {
        _recipe.setCalories("Test Calories");
        assertEquals("Test Calories", _recipe.getCalories());
    }

    void testSetGetDisplayBatchSize() {
        _recipe.setDisplayBatchSize("Test Display Batch Size");
        assertEquals("Test Display Batch Size", _recipe.getDisplayBatchSize());
    }

    void testSetGetDisplayBoilSize() {
        _recipe.setDisplayBoilSize("Test Display Boil Size");
        assertEquals("Test Display Boil Size", _recipe.getDisplayBoilSize());
    }

    void testSetGetDisplayOriginalGravity() {
        _recipe.setDisplayOriginalGravity("Test Display Original Gravity");
        assertEquals("Test Display Original Gravity", _recipe.getDisplayOriginalGravity());
    }

    void testSetGetDisplayFinalGravity() {
        _recipe.setDisplayFinalGravity("Test Display Final Gravity");
        assertEquals("Test Display Final Gravity", _recipe.getDisplayFinalGravity());
    }

    void testSetGetDisplayPrimaryTemperature() {
        _recipe.setDisplayPrimaryTemperature("Test Display Primary Temperature");
        assertEquals("Test Display Primary Temperature", _recipe.getDisplayPrimaryTemperature());
    }

    void testSetGetDisplaySecondaryTemperature() {
        _recipe.setDisplaySecondaryTemperature("Test Display Secondary Temperature");
        assertEquals("Test Display Secondary Temperature", _recipe.getDisplaySecondaryTemperature());
    }

    void testSetGetDisplayTertiaryTemperature() {
        _recipe.setDisplayTertiaryTemperature("Test Display Tertiary Temperature");
        assertEquals("Test Display Tertiary Temperature", _recipe.getDisplayTertiaryTemperature());
    }

    void testSetGetDisplayAgeTemperature() {
        _recipe.setDisplayAgeTemperature("Test Display Age Temperature");
        assertEquals("Test Display Age Temperature", _recipe.getDisplayAgeTemperature());
    }

    void testSetGetCarbonationUsed() {
        _recipe.setCarbonationUsed("Test Carbonation Used");
        assertEquals("Test Carbonation Used", _recipe.getCarbonationUsed());
    }

    void testSetGetDisplayCarbTemperature() {
        _recipe.setDisplayCarbTemperature("Test Display Carb Temperature");
        assertEquals("Test Display Carb Temperature", _recipe.getDisplayCarbTemperature());
    }

    void testSetGetName() {
        _recipe.setName("Test Name");
        assertEquals("Test Name", _recipe.getName());
    }

    void testSetGetVersion() {
        _recipe.setVersion(25);
        assertEquals(25, _recipe.getVersion());
    }
}
