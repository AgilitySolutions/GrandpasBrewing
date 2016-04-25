package com.grandpasbrewing.objectmodel

class IngredientTest extends GroovyTestCase {
    private Ingredient _ingredient;

    void setUp() {
        super.setUp()

        _ingredient = new Ingredient();
    }

    void testSetGetName() {
        _ingredient.setName("Test Name");
        assertEquals("Test Name", _ingredient.getName());
    }

    void testSetGetId() {
        _ingredient.setId(1);
        assertEquals(1, _ingredient.getId());
    }
}
