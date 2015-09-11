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
import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.enums.RecipeType
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.Fermentable
import com.grandpasbrewing.beerxml.version1.objects.Hop
import com.grandpasbrewing.beerxml.version1.objects.Misc
import com.grandpasbrewing.beerxml.version1.objects.Recipe
import com.grandpasbrewing.beerxml.version1.objects.RecipeCollection
import com.grandpasbrewing.beerxml.version1.objects.Yeast
import com.grandpasbrewing.objectmodel.MiscellaneousItem
import com.grandpasbrewing.objectmodel.enums.MiscellaneousItemUse

class RecipeCollectionConverterTest extends GroovyTestCase {
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

    private RecipeCollectionConverter _recipeCollectionConverter;

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

        _recipeCollectionConverter = new RecipeCollectionConverter(_recipeConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.RecipeCollection recipeCollection = _recipeCollectionConverter.toObjectModel(null);

        assertNull(recipeCollection);
    }

    void testToObjectModelRecipeCollection() {
        RecipeCollection beerXmlObjectRecipeCollection = new RecipeCollection();

        ArrayList<Recipe> recipes = new ArrayList<Recipe>();

        Recipe recipe = new Recipe();

        recipe.setName("Kentucky Bourbon Barrel Ale Clone");
        recipe.setType(RecipeType.PartialMash);
        recipe.setBrewer("Sunporch Brewery");
        recipe.setBatchSize(18.9270589);
        recipe.setBoilSize(22.71247068);
        recipe.setBoilTime(60);
        recipe.setEfficiency(75.0);

        ArrayList<Fermentable> fermentables = new ArrayList<Fermentable>();

        Fermentable fermentable1 = new Fermentable();

        fermentable1.setName("Wheat Malt, White");
        fermentable1.setPlaceOfOrigin(null);
        fermentable1.setType(FermentableType.Adjunct);
        fermentable1.setYield( 84.21507233858777);
        fermentable1.setAmount(0.34019387292375136);
        fermentable1.setDisplayAmount("0.74999910806205 lb");
        fermentable1.setPotential(1.039);
        fermentable1.setColor(2);
        fermentable1.setDisplayColor("2 SRM");
        fermentable1.setAddAfterBoil(null);
        fermentable1.setCoarseFineDiff(null);
        fermentable1.setMoisture(null);
        fermentable1.setDiastaticPower(null);
        fermentable1.setProtein(null);
        fermentable1.setMaximumInBatch(null);
        fermentable1.setRecommendMash(null);
        fermentable1.setIBUGallonsPerPound(null);
        fermentable1.setNotes(null);

        fermentables.add(fermentable1);

        Fermentable fermentable2 = new Fermentable();

        fermentable2.setName("Carapils® Malt");
        fermentable2.setPlaceOfOrigin( null);
        fermentable2.setType(FermentableType.Adjunct);
        fermentable2.setYield(73.41826819261497);
        fermentable2.setAmount(0.45359183056500185);
        fermentable2.setDisplayAmount("0.9999988107494 lb");
        fermentable2.setPotential(1.034);
        fermentable2.setColor(1);
        fermentable2.setDisplayColor("1 SRM");
        fermentable2.setAddAfterBoil(null);
        fermentable2.setCoarseFineDiff(null);
        fermentable2.setMoisture(null);
        fermentable2.setDiastaticPower(null);
        fermentable2.setProtein(null);
        fermentable2.setMaximumInBatch(null);
        fermentable2.setRecommendMash(null);
        fermentable2.setIBUGallonsPerPound(null);
        fermentable2.setNotes(null);

        fermentables.add(fermentable2);

        Fermentable fermentable3 = new Fermentable();

        fermentable3.setName("Simpon's Light Crystal");
        fermentable3.setPlaceOfOrigin(null);
        fermentable3.setType(FermentableType.Grain);
        fermentable3.setYield(73.41826819261497);
        fermentable3.setAmount(0.45359183056500185);
        fermentable3.setDisplayAmount("0.9999988107494 lb");
        fermentable3.setPotential(1.034);
        fermentable3.setColor(35);
        fermentable3.setDisplayColor("35 SRM");
        fermentable3.setAddAfterBoil(null);
        fermentable3.setCoarseFineDiff(null);
        fermentable3.setMoisture(null);
        fermentable3.setDiastaticPower(null);
        fermentable3.setProtein(null);
        fermentable3.setMaximumInBatch(null);
        fermentable3.setRecommendMash(null);
        fermentable3.setIBUGallonsPerPound(null);
        fermentable3.setNotes(null);

        fermentables.add(fermentable3);

        Fermentable fermentable4 = new Fermentable();

        fermentable4.setName("Cane/Beet Sugar (Dextrose)");
        fermentable4.setPlaceOfOrigin(null);
        fermentable4.setType(FermentableType.Sugar);
        fermentable4.setYield(99.33059814294968);
        fermentable4.setAmount(0.5669897882062522);
        fermentable4.setDisplayAmount("1.24999851343675 lb");
        fermentable4.setPotential(1.046);
        fermentable4.setColor(0);
        fermentable4.setDisplayColor("0 SRM");
        fermentable4.setAddAfterBoil(null);
        fermentable4.setCoarseFineDiff(null);
        fermentable4.setMoisture(null);
        fermentable4.setDiastaticPower( null);
        fermentable4.setProtein(null);
        fermentable4.setMaximumInBatch(null);
        fermentable4.setRecommendMash(null);
        fermentable4.setIBUGallonsPerPound(null);
        fermentable4.setNotes(null);

        fermentables.add(fermentable4);

        Fermentable fermentable5 = new Fermentable();

        fermentable5.setName("Pilsen Light DME");
        fermentable5.setPlaceOfOrigin(null);
        fermentable5.setType(FermentableType.DryExtract);
        fermentable5.setYield(95.01187648456056);
        fermentable5.setAmount(0.9071836611300037);
        fermentable5.setDisplayAmount("1.9999976214988 lb");
        fermentable5.setPotential(1.044);
        fermentable5.setColor(2);
        fermentable5.setDisplayColor("2 SRM");
        fermentable5.setAddAfterBoil(null);
        fermentable5.setCoarseFineDiff(null);
        fermentable5.setMoisture(null);
        fermentable5.setDiastaticPower(null);
        fermentable5.setProtein(null);
        fermentable5.setMaximumInBatch(null);
        fermentable5.setRecommendMash(null);
        fermentable5.setIBUGallonsPerPound(null);
        fermentable5.setNotes(null);

        fermentables.add(fermentable5);

        Fermentable fermentable6 = new Fermentable();

        fermentable6.setName("Pilsen Light DME");
        fermentable6.setPlaceOfOrigin(null);
        fermentable6.setType(FermentableType.DryExtract);
        fermentable6.setYield(95.01187648456056);
        fermentable6.setAmount(0.9071836611300037);
        fermentable6.setDisplayAmount("1.9999976214988 lb");
        fermentable6.setPotential(1.044);
        fermentable6.setColor(2);
        fermentable6.setDisplayColor("2 SRM");
        fermentable6.setAddAfterBoil(null);
        fermentable6.setCoarseFineDiff(null);
        fermentable6.setMoisture(null);
        fermentable6.setDiastaticPower(null);
        fermentable6.setProtein(null);
        fermentable6.setMaximumInBatch(null);
        fermentable6.setRecommendMash(null);
        fermentable6.setIBUGallonsPerPound(null);
        fermentable6.setNotes(null);

        fermentables.add(fermentable6);

        Fermentable fermentable7 = new Fermentable();

        fermentable7.setName("Pilsen Light DME");
        fermentable7.setPlaceOfOrigin(null);
        fermentable7.setType(FermentableType.DryExtract);
        fermentable7.setYield(95.01187648456056);
        fermentable7.setAmount(1.3607754916950054);
        fermentable7.setDisplayAmount("2.9999964322482 lb");
        fermentable7.setPotential(1.044);
        fermentable7.setColor(2);
        fermentable7.setDisplayColor("2 SRM");
        fermentable7.setAddAfterBoil(null);
        fermentable7.setCoarseFineDiff(null);
        fermentable7.setMoisture(null);
        fermentable7.setDiastaticPower(null);
        fermentable7.setProtein(null);
        fermentable7.setMaximumInBatch(null);
        fermentable7.setRecommendMash(null);
        fermentable7.setIBUGallonsPerPound(null);
        fermentable7.setNotes(null);

        fermentables.add(fermentable7);

        recipe.setFermentables(fermentables);

        ArrayList<Hop> hops = new ArrayList<Hop>();

        Hop hop1 = new Hop();

        hop1.setName("Fuggle");
        hop1.setPlaceOfOrigin("United States");
        hop1.setAlphaPercentage(4.0);
        hop1.setBetaPercentage(null);
        hop1.setAmount(0.028349530580924584);
        hop1.setDisplayAmount("1.00000107871125 oz");
        hop1.setUse(HopUse.Boil);
        hop1.setForm(HopForm.Leaf);
        hop1.setTime(5);
        hop1.setDisplayTime("5.0 min");
        hop1.setNotes(null);

        hops.add(hop1);

        Hop hop2 = new Hop();

        hop2.setName("Kent Golding");
        hop2.setPlaceOfOrigin("United Kingdom");
        hop2.setAlphaPercentage(4.7);
        hop2.setBetaPercentage(null);
        hop2.setAmount(0.028349530580924584);
        hop2.setDisplayAmount("1.00000107871125 oz");
        hop2.setUse(HopUse.Boil);
        hop2.setForm(HopForm.Leaf);
        hop2.setTime(60);
        hop2.setDisplayTime("60.0 min");
        hop2.setNotes(null);

        hops.add(hop2);

        recipe.setHops(hops);

        ArrayList<Yeast> yeasts = new ArrayList<Yeast>();

        Yeast yeast = new Yeast();

        yeast.setLaboratory("White Labs");
        yeast.setName("Dry English Ale Yeast");
        yeast.setType(YeastType.Ale);
        yeast.setForm(YeastForm.Liquid);
        yeast.setAttenuation(75.0);

        yeasts.add(yeast);

        recipe.setYeasts(yeasts);

        ArrayList<Misc> miscs = new ArrayList<Misc>();

        Misc misc1 = new Misc();

        misc1.setName("Priming Sugar");
        misc1.setUse(MiscUse.Bottle);
        misc1.setTime(0.0);
        misc1.setAmount(5.0);
        misc1.setAmountIsWeight(true);
        misc1.setNotes(null);
        misc1.setDisplayAmount("5.0 oz");
        misc1.setDisplayTime("0.0 days");

        miscs.add(misc1);

        Misc misc2 = new Misc();

        misc2.setName("Bourbon");
        misc2.setUse(MiscUse.Secondary);
        misc2.setTime(14.0);
        misc2.setAmount(9.0);
        misc2.setAmountIsWeight(true);
        misc2.setNotes(null);
        misc2.setDisplayAmount("9.0 oz");
        misc2.setDisplayTime("14.0 days");

        miscs.add(misc2);

        Misc misc3 = new Misc();

        misc3.setName("Oak Cubes, heavy char");
        misc3.setUse(MiscUse.Secondary);
        misc3.setTime(14.0);
        misc3.setAmount(3.0);
        misc3.setAmountIsWeight(true);
        misc3.setNotes(null);
        misc3.setDisplayAmount("3.0 oz");
        misc3.setDisplayTime("14.0 days");

        miscs.add(misc3);

        Misc misc4 = new Misc();

        misc4.setName("Whirlfloc Tablet");
        misc4.setUse(MiscUse.Boil);
        misc4.setTime(15.0);
        misc4.setAmount(1.0);
        misc4.setAmountIsWeight(false);
        misc4.setNotes("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.");
        misc4.setDisplayAmount("1.0 each");
        misc4.setDisplayTime("15.0 min");

        miscs.add(misc4);

        recipe.setMiscs(miscs);

        recipes.add(recipe);

        beerXmlObjectRecipeCollection.setRecipes(recipes);

        com.grandpasbrewing.objectmodel.RecipeCollection recipeCollection = _recipeCollectionConverter.toObjectModel(beerXmlObjectRecipeCollection);

        assertNotNull(recipeCollection);

        assertEquals(1, recipeCollection.getRecipes().size());

        def recipeIterator = recipeCollection.getRecipes().listIterator();
        def recipeIteratorCurrent = recipeIterator.next();

        assertNotNull(recipeIteratorCurrent);
        
        assertEquals("Kentucky Bourbon Barrel Ale Clone", recipeIteratorCurrent.getName());
        assertNull(recipeIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash, recipeIteratorCurrent.getType());
        assertNull(recipeIteratorCurrent.getStyle());
        assertNull(recipeIteratorCurrent.getEquipment());
        assertEquals("Sunporch Brewery", recipeIteratorCurrent.getBrewer());
        assertNull(recipeIteratorCurrent.getAssistantBrewer());
        assertEquals(18.9270589, recipeIteratorCurrent.getBatchSize());
        assertEquals(22.71247068, recipeIteratorCurrent.getBoilSize());
        assertEquals(60, recipeIteratorCurrent.getBoilTime());
        assertEquals(75.0, recipeIteratorCurrent.getEfficiency());
        assertEquals(2, recipeIteratorCurrent.getHops().size());
        assertEquals(7, recipeIteratorCurrent.getFermentables().size());
        assertEquals(4, recipeIteratorCurrent.getMiscs().size());
        assertEquals(1, recipeIteratorCurrent.getYeasts().size());
        assertNull(recipeIteratorCurrent.getWaters());
        assertNull(recipeIteratorCurrent.getMash());
        assertNull(recipeIteratorCurrent.getNotes());
        assertNull(recipeIteratorCurrent.getTasteNotes());
        assertNull(recipeIteratorCurrent.getRating());
        assertNull(recipeIteratorCurrent.getOriginalGravity());
        assertNull(recipeIteratorCurrent.getFinalGravity());
        assertNull(recipeIteratorCurrent.getFermentationStages());
        assertNull(recipeIteratorCurrent.getPrimaryAge());
        assertNull(recipeIteratorCurrent.getPrimaryTemperature());
        assertNull(recipeIteratorCurrent.getSecondaryAge());
        assertNull(recipeIteratorCurrent.getSecondaryTemperature());
        assertNull(recipeIteratorCurrent.getTertiaryAge());
        assertNull(recipeIteratorCurrent.getTertiaryTemperature());
        assertNull(recipeIteratorCurrent.getAge());
        assertNull(recipeIteratorCurrent.getAgeTemperature());
        assertNull(recipeIteratorCurrent.getDate());
        assertNull(recipeIteratorCurrent.getCarbonation());
        assertNull(recipeIteratorCurrent.getForcedCarbonation());
        assertNull(recipeIteratorCurrent.getPrimingSugarName());
        assertNull(recipeIteratorCurrent.getCarbonationTemperature());
        assertNull(recipeIteratorCurrent.getPrimingSugarEquivalent());
        assertNull(recipeIteratorCurrent.getKegPrimingFactor());
        assertNull(recipeIteratorCurrent.getEstimatedOriginalGravity());
        assertNull(recipeIteratorCurrent.getEstimatedFinalGravity());
        assertNull(recipeIteratorCurrent.getEstimatedColor());
        assertNull(recipeIteratorCurrent.getIBU());
        assertNull(recipeIteratorCurrent.getIBUMethod());
        assertNull(recipeIteratorCurrent.getEstimatedABV());
        assertNull(recipeIteratorCurrent.getABV());
        assertNull(recipeIteratorCurrent.getActualEfficiency());
        assertNull(recipeIteratorCurrent.getCalories());
        assertNull(recipeIteratorCurrent.getDisplayBatchSize());
        assertNull(recipeIteratorCurrent.getDisplayBoilSize());
        assertNull(recipeIteratorCurrent.getDisplayOriginalGravity());
        assertNull(recipeIteratorCurrent.getDisplayFinalGravity());
        assertNull(recipeIteratorCurrent.getDisplayPrimaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplaySecondaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplayTertiaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplayAgeTemperature());
        assertNull(recipeIteratorCurrent.getCarbonationUsed());
        assertNull(recipeIteratorCurrent.getDisplayCarbTemperature());

        def fermentableIterator = recipeIteratorCurrent.getFermentables().listIterator();
        def fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Wheat Malt, White", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct, fermentableIteratorCurrent.getType());
        assertEquals(0.34019387292375136, fermentableIteratorCurrent.getAmount());
        assertEquals(84.21507233858777, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.74999910806205 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.039, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Carapils® Malt", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct, fermentableIteratorCurrent.getType());
        assertEquals(0.45359183056500185, fermentableIteratorCurrent.getAmount());
        assertEquals(73.41826819261497, fermentableIteratorCurrent.getYield());
        assertEquals(1, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.9999988107494 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.034, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("1 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Simpon's Light Crystal", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentableIteratorCurrent.getType());
        assertEquals(0.45359183056500185, fermentableIteratorCurrent.getAmount());
        assertEquals(73.41826819261497, fermentableIteratorCurrent.getYield());
        assertEquals(35, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.9999988107494 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.034, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("35 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Cane/Beet Sugar (Dextrose)", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Sugar, fermentableIteratorCurrent.getType());
        assertEquals(0.5669897882062522, fermentableIteratorCurrent.getAmount());
        assertEquals(99.33059814294968, fermentableIteratorCurrent.getYield());
        assertEquals(0, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.24999851343675 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.046, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("0 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(0.9071836611300037, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.9999976214988 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(0.9071836611300037, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.9999976214988 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(1.3607754916950054, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("2.9999964322482 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        def hopIterator = recipeIteratorCurrent.getHops().listIterator();
        def hopIteratorCurrent = hopIterator.next();

        assertNotNull(hopIteratorCurrent);

        assertEquals("Fuggle", hopIteratorCurrent.getName());
        assertNull(hopIteratorCurrent.getVersion());
        assertEquals(4.0, hopIteratorCurrent.getAlphaPercentage());
        assertEquals(0.028349530580924584, hopIteratorCurrent.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Boil, hopIteratorCurrent.getUse());
        assertEquals(5, hopIteratorCurrent.getTime());
        assertNull(hopIteratorCurrent.getNotes());
        assertNull(hopIteratorCurrent.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf, hopIteratorCurrent.getForm());
        assertNull(hopIteratorCurrent.getBetaPercentage());
        assertNull(hopIteratorCurrent.getHopStabilityIndex());
        assertEquals("United States", hopIteratorCurrent.getPlaceOfOrigin());
        assertNull(hopIteratorCurrent.getSubstitutes());
        assertNull(hopIteratorCurrent.getHumuleneLevel());
        assertNull(hopIteratorCurrent.getCaryophylleneLevel());
        assertNull(hopIteratorCurrent.getCohumuloneLevel());
        assertNull(hopIteratorCurrent.getMyrceneLevel());
        assertEquals("1.00000107871125 oz", hopIteratorCurrent.getDisplayAmount());
        assertNull(hopIteratorCurrent.getInventory());
        assertEquals("5.0 min", hopIteratorCurrent.getDisplayTime());

        hopIteratorCurrent = hopIterator.next();

        assertNotNull(hopIteratorCurrent);

        assertEquals("Kent Golding", hopIteratorCurrent.getName());
        assertNull(hopIteratorCurrent.getVersion());
        assertEquals(4.7, hopIteratorCurrent.getAlphaPercentage());
        assertEquals(0.028349530580924584, hopIteratorCurrent.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Boil, hopIteratorCurrent.getUse());
        assertEquals(60, hopIteratorCurrent.getTime());
        assertNull(hopIteratorCurrent.getNotes());
        assertNull(hopIteratorCurrent.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf, hopIteratorCurrent.getForm());
        assertNull(hopIteratorCurrent.getBetaPercentage());
        assertNull(hopIteratorCurrent.getHopStabilityIndex());
        assertEquals("United Kingdom", hopIteratorCurrent.getPlaceOfOrigin());
        assertNull(hopIteratorCurrent.getSubstitutes());
        assertNull(hopIteratorCurrent.getHumuleneLevel());
        assertNull(hopIteratorCurrent.getCaryophylleneLevel());
        assertNull(hopIteratorCurrent.getCohumuloneLevel());
        assertNull(hopIteratorCurrent.getMyrceneLevel());
        assertEquals("1.00000107871125 oz", hopIteratorCurrent.getDisplayAmount());
        assertNull(hopIteratorCurrent.getInventory());
        assertEquals("60.0 min", hopIteratorCurrent.getDisplayTime());

        def yeastIterator = recipeIteratorCurrent.getYeasts().listIterator();
        def yeastIteratorCurrent = yeastIterator.next();

        assertNotNull(yeastIteratorCurrent);

        assertEquals("Dry English Ale Yeast", yeastIteratorCurrent.getName());
        assertNull(yeastIteratorCurrent.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Ale, yeastIteratorCurrent.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid, yeastIteratorCurrent.getForm());
        assertNull(yeastIteratorCurrent.getAmount());
        assertNull(yeastIteratorCurrent.getAmountIsWeight());
        assertEquals("White Labs", yeastIteratorCurrent.getLaboratory());
        assertNull(yeastIteratorCurrent.getManufacturerProductId());
        assertNull(yeastIteratorCurrent.getMinimumTemperature());
        assertNull(yeastIteratorCurrent.getMaximumTemperature());
        assertNull(yeastIteratorCurrent.getFlocculation());
        assertEquals(75.0, yeastIteratorCurrent.getAttenuation());
        assertNull(yeastIteratorCurrent.getNotes());
        assertNull(yeastIteratorCurrent.getBestFor());
        assertNull(yeastIteratorCurrent.getTimesCultured());
        assertNull(yeastIteratorCurrent.getMaximumReuse());
        assertNull(yeastIteratorCurrent.getAddToSecondary());
        assertNull(yeastIteratorCurrent.getDisplayAmount());
        assertNull(yeastIteratorCurrent.getDisplayMinimumTemperature());
        assertNull(yeastIteratorCurrent.getDisplayMaximumTemperature());
        assertNull(yeastIteratorCurrent.getInventory());
        assertNull(yeastIteratorCurrent.getCultureDate());

        def miscIterator = recipeIteratorCurrent.getMiscs().listIterator();
        def miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Priming Sugar", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscellaneousItemUse.Bottle, miscIteratorCurrent.getUse());
        assertEquals(0.0, miscIteratorCurrent.getTime());
        assertEquals(5.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("5.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("0.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Bourbon", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscellaneousItemUse.Secondary, miscIteratorCurrent.getUse());
        assertEquals(14.0, miscIteratorCurrent.getTime());
        assertEquals(9.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("9.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("14.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Oak Cubes, heavy char", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscellaneousItemUse.Secondary, miscIteratorCurrent.getUse());
        assertEquals(14.0, miscIteratorCurrent.getTime());
        assertEquals(3.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("3.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("14.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Whirlfloc Tablet", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscellaneousItemUse.Boil, miscIteratorCurrent.getUse());
        assertEquals(15.0, miscIteratorCurrent.getTime());
        assertEquals(1.0, miscIteratorCurrent.getAmount());
        assertEquals(false, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertEquals("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.", miscIteratorCurrent.getNotes());
        assertEquals("1.0 each", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("15.0 min", miscIteratorCurrent.getDisplayTime());
    }

    void testFromObjectModelNull() {
        RecipeCollection recipeCollection = _recipeCollectionConverter.fromObjectModel(null);

        assertNull(recipeCollection);
    }

    void testFromObjectModelRecipeCollection() {
        com.grandpasbrewing.objectmodel.RecipeCollection objectModelRecipeCollection = new com.grandpasbrewing.objectmodel.RecipeCollection();

        ArrayList<com.grandpasbrewing.objectmodel.Recipe> recipes = new ArrayList<com.grandpasbrewing.objectmodel.Recipe>();

        com.grandpasbrewing.objectmodel.Recipe recipe = new com.grandpasbrewing.objectmodel.Recipe();

        recipe.setName("Kentucky Bourbon Barrel Ale Clone");
        recipe.setType(com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash);
        recipe.setBrewer("Sunporch Brewery");
        recipe.setBatchSize(18.9270589);
        recipe.setBoilSize(22.71247068);
        recipe.setBoilTime(60);
        recipe.setEfficiency(75.0);

        ArrayList<com.grandpasbrewing.objectmodel.Fermentable> fermentables = new ArrayList<com.grandpasbrewing.objectmodel.Fermentable>();

        com.grandpasbrewing.objectmodel.Fermentable fermentable1 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable1.setName("Wheat Malt, White");
        fermentable1.setPlaceOfOrigin(null);
        fermentable1.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct);
        fermentable1.setYield( 84.21507233858777);
        fermentable1.setAmount(0.34019387292375136);
        fermentable1.setDisplayAmount("0.74999910806205 lb");
        fermentable1.setPotential(1.039);
        fermentable1.setColor(2);
        fermentable1.setDisplayColor("2 SRM");
        fermentable1.setAddAfterBoil(null);
        fermentable1.setCoarseFineDiff(null);
        fermentable1.setMoisture(null);
        fermentable1.setDiastaticPower(null);
        fermentable1.setProtein(null);
        fermentable1.setMaximumInBatch(null);
        fermentable1.setRecommendMash(null);
        fermentable1.setIBUGallonsPerPound(null);
        fermentable1.setNotes(null);

        fermentables.add(fermentable1);

        com.grandpasbrewing.objectmodel.Fermentable fermentable2 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable2.setName("Carapils® Malt");
        fermentable2.setPlaceOfOrigin( null);
        fermentable2.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Adjunct);
        fermentable2.setYield(73.41826819261497);
        fermentable2.setAmount(0.45359183056500185);
        fermentable2.setDisplayAmount("0.9999988107494 lb");
        fermentable2.setPotential(1.034);
        fermentable2.setColor(1);
        fermentable2.setDisplayColor("1 SRM");
        fermentable2.setAddAfterBoil(null);
        fermentable2.setCoarseFineDiff(null);
        fermentable2.setMoisture(null);
        fermentable2.setDiastaticPower(null);
        fermentable2.setProtein(null);
        fermentable2.setMaximumInBatch(null);
        fermentable2.setRecommendMash(null);
        fermentable2.setIBUGallonsPerPound(null);
        fermentable2.setNotes(null);

        fermentables.add(fermentable2);

        com.grandpasbrewing.objectmodel.Fermentable fermentable3 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable3.setName("Simpon's Light Crystal");
        fermentable3.setPlaceOfOrigin(null);
        fermentable3.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain);
        fermentable3.setYield(73.41826819261497);
        fermentable3.setAmount(0.45359183056500185);
        fermentable3.setDisplayAmount("0.9999988107494 lb");
        fermentable3.setPotential(1.034);
        fermentable3.setColor(35);
        fermentable3.setDisplayColor("35 SRM");
        fermentable3.setAddAfterBoil(null);
        fermentable3.setCoarseFineDiff(null);
        fermentable3.setMoisture(null);
        fermentable3.setDiastaticPower(null);
        fermentable3.setProtein(null);
        fermentable3.setMaximumInBatch(null);
        fermentable3.setRecommendMash(null);
        fermentable3.setIBUGallonsPerPound(null);
        fermentable3.setNotes(null);

        fermentables.add(fermentable3);

        com.grandpasbrewing.objectmodel.Fermentable fermentable4 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable4.setName("Cane/Beet Sugar (Dextrose)");
        fermentable4.setPlaceOfOrigin(null);
        fermentable4.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Sugar);
        fermentable4.setYield(99.33059814294968);
        fermentable4.setAmount(0.5669897882062522);
        fermentable4.setDisplayAmount("1.24999851343675 lb");
        fermentable4.setPotential(1.046);
        fermentable4.setColor(0);
        fermentable4.setDisplayColor("0 SRM");
        fermentable4.setAddAfterBoil(null);
        fermentable4.setCoarseFineDiff(null);
        fermentable4.setMoisture(null);
        fermentable4.setDiastaticPower( null);
        fermentable4.setProtein(null);
        fermentable4.setMaximumInBatch(null);
        fermentable4.setRecommendMash(null);
        fermentable4.setIBUGallonsPerPound(null);
        fermentable4.setNotes(null);

        fermentables.add(fermentable4);

        com.grandpasbrewing.objectmodel.Fermentable fermentable5 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable5.setName("Pilsen Light DME");
        fermentable5.setPlaceOfOrigin(null);
        fermentable5.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract);
        fermentable5.setYield(95.01187648456056);
        fermentable5.setAmount(0.9071836611300037);
        fermentable5.setDisplayAmount("1.9999976214988 lb");
        fermentable5.setPotential(1.044);
        fermentable5.setColor(2);
        fermentable5.setDisplayColor("2 SRM");
        fermentable5.setAddAfterBoil(null);
        fermentable5.setCoarseFineDiff(null);
        fermentable5.setMoisture(null);
        fermentable5.setDiastaticPower(null);
        fermentable5.setProtein(null);
        fermentable5.setMaximumInBatch(null);
        fermentable5.setRecommendMash(null);
        fermentable5.setIBUGallonsPerPound(null);
        fermentable5.setNotes(null);

        fermentables.add(fermentable5);

        com.grandpasbrewing.objectmodel.Fermentable fermentable6 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable6.setName("Pilsen Light DME");
        fermentable6.setPlaceOfOrigin(null);
        fermentable6.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract);
        fermentable6.setYield(95.01187648456056);
        fermentable6.setAmount(0.9071836611300037);
        fermentable6.setDisplayAmount("1.9999976214988 lb");
        fermentable6.setPotential(1.044);
        fermentable6.setColor(2);
        fermentable6.setDisplayColor("2 SRM");
        fermentable6.setAddAfterBoil(null);
        fermentable6.setCoarseFineDiff(null);
        fermentable6.setMoisture(null);
        fermentable6.setDiastaticPower(null);
        fermentable6.setProtein(null);
        fermentable6.setMaximumInBatch(null);
        fermentable6.setRecommendMash(null);
        fermentable6.setIBUGallonsPerPound(null);
        fermentable6.setNotes(null);

        fermentables.add(fermentable6);

        com.grandpasbrewing.objectmodel.Fermentable fermentable7 = new com.grandpasbrewing.objectmodel.Fermentable();

        fermentable7.setName("Pilsen Light DME");
        fermentable7.setPlaceOfOrigin(null);
        fermentable7.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.DryExtract);
        fermentable7.setYield(95.01187648456056);
        fermentable7.setAmount(1.3607754916950054);
        fermentable7.setDisplayAmount("2.9999964322482 lb");
        fermentable7.setPotential(1.044);
        fermentable7.setColor(2);
        fermentable7.setDisplayColor("2 SRM");
        fermentable7.setAddAfterBoil(null);
        fermentable7.setCoarseFineDiff(null);
        fermentable7.setMoisture(null);
        fermentable7.setDiastaticPower(null);
        fermentable7.setProtein(null);
        fermentable7.setMaximumInBatch(null);
        fermentable7.setRecommendMash(null);
        fermentable7.setIBUGallonsPerPound(null);
        fermentable7.setNotes(null);

        fermentables.add(fermentable7);

        recipe.setFermentables(fermentables);

        ArrayList<com.grandpasbrewing.objectmodel.Hop> hops = new ArrayList<com.grandpasbrewing.objectmodel.Hop>();

        com.grandpasbrewing.objectmodel.Hop hop1 = new com.grandpasbrewing.objectmodel.Hop();

        hop1.setName("Fuggle");
        hop1.setPlaceOfOrigin("United States");
        hop1.setAlphaPercentage(4.0);
        hop1.setBetaPercentage(null);
        hop1.setAmount(0.028349530580924584);
        hop1.setDisplayAmount("1.00000107871125 oz");
        hop1.setUse(com.grandpasbrewing.objectmodel.enums.HopUse.Boil);
        hop1.setForm(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf);
        hop1.setTime(5);
        hop1.setDisplayTime("5.0 min");
        hop1.setNotes(null);

        hops.add(hop1);

        com.grandpasbrewing.objectmodel.Hop hop2 = new com.grandpasbrewing.objectmodel.Hop();

        hop2.setName("Kent Golding");
        hop2.setPlaceOfOrigin("United Kingdom");
        hop2.setAlphaPercentage(4.7);
        hop2.setBetaPercentage(null);
        hop2.setAmount(0.028349530580924584);
        hop2.setDisplayAmount("1.00000107871125 oz");
        hop2.setUse(com.grandpasbrewing.objectmodel.enums.HopUse.Boil);
        hop2.setForm(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf);
        hop2.setTime(60);
        hop2.setDisplayTime("60.0 min");
        hop2.setNotes(null);

        hops.add(hop2);

        recipe.setHops(hops);

        ArrayList<com.grandpasbrewing.objectmodel.Yeast> yeasts = new ArrayList<com.grandpasbrewing.objectmodel.Yeast>();

        com.grandpasbrewing.objectmodel.Yeast yeast = new com.grandpasbrewing.objectmodel.Yeast();

        yeast.setLaboratory("White Labs");
        yeast.setName("Dry English Ale Yeast");
        yeast.setType(com.grandpasbrewing.objectmodel.enums.YeastType.Ale);
        yeast.setForm(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid);
        yeast.setAttenuation(75.0);

        yeasts.add(yeast);

        recipe.setYeasts(yeasts);

        ArrayList<MiscellaneousItem> miscs = new ArrayList<MiscellaneousItem>();

        MiscellaneousItem misc1 = new MiscellaneousItem();

        misc1.setName("Priming Sugar");
        misc1.setUse(MiscellaneousItemUse.Bottle);
        misc1.setTime(0.0);
        misc1.setAmount(5.0);
        misc1.setAmountIsWeight(true);
        misc1.setNotes(null);
        misc1.setDisplayAmount("5.0 oz");
        misc1.setDisplayTime("0.0 days");

        miscs.add(misc1);

        MiscellaneousItem misc2 = new MiscellaneousItem();

        misc2.setName("Bourbon");
        misc2.setUse(MiscellaneousItemUse.Secondary);
        misc2.setTime(14.0);
        misc2.setAmount(9.0);
        misc2.setAmountIsWeight(true);
        misc2.setNotes(null);
        misc2.setDisplayAmount("9.0 oz");
        misc2.setDisplayTime("14.0 days");

        miscs.add(misc2);

        MiscellaneousItem misc3 = new MiscellaneousItem();

        misc3.setName("Oak Cubes, heavy char");
        misc3.setUse(MiscellaneousItemUse.Secondary);
        misc3.setTime(14.0);
        misc3.setAmount(3.0);
        misc3.setAmountIsWeight(true);
        misc3.setNotes(null);
        misc3.setDisplayAmount("3.0 oz");
        misc3.setDisplayTime("14.0 days");

        miscs.add(misc3);

        MiscellaneousItem misc4 = new MiscellaneousItem();

        misc4.setName("Whirlfloc Tablet");
        misc4.setUse(MiscellaneousItemUse.Boil);
        misc4.setTime(15.0);
        misc4.setAmount(1.0);
        misc4.setAmountIsWeight(false);
        misc4.setNotes("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.");
        misc4.setDisplayAmount("1.0 each");
        misc4.setDisplayTime("15.0 min");

        miscs.add(misc4);

        recipe.setMiscs(miscs);

        recipes.add(recipe);

        objectModelRecipeCollection.setRecipes(recipes);

        RecipeCollection recipeCollection = _recipeCollectionConverter.fromObjectModel(objectModelRecipeCollection);

        assertNotNull(recipeCollection);

        assertEquals(1, recipeCollection.getRecipes().size());

        def recipeIterator = recipeCollection.getRecipes().listIterator();
        def recipeIteratorCurrent = recipeIterator.next();

        assertNotNull(recipeIteratorCurrent);

        assertEquals("Kentucky Bourbon Barrel Ale Clone", recipeIteratorCurrent.getName());
        assertNull(recipeIteratorCurrent.getVersion());
        assertEquals(RecipeType.PartialMash, recipeIteratorCurrent.getType());
        assertNull(recipeIteratorCurrent.getStyle());
        assertNull(recipeIteratorCurrent.getEquipment());
        assertEquals("Sunporch Brewery", recipeIteratorCurrent.getBrewer());
        assertNull(recipeIteratorCurrent.getAssistantBrewer());
        assertEquals(18.9270589, recipeIteratorCurrent.getBatchSize());
        assertEquals(22.71247068, recipeIteratorCurrent.getBoilSize());
        assertEquals(60, recipeIteratorCurrent.getBoilTime());
        assertEquals(75.0, recipeIteratorCurrent.getEfficiency());
        assertEquals(2, recipeIteratorCurrent.getHops().size());
        assertEquals(7, recipeIteratorCurrent.getFermentables().size());
        assertEquals(4, recipeIteratorCurrent.getMiscs().size());
        assertEquals(1, recipeIteratorCurrent.getYeasts().size());
        assertNull(recipeIteratorCurrent.getWaters());
        assertNull(recipeIteratorCurrent.getMash());
        assertNull(recipeIteratorCurrent.getNotes());
        assertNull(recipeIteratorCurrent.getTasteNotes());
        assertNull(recipeIteratorCurrent.getRating());
        assertNull(recipeIteratorCurrent.getOriginalGravity());
        assertNull(recipeIteratorCurrent.getFinalGravity());
        assertNull(recipeIteratorCurrent.getFermentationStages());
        assertNull(recipeIteratorCurrent.getPrimaryAge());
        assertNull(recipeIteratorCurrent.getPrimaryTemperature());
        assertNull(recipeIteratorCurrent.getSecondaryAge());
        assertNull(recipeIteratorCurrent.getSecondaryTemperature());
        assertNull(recipeIteratorCurrent.getTertiaryAge());
        assertNull(recipeIteratorCurrent.getTertiaryTemperature());
        assertNull(recipeIteratorCurrent.getAge());
        assertNull(recipeIteratorCurrent.getAgeTemperature());
        assertNull(recipeIteratorCurrent.getDate());
        assertNull(recipeIteratorCurrent.getCarbonation());
        assertNull(recipeIteratorCurrent.getForcedCarbonation());
        assertNull(recipeIteratorCurrent.getPrimingSugarName());
        assertNull(recipeIteratorCurrent.getCarbonationTemperature());
        assertNull(recipeIteratorCurrent.getPrimingSugarEquivalent());
        assertNull(recipeIteratorCurrent.getKegPrimingFactor());
        assertNull(recipeIteratorCurrent.getEstimatedOriginalGravity());
        assertNull(recipeIteratorCurrent.getEstimatedFinalGravity());
        assertNull(recipeIteratorCurrent.getEstimatedColor());
        assertNull(recipeIteratorCurrent.getIBU());
        assertNull(recipeIteratorCurrent.getIBUMethod());
        assertNull(recipeIteratorCurrent.getEstimatedABV());
        assertNull(recipeIteratorCurrent.getABV());
        assertNull(recipeIteratorCurrent.getActualEfficiency());
        assertNull(recipeIteratorCurrent.getCalories());
        assertNull(recipeIteratorCurrent.getDisplayBatchSize());
        assertNull(recipeIteratorCurrent.getDisplayBoilSize());
        assertNull(recipeIteratorCurrent.getDisplayOriginalGravity());
        assertNull(recipeIteratorCurrent.getDisplayFinalGravity());
        assertNull(recipeIteratorCurrent.getDisplayPrimaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplaySecondaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplayTertiaryTemperature());
        assertNull(recipeIteratorCurrent.getDisplayAgeTemperature());
        assertNull(recipeIteratorCurrent.getCarbonationUsed());
        assertNull(recipeIteratorCurrent.getDisplayCarbTemperature());

        def fermentableIterator = recipeIteratorCurrent.getFermentables().listIterator();
        def fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Wheat Malt, White", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Adjunct, fermentableIteratorCurrent.getType());
        assertEquals(0.34019387292375136, fermentableIteratorCurrent.getAmount());
        assertEquals(84.21507233858777, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.74999910806205 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.039, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Carapils® Malt", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Adjunct, fermentableIteratorCurrent.getType());
        assertEquals(0.45359183056500185, fermentableIteratorCurrent.getAmount());
        assertEquals(73.41826819261497, fermentableIteratorCurrent.getYield());
        assertEquals(1, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.9999988107494 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.034, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("1 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Simpon's Light Crystal", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Grain, fermentableIteratorCurrent.getType());
        assertEquals(0.45359183056500185, fermentableIteratorCurrent.getAmount());
        assertEquals(73.41826819261497, fermentableIteratorCurrent.getYield());
        assertEquals(35, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("0.9999988107494 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.034, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("35 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Cane/Beet Sugar (Dextrose)", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Sugar, fermentableIteratorCurrent.getType());
        assertEquals(0.5669897882062522, fermentableIteratorCurrent.getAmount());
        assertEquals(99.33059814294968, fermentableIteratorCurrent.getYield());
        assertEquals(0, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.24999851343675 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.046, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("0 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(0.9071836611300037, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.9999976214988 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(0.9071836611300037, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("1.9999976214988 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        fermentableIteratorCurrent = fermentableIterator.next();

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Pilsen Light DME", fermentableIteratorCurrent.getName());
        assertNull(fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.DryExtract, fermentableIteratorCurrent.getType());
        assertEquals(1.3607754916950054, fermentableIteratorCurrent.getAmount());
        assertEquals(95.01187648456056, fermentableIteratorCurrent.getYield());
        assertEquals(2, fermentableIteratorCurrent.getColor());
        assertNull(fermentableIteratorCurrent.getAddAfterBoil());
        assertNull(fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertNull(fermentableIteratorCurrent.getNotes());
        assertNull(fermentableIteratorCurrent.getCoarseFineDiff());
        assertNull(fermentableIteratorCurrent.getMoisture());
        assertNull(fermentableIteratorCurrent.getDiastaticPower());
        assertNull(fermentableIteratorCurrent.getProtein());
        assertNull(fermentableIteratorCurrent.getMaximumInBatch());
        assertNull(fermentableIteratorCurrent.getRecommendMash());
        assertNull(fermentableIteratorCurrent.getIBUGallonsPerPound());
        assertEquals("2.9999964322482 lb", fermentableIteratorCurrent.getDisplayAmount());
        assertEquals(1.044, fermentableIteratorCurrent.getPotential());
        assertNull(fermentableIteratorCurrent.getInventory());
        assertEquals("2 SRM", fermentableIteratorCurrent.getDisplayColor());

        def hopIterator = recipeIteratorCurrent.getHops().listIterator();
        def hopIteratorCurrent = hopIterator.next();

        assertNotNull(hopIteratorCurrent);

        assertEquals("Fuggle", hopIteratorCurrent.getName());
        assertNull(hopIteratorCurrent.getVersion());
        assertEquals(4.0, hopIteratorCurrent.getAlphaPercentage());
        assertEquals(0.028349530580924584, hopIteratorCurrent.getAmount());
        assertEquals(HopUse.Boil, hopIteratorCurrent.getUse());
        assertEquals(5, hopIteratorCurrent.getTime());
        assertNull(hopIteratorCurrent.getNotes());
        assertNull(hopIteratorCurrent.getType());
        assertEquals(HopForm.Leaf, hopIteratorCurrent.getForm());
        assertNull(hopIteratorCurrent.getBetaPercentage());
        assertNull(hopIteratorCurrent.getHopStabilityIndex());
        assertEquals("United States", hopIteratorCurrent.getPlaceOfOrigin());
        assertNull(hopIteratorCurrent.getSubstitutes());
        assertNull(hopIteratorCurrent.getHumuleneLevel());
        assertNull(hopIteratorCurrent.getCaryophylleneLevel());
        assertNull(hopIteratorCurrent.getCohumuloneLevel());
        assertNull(hopIteratorCurrent.getMyrceneLevel());
        assertEquals("1.00000107871125 oz", hopIteratorCurrent.getDisplayAmount());
        assertNull(hopIteratorCurrent.getInventory());
        assertEquals("5.0 min", hopIteratorCurrent.getDisplayTime());

        hopIteratorCurrent = hopIterator.next();

        assertNotNull(hopIteratorCurrent);

        assertEquals("Kent Golding", hopIteratorCurrent.getName());
        assertNull(hopIteratorCurrent.getVersion());
        assertEquals(4.7, hopIteratorCurrent.getAlphaPercentage());
        assertEquals(0.028349530580924584, hopIteratorCurrent.getAmount());
        assertEquals(HopUse.Boil, hopIteratorCurrent.getUse());
        assertEquals(60, hopIteratorCurrent.getTime());
        assertNull(hopIteratorCurrent.getNotes());
        assertNull(hopIteratorCurrent.getType());
        assertEquals(HopForm.Leaf, hopIteratorCurrent.getForm());
        assertNull(hopIteratorCurrent.getBetaPercentage());
        assertNull(hopIteratorCurrent.getHopStabilityIndex());
        assertEquals("United Kingdom", hopIteratorCurrent.getPlaceOfOrigin());
        assertNull(hopIteratorCurrent.getSubstitutes());
        assertNull(hopIteratorCurrent.getHumuleneLevel());
        assertNull(hopIteratorCurrent.getCaryophylleneLevel());
        assertNull(hopIteratorCurrent.getCohumuloneLevel());
        assertNull(hopIteratorCurrent.getMyrceneLevel());
        assertEquals("1.00000107871125 oz", hopIteratorCurrent.getDisplayAmount());
        assertNull(hopIteratorCurrent.getInventory());
        assertEquals("60.0 min", hopIteratorCurrent.getDisplayTime());

        def yeastIterator = recipeIteratorCurrent.getYeasts().listIterator();
        def yeastIteratorCurrent = yeastIterator.next();

        assertNotNull(yeastIteratorCurrent);

        assertEquals("Dry English Ale Yeast", yeastIteratorCurrent.getName());
        assertNull(yeastIteratorCurrent.getVersion());
        assertEquals(YeastType.Ale, yeastIteratorCurrent.getType());
        assertEquals(YeastForm.Liquid, yeastIteratorCurrent.getForm());
        assertNull(yeastIteratorCurrent.getAmount());
        assertNull(yeastIteratorCurrent.getAmountIsWeight());
        assertEquals("White Labs", yeastIteratorCurrent.getLaboratory());
        assertNull(yeastIteratorCurrent.getManufacturerProductId());
        assertNull(yeastIteratorCurrent.getMinimumTemperature());
        assertNull(yeastIteratorCurrent.getMaximumTemperature());
        assertNull(yeastIteratorCurrent.getFlocculation());
        assertEquals(75.0, yeastIteratorCurrent.getAttenuation());
        assertNull(yeastIteratorCurrent.getNotes());
        assertNull(yeastIteratorCurrent.getBestFor());
        assertNull(yeastIteratorCurrent.getTimesCultured());
        assertNull(yeastIteratorCurrent.getMaximumReuse());
        assertNull(yeastIteratorCurrent.getAddToSecondary());
        assertNull(yeastIteratorCurrent.getDisplayAmount());
        assertNull(yeastIteratorCurrent.getDisplayMinimumTemperature());
        assertNull(yeastIteratorCurrent.getDisplayMaximumTemperature());
        assertNull(yeastIteratorCurrent.getInventory());
        assertNull(yeastIteratorCurrent.getCultureDate());

        def miscIterator = recipeIteratorCurrent.getMiscs().listIterator();
        def miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Priming Sugar", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscUse.Bottle, miscIteratorCurrent.getUse());
        assertEquals(0.0, miscIteratorCurrent.getTime());
        assertEquals(5.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("5.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("0.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Bourbon", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscUse.Secondary, miscIteratorCurrent.getUse());
        assertEquals(14.0, miscIteratorCurrent.getTime());
        assertEquals(9.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("9.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("14.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Oak Cubes, heavy char", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscUse.Secondary, miscIteratorCurrent.getUse());
        assertEquals(14.0, miscIteratorCurrent.getTime());
        assertEquals(3.0, miscIteratorCurrent.getAmount());
        assertEquals(true, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertNull(miscIteratorCurrent.getNotes());
        assertEquals("3.0 oz", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("14.0 days", miscIteratorCurrent.getDisplayTime());

        miscIteratorCurrent = miscIterator.next();

        assertNotNull(miscIteratorCurrent);

        assertEquals("Whirlfloc Tablet", miscIteratorCurrent.getName());
        assertNull(miscIteratorCurrent.getVersion());
        assertNull(miscIteratorCurrent.getType());
        assertEquals(MiscUse.Boil, miscIteratorCurrent.getUse());
        assertEquals(15.0, miscIteratorCurrent.getTime());
        assertEquals(1.0, miscIteratorCurrent.getAmount());
        assertEquals(false, miscIteratorCurrent.getAmountIsWeight());
        assertNull(miscIteratorCurrent.getUseFor());
        assertEquals("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.", miscIteratorCurrent.getNotes());
        assertEquals("1.0 each", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("15.0 min", miscIteratorCurrent.getDisplayTime());
    }
}
