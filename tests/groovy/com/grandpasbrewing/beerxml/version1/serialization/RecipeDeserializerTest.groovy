package com.grandpasbrewing.beerxml.version1.serialization

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
import com.grandpasbrewing.beerxml.version1.objects.Recipe

class RecipeDeserializerTest extends GroovyTestCase {
    private Deserializer _deserializer;
    private String _equipmentXml;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<Recipe>();

        _equipmentXml = "<RECIPE>" +
                "<NAME>Dry Stout</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>All Grain</TYPE>" +
                "<BREWER>Brad Smith</BREWER>" +
                "<BATCH_SIZE>18.93</BATCH_SIZE>" +
                "<BOIL_SIZE>20.82</BOIL_SIZE>" +
                "<BOIL_TIME>60.0</BOIL_TIME>" +
                "<EFFICIENCY>72.0</EFFICIENCY>" +
                "<TASTE_NOTES>Nice dry Irish stout with a warm body but low starting gravity much like the famous drafts.</TASTE_NOTES>" +
                "<RATING>41</RATING>" +
                "<DATE>3 Jan 04</DATE>" +
                "<OG>1.036</OG>" +
                "<FG>1.012</FG>" +
                "<CARBONATION>2.1</CARBONATION>" +
                "<CARBONATION_USED>Kegged</CARBONATION_USED>" +
                "<AGE>24.0</AGE>" +
                "<AGE_TEMP>17.0</AGE_TEMP>" +
                "<FERMENTATION_STAGES>2</FERMENTATION_STAGES>" +
                "<STYLE>" +
                "<NAME>Dry Stout</NAME>" +
                "<CATEGORY>Stout</CATEGORY>" +
                "<CATEGORY_NUMBER>16</CATEGORY_NUMBER>" +
                "<STYLE_LETTER>A</STYLE_LETTER>" +
                "<STYLE_GUIDE>BJCP</STYLE_GUIDE>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Ale</TYPE>" +
                "<OG_MIN>1.035</OG_MIN>" +
                "<OG_MAX>1.050</OG_MAX>" +
                "<FG_MIN>1.007</FG_MIN>" +
                "<FG_MAX>1.011</FG_MAX>" +
                "<IBU_MIN>30.0</IBU_MIN>" +
                "<IBU_MAX>50.0</IBU_MAX>" +
                "<COLOR_MIN>35.0</COLOR_MIN>" +
                "<COLOR_MAX>200.0</COLOR_MAX>" +
                "<ABV_MIN>3.2</ABV_MIN>" +
                "<ABV_MAX>5.5</ABV_MAX>" +
                "<CARB_MIN>1.6</CARB_MIN>" +
                "<CARB_MAX>2.1</CARB_MAX>" +
                "<NOTES>Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer. Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.</NOTES>" +
                "</STYLE>" +
                "<HOPS>" +
                "<HOP>" +
                "<NAME>Goldings,  East Kent </NAME>" +
                "<VERSION>1</VERSION>" +
                "<ALPHA>5.0</ALPHA>" +
                "<AMOUNT>0.0638</AMOUNT>" +
                "<USE>Boil</USE>" +
                "<TIME>60.0</TIME>" +
                "<NOTES>Great all purpose UK hop for ales, stouts, porters</NOTES>" +
                "</HOP>" +
                "</HOPS>" +
                "<FERMENTABLES>" +
                "<FERMENTABLE>" +
                "<NAME>Pale Malt (2 row) UK</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>2.27</AMOUNT>" +
                "<TYPE>Grain</TYPE>" +
                "<YIELD>78.0</YIELD>" +
                "<COLOR>3.0</COLOR>" +
                "<ORIGIN> United Kingdom </ORIGIN>" +
                "<SUPPLIER>Fussybrewer Malting</SUPPLIER>" +
                "<NOTES>All purpose base malt for English styles</NOTES>" +
                "<COARSE_FINE_DIFF>1.5</COARSE_FINE_DIFF>" +
                "<MOISTURE>4.0</MOISTURE>" +
                "<DIASTATIC_POWER>45.0</DIASTATIC_POWER>" +
                "<PROTEIN>10.2</PROTEIN>" +
                "<MAX_IN_BATCH>100.0</MAX_IN_BATCH>" +
                "</FERMENTABLE>" +
                "<FERMENTABLE>" +
                "<NAME>Barley, Flaked</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>0.91</AMOUNT>" +
                "<TYPE>Grain</TYPE>" +
                "<YIELD>70.0</YIELD>" +
                "<COLOR>2.0</COLOR>" +
                "<ORIGIN> United Kingdom </ORIGIN>" +
                "<SUPPLIER>Fussybrewer Malting</SUPPLIER>" +
                "<NOTES>Adds body to porters and stouts, must be mashed</NOTES>" +
                "<COARSE_FINE_DIFF>1.5</COARSE_FINE_DIFF>" +
                "<MOISTURE>9.0</MOISTURE>" +
                "<DIASTATIC_POWER>0.0</DIASTATIC_POWER>" +
                "<PROTEIN>13.2</PROTEIN>" +
                "<MAX_IN_BATCH>20.0</MAX_IN_BATCH>" +
                "<RECOMMEND_MASH>TRUE</RECOMMEND_MASH>" +
                "</FERMENTABLE>" +
                "<FERMENTABLE>" +
                "<NAME>Black Barley</NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>0.45</AMOUNT>" +
                "<TYPE>Grain</TYPE>" +
                "<YIELD>78.0</YIELD>" +
                "<COLOR>500.0</COLOR>" +
                "<ORIGIN> United Kingdom </ORIGIN>" +
                "<SUPPLIER>Fussybrewer Malting</SUPPLIER>" +
                "<NOTES>Unmalted roasted barley for stouts, porters</NOTES>" +
                "<COARSE_FINE_DIFF>1.5</COARSE_FINE_DIFF>" +
                "<MOISTURE>5.0</MOISTURE>" +
                "<DIASTATIC_POWER>0.0</DIASTATIC_POWER>" +
                "<PROTEIN>13.2</PROTEIN>" +
                "<MAX_IN_BATCH>10.0</MAX_IN_BATCH>" +
                "</FERMENTABLE>" +
                "</FERMENTABLES>" +
                "<MISCS>" +
                "<MISC>" +
                "<NAME>Irish Moss</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Fining</TYPE>" +
                "<USE>Boil</USE>" +
                "<TIME>15.0</TIME>" +
                "<AMOUNT>0.010</AMOUNT>" +
                "<NOTES>Used as a clarifying agent during the last few minutes of the boil</NOTES>" +
                "</MISC>" +
                "</MISCS>" +
                "<WATERS>" +
                "<WATER>" +
                "<NAME> Burton on Trent, UK </NAME>" +
                "<VERSION>1</VERSION>" +
                "<AMOUNT>20.0</AMOUNT>" +
                "<CALCIUM>295.0</CALCIUM>" +
                "<MAGNESIUM>45.0</MAGNESIUM>" +
                "<SODIUM>55.0</SODIUM>" +
                "<SULFATE>725.0</SULFATE>" +
                "<CHLORIDE>25.0</CHLORIDE>" +
                "<BICARBONATE>300.0</BICARBONATE>" +
                "<PH>8.0</PH>" +
                "<NOTES> Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale " +
                "</NOTES>" +
                "</WATER>" +
                "</WATERS>" +
                "<YEASTS>" +
                "<YEAST>" +
                "<NAME>Irish Ale</NAME>" +
                "<TYPE>Ale</TYPE>" +
                "<VERSION>1</VERSION>" +
                "<FORM>Liquid</FORM>" +
                "<AMOUNT>0.250</AMOUNT>" +
                "<LABORATORY>Wyeast Labs</LABORATORY>" +
                "<PRODUCT_ID>1084</PRODUCT_ID>" +
                "<MIN_TEMPERATURE>16.7</MIN_TEMPERATURE>" +
                "<MAX_TEMPERATURE>22.2</MAX_TEMPERATURE>" +
                "<ATTENUATION>73.0</ATTENUATION>" +
                "<NOTES>Dry, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor. </NOTES>" +
                "<BEST_FOR>Irish Dry Stouts</BEST_FOR>" +
                "<FLOCCULATION>Medium</FLOCCULATION>" +
                "</YEAST>" +
                "</YEASTS>" +
                "<MASH>" +
                "<NAME>Single Step Infusion, 68 C</NAME>" +
                "<VERSION>1</VERSION>" +
                "<GRAIN_TEMP>22.0</GRAIN_TEMP>" +
                "<MASH_STEPS>" +
                "<MASH_STEP>" +
                "<NAME>Conversion Step, 68C </NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Infusion</TYPE>" +
                "<STEP_TEMP>68.0</STEP_TEMP>" +
                "<STEP_TIME>60.0</STEP_TIME>" +
                "<INFUSE_AMOUNT>10.0</INFUSE_AMOUNT>" +
                "</MASH_STEP>" +
                "</MASH_STEPS>" +
                "</MASH>" +
                "</RECIPE>";
    }

    void testToBeerXml() {
        Recipe recipe = (Recipe) _deserializer.toBeerXml(_equipmentXml, Recipe.class);

        assertEquals("Dry Stout", recipe.getName());
        assertEquals(1, recipe.getVersion());
        assertEquals(RecipeType.AllGrain, recipe.getType());
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
        assertEquals(StyleType.Ale, recipe.getStyle().getType());
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
        assertEquals(HopUse.Boil, hopIteratorCurrent.getUse());
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
        assertEquals(FermentableType.Grain, fermentableIteratorCurrent.getType());
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

        fermentableIteratorCurrent = fermentableIterator.next()

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Barley, Flaked", fermentableIteratorCurrent.getName());
        assertEquals(1, fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Grain, fermentableIteratorCurrent.getType());
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

        fermentableIteratorCurrent = fermentableIterator.next()

        assertNotNull(fermentableIteratorCurrent);

        assertEquals("Black Barley", fermentableIteratorCurrent.getName());
        assertEquals(1, fermentableIteratorCurrent.getVersion());
        assertEquals(FermentableType.Grain, fermentableIteratorCurrent.getType());
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
        assertEquals(MiscType.Fining, miscIteratorCurrent.getType());
        assertEquals(MiscUse.Boil, miscIteratorCurrent.getUse());
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
        assertEquals(" Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale ", waterIteratorCurrent.getNotes());
        assertNull(waterIteratorCurrent.getDisplayAmount());

        def yeastIterator = recipe.getYeasts().listIterator();
        def yeastIteratorCurrent = yeastIterator.next();

        assertNotNull(yeastIteratorCurrent);

        assertEquals("Irish Ale", yeastIteratorCurrent.getName());
        assertEquals(1, yeastIteratorCurrent.getVersion());
        assertEquals(YeastType.Ale, yeastIteratorCurrent.getType());
        assertEquals(YeastForm.Liquid, yeastIteratorCurrent.getForm());
        assertEquals(0.250, yeastIteratorCurrent.getAmount());
        assertNull(yeastIteratorCurrent.getAmountIsWeight());
        assertEquals("Wyeast Labs", yeastIteratorCurrent.getLaboratory());
        assertEquals("1084", yeastIteratorCurrent.getManufacturerProductId());
        assertEquals(16.7, yeastIteratorCurrent.getMinimumTemperature());
        assertEquals(22.2, yeastIteratorCurrent.getMaximumTemperature());
        assertEquals(YeastFlocculation.Medium, yeastIteratorCurrent.getFlocculation());
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
        assertEquals(MashStepType.Infusion, mashStepIteratorCurrent.getType());
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
