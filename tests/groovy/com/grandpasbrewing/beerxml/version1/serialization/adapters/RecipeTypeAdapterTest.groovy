package com.grandpasbrewing.beerxml.version1.serialization.adapters

import com.grandpasbrewing.beerxml.version1.enums.RecipeType

class RecipeTypeAdapterTest extends GroovyTestCase {
    private RecipeTypeAdapter _recipeTypeAdapter;

    void setUp() {
        super.setUp()

        _recipeTypeAdapter = new RecipeTypeAdapter();
    }

    void testUnmarshal() {
        assertEquals(RecipeType.Extract, _recipeTypeAdapter.unmarshal("Extract"));
        assertEquals(RecipeType.PartialMash, _recipeTypeAdapter.unmarshal("Partial Mash"));
        assertEquals(RecipeType.AllGrain, _recipeTypeAdapter.unmarshal("All Grain"));
        assertEquals(null, _recipeTypeAdapter.unmarshal("unknown"));
        assertEquals(null, _recipeTypeAdapter.unmarshal(null));
    }

    void testMarshal() {
        assertEquals("Extract", _recipeTypeAdapter.marshal(RecipeType.Extract));
        assertEquals("Partial Mash", _recipeTypeAdapter.marshal(RecipeType.PartialMash));
        assertEquals("All Grain", _recipeTypeAdapter.marshal(RecipeType.AllGrain));
        assertEquals(null, _recipeTypeAdapter.marshal(null));
    }
}
