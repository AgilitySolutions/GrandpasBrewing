package com.grandpasbrewing.objectmodel.enums

class FermentableTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Grain", FermentableType.Grain.getDescription());
        assertEquals("Sugar", FermentableType.Sugar.getDescription());
        assertEquals("Extract", FermentableType.Extract.getDescription());
        assertEquals("Dry Extract", FermentableType.DryExtract.getDescription());
        assertEquals("Adjunct", FermentableType.Adjunct.getDescription());
    }
}
