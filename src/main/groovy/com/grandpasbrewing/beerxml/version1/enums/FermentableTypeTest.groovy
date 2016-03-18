package com.grandpasbrewing.beerxml.version1.enums

class FermentableTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Grain", FermentableType.Grain.getDescription());
        assertEquals("Sugar", FermentableType.Sugar.getDescription());
        assertEquals("Extract", FermentableType.Extract.getDescription());
        assertEquals("Dry Extract", FermentableType.DryExtract.getDescription());
        assertEquals("Adjunct", FermentableType.Adjunct.getDescription());
    }

    void testFromDescription() {
        assertEquals(FermentableType.Grain, FermentableType.fromDescription("Grain"));
        assertEquals(FermentableType.Sugar,  FermentableType.fromDescription("Sugar"));
        assertEquals(FermentableType.Extract,  FermentableType.fromDescription("Extract"));
        assertEquals(FermentableType.DryExtract,  FermentableType.fromDescription("Dry Extract"));
        assertEquals(FermentableType.Adjunct,  FermentableType.fromDescription("Adjunct"));
        assertEquals(null,  FermentableType.fromDescription("unknown"));
    }
}

