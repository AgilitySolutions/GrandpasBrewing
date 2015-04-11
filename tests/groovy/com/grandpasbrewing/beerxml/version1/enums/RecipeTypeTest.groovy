package com.grandpasbrewing.beerxml.version1.enums

class RecipeTypeTest extends GroovyTestCase {
    void testGetDescription() {
        assertEquals("Extract", RecipeType.Extract.getDescription());
        assertEquals("Partial Mash", RecipeType.PartialMash.getDescription());
        assertEquals("All Grain", RecipeType.AllGrain.getDescription());
    }
}

