package BeerXml.Enums

class MiscUseTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Boil", MiscUse.Boil.getDescription());
        assertEquals("Mash", MiscUse.Mash.getDescription());
        assertEquals("Primary", MiscUse.Primary.getDescription());
        assertEquals("Secondary", MiscUse.Secondary.getDescription());
        assertEquals("Bottle", MiscUse.Bottle.getDescription());
    }
}
