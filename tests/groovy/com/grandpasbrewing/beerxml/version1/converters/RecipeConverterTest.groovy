package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.FermentableTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopFormEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopUseEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MashStepTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MiscellaneousItemUseEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.RecipeTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.StyleTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFlocculationEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFormEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.FermentableType
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.enums.RecipeType
import com.grandpasbrewing.beerxml.version1.enums.StyleType
import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.Fermentable
import com.grandpasbrewing.beerxml.version1.objects.Hop
import com.grandpasbrewing.beerxml.version1.objects.Mash
import com.grandpasbrewing.beerxml.version1.objects.MashStep
import com.grandpasbrewing.beerxml.version1.objects.Misc
import com.grandpasbrewing.beerxml.version1.objects.Recipe
import com.grandpasbrewing.beerxml.version1.objects.Style
import com.grandpasbrewing.beerxml.version1.objects.Water
import com.grandpasbrewing.beerxml.version1.objects.Yeast
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemType
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse

class RecipeConverterTest extends GroovyTestCase {
    private FermentableTypeEnumConverter _fermentableTypeEnumConverter;
    private HopFormEnumConverter _hopFormEnumConverter;
    private HopTypeEnumConverter _hopTypeEnumConverter;
    private HopUseEnumConverter _hopUseEnumConverter;
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;
    private MiscellaneousItemTypeEnumConverter _miscellaneousItemTypeEnumConverter;
    private MiscellaneousItemUseEnumConverter _miscellaneousItemUseEnumConverter;
    private RecipeTypeEnumConverter _recipeTypeEnumConverter;
    private StyleTypeEnumConverter _styleTypeEnumConverter;
    private YeastFlocculationEnumConverter _yeastFlocculationEnumConverter;
    private YeastFormEnumConverter _yeastFormEnumConverter;
    private YeastTypeEnumConverter _yeastTypeEnumConverter;

    private EquipmentConverter _equipmentConverter;
    private StyleConverter _styleConverter;
    private MashConverter _mashConverter;
    private MashStepConverter _mashStepConverter;
    private FermentableConverter _fermentableConverter;
    private HopConverter _hopConverter;
    private MiscellaneousItemConverter _miscConverter;
    private WaterConverter _waterConverter;
    private YeastConverter _yeastConverter;

    private RecipeConverter _recipeConverter;

    void setUp() {
        super.setUp()

        _fermentableTypeEnumConverter = new FermentableTypeEnumConverter();
        _hopFormEnumConverter = new HopFormEnumConverter();
        _hopTypeEnumConverter = new HopTypeEnumConverter();
        _hopUseEnumConverter = new HopUseEnumConverter();
        _mashStepTypeEnumConverter = new MashStepTypeEnumConverter();
        _miscellaneousItemTypeEnumConverter = new MiscellaneousItemTypeEnumConverter();
        _miscellaneousItemUseEnumConverter = new MiscellaneousItemUseEnumConverter();
        _recipeTypeEnumConverter = new RecipeTypeEnumConverter();
        _styleTypeEnumConverter = new StyleTypeEnumConverter();
        _yeastFlocculationEnumConverter = new YeastFlocculationEnumConverter();
        _yeastFormEnumConverter = new YeastFormEnumConverter();
        _yeastTypeEnumConverter = new YeastTypeEnumConverter();

        _equipmentConverter = new EquipmentConverter();
        _styleConverter = new StyleConverter(_styleTypeEnumConverter);
        _mashStepConverter = new MashStepConverter(_mashStepTypeEnumConverter);
        _mashConverter = new MashConverter(_mashStepConverter);
        _fermentableConverter = new FermentableConverter(_fermentableTypeEnumConverter);
        _hopConverter = new HopConverter(_hopFormEnumConverter, _hopTypeEnumConverter, _hopUseEnumConverter);
        _miscConverter = new MiscellaneousItemConverter(_miscellaneousItemTypeEnumConverter, _miscellaneousItemUseEnumConverter);
        _waterConverter = new WaterConverter();
        _yeastConverter = new YeastConverter(_yeastFlocculationEnumConverter, _yeastFormEnumConverter, _yeastTypeEnumConverter);

        _recipeConverter = new RecipeConverter(_equipmentConverter,
                _styleConverter,
                _mashConverter,
                _fermentableConverter,
                _hopConverter,
                _miscConverter,
                _waterConverter,
                _yeastConverter,
                _recipeTypeEnumConverter
        );
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Recipe recipe = _recipeConverter.toObjectModel(null);

        assertNull(recipe);
    }

    void testToObjectModelRecipe() {
        Recipe beerXmlObjectRecipe = new Recipe();

        beerXmlObjectRecipe.setName("Dry Stout");
        beerXmlObjectRecipe.setVersion(1);
        beerXmlObjectRecipe.setType(RecipeType.AllGrain);
        beerXmlObjectRecipe.setBrewer("Brad Smith");
        beerXmlObjectRecipe.setBatchSize(18.93);
        beerXmlObjectRecipe.setBoilSize(20.82);
        beerXmlObjectRecipe.setBoilTime(60.0);
        beerXmlObjectRecipe.setEfficiency(72.0);
        beerXmlObjectRecipe.setTasteNotes("Nice dry Irish stout with a warm body but low starting gravity much like the famous drafts.");
        beerXmlObjectRecipe.setRating(41);
        beerXmlObjectRecipe.setDate("3 Jan 04");
        beerXmlObjectRecipe.setOriginalGravity(1.036);
        beerXmlObjectRecipe.setFinalGravity(1.012);
        beerXmlObjectRecipe.setCarbonation(2.1);
        beerXmlObjectRecipe.setCarbonationUsed("Kegged");
        beerXmlObjectRecipe.setAge(24.0);
        beerXmlObjectRecipe.setAgeTemperature(17.0);
        beerXmlObjectRecipe.setFermentationStages(2);

        Style beerXmlObjectStyle = new Style();

        beerXmlObjectStyle.setName("Dry Stout");
        beerXmlObjectStyle.setCategory("Stout");
        beerXmlObjectStyle.setCategoryNumber("16");
        beerXmlObjectStyle.setStyleLetter("A");
        beerXmlObjectStyle.setStyleGuide("BJCP");
        beerXmlObjectStyle.setVersion(1);
        beerXmlObjectStyle.setType(StyleType.Ale);
        beerXmlObjectStyle.setOriginalGravityMinimum(1.035);
        beerXmlObjectStyle.setOriginalGravityMaximum(1.050);
        beerXmlObjectStyle.setFinalGravityMinimum(1.007);
        beerXmlObjectStyle.setFinalGravityMaximum(1.011);
        beerXmlObjectStyle.setIBUMinimum(30.0);
        beerXmlObjectStyle.setIBUMaximum(50.0);
        beerXmlObjectStyle.setColorMinimum("35.0");
        beerXmlObjectStyle.setColorMaximum("200.0");
        beerXmlObjectStyle.setABVMinimum(3.2);
        beerXmlObjectStyle.setABVMaximum(5.5);
        beerXmlObjectStyle.setCarbonationMinimum(1.6);
        beerXmlObjectStyle.setCarbonationMaximum(2.1);
        beerXmlObjectStyle.setNotes("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer. Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.");

        beerXmlObjectRecipe.setStyle(beerXmlObjectStyle);

        ArrayList<Hop> beerXmlHopArrayList = new ArrayList<Hop>();

        Hop beerXmlObjectHop = new Hop();

        beerXmlObjectHop.setName("Goldings,  East Kent ");
        beerXmlObjectHop.setVersion(1);
        beerXmlObjectHop.setAlphaPercentage(5.0);
        beerXmlObjectHop.setAmount(0.0638);
        beerXmlObjectHop.setUse(HopUse.Boil);
        beerXmlObjectHop.setTime(60.0);
        beerXmlObjectHop.setNotes("Great all purpose UK hop for ales, stouts, porters");

        beerXmlHopArrayList.add(beerXmlObjectHop);

        beerXmlObjectRecipe.setHops(beerXmlHopArrayList);

        ArrayList<Fermentable> beerXmlFermentableArrayList = new ArrayList<Fermentable>();

        Fermentable beerXmlObjectFermaentable1 = new Fermentable();

        beerXmlObjectFermaentable1.setName("Pale Malt (2 row) UK");
        beerXmlObjectFermaentable1.setVersion(1);
        beerXmlObjectFermaentable1.setAmount(2.27);
        beerXmlObjectFermaentable1.setType(FermentableType.Grain);
        beerXmlObjectFermaentable1.setYield(78.0);
        beerXmlObjectFermaentable1.setColor(3.0);
        beerXmlObjectFermaentable1.setPlaceOfOrigin(" United Kingdom ");
        beerXmlObjectFermaentable1.setSupplier("Fussybrewer Malting");
        beerXmlObjectFermaentable1.setNotes("All purpose base malt for English styles");
        beerXmlObjectFermaentable1.setCoarseFineDiff(1.5);
        beerXmlObjectFermaentable1.setMoisture(4.0);
        beerXmlObjectFermaentable1.setDiastaticPower(45.0);
        beerXmlObjectFermaentable1.setProtein(10.2);
        beerXmlObjectFermaentable1.setMaximumInBatch(100.0);

        beerXmlFermentableArrayList.add(beerXmlObjectFermaentable1);

        Fermentable beerXmlObjectFermaentable2 = new Fermentable();

        beerXmlObjectFermaentable2.setName("Barley, Flaked");
        beerXmlObjectFermaentable2.setVersion(1);
        beerXmlObjectFermaentable2.setAmount(0.91);
        beerXmlObjectFermaentable2.setType(FermentableType.Grain);
        beerXmlObjectFermaentable2.setYield(70.0);
        beerXmlObjectFermaentable2.setColor(2.0);
        beerXmlObjectFermaentable2.setPlaceOfOrigin(" United Kingdom ");
        beerXmlObjectFermaentable2.setSupplier("Fussybrewer Malting");
        beerXmlObjectFermaentable2.setNotes("Adds body to porters and stouts, must be mashed");
        beerXmlObjectFermaentable2.setCoarseFineDiff(1.5);
        beerXmlObjectFermaentable2.setMoisture(9.0);
        beerXmlObjectFermaentable2.setDiastaticPower(0.0);
        beerXmlObjectFermaentable2.setProtein(13.2);
        beerXmlObjectFermaentable2.setMaximumInBatch(20.0);
        beerXmlObjectFermaentable2.setRecommendMash(true);

        beerXmlFermentableArrayList.add(beerXmlObjectFermaentable2);

        Fermentable beerXmlObjectFermaentable3 = new Fermentable();

        beerXmlObjectFermaentable3.setName("Black Barley");
        beerXmlObjectFermaentable3.setVersion(1);
        beerXmlObjectFermaentable3.setAmount(0.45);
        beerXmlObjectFermaentable3.setType(FermentableType.Grain);
        beerXmlObjectFermaentable3.setYield(78.0);
        beerXmlObjectFermaentable3.setColor(500.0);
        beerXmlObjectFermaentable3.setPlaceOfOrigin(" United Kingdom ");
        beerXmlObjectFermaentable3.setSupplier("Fussybrewer Malting");
        beerXmlObjectFermaentable3.setNotes("Unmalted roasted barley for stouts, porters");
        beerXmlObjectFermaentable3.setCoarseFineDiff(1.5);
        beerXmlObjectFermaentable3.setMoisture(5.0);
        beerXmlObjectFermaentable3.setDiastaticPower(0.0);
        beerXmlObjectFermaentable3.setProtein(13.2);
        beerXmlObjectFermaentable3.setMaximumInBatch(10.0);

        beerXmlFermentableArrayList.add(beerXmlObjectFermaentable3);

        beerXmlObjectRecipe.setFermentables(beerXmlFermentableArrayList);

        ArrayList<Misc> beerXmlMiscArrayList = new ArrayList<Misc>();

        Misc beerXmlObjectMisc = new Misc();

        beerXmlObjectMisc.setName("Irish Moss");
        beerXmlObjectMisc.setVersion(1);
        beerXmlObjectMisc.setType(MiscType.Fining);
        beerXmlObjectMisc.setUse(MiscUse.Boil);
        beerXmlObjectMisc.setTime(15.0);
        beerXmlObjectMisc.setAmount(0.010);
        beerXmlObjectMisc.setNotes("Used as a clarifying agent during the last few minutes of the boil");

        beerXmlMiscArrayList.add(beerXmlObjectMisc);

        beerXmlObjectRecipe.setMiscs(beerXmlMiscArrayList);

        ArrayList<Water> beerXmlWaterArrayList = new ArrayList<Water>();

        Water beerXmlObjectWater = new Water();

        beerXmlObjectWater.setName(" Burton on Trent, UK ");
        beerXmlObjectWater.setVersion(1);
        beerXmlObjectWater.setAmount(20.0);
        beerXmlObjectWater.setCalcium(295.0);
        beerXmlObjectWater.setMagnesium(45.0);
        beerXmlObjectWater.setSodium(55.0);
        beerXmlObjectWater.setSulfate(725.0);
        beerXmlObjectWater.setChloride(25.0);
        beerXmlObjectWater.setBicarbonate(300.0);
        beerXmlObjectWater.setPH(8.0);
        beerXmlObjectWater.setNotes(" Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale");

        beerXmlWaterArrayList.add(beerXmlObjectWater);

        beerXmlObjectRecipe.setWaters(beerXmlWaterArrayList);

        ArrayList<Yeast> beerXmlYeastArrayList = new ArrayList<Yeast>();

        Yeast beerXmlObjectYeast = new Yeast();

        beerXmlObjectYeast.setName("Irish Ale");
        beerXmlObjectYeast.setType(YeastType.Ale);
        beerXmlObjectYeast.setVersion(1);
        beerXmlObjectYeast.setForm(YeastForm.Liquid);
        beerXmlObjectYeast.setAmount(0.250);
        beerXmlObjectYeast.setLaboratory("Wyeast Labs");
        beerXmlObjectYeast.setManufacturerProductId("1084");
        beerXmlObjectYeast.setMinimumTemperature(16.7);
        beerXmlObjectYeast.setMaximumTemperature(22.2);
        beerXmlObjectYeast.setAttenuation(73.0);
        beerXmlObjectYeast.setNotes("Dry, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor. ");
        beerXmlObjectYeast.setBestFor("Irish Dry Stouts");
        beerXmlObjectYeast.setFlocculation(YeastFlocculation.Medium);

        beerXmlYeastArrayList.add(beerXmlObjectYeast);

        beerXmlObjectRecipe.setYeasts(beerXmlYeastArrayList);

        Mash beerXmlObjectMash = new Mash();

        beerXmlObjectMash.setName("Single Step Infusion, 68 C");
        beerXmlObjectMash.setVersion(1);
        beerXmlObjectMash.setGrainTemperature(22.0);

        ArrayList<MashStep> beerXmlMashStepsArrayList = new ArrayList<MashStep>();

        MashStep beerXmlMashStep = new MashStep();

        beerXmlMashStep.setName("Conversion Step, 68C ");
        beerXmlMashStep.setVersion(1);
        beerXmlMashStep.setType(MashStepType.Infusion);
        beerXmlMashStep.setStepTemperature(68.0);
        beerXmlMashStep.setStepTime(60.0);
        beerXmlMashStep.setInfuseAmount(10.0);

        beerXmlMashStepsArrayList.add(beerXmlMashStep);

        beerXmlObjectMash.setMashSteps(beerXmlMashStepsArrayList);

        beerXmlObjectRecipe.setMash(beerXmlObjectMash);

        com.grandpasbrewing.objectmodel.Recipe recipe = _recipeConverter.toObjectModel(beerXmlObjectRecipe);

        assertEquals("Dry Stout", recipe.getName());
        assertEquals(1, recipe.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain, recipe.getType());
        assertNull(recipe.getEquipment());
        assertEquals("Brad Smith", recipe.getBrewer());
        assertNull(recipe.getAssistantBrewer());
        assertEquals(18.93, recipe.getBatchSize());
        assertEquals(20.82, recipe.getBoilSize());
        assertEquals(60.0, recipe.getBoilTime());
        assertEquals(72.0, recipe.getEfficiency());
        assertEquals(1, recipe.getHops().size());
        assertEquals(3, recipe.getFermentables().size());
        assertEquals(1, recipe.getMiscs().size());
        assertEquals(1, recipe.getYeasts().size());
        assertEquals(1, recipe.getWaters().size());
        assertNull(recipe.getNotes());
        assertEquals("Nice dry Irish stout with a warm body but low starting gravity much like the famous drafts.", recipe.getTasteNotes());
        assertEquals(41, recipe.getRating());
        assertEquals(1.036, recipe.getOriginalGravity());
        assertEquals(1.012, recipe.getFinalGravity());
        assertEquals(2, recipe.getFermentationStages());
        assertNull(recipe.getPrimaryAge());
        assertNull(recipe.getPrimaryTemperature());
        assertNull(recipe.getSecondaryAge());
        assertNull(recipe.getSecondaryTemperature());
        assertNull(recipe.getTertiaryAge());
        assertNull(recipe.getTertiaryTemperature());
        assertEquals(24.0, recipe.getAge());
        assertEquals(17.0, recipe.getAgeTemperature());
        assertEquals("3 Jan 04", recipe.getDate());
        assertEquals(2.1, recipe.getCarbonation());
        assertNull(recipe.getPrimingSugarName());
        assertNull(recipe.getCarbonationTemperature());
        assertNull(recipe.getPrimingSugarEquivalent());
        assertNull(recipe.getKegPrimingFactor());
        assertNull(recipe.getEstimatedOriginalGravity());
        assertNull(recipe.getEstimatedFinalGravity());
        assertNull(recipe.getEstimatedColor());
        assertNull(recipe.getIBU());
        assertNull(recipe.getIBUMethod());
        assertNull(recipe.getEstimatedABV());
        assertNull(recipe.getABV());
        assertNull(recipe.getActualEfficiency());
        assertNull(recipe.getCalories());
        assertNull(recipe.getDisplayBatchSize());
        assertNull(recipe.getDisplayBoilSize());
        assertNull(recipe.getDisplayOriginalGravity());
        assertNull(recipe.getDisplayFinalGravity());
        assertNull(recipe.getDisplayPrimaryTemperature());
        assertNull(recipe.getDisplaySecondaryTemperature());
        assertNull(recipe.getDisplayTertiaryTemperature());
        assertNull(recipe.getDisplayAgeTemperature());
        assertEquals("Kegged", recipe.getCarbonationUsed());
        assertNull(recipe.getDisplayCarbTemperature());

        assertEquals("Dry Stout", recipe.getStyle().getName());
        assertEquals("Stout", recipe.getStyle().getCategory());
        assertEquals(1, recipe.getStyle().getVersion());
        assertEquals("16", recipe.getStyle().getCategoryNumber());
        assertEquals("A", recipe.getStyle().getStyleLetter());
        assertEquals("BJCP", recipe.getStyle().getStyleGuide());
        assertEquals(com.grandpasbrewing.objectmodel.enums.StyleType.Ale, recipe.getStyle().getType());
        assertEquals(1.035, recipe.getStyle().getOriginalGravityMinimum());
        assertEquals(1.050, recipe.getStyle().getOriginalGravityMaximum());
        assertEquals(1.007, recipe.getStyle().getFinalGravityMinimum());
        assertEquals(1.011, recipe.getStyle().getFinalGravityMaximum());
        assertEquals(30.0, recipe.getStyle().getIBUMinimum());
        assertEquals(50.0, recipe.getStyle().getIBUMaximum());
        assertEquals("35.0", recipe.getStyle().getColorMinimum());
        assertEquals("200.0", recipe.getStyle().getColorMaximum());
        assertEquals(1.6, recipe.getStyle().getCarbonationMinimum());
        assertEquals(2.1, recipe.getStyle().getCarbonationMaximum());
        assertEquals(3.2, recipe.getStyle().getABVMinimum());
        assertEquals(5.5, recipe.getStyle().getABVMaximum());
        assertEquals("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer. Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.", recipe.getStyle().getNotes());
        assertNull(recipe.getStyle().getProfile());
        assertNull(recipe.getStyle().getIngredients());
        assertNull(recipe.getStyle().getExamples());

        def hopIterator = recipe.getHops().listIterator();
        def hopIteratorCurrent = hopIterator.next();

        assertNotNull(hopIteratorCurrent);

        assertEquals("Goldings,  East Kent ", hopIteratorCurrent.getName());
        assertEquals(1, hopIteratorCurrent.getVersion());
        assertEquals(5.0, hopIteratorCurrent.getAlphaPercentage());
        assertEquals(0.0638, hopIteratorCurrent.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Boil, hopIteratorCurrent.getUse());
        assertEquals(60, hopIteratorCurrent.getTime());
        assertEquals("Great all purpose UK hop for ales, stouts, porters", hopIteratorCurrent.getNotes());
        assertNull(hopIteratorCurrent.getType());
        assertNull(hopIteratorCurrent.getForm());
        assertNull(hopIteratorCurrent.getBetaPercentage());
        assertNull(hopIteratorCurrent.getHopStabilityIndex());
        assertNull(hopIteratorCurrent.getPlaceOfOrigin());
        assertNull(hopIteratorCurrent.getSubstitutes());
        assertNull(hopIteratorCurrent.getHumuleneLevel());
        assertNull(hopIteratorCurrent.getCaryophylleneLevel());
        assertNull(hopIteratorCurrent.getCohumuloneLevel());
        assertNull(hopIteratorCurrent.getMyrceneLevel());
        assertNull(hopIteratorCurrent.getDisplayAmount());
        assertNull(hopIteratorCurrent.getInventory());
        assertNull(hopIteratorCurrent.getDisplayTime());

        def fermentableIterator = recipe.getFermentables().listIterator();
        def fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pale Malt (2 row) UK", fermentableIteratorCurrent.getName());
        assertEquals(1, fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentableIteratorCurrent.getType());
        assertEquals(2.27, fermentableIteratorCurrent.getAmount());
        assertEquals(78.0, fermentableIteratorCurrent.getYield());
        assertEquals(3.0, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertEquals(" United Kingdom ", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentableIteratorCurrent.getSupplier());
        assertEquals("All purpose base malt for English styles", fermentableIteratorCurrent.getNotes());
        assertEquals(1.5, fermentableIteratorCurrent.getCoarseFineDiff());
        assertEquals(4.0, fermentableIteratorCurrent.getMoisture());
        assertEquals(45.0, fermentableIteratorCurrent.getDiastaticPower());
        assertEquals(10.2, fermentableIteratorCurrent.getProtein());
        assertEquals(100.0, fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertNull(fermentableIteratorCurrent.getDisplayAmount());
        assertNull(fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertNull(fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Barley, Flaked", fermentableIteratorCurrent.getName());
        assertEquals(1, fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentableIteratorCurrent.getType());
        assertEquals(0.91, fermentableIteratorCurrent.getAmount());
        assertEquals(70.0, fermentableIteratorCurrent.getYield());
        assertEquals(2.0, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertEquals(" United Kingdom ", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentableIteratorCurrent.getSupplier());
        assertEquals("Adds body to porters and stouts, must be mashed", fermentableIteratorCurrent.getNotes());
        assertEquals(1.5, fermentableIteratorCurrent.getCoarseFineDiff());
        assertEquals(9.0, fermentableIteratorCurrent.getMoisture());
        assertEquals(0.0, fermentableIteratorCurrent.getDiastaticPower());
        assertEquals(13.2, fermentableIteratorCurrent.getProtein());
        assertEquals(20.0, fermentableIteratorCurrent.getMaximumInBatch());
        assertEquals(true, fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertNull(fermentableIteratorCurrent.getDisplayAmount());
        assertNull(fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertNull(fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Black Barley", fermentableIteratorCurrent.getName());
        assertEquals(1, fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentableIteratorCurrent.getType());
        assertEquals(0.45, fermentableIteratorCurrent.getAmount());
        assertEquals(78.0, fermentableIteratorCurrent.getYield());
        assertEquals(500.0, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertEquals(" United Kingdom ", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentableIteratorCurrent.getSupplier());
        assertEquals("Unmalted roasted barley for stouts, porters", fermentableIteratorCurrent.getNotes());
        assertEquals(1.5, fermentableIteratorCurrent.getCoarseFineDiff());
        assertEquals(5.0, fermentableIteratorCurrent.getMoisture());
        assertEquals(0.0, fermentableIteratorCurrent.getDiastaticPower());
        assertEquals(13.2, fermentableIteratorCurrent.getProtein());
        assertEquals(10.0, fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertNull(fermentableIteratorCurrent.getDisplayAmount());
        assertNull(fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertNull(fermentableIteratorCurrent.getDisplayColor());

        def miscIterator = recipe.getMiscs().listIterator();
        def miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Irish Moss", miscIteratorCurrent.getName());
        assertEquals(1, miscIteratorCurrent.getVersion());
        assertEquals(MiscellaneousItemType.Fining, miscIteratorCurrent.getType());
        assertEquals(MiscellaneousItemUse.Boil, miscIteratorCurrent.getUse());
        assertEquals(15.0, miscIteratorCurrent.getTime());
        assertEquals(0.010, miscIteratorCurrent.getAmount());
        assertNull(miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertEquals("Used as a clarifying agent during the last few minutes of the boil", miscIteratorCurrent.getNotes());
        assertNull(miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertNull(miscIteratorCurrent.getDisplayTime());

        def waterIterator = recipe.getWaters().listIterator();
        def waterIteratorCurrent = waterIterator.next();

        assertNotNull(waterIteratorCurrent);

        assertEquals(" Burton on Trent, UK ", waterIteratorCurrent.getName());
        assertEquals(1, waterIteratorCurrent.getVersion());
        assertEquals(20.0, waterIteratorCurrent.getAmount());
        assertEquals(295.0, waterIteratorCurrent.getCalcium());
        assertEquals(300.0, waterIteratorCurrent.getBicarbonate());
        assertEquals(725.0, waterIteratorCurrent.getSulfate());
        assertEquals(25.0, waterIteratorCurrent.getChloride());
        assertEquals(55.0, waterIteratorCurrent.getSodium());
        assertEquals(45.0, waterIteratorCurrent.getMagnesium());
        assertEquals(8.0, waterIteratorCurrent.getPH());
        assertEquals(" Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale", waterIteratorCurrent.getNotes());
        assertNull(waterIteratorCurrent.getDisplayAmount());

        def yeastIterator = recipe.getYeasts().listIterator();
        def yeastIteratorCurrent = yeastIterator.next();

        assertNotNull(yeastIteratorCurrent);

        assertEquals("Irish Ale", yeastIteratorCurrent.getName());
        assertEquals(1, yeastIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Ale, yeastIteratorCurrent.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid, yeastIteratorCurrent.getForm());
        assertEquals(0.250, yeastIteratorCurrent.getAmount());
        assertNull(yeastIteratorCurrent.getAmountIsWeight());
        assertEquals("Wyeast Labs", yeastIteratorCurrent.getLaboratory());
        assertEquals("1084", yeastIteratorCurrent.getManufacturerProductId());
        assertEquals(16.7, yeastIteratorCurrent.getMinimumTemperature());
        assertEquals(22.2, yeastIteratorCurrent.getMaximumTemperature());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Medium, yeastIteratorCurrent.getFlocculation());
        assertEquals(73.0, yeastIteratorCurrent.getAttenuation());
        assertEquals("Dry, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor. ", yeastIteratorCurrent.getNotes());
        assertEquals("Irish Dry Stouts", yeastIteratorCurrent.getBestFor());
        assertNull(yeastIteratorCurrent.getTimesCultured());
        assertNull(yeastIteratorCurrent.getMaximumReuse());
        assertNull(yeastIteratorCurrent.getAddToSecondary());
        assertNull(yeastIteratorCurrent.getDisplayAmount());
        assertNull(yeastIteratorCurrent.getDisplayMinimumTemperature());
        assertNull(yeastIteratorCurrent.getDisplayMaximumTemperature());
        assertNull(yeastIteratorCurrent.getInventory());
        assertNull(yeastIteratorCurrent.getCultureDate());

        assertEquals("Single Step Infusion, 68 C", recipe.getMash().getName());
        assertEquals(1, recipe.getMash().getVersion());
        assertEquals(22.0, recipe.getMash().getGrainTemperature());
        assertEquals(1, recipe.getMash().getMashSteps().size());
        assertNull(recipe.getMash().getNotes());
        assertNull(recipe.getMash().getTunTemperature());
        assertNull(recipe.getMash().getSpargeTemperature());
        assertNull(recipe.getMash().getPH());
        assertNull(recipe.getMash().getTunWeight());
        assertNull(recipe.getMash().getTunSpecificHeat());
        assertNull(recipe.getMash().getEquipmentAdjust());
        assertNull(recipe.getMash().getDisplayGrainTemperature());
        assertNull(recipe.getMash().getDisplayTunTemperature());
        assertNull(recipe.getMash().getDisplaySpargeTemperature());
        assertNull(recipe.getMash().getDisplayTunWeight());

        def mashStepIterator = recipe.getMash().getMashSteps().listIterator();
        def mashStepIteratorCurrent = mashStepIterator.next();

        assertNotNull(mashStepIteratorCurrent);

        assertEquals("Conversion Step, 68C ", mashStepIteratorCurrent.getName());
        assertEquals(1, mashStepIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion, mashStepIteratorCurrent.getType());
        assertEquals(10.0, mashStepIteratorCurrent.getInfuseAmount());
        assertEquals(68.0, mashStepIteratorCurrent.getStepTemperature());
        assertEquals(60.0, mashStepIteratorCurrent.getStepTime());
        assertNull(mashStepIteratorCurrent.getRampTime());
        assertNull(mashStepIteratorCurrent.getEndTemperature());
        assertNull(mashStepIteratorCurrent.getDescription());
        assertNull(mashStepIteratorCurrent.getWaterGrainRatio());
        assertNull(mashStepIteratorCurrent.getDecoctionAmount());
        assertNull(mashStepIteratorCurrent.getInfuseTemperature());
        assertNull(mashStepIteratorCurrent.getDisplayStepTemperature());
        assertNull(mashStepIteratorCurrent.getDisplayInfuseAmount());
    }
}
