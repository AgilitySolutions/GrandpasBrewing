package com.grandpasbrewing.objectmodel

class IngredientTest extends GroovyTestCase {
    private Ingredient _ingredient;

    void setUp() {
        super.setUp()

        _ingredient = new Ingredient();
    }

    void testSetGetId() {
        _ingredient.setId(1);
        assertEquals(1, _ingredient.getId());
    }
}
