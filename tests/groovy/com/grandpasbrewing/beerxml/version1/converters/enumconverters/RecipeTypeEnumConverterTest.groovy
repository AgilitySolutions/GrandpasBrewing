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
}
