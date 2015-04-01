package com.grandpasbrewing.beerxml.version1.enums

class MashStepTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Infusion", MashStepType.Infusion.getDescription());
        assertEquals("Temperature", MashStepType.Temperature.getDescription());
        assertEquals("Decoction", MashStepType.Decoction.getDescription());
    }
}

