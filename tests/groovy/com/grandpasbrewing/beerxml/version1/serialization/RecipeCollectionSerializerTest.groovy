package com.grandpasbrewing.beerxml.version1.serialization

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
import org.w3c.dom.Node
import org.w3c.dom.NodeList

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

class RecipeCollectionSerializerTest extends GroovyTestCase {
    private Serializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new Serializer<RecipeCollection>();
    }

    void testRecipeCollectionFromBeerXml() {
        RecipeCollection recipeCollection = new RecipeCollection();
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
        fermentable1.setYield(84.21507233858777);
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
        fermentable2.setPlaceOfOrigin(null);
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
        fermentable4.setDiastaticPower(null);
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

        recipeCollection.setRecipes(recipes);

        String xml = _serializer.fromBeerXml(recipeCollection, recipeCollection.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("RECIPES", documentElement.getTagName());
        assertEquals(1, documentElement.getChildNodes().getLength());

        Node recipeNode = (Node) xpath.evaluate("//RECIPE", document, XPathConstants.NODE);

        assertEquals(11, recipeNode.getChildNodes().getLength());

        assertEquals("Kentucky Bourbon Barrel Ale Clone", xpath.evaluate("NAME", recipeNode));
        assertEquals("Partial Mash", xpath.evaluate("TYPE", recipeNode));
        assertEquals("Sunporch Brewery", xpath.evaluate("BREWER", recipeNode));
        assertEquals("18.9270589", xpath.evaluate("BATCH_SIZE", recipeNode));
        assertEquals("22.71247068", xpath.evaluate("BOIL_SIZE", recipeNode));
        assertEquals("60.0", xpath.evaluate("BOIL_TIME", recipeNode));
        assertEquals("75.0", xpath.evaluate("EFFICIENCY", recipeNode));

        NodeList fermentableNodes = (NodeList) xpath.evaluate("//FERMENTABLES/FERMENTABLE", document, XPathConstants.NODESET);
        assertNotNull(fermentableNodes);
        assertEquals(7, fermentableNodes.getLength());

        def fermentableNode = fermentableNodes.item(0);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Wheat Malt, White", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Adjunct", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("84.21507233858777", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.34019387292375136", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("0.74999910806205 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.039", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("2.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("2 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(1);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Carapils® Malt", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Adjunct", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("73.41826819261497", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.45359183056500185", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("0.9999988107494 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.034", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("1.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("1 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(2);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Simpon's Light Crystal", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Grain", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("73.41826819261497", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.45359183056500185", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("0.9999988107494 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.034", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("35.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("35 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(3);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Cane/Beet Sugar (Dextrose)", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Sugar", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("99.33059814294968", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.5669897882062522", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("1.24999851343675 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.046", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("0.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("0 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(4);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Pilsen Light DME", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Dry Extract", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("95.01187648456056", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.9071836611300037", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("1.9999976214988 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.044", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("2.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("2 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(5);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Pilsen Light DME", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Dry Extract", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("95.01187648456056", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("0.9071836611300037", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("1.9999976214988 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.044", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("2.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("2 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        fermentableNode = fermentableNodes.item(6);

        assertNotNull(fermentableNode);
        assertEquals(8, fermentableNode.getChildNodes().getLength());

        assertEquals("Pilsen Light DME", xpath.evaluate("NAME", fermentableNode));
        assertEquals("Dry Extract", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("95.01187648456056", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("1.3607754916950054", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("2.9999964322482 lb", xpath.evaluate("DISPLAY_AMOUNT", fermentableNode));
        assertEquals("1.044", xpath.evaluate("POTENTIAL", fermentableNode));
        assertEquals("2.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals("2 SRM", xpath.evaluate("DISPLAY_COLOR", fermentableNode));
        assertEquals("", xpath.evaluate("ADD_AFTER_BOIL", fermentableNode));
        assertEquals("", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("", xpath.evaluate("RECOMMEND_MASH", fermentableNode));
        assertEquals("", xpath.evaluate("IBU_GAL_PER_LB", fermentableNode));

        NodeList hopNodes = (NodeList) xpath.evaluate("//HOPS/HOP", document, XPathConstants.NODESET);
        assertNotNull(hopNodes);
        assertEquals(2, hopNodes.getLength());

        def hopNode = hopNodes.item(0);

        assertNotNull(hopNode);
        assertEquals(9, hopNode.getChildNodes().getLength());

        assertEquals("Fuggle", xpath.evaluate("NAME", hopNode));
        assertEquals("United States", xpath.evaluate("ORIGIN", hopNode));
        assertEquals("4.0", xpath.evaluate("ALPHA", hopNode));
        assertEquals("", xpath.evaluate("BETA", hopNode));
        assertEquals("0.028349530580924584", xpath.evaluate("AMOUNT", hopNode));
        assertEquals("1.00000107871125 oz", xpath.evaluate("DISPLAY_AMOUNT", hopNode));
        assertEquals("Boil", xpath.evaluate("USE", hopNode));
        assertEquals("Leaf", xpath.evaluate("FORM", hopNode));
        assertEquals("5.0", xpath.evaluate("TIME", hopNode));
        assertEquals("5.0 min", xpath.evaluate("DISPLAY_TIME", hopNode));
        
        hopNode = hopNodes.item(1);

        assertNotNull(hopNode);
        assertEquals(9, hopNode.getChildNodes().getLength());

        assertEquals("Kent Golding", xpath.evaluate("NAME", hopNode));
        assertEquals("United Kingdom", xpath.evaluate("ORIGIN", hopNode));
        assertEquals("4.7", xpath.evaluate("ALPHA", hopNode));
        assertEquals("", xpath.evaluate("BETA", hopNode));
        assertEquals("0.028349530580924584", xpath.evaluate("AMOUNT", hopNode));
        assertEquals("1.00000107871125 oz", xpath.evaluate("DISPLAY_AMOUNT", hopNode));
        assertEquals("Boil", xpath.evaluate("USE", hopNode));
        assertEquals("Leaf", xpath.evaluate("FORM", hopNode));
        assertEquals("60.0", xpath.evaluate("TIME", hopNode));
        assertEquals("60.0 min", xpath.evaluate("DISPLAY_TIME", hopNode));
        
        NodeList yeastNodes = (NodeList) xpath.evaluate("//YEASTS/YEAST", document, XPathConstants.NODESET);
        assertNotNull(yeastNodes);
        assertEquals(1, yeastNodes.getLength());

        def yeastNode = yeastNodes.item(0);

        assertNotNull(yeastNode);
        assertEquals(5, yeastNode.getChildNodes().getLength());

        assertEquals("White Labs", xpath.evaluate("LABORATORY", yeastNode));
        assertEquals("Dry English Ale Yeast", xpath.evaluate("NAME", yeastNode));
        assertEquals("Ale", xpath.evaluate("TYPE", yeastNode));
        assertEquals("Liquid", xpath.evaluate("FORM", yeastNode));
        assertEquals("75.0", xpath.evaluate("ATTENUATION", yeastNode));

        NodeList miscNodes = (NodeList) xpath.evaluate("//MISCS/MISC", document, XPathConstants.NODESET);
        assertNotNull(miscNodes);
        assertEquals(4, miscNodes.getLength());

        def miscNode = miscNodes.item(0);

        assertNotNull(miscNode);
        assertEquals(7, miscNode.getChildNodes().getLength());

        assertEquals("Priming Sugar", xpath.evaluate("NAME", miscNode));
        assertEquals("Bottle", xpath.evaluate("USE", miscNode));
        assertEquals("0.0", xpath.evaluate("TIME", miscNode));
        assertEquals("5.0", xpath.evaluate("AMOUNT", miscNode));
        assertEquals("true", xpath.evaluate("AMOUNT_IS_WEIGHT", miscNode));
        assertEquals("5.0 oz", xpath.evaluate("DISPLAY_AMOUNT", miscNode));
        assertEquals("0.0 days", xpath.evaluate("DISPLAY_TIME", miscNode));

        miscNode = miscNodes.item(1);

        assertNotNull(miscNode);
        assertEquals(7, miscNode.getChildNodes().getLength());

        assertEquals("Bourbon", xpath.evaluate("NAME", miscNode));
        assertEquals("Secondary", xpath.evaluate("USE", miscNode));
        assertEquals("14.0", xpath.evaluate("TIME", miscNode));
        assertEquals("9.0", xpath.evaluate("AMOUNT", miscNode));
        assertEquals("true", xpath.evaluate("AMOUNT_IS_WEIGHT", miscNode));
        assertEquals("9.0 oz", xpath.evaluate("DISPLAY_AMOUNT", miscNode));
        assertEquals("14.0 days", xpath.evaluate("DISPLAY_TIME", miscNode));

        miscNode = miscNodes.item(2);

        assertNotNull(miscNode);
        assertEquals(7, miscNode.getChildNodes().getLength());

        assertEquals("Oak Cubes, heavy char", xpath.evaluate("NAME", miscNode));
        assertEquals("Secondary", xpath.evaluate("USE", miscNode));
        assertEquals("14.0", xpath.evaluate("TIME", miscNode));
        assertEquals("3.0", xpath.evaluate("AMOUNT", miscNode));
        assertEquals("true", xpath.evaluate("AMOUNT_IS_WEIGHT", miscNode));
        assertEquals("3.0 oz", xpath.evaluate("DISPLAY_AMOUNT", miscNode));
        assertEquals("14.0 days", xpath.evaluate("DISPLAY_TIME", miscNode));

        miscNode = miscNodes.item(3);

        assertNotNull(miscNode);
        assertEquals(8, miscNode.getChildNodes().getLength());

        assertEquals("Whirlfloc Tablet", xpath.evaluate("NAME", miscNode));
        assertEquals("Boil", xpath.evaluate("USE", miscNode));
        assertEquals("15.0", xpath.evaluate("TIME", miscNode));
        assertEquals("1.0", xpath.evaluate("AMOUNT", miscNode));
        assertEquals("false", xpath.evaluate("AMOUNT_IS_WEIGHT", miscNode));
        assertEquals("A blend of Irish Moss and purified Kappa carrageenan that encourages the precipitation of haze causing materials such as proteins and Beta glucans. Prepared in a quick dissolving, highly soluble tablet form.", xpath.evaluate("NOTES", miscNode));
        assertEquals("1.0 each", xpath.evaluate("DISPLAY_AMOUNT", miscNode));
        assertEquals("15.0 min", xpath.evaluate("DISPLAY_TIME", miscNode));
    }
}

