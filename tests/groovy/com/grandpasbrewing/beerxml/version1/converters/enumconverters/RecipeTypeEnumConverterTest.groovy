package com.grandpasbrewing.beerxml.version1.converters.enumconverters

import com.grandpasbrewing.beerxml.version1.enums.RecipeType

class RecipeTypeEnumConverterTest extends GroovyTestCase {
    private RecipeTypeEnumConverter _recipeTypeEnumConverter;

    void setUp() {
        super.setUp()

        _recipeTypeEnumConverter = new RecipeTypeEnumConverter();
    }

    void testToObjectModel() {
        assertEquals(com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain, _recipeTypeEnumConverter.toObjectModel(RecipeType.AllGrain));
        assertEquals(com.grandpasbrewing.objectmodel.enums.RecipeType.Extract, _recipeTypeEnumConverter.toObjectModel(RecipeType.Extract));
        assertEquals(com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash, _recipeTypeEnumConverter.toObjectModel(RecipeType.PartialMash));
    }

    void testFromObjectModel() {
        assertEquals(RecipeType.AllGrain, _recipeTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.RecipeType.AllGrain));
        assertEquals(RecipeType.Extract, _recipeTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.RecipeType.Extract));
        assertEquals(RecipeType.PartialMash, _recipeTypeEnumConverter.fromObjectModel(com.grandpasbrewing.objectmodel.enums.RecipeType.PartialMash));
    }
}
