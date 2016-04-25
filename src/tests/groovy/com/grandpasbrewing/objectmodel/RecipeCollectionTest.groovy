package com.grandpasbrewing.objectmodel

class RecipeCollectionTest extends GroovyTestCase {
    private RecipeCollection _recipeCollection;

    void setUp() {
        super.setUp()

        _recipeCollection = new RecipeCollection();
    }

    void testSetGetRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        recipes.add(new Recipe());
        recipes.add(new Recipe());
        recipes.add(new Recipe());

        _recipeCollection.setRecipes(recipes);
        assertEquals(3, _recipeCollection.getRecipes().size());
    }
}
