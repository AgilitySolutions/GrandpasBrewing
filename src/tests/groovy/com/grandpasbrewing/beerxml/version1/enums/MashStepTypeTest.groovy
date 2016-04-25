package com.grandpasbrewing.beerxml.version1.enums

class MashStepTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Infusion", MashStepType.Infusion.getDescription());
        assertEquals("Temperature", MashStepType.Temperature.getDescription());
        assertEquals("Decoction", MashStepType.Decoction.getDescription());
    }

    void testFromDescription() {
        assertEquals(MashStepType.Infusion, MashStepType.fromDescription("Infusion"));
        assertEquals(MashStepType.Temperature,  MashStepType.fromDescription("Temperature"));
        assertEquals(MashStepType.Decoction,  MashStepType.fromDescription("Decoction"));
        assertEquals(null,  MashStepType.fromDescription("unknown"));
    }
}

