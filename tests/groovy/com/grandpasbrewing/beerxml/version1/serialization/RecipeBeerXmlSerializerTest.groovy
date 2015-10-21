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
import com.grandpasbrewing.beerxml.version1.objects.Fermentable
import com.grandpasbrewing.beerxml.version1.objects.Hop
import com.grandpasbrewing.beerxml.version1.objects.Mash
import com.grandpasbrewing.beerxml.version1.objects.MashStep
import com.grandpasbrewing.beerxml.version1.objects.Misc
import com.grandpasbrewing.beerxml.version1.objects.Recipe
import com.grandpasbrewing.beerxml.version1.objects.Style
import com.grandpasbrewing.beerxml.version1.objects.Water
import com.grandpasbrewing.beerxml.version1.objects.Yeast
import org.w3c.dom.NodeList
import org.w3c.dom.Node

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory

class RecipeBeerXmlSerializerTest extends GroovyTestCase {
    private BeerXmlSerializer _serializer;

    void setUp() {
        super.setUp()

        _serializer = new BeerXmlSerializer<Recipe>();
    }

    void testStyleFromBeerXml() {
        Recipe recipe = new Recipe();
        recipe.setName("Dry Stout");
        recipe.setVersion(1);
        recipe.setType(RecipeType.AllGrain);
        recipe.setBrewer("Brad Smith");
        recipe.setBatchSize(18.93);
        recipe.setBoilSize(20.82);
        recipe.setBoilTime(60.0);
        recipe.setEfficiency(72.0);
        recipe.setTasteNotes("Nice dry Irish stout with a warm body but low starting gravity much like the famous drafts.");
        recipe.setRating(41);
        recipe.setDate("3 Jan 04");
        recipe.setOriginalGravity(1.036);
        recipe.setFinalGravity(1.012);
        recipe.setCarbonation(2.1);
        recipe.setCarbonationUsed("Kegged");
        recipe.setAge(24.0);
        recipe.setAgeTemperature(17.0);
        recipe.setFermentationStages(2);

        Style style = new Style();
        style.setName("Dry Stout");
        style.setCategory("Stout");
        style.setCategoryNumber("16");
        style.setStyleLetter("A");
        style.setStyleGuide("BJCP");
        style.setVersion(1);
        style.setType(StyleType.Ale);
        style.setOriginalGravityMinimum(1.035);
        style.setOriginalGravityMaximum(1.050);
        style.setFinalGravityMinimum(1.007);
        style.setFinalGravityMaximum(1.011);
        style.setIBUMinimum(30.0);
        style.setIBUMaximum(50.0);
        style.setColorMinimum("35.0");
        style.setColorMaximum("200.0");
        style.setABVMinimum(3.2);
        style.setABVMaximum(5.5);
        style.setCarbonationMinimum(1.6);
        style.setCarbonationMaximum(2.1);
        style.setNotes("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer. Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.");

        recipe.setStyle(style);

        ArrayList<Hop> hops = new ArrayList<Hop>();

        Hop hop = new Hop();
        hop.setName("Goldings,  East Kent ");
        hop.setVersion(1);
        hop.setAlphaPercentage(5.0);
        hop.setAmount(0.0638);
        hop.setUse(HopUse.Boil);
        hop.setTime(60.0);
        hop.setNotes("Great all purpose UK hop for ales, stouts, porters");

        hops.add(hop);

        recipe.setHops(hops);

        ArrayList<Fermentable> fermentables = new ArrayList<Fermentable>();

        Fermentable fermentable1 = new Fermentable();
        fermentable1.setName("Pale Malt (2 row) UK");
        fermentable1.setVersion(1);
        fermentable1.setAmount(2.27);
        fermentable1.setType(FermentableType.Grain);
        fermentable1.setYield(78.0);
        fermentable1.setColor(3.0);
        fermentable1.setPlaceOfOrigin(" United Kingdom ");
        fermentable1.setSupplier("Fussybrewer Malting");
        fermentable1.setNotes("All purpose base malt for English styles");
        fermentable1.setCoarseFineDiff(1.5);
        fermentable1.setMoisture(4.0);
        fermentable1.setDiastaticPower(45.0);
        fermentable1.setProtein(10.2);
        fermentable1.setMaximumInBatch(100.0);

        fermentables.add(fermentable1);

        Fermentable fermentable2 = new Fermentable();
        fermentable2.setName("Barley, Flaked");
        fermentable2.setVersion(1);
        fermentable2.setAmount(0.91);
        fermentable2.setType(FermentableType.Grain);
        fermentable2.setYield(70.0);
        fermentable2.setColor(2.0);
        fermentable2.setPlaceOfOrigin(" United Kingdom ");
        fermentable2.setSupplier("Fussybrewer Malting");
        fermentable2.setNotes("Adds body to porters and stouts, must be mashed");
        fermentable2.setCoarseFineDiff(1.5);
        fermentable2.setMoisture(9.0);
        fermentable2.setDiastaticPower(0.0);
        fermentable2.setProtein(13.2);
        fermentable2.setMaximumInBatch(20.0);
        fermentable2.setRecommendMash(true);

        fermentables.add(fermentable2);

        Fermentable fermentable3 = new Fermentable();
        fermentable3.setName("Black Barley");
        fermentable3.setVersion(1);
        fermentable3.setAmount(0.45);
        fermentable3.setType(FermentableType.Grain);
        fermentable3.setYield(78.0);
        fermentable3.setColor(500.0);
        fermentable3.setPlaceOfOrigin(" United Kingdom ");
        fermentable3.setSupplier("Fussybrewer Malting");
        fermentable3.setNotes("Unmalted roasted barley for stouts, porters");
        fermentable3.setCoarseFineDiff(1.5);
        fermentable3.setMoisture(5.0);
        fermentable3.setDiastaticPower(0.0);
        fermentable3.setProtein(13.2);
        fermentable3.setMaximumInBatch(10.0);

        fermentables.add(fermentable3);

        recipe.setFermentables(fermentables);

        ArrayList<Misc> miscs = new ArrayList<Misc>();

        Misc misc = new Misc();
        misc.setName("Irish Moss");
        misc.setVersion(1);
        misc.setType(MiscType.Fining);
        misc.setUse(MiscUse.Boil);
        misc.setTime(15.0);
        misc.setAmount(0.010);
        misc.setNotes("Used as a clarifying agent during the last few minutes of the boil");

        miscs.add(misc);

        recipe.setMiscs(miscs);

        ArrayList<Water> waters = new ArrayList<Water>();

        Water water = new Water();
        water.setName(" Burton on Trent, UK ");
        water.setVersion(1);
        water.setAmount(20.0);
        water.setCalcium(295.0);
        water.setMagnesium(45.0);
        water.setSodium(55.0);
        water.setSulfate(725.0);
        water.setChloride(25.0);
        water.setBicarbonate(300.0);
        water.setPH(8.0);
        water.setNotes(" Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale");

        waters.add(water);

        recipe.setWaters(waters);

        ArrayList<Yeast> yeasts = new ArrayList<Yeast>();

        Yeast yeast = new Yeast();
        yeast.setName("Irish Ale");
        yeast.setType(YeastType.Ale);
        yeast.setVersion(1);
        yeast.setForm(YeastForm.Liquid);
        yeast.setAmount(0.250);
        yeast.setLaboratory("Wyeast Labs");
        yeast.setManufacturerProductId("1084");
        yeast.setMinimumTemperature(16.7);
        yeast.setMaximumTemperature(22.2);
        yeast.setAttenuation(73.0);
        yeast.setNotes("Dry, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor. ");
        yeast.setBestFor("Irish Dry Stouts");
        yeast.setFlocculation(YeastFlocculation.Medium);

        yeasts.add(yeast);

        recipe.setYeasts(yeasts);

        Mash mash = new Mash();
        mash.setName("Single Step Infusion, 68 C");
        mash.setVersion(1);
        mash.setGrainTemperature(22.0);

        ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

        MashStep mashStep = new MashStep();
        mashStep.setName("Conversion Step, 68C ");
        mashStep.setVersion(1);
        mashStep.setType(MashStepType.Infusion);
        mashStep.setStepTemperature(68.0);
        mashStep.setStepTime(60.0);
        mashStep.setInfuseAmount(10.0);

        mashSteps.add(mashStep);

        mash.setMashSteps(mashSteps);

        recipe.setMash(mash);

        String xml = _serializer.fromBeerXml(recipe, recipe.getClass())

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        def document = documentBuilder.parse(is);

        XPathFactory xPathFactory = XPathFactory.newInstance();
        def xpath = xPathFactory.newXPath();

        def documentElement = document.getDocumentElement();

        assertNotNull(documentElement);

        assertEquals("RECIPE", documentElement.getTagName());
        assertEquals(25, documentElement.getChildNodes().getLength());
        assertEquals("Dry Stout", xpath.evaluate("//NAME", document));
        assertEquals("1", xpath.evaluate("//VERSION", document));
        assertEquals("All Grain", xpath.evaluate("TYPE", documentElement));
        assertEquals("Brad Smith", xpath.evaluate("//BREWER", document));
        assertEquals("18.93", xpath.evaluate("//BATCH_SIZE", document));
        assertEquals("20.82", xpath.evaluate("//BOIL_SIZE", document));
        assertEquals("60.0", xpath.evaluate("//BOIL_TIME", document));
        assertEquals("72.0", xpath.evaluate("//EFFICIENCY", document));
        assertEquals("Nice dry Irish stout with a warm body but low starting gravity much like the famous drafts.", xpath.evaluate("//TASTE_NOTES", document));
        assertEquals("41.0", xpath.evaluate("//RATING", document));
        assertEquals("3 Jan 04", xpath.evaluate("//DATE", document));
        assertEquals("1.036", xpath.evaluate("//OG", document));
        assertEquals("1.012", xpath.evaluate("//FG", document));
        assertEquals("2.1", xpath.evaluate("//CARBONATION", document));
        assertEquals("Kegged", xpath.evaluate("//CARBONATION_USED", document));
        assertEquals("24.0", xpath.evaluate("//AGE", document));
        assertEquals("17.0", xpath.evaluate("//AGE_TEMP", document));
        assertEquals("2", xpath.evaluate("//FERMENTATION_STAGES", document));

        Node styleNode = (Node) xpath.evaluate("//STYLE", document, XPathConstants.NODE);

        assertEquals("STYLE", styleNode.getNodeName());
        assertEquals(20, styleNode.getChildNodes().getLength());
        assertEquals("Dry Stout", xpath.evaluate("NAME", styleNode));
        assertEquals("Stout", xpath.evaluate("CATEGORY", styleNode));
        assertEquals("16", xpath.evaluate("CATEGORY_NUMBER", styleNode));
        assertEquals("A", xpath.evaluate("STYLE_LETTER", styleNode));
        assertEquals("BJCP", xpath.evaluate("STYLE_GUIDE", styleNode));
        assertEquals("1", xpath.evaluate("VERSION", styleNode));
        assertEquals("Ale", xpath.evaluate("TYPE", styleNode));
        assertEquals("1.035", xpath.evaluate("OG_MIN", styleNode));
        assertEquals("1.05", xpath.evaluate("OG_MAX", styleNode));
        assertEquals("1.007", xpath.evaluate("FG_MIN", styleNode));
        assertEquals("1.011", xpath.evaluate("FG_MAX", styleNode));
        assertEquals("30.0", xpath.evaluate("IBU_MIN", styleNode));
        assertEquals("50.0", xpath.evaluate("IBU_MAX", styleNode));
        assertEquals("35.0", xpath.evaluate("COLOR_MIN", styleNode));
        assertEquals("200.0", xpath.evaluate("COLOR_MAX", styleNode));
        assertEquals("3.2", xpath.evaluate("ABV_MIN", styleNode));
        assertEquals("5.5", xpath.evaluate("ABV_MAX", styleNode));
        assertEquals("1.6", xpath.evaluate("CARB_MIN", styleNode));
        assertEquals("2.1", xpath.evaluate("CARB_MAX", styleNode));
        assertEquals("Famous Irish Stout. Dry, roasted, almost coffee like flavor. Often soured with pasteurized sour beer. Full body perception due to flaked barley, though starting gravity may be low. Dry roasted flavor.", xpath.evaluate("NOTES", styleNode));

        NodeList hopNodes = (NodeList) xpath.evaluate("//HOPS/HOP", document, XPathConstants.NODESET);
        assertNotNull(hopNodes);
        assertEquals(1, hopNodes.getLength());

        def hopNode = hopNodes.item(0);

        assertNotNull(hopNode);
        assertEquals(7, hopNode.getChildNodes().getLength());

        assertEquals("Goldings,  East Kent ", xpath.evaluate("NAME", hopNode));
        assertEquals("1", xpath.evaluate("VERSION", hopNode));
        assertEquals("5.0", xpath.evaluate("ALPHA", hopNode));
        assertEquals("0.0638", xpath.evaluate("AMOUNT", hopNode));
        assertEquals("Boil", xpath.evaluate("USE", hopNode));
        assertEquals("60.0", xpath.evaluate("TIME", hopNode));
        assertEquals("Great all purpose UK hop for ales, stouts, porters", xpath.evaluate("NOTES", hopNode));

        NodeList fermentableNodes = (NodeList) xpath.evaluate("//FERMENTABLES/FERMENTABLE", document, XPathConstants.NODESET);
        assertNotNull(fermentableNodes);
        assertEquals(3, fermentableNodes.getLength());

        def fermentableNode = fermentableNodes.item(0);

        assertNotNull(fermentableNode);
        assertEquals(14, fermentableNode.getChildNodes().getLength());

        assertEquals("Pale Malt (2 row) UK", xpath.evaluate("NAME", fermentableNode));
        assertEquals("1", xpath.evaluate("VERSION", fermentableNode));
        assertEquals("2.27", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("Grain", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("78.0", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("3.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals(" United Kingdom ", xpath.evaluate("ORIGIN", fermentableNode));
        assertEquals("Fussybrewer Malting", xpath.evaluate("SUPPLIER", fermentableNode));
        assertEquals("All purpose base malt for English styles", xpath.evaluate("NOTES", fermentableNode));
        assertEquals("1.5", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("4.0", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("45.0", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("10.2", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("100.0", xpath.evaluate("MAX_IN_BATCH", fermentableNode));

        fermentableNode = fermentableNodes.item(1);

        assertNotNull(fermentableNode);
        assertEquals(15, fermentableNode.getChildNodes().getLength());

        assertEquals("Barley, Flaked", xpath.evaluate("NAME", fermentableNode));
        assertEquals("1", xpath.evaluate("VERSION", fermentableNode));
        assertEquals("0.91", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("Grain", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("70.0", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("2.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals(" United Kingdom ", xpath.evaluate("ORIGIN", fermentableNode));
        assertEquals("Fussybrewer Malting", xpath.evaluate("SUPPLIER", fermentableNode));
        assertEquals("Adds body to porters and stouts, must be mashed", xpath.evaluate("NOTES", fermentableNode));
        assertEquals("1.5", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("9.0", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("0.0", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("13.2", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("20.0", xpath.evaluate("MAX_IN_BATCH", fermentableNode));
        assertEquals("true", xpath.evaluate("RECOMMEND_MASH", fermentableNode));

        fermentableNode = fermentableNodes.item(2);

        assertNotNull(fermentableNode);
        assertEquals(14, fermentableNode.getChildNodes().getLength());

        assertEquals("Black Barley", xpath.evaluate("NAME", fermentableNode));
        assertEquals("1", xpath.evaluate("VERSION", fermentableNode));
        assertEquals("0.45", xpath.evaluate("AMOUNT", fermentableNode));
        assertEquals("Grain", xpath.evaluate("TYPE", fermentableNode));
        assertEquals("78.0", xpath.evaluate("YIELD", fermentableNode));
        assertEquals("500.0", xpath.evaluate("COLOR", fermentableNode));
        assertEquals(" United Kingdom ", xpath.evaluate("ORIGIN", fermentableNode));
        assertEquals("Fussybrewer Malting", xpath.evaluate("SUPPLIER", fermentableNode));
        assertEquals("Unmalted roasted barley for stouts, porters", xpath.evaluate("NOTES", fermentableNode));
        assertEquals("1.5", xpath.evaluate("COARSE_FINE_DIFF", fermentableNode));
        assertEquals("5.0", xpath.evaluate("MOISTURE", fermentableNode));
        assertEquals("0.0", xpath.evaluate("DIASTATIC_POWER", fermentableNode));
        assertEquals("13.2", xpath.evaluate("PROTEIN", fermentableNode));
        assertEquals("10.0", xpath.evaluate("MAX_IN_BATCH", fermentableNode));

        NodeList miscNodes = (NodeList) xpath.evaluate("//MISCS/MISC", document, XPathConstants.NODESET);
        assertNotNull(miscNodes);
        assertEquals(1, miscNodes.getLength());

        def miscNode = miscNodes.item(0);

        assertNotNull(miscNode);
        assertEquals(7, miscNode.getChildNodes().getLength());

        assertEquals("Irish Moss", xpath.evaluate("NAME", miscNode));
        assertEquals("1", xpath.evaluate("VERSION", miscNode));
        assertEquals("Fining", xpath.evaluate("TYPE", miscNode));
        assertEquals("Boil", xpath.evaluate("USE", miscNode));
        assertEquals("15.0", xpath.evaluate("TIME", miscNode));
        assertEquals("0.01", xpath.evaluate("AMOUNT", miscNode));
        assertEquals("Used as a clarifying agent during the last few minutes of the boil", xpath.evaluate("NOTES", miscNode));

        NodeList waterNodes = (NodeList) xpath.evaluate("//WATERS/WATER", document, XPathConstants.NODESET);
        assertNotNull(waterNodes);
        assertEquals(1, waterNodes.getLength());

        def waterNode = waterNodes.item(0);

        assertNotNull(waterNode);
        assertEquals(11, waterNode.getChildNodes().getLength());

        assertEquals(" Burton on Trent, UK ", xpath.evaluate("NAME", waterNode));
        assertEquals("1", xpath.evaluate("VERSION", waterNode));
        assertEquals("20.0", xpath.evaluate("AMOUNT", waterNode));
        assertEquals("295.0", xpath.evaluate("CALCIUM", waterNode));
        assertEquals("45.0", xpath.evaluate("MAGNESIUM", waterNode));
        assertEquals("55.0", xpath.evaluate("SODIUM", waterNode));
        assertEquals("725.0", xpath.evaluate("SULFATE", waterNode));
        assertEquals("25.0", xpath.evaluate("CHLORIDE", waterNode));
        assertEquals("300.0", xpath.evaluate("BICARBONATE", waterNode));
        assertEquals("8.0", xpath.evaluate("PH", waterNode));
        assertEquals(" Use for distinctive pale ales strongly hopped. Very hard water accentuates the hops flavor. Example: Bass Ale", xpath.evaluate("NOTES", waterNode));

        NodeList yeastNodes = (NodeList) xpath.evaluate("//YEASTS/YEAST", document, XPathConstants.NODESET);
        assertNotNull(yeastNodes);
        assertEquals(1, yeastNodes.getLength());

        def yeastNode = yeastNodes.item(0);

        assertNotNull(yeastNode);
        assertEquals(13, yeastNode.getChildNodes().getLength());

        assertEquals("Irish Ale", xpath.evaluate("NAME", yeastNode));
        assertEquals("Ale", xpath.evaluate("TYPE", yeastNode));
        assertEquals("1", xpath.evaluate("VERSION", yeastNode));
        assertEquals("Liquid", xpath.evaluate("FORM", yeastNode));
        assertEquals("0.25", xpath.evaluate("AMOUNT", yeastNode));
        assertEquals("Wyeast Labs", xpath.evaluate("LABORATORY", yeastNode));
        assertEquals("1084", xpath.evaluate("PRODUCT_ID", yeastNode));
        assertEquals("16.7", xpath.evaluate("MIN_TEMPERATURE", yeastNode));
        assertEquals("22.2", xpath.evaluate("MAX_TEMPERATURE", yeastNode));
        assertEquals("73.0", xpath.evaluate("ATTENUATION", yeastNode));
        assertEquals("Dry, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor. ", xpath.evaluate("NOTES", yeastNode));
        assertEquals("Irish Dry Stouts", xpath.evaluate("BEST_FOR", yeastNode));
        assertEquals("Medium", xpath.evaluate("FLOCCULATION", yeastNode));

        Node mashNode = (Node) xpath.evaluate("//MASH", document, XPathConstants.NODE);

        assertEquals("MASH", mashNode.getNodeName());
        assertEquals(4, mashNode.getChildNodes().getLength());
        assertEquals("Single Step Infusion, 68 C", xpath.evaluate("NAME", mashNode));
        assertEquals("1", xpath.evaluate("VERSION", mashNode));
        assertEquals("22.0", xpath.evaluate("GRAIN_TEMP", mashNode));

        NodeList mashStepNodes = (NodeList) xpath.evaluate("MASH_STEPS/MASH_STEP", mashNode, XPathConstants.NODESET);
        assertNotNull(mashStepNodes);
        assertEquals(1, mashStepNodes.getLength());

        def mashStepNode = mashStepNodes.item(0);

        assertNotNull(mashStepNode);
        assertEquals(6, mashStepNode.getChildNodes().getLength());

        assertEquals("Conversion Step, 68C ", xpath.evaluate("NAME", mashStepNode));
        assertEquals("1", xpath.evaluate("VERSION", mashStepNode));
        assertEquals("Infusion", xpath.evaluate("TYPE", mashStepNode));
        assertEquals("68.0", xpath.evaluate("STEP_TEMP", mashStepNode));
        assertEquals("60.0", xpath.evaluate("STEP_TIME", mashStepNode));
        assertEquals("10.0", xpath.evaluate("INFUSE_AMOUNT", mashStepNode));
    }
}
