package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.FermentableType
import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.enums.RecipeType
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.RecipeCollection

class RecipeCollectionDeserializerTest extends GroovyTestCase {
    private Deserializer _deserializer;
    private String _equipmentXml;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<RecipeCollection>();

        _equipmentXml = "<RECIPES>\n" +
                "                          <RECIPE>\n" +
                "                            <NAME>Kentucky Bourbon Barrel Ale Clone</NAME>\n" +
                "                            <TYPE>Partial Mash</TYPE>\n" +
                "                            <BREWER>Sunporch Brewery</BREWER>\n" +
                "                            <BATCH_SIZE>18.9270589</BATCH_SIZE>\n" +
                "                            <BOIL_SIZE>22.71247068</BOIL_SIZE>\n" +
                "                            <BOIL_TIME>60</BOIL_TIME>\n" +
                "                            <EFFICIENCY>75.0</EFFICIENCY>\n" +
                "                            <FERMENTABLES>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Wheat Malt, White</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Adjunct</TYPE>\n" +
                "                                <YIELD>84.21507233858777</YIELD>\n" +
                "                                <AMOUNT>0.34019387292375136</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>0.74999910806205 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.039</POTENTIAL>\n" +
                "                                <COLOR>2</COLOR>\n" +
                "                                <DISPLAY_COLOR>2 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Carapils® Malt</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Adjunct</TYPE>\n" +
                "                                <YIELD>73.41826819261497</YIELD>\n" +
                "                                <AMOUNT>0.45359183056500185</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>0.9999988107494 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.034</POTENTIAL>\n" +
                "                                <COLOR>1</COLOR>\n" +
                "                                <DISPLAY_COLOR>1 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Simpon's Light Crystal</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Grain</TYPE>\n" +
                "                                <YIELD>73.41826819261497</YIELD>\n" +
                "                                <AMOUNT>0.45359183056500185</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>0.9999988107494 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.034</POTENTIAL>\n" +
                "                                <COLOR>35</COLOR>\n" +
                "                                <DISPLAY_COLOR>35 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Cane/Beet Sugar (Dextrose)</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Sugar</TYPE>\n" +
                "                                <YIELD>99.33059814294968</YIELD>\n" +
                "                                <AMOUNT>0.5669897882062522</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>1.24999851343675 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.046</POTENTIAL>\n" +
                "                                <COLOR>0</COLOR>\n" +
                "                                <DISPLAY_COLOR>0 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Pilsen Light DME</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Dry Extract</TYPE>\n" +
                "                                <YIELD>95.01187648456056</YIELD>\n" +
                "                                <AMOUNT>0.9071836611300037</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>1.9999976214988 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.044</POTENTIAL>\n" +
                "                                <COLOR>2</COLOR>\n" +
                "                                <DISPLAY_COLOR>2 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Pilsen Light DME</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Dry Extract</TYPE>\n" +
                "                                <YIELD>95.01187648456056</YIELD>\n" +
                "                                <AMOUNT>0.9071836611300037</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>1.9999976214988 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.044</POTENTIAL>\n" +
                "                                <COLOR>2</COLOR>\n" +
                "                                <DISPLAY_COLOR>2 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                              <FERMENTABLE>\n" +
                "                                <NAME>Pilsen Light DME</NAME>\n" +
                "                                <ORIGIN></ORIGIN>\n" +
                "                                <TYPE>Dry Extract</TYPE>\n" +
                "                                <YIELD>95.01187648456056</YIELD>\n" +
                "                                <AMOUNT>1.3607754916950054</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>2.9999964322482 lb</DISPLAY_AMOUNT>\n" +
                "                                <POTENTIAL>1.044</POTENTIAL>\n" +
                "                                <COLOR>2</COLOR>\n" +
                "                                <DISPLAY_COLOR>2 SRM</DISPLAY_COLOR>\n" +
                "                                <ADD_AFTER_BOIL></ADD_AFTER_BOIL>\n" +
                "                                <COARSE_FINE_DIFF></COARSE_FINE_DIFF>\n" +
                "                                <MOISTURE></MOISTURE>\n" +
                "                                <DIASTATIC_POWER></DIASTATIC_POWER>\n" +
                "                                <PROTEIN></PROTEIN>\n" +
                "                                <MAX_IN_BATCH></MAX_IN_BATCH>\n" +
                "                                <RECOMMEND_MASH></RECOMMEND_MASH>\n" +
                "                                <IBU_GAL_PER_LB></IBU_GAL_PER_LB>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </FERMENTABLE>\n" +
                "                            </FERMENTABLES>\n" +
                "                            <HOPS>\n" +
                "                              <HOP>\n" +
                "                                <NAME>Fuggle</NAME>\n" +
                "                                <ORIGIN>United States</ORIGIN>\n" +
                "                                <ALPHA>4.0</ALPHA>\n" +
                "                                <BETA></BETA>\n" +
                "                                <AMOUNT>0.028349530580924584</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>1.00000107871125 oz</DISPLAY_AMOUNT>\n" +
                "                                <USE>Boil</USE>\n" +
                "                                <FORM>Leaf</FORM>\n" +
                "                                <TIME>5</TIME>\n" +
                "                                <DISPLAY_TIME>5.0 min</DISPLAY_TIME>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </HOP>\n" +
                "                              <HOP>\n" +
                "                                <NAME>Kent Golding</NAME>\n" +
                "                                <ORIGIN>United Kingdom</ORIGIN>\n" +
                "                                <ALPHA>4.7</ALPHA>\n" +
                "                                <BETA></BETA>\n" +
                "                                <AMOUNT>0.028349530580924584</AMOUNT>\n" +
                "                                <DISPLAY_AMOUNT>1.00000107871125 oz</DISPLAY_AMOUNT>\n" +
                "                                <USE>Boil</USE>\n" +
                "                                <FORM>Leaf</FORM>\n" +
                "                                <TIME>60</TIME>\n" +
                "                                <DISPLAY_TIME>60.0 min</DISPLAY_TIME>\n" +
                "                                <NOTES></NOTES>\n" +
                "                              </HOP>\n" +
                "                            </HOPS>\n" +
                "                            <YEASTS>\n" +
                "                              <YEAST>\n" +
                "                                <LABORATORY>White Labs</LABORATORY>\n" +
                "                                <NAME>Dry English Ale Yeast</NAME>\n" +
                "                                <TYPE>Ale</TYPE>\n" +
                "                                <FORM>Liquid</FORM>\n" +
                "                                <ATTENUATION>75.0</ATTENUATION>\n" +
                "                              </YEAST>\n" +
                "                            </YEASTS>\n" +
                "                            <MISCS>\n" +
                "                              <MISC>\n" +
                "                                <NAME>Priming Sugar</NAME>\n" +
                "                                <USE>Bottle</USE>\n" +
                "                                <TIME>0.0</TIME>\n" +
                "                                <AMOUNT>5.0</AMOUNT>\n" +
                "                                <AMOUNT_IS_WEIGHT>true</AMOUNT_IS_WEIGHT>\n" +
                "                                <NOTES nil='true'/>\n" +
                "                                <DISPLAY_AMOUNT>5.0 oz</DISPLAY_AMOUNT>\n" +
                "                                <DISPLAY_TIME>0.0 days</DISPLAY_TIME>\n" +
                "                              </MISC>\n" +
                "                              <MISC>\n" +
                "                                <NAME>Bourbon</NAME>\n" +
                "                                <USE>Secondary</USE>\n" +
                "                                <TIME>14.0</TIME>\n" +
                "                                <AMOUNT>9.0</AMOUNT>\n" +
                "                                <AMOUNT_IS_WEIGHT>true</AMOUNT_IS_WEIGHT>\n" +
                "                                <NOTES></NOTES>\n" +
                "                                <DISPLAY_AMOUNT>9.0 oz</DISPLAY_AMOUNT>\n" +
                "                                <DISPLAY_TIME>14.0 days</DISPLAY_TIME>\n" +
                "                              </MISC>\n" +
                "                              <MISC>\n" +
                "                                <NAME>Oak Cubes, heavy char</NAME>\n" +
                "                                <USE>Secondary</USE>\n" +
                "                                <TIME>14.0</TIME>\n" +
                "                                <AMOUNT>3.0</AMOUNT>\n" +
                "                                <AMOUNT_IS_WEIGHT>true</AMOUNT_IS_WEIGHT>\n" +
                "                                <NOTES nil='true'/>\n" +
                "                                <DISPLAY_AMOUNT>3.0 oz</DISPLAY_AMOUNT>\n" +
                "                                <DISPLAY_TIME>14.0 days</DISPLAY_TIME>\n" +
                "                              </MISC>\n" +
                "                              <MISC>\n" +
                "                                <NAME>Whirlfloc Tablet</NAME>\n" +
                "                                <USE>Boil</USE>\n" +
                "                                <TIME>15.0</TIME>\n" +
                "                                <AMOUNT>1.0</AMOUNT>\n" +
                "                                <AMOUNT_IS_WEIGHT>false</AMOUNT_IS_WEIGHT>\n" +
                "                                <NOTES>A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.</NOTES>\n" +
                "                                <DISPLAY_AMOUNT>1.0 each</DISPLAY_AMOUNT>\n" +
                "                                <DISPLAY_TIME>15.0 min</DISPLAY_TIME>\n" +
                "                              </MISC>\n" +
                "                            </MISCS>\n" +
                "                          </RECIPE>\n" +
                "                        </RECIPES>";
    }


    void testToBeerXmlRecipesActualRecipeFromBrewtoad() {
        RecipeCollection recipeCollection = (RecipeCollection) _deserializer.toBeerXml(_equipmentXml, RecipeCollection.class);

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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", fermentableIteratorCurrent.getPlaceOfOrigin());
        assertNull(fermentableIteratorCurrent.getSupplier());
        assertEquals("", fermentableIteratorCurrent.getNotes());
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
        assertEquals("", hopIteratorCurrent.getNotes());
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
        assertEquals("", hopIteratorCurrent.getNotes());
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
        assertEquals("", miscIteratorCurrent.getNotes());
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
        assertEquals("", miscIteratorCurrent.getNotes());
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
        assertEquals("", miscIteratorCurrent.getNotes());
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
        assertEquals("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.",
                miscIteratorCurrent.getNotes());
        assertEquals("1.0 each", miscIteratorCurrent.getDisplayAmount());
        assertNull(miscIteratorCurrent.getInventory());
        assertEquals("15.0 min", miscIteratorCurrent.getDisplayTime());
    }
}
