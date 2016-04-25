package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopFormEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.HopUseEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopType
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.objects.Hop

class HopConverterTest extends GroovyTestCase {
    private HopFormEnumConverter _hopFormEnumConverter;
    private HopTypeEnumConverter _hopTypeEnumConverter;
    private HopUseEnumConverter _hopUseEnumConverter;

    private HopConverter _hopConverter;

    void setUp() {
        super.setUp()

        _hopFormEnumConverter = new HopFormEnumConverter();
        _hopTypeEnumConverter = new HopTypeEnumConverter();
        _hopUseEnumConverter = new HopUseEnumConverter();

        _hopConverter = new HopConverter(_hopFormEnumConverter, _hopTypeEnumConverter, _hopUseEnumConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Hop hop = _hopConverter.toObjectModel(null);

        assertNull(hop);
    }

    void testToObjectModelRequiredFieldsOnly() {
        Hop beerXmlHop = new Hop();

        beerXmlHop.setName("Cascade");
        beerXmlHop.setVersion(1);
        beerXmlHop.setAlphaPercentage(5.0);
        beerXmlHop.setAmount(0.100);
        beerXmlHop.setUse(HopUse.Boil);
        beerXmlHop.setTime(60);

        com.grandpasbrewing.objectmodel.Hop hop = _hopConverter.toObjectModel(beerXmlHop);

        assertEquals("Cascade", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(5.0, hop.getAlphaPercentage());
        assertEquals(0.100, hop.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Boil, hop.getUse());
        assertEquals(60, hop.getTime());
        assertNull(hop.getNotes());
        assertNull(hop.getType());
        assertNull(hop.getForm());
        assertNull(hop.getBetaPercentage());
        assertNull(hop.getHopStabilityIndex());
        assertNull(hop.getPlaceOfOrigin());
        assertNull(hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertNull(hop.getCohumuloneLevel());
        assertNull(hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }

    void testToObjectModelDryHopForThreeDays() {
        Hop beerXmlHop = new Hop();

        beerXmlHop.setName("Fuggles");
        beerXmlHop.setVersion(1);
        beerXmlHop.setAlphaPercentage(4.5);
        beerXmlHop.setAmount(0.250);
        beerXmlHop.setUse(HopUse.DryHop);
        beerXmlHop.setTime(10080.0);

        com.grandpasbrewing.objectmodel.Hop hop = _hopConverter.toObjectModel(beerXmlHop);

        assertEquals("Fuggles", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(4.5, hop.getAlphaPercentage());
        assertEquals(0.250, hop.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.DryHop, hop.getUse());
        assertEquals(10080.0, hop.getTime());
        assertNull(hop.getNotes());
        assertNull(hop.getType());
        assertNull(hop.getForm());
        assertNull(hop.getBetaPercentage());
        assertNull(hop.getHopStabilityIndex());
        assertNull(hop.getPlaceOfOrigin());
        assertNull(hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertNull(hop.getCohumuloneLevel());
        assertNull(hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }

    public void testToObjectModelMashHopsWithAllFieldsInShuffledOrder() {
        Hop beerXmlHop = new Hop();

        beerXmlHop.setAmount(0.050);
        beerXmlHop.setVersion(1);
        beerXmlHop.setUse(HopUse.Mash);
        beerXmlHop.setAlphaPercentage(4.5);
        beerXmlHop.setNotes("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.");
        beerXmlHop.setTime(45.0);
        beerXmlHop.setBetaPercentage(5.5);
        beerXmlHop.setName("Super Hops");
        beerXmlHop.setPlaceOfOrigin("Planet Krypton");
        beerXmlHop.setSubstitutes("Goldings, Fuggles, Super Alpha");
        beerXmlHop.setMyrceneLevel(24.4);
        beerXmlHop.setHopStabilityIndex(30);
        beerXmlHop.setForm(HopForm.Leaf);
        beerXmlHop.setType(HopType.Bittering);
        beerXmlHop.setCohumuloneLevel(13.2);

        com.grandpasbrewing.objectmodel.Hop hop = _hopConverter.toObjectModel(beerXmlHop);

        assertEquals("Super Hops", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(4.5, hop.getAlphaPercentage());
        assertEquals(0.050, hop.getAmount());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopUse.Mash, hop.getUse());
        assertEquals(45.0, hop.getTime());
        assertEquals("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.", hop.getNotes());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopType.Bittering, hop.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf, hop.getForm());
        assertEquals(5.5, hop.getBetaPercentage());
        assertEquals(30, hop.getHopStabilityIndex());
        assertEquals("Planet Krypton", hop.getPlaceOfOrigin());
        assertEquals("Goldings, Fuggles, Super Alpha", hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertEquals(13.2, hop.getCohumuloneLevel());
        assertEquals(24.4, hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }

    void testFromObjectModelNull() {
        Hop hop = _hopConverter.fromObjectModel(null);

        assertNull(hop);
    }

    void testFromObjectModelRequiredFieldsOnly() {
        com.grandpasbrewing.objectmodel.Hop objectModelHop = new com.grandpasbrewing.objectmodel.Hop();

        objectModelHop.setName("Cascade");
        objectModelHop.setVersion(1);
        objectModelHop.setAlphaPercentage(5.0);
        objectModelHop.setAmount(0.100);
        objectModelHop.setUse(com.grandpasbrewing.objectmodel.enums.HopUse.Boil);
        objectModelHop.setTime(60);

        Hop hop = _hopConverter.fromObjectModel(objectModelHop);

        assertEquals("Cascade", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(5.0, hop.getAlphaPercentage());
        assertEquals(0.100, hop.getAmount());
        assertEquals(HopUse.Boil, hop.getUse());
        assertEquals(60, hop.getTime());
        assertNull(hop.getNotes());
        assertNull(hop.getType());
        assertNull(hop.getForm());
        assertNull(hop.getBetaPercentage());
        assertNull(hop.getHopStabilityIndex());
        assertNull(hop.getPlaceOfOrigin());
        assertNull(hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertNull(hop.getCohumuloneLevel());
        assertNull(hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }

    void testFromObjectModelDryHopForThreeDays() {
        com.grandpasbrewing.objectmodel.Hop objectModelHop = new com.grandpasbrewing.objectmodel.Hop();

        objectModelHop.setName("Fuggles");
        objectModelHop.setVersion(1);
        objectModelHop.setAlphaPercentage(4.5);
        objectModelHop.setAmount(0.250);
        objectModelHop.setUse(com.grandpasbrewing.objectmodel.enums.HopUse.DryHop);
        objectModelHop.setTime(10080.0);

        Hop hop = _hopConverter.fromObjectModel(objectModelHop);

        assertEquals("Fuggles", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(4.5, hop.getAlphaPercentage());
        assertEquals(0.250, hop.getAmount());
        assertEquals(HopUse.DryHop, hop.getUse());
        assertEquals(10080.0, hop.getTime());
        assertNull(hop.getNotes());
        assertNull(hop.getType());
        assertNull(hop.getForm());
        assertNull(hop.getBetaPercentage());
        assertNull(hop.getHopStabilityIndex());
        assertNull(hop.getPlaceOfOrigin());
        assertNull(hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertNull(hop.getCohumuloneLevel());
        assertNull(hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }

    public void testFromObjectModelMashHopsWithAllFieldsInShuffledOrder() {
        com.grandpasbrewing.objectmodel.Hop objectModelHop = new com.grandpasbrewing.objectmodel.Hop();

        objectModelHop.setAmount(0.050);
        objectModelHop.setVersion(1);
        objectModelHop.setUse(com.grandpasbrewing.objectmodel.enums.HopUse.Mash);
        objectModelHop.setAlphaPercentage(4.5);
        objectModelHop.setNotes("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.");
        objectModelHop.setTime(45.0);
        objectModelHop.setBetaPercentage(5.5);
        objectModelHop.setName("Super Hops");
        objectModelHop.setPlaceOfOrigin("Planet Krypton");
        objectModelHop.setSubstitutes("Goldings, Fuggles, Super Alpha");
        objectModelHop.setMyrceneLevel(24.4);
        objectModelHop.setHopStabilityIndex(30);
        objectModelHop.setForm(com.grandpasbrewing.objectmodel.enums.HopForm.Leaf);
        objectModelHop.setType(com.grandpasbrewing.objectmodel.enums.HopType.Bittering);
        objectModelHop.setCohumuloneLevel(13.2);

        Hop hop = _hopConverter.fromObjectModel(objectModelHop);

        assertEquals("Super Hops", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(4.5, hop.getAlphaPercentage());
        assertEquals(0.050, hop.getAmount());
        assertEquals(HopUse.Mash, hop.getUse());
        assertEquals(45.0, hop.getTime());
        assertEquals("This hop is a really cool hops - you can use it for anything.  It leaps over buildings in a single bound, is faster than a speeding bullet and makes really bitter beer.", hop.getNotes());
        assertEquals(HopType.Bittering, hop.getType());
        assertEquals(HopForm.Leaf, hop.getForm());
        assertEquals(5.5, hop.getBetaPercentage());
        assertEquals(30, hop.getHopStabilityIndex());
        assertEquals("Planet Krypton", hop.getPlaceOfOrigin());
        assertEquals("Goldings, Fuggles, Super Alpha", hop.getSubstitutes());
        assertNull(hop.getHumuleneLevel());
        assertNull(hop.getCaryophylleneLevel());
        assertEquals(13.2, hop.getCohumuloneLevel());
        assertEquals(24.4, hop.getMyrceneLevel());
        assertNull(hop.getDisplayAmount());
        assertNull(hop.getInventory());
        assertNull(hop.getDisplayTime());
    }
}
