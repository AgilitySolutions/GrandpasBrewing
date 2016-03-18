package com.grandpasbrewing.beerxml.version1.enums

class RecipeTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Extract", RecipeType.Extract.getDescription());
        assertEquals("Partial Mash", RecipeType.PartialMash.getDescription());
        assertEquals("All Grain", RecipeType.AllGrain.getDescription());
    }

    void testFromDescription() {
        assertEquals(RecipeType.Extract, RecipeType.fromDescription("Extract"));
        assertEquals(RecipeType.PartialMash,  RecipeType.fromDescription("Partial Mash"));
        assertEquals(RecipeType.AllGrain,  RecipeType.fromDescription("All Grain"));
        assertEquals(null,  RecipeType.fromDescription("unknown"));
    }
}

