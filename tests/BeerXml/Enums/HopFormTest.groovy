package BeerXml.Enums

class HopFormTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Pellet", HopForm.Pellet.getDescription());
        assertEquals("Plug", HopForm.Plug.getDescription());
        assertEquals("Leaf", HopForm.Leaf.getDescription());
    }
}
