package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.HopForm
import com.grandpasbrewing.beerxml.version1.enums.HopType
import com.grandpasbrewing.beerxml.version1.enums.HopUse
import com.grandpasbrewing.beerxml.version1.objects.Hop

class HopBeerXmlDeserializerTest extends GroovyTestCase {
    private BeerXmlDeserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new BeerXmlDeserializer<Hop>();
    }

    void testToBeerHopRequiredFieldsOnly() {
        String xml = "<HOP>" +
                "<NAME>Cascade</NAME>" +
                "<VERSION>1</VERSION>" +
                "<ALPHA>5.0</ALPHA>" +
                "<AMOUNT>0.100</AMOUNT>" +
                "<USE>Boil</USE>" +
                "<TIME>60</TIME>" +
                "</HOP>";

        Hop hop = (Hop) _deserializer.toBeerXml(xml, Hop.class);

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

    void testToBeerHopDryHopForThreeDays() {
        String xml = "<HOP>" +
                "<NAME>Fuggles</NAME>" +
                "<VERSION>1</VERSION>" +
                "<ALPHA>4.5</ALPHA>" +
                "<AMOUNT>0.250</AMOUNT>" +
                "<USE>Dry Hop</USE>" +
                "<TIME>10080.0</TIME>" +
                "</HOP>";

        Hop hop = (Hop) _deserializer.toBeerXml(xml, Hop.class);

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

    void testToBeerHopMashHopsWithAllFieldsInShuffledOrder() {
        String xml = "<HOP>" +
                "<AMOUNT>0.050</AMOUNT>" +
                "<VERSION>1</VERSION>" +
                "<USE>Mash</USE>" +
                "<ALPHA>4.5</ALPHA>" +
                "<NOTES>This hop is a really cool hops - you can use it for anything. \n" +
                "It leaps over buildings in a single bound, is faster than\n" +
                "a speeding bullet and makes really bitter beer.\n" +
                "</NOTES>" +
                "<TIME>45.0</TIME>" +
                "<BETA>5.5 </BETA>" +
                "<NAME>Super Hops</NAME>" +
                "<ORIGIN>Planet Krypton</ORIGIN>" +
                "<SUBSTITUTES>Goldings, Fuggles, Super Alpha</SUBSTITUTES>" +
                "<MYRCENE>24.4</MYRCENE>" +
                "<HSI>30</HSI>" +
                "<FORM>Leaf</FORM>" +
                "<TYPE>Bittering</TYPE>" +
                "<COHUMULONE>13.2</COHUMULONE>" +
                "</HOP>";

        Hop hop = (Hop) _deserializer.toBeerXml(xml, Hop.class);

        assertEquals("Super Hops", hop.getName());
        assertEquals(1, hop.getVersion());
        assertEquals(4.5, hop.getAlphaPercentage());
        assertEquals(0.050, hop.getAmount());
        assertEquals(HopUse.Mash, hop.getUse());
        assertEquals(45.0, hop.getTime());
        assertEquals("This hop is a really cool hops - you can use it for anything. \n" +
                "It leaps over buildings in a single bound, is faster than\n" +
                "a speeding bullet and makes really bitter beer.\n", hop.getNotes());
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
