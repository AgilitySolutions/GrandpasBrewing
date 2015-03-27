package BeerXml.Enums

class MashStepTypeTest extends GroovyTestCase {
    void testGetDesccription() {
        assertEquals("Infusion", MashStepType.Infusion.getDesccription());
        assertEquals("Temperature", MashStepType.Temperature.getDesccription());
        assertEquals("Decoction", MashStepType.Decoction.getDesccription());
    }
}
