package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MiscType
import com.grandpasbrewing.beerxml.version1.enums.MiscUse
import com.grandpasbrewing.beerxml.version1.objects.Misc

class MiscBeerXmlDeserializerTest extends GroovyTestCase {
    private BeerXmlDeserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new BeerXmlDeserializer<Misc>();
    }

    void testToBeerXmlMiscIrishMossWithMinimalFields() {
        String xml = "<MISC>" +
                "<NAME>Irish Moss</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Fining</TYPE>" +
                "<USE>Boil</USE>" +
                "<TIME>15.0</TIME>" +
                "<AMOUNT>0.010</AMOUNT>" +
                "</MISC>";

        Misc misc = (Misc) _deserializer.toBeerXml(xml, Misc.class);

        assertEquals("Irish Moss", misc.getName());
        assertEquals(1, misc.getVersion());
        assertEquals(MiscType.Fining, misc.getType());
        assertEquals(MiscUse.Boil, misc.getUse());
        assertEquals(15.0, misc.getTime());
        assertEquals(0.010, misc.getAmount());
        assertNull(misc.getAmountIsWeight());
        assertNull(misc.getUseFor());
        assertNull(misc.getNotes());
        assertNull(misc.getDisplayAmount());
        assertNull(misc.getInventory());
        assertNull(misc.getDisplayTime());
    }

    void testToBeerXmlMiscCorianderSpiceWithATypicalSetOfFields() {
        String xml = "<MISC>\n" +
                "<NAME>Coriander</NAME>" +
                "<TYPE>Spice</TYPE>" +
                "<VERSION>1</VERSION>" +
                "<USE>Boil</USE>" +
                "<TIME>5.0</TIME>" +
                "<AMOUNT>0.025</AMOUNT>" +
                "<USE_FOR>Belgian Wit Spice</USE_FOR>" +
                "<NOTES>Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor." +
                "</NOTES>" +
                "</MISC>";

        Misc misc = (Misc) _deserializer.toBeerXml(xml, Misc.class);

        assertEquals("Coriander", misc.getName());
        assertEquals(1, misc.getVersion());
        assertEquals(MiscType.Spice, misc.getType());
        assertEquals(MiscUse.Boil, misc.getUse());
        assertEquals(5.0, misc.getTime());
        assertEquals(0.025, misc.getAmount());
        assertNull(misc.getAmountIsWeight());
        assertEquals("Belgian Wit Spice", misc.getUseFor());
        assertEquals("Used in Belgian Wit, Whites, and Holiday ales.Very good when used in light wheat ales.Often used with Bitter Orange Peel. Crack open seeds and add at the end of the boil to extract aroma and flavor.", misc.getNotes());
        assertNull(misc.getDisplayAmount());
        assertNull(misc.getInventory());
        assertNull(misc.getDisplayTime());
    }
}
