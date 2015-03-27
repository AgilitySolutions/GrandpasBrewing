package BeerXml.Enums

class StyleTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Lager", StyleType.Lager.getDescription());
        assertEquals("Ale", StyleType.Ale.getDescription());
        assertEquals("Mead", StyleType.Mead.getDescription());
        assertEquals("Wheat", StyleType.Wheat.getDescription());
        assertEquals("Mixed", StyleType.Mixed.getDescription());
        assertEquals("Cider", StyleType.Cider.getDescription());
    }
}
