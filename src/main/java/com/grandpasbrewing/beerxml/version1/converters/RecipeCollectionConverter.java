package com.grandpasbrewing.beerxml.version1.converters;

import com.grandpasbrewing.beerxml.version1.objects.Recipe;
import com.grandpasbrewing.beerxml.version1.objects.RecipeCollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class RecipeCollectionConverter {
    private RecipeConverter _recipeConverter;

    public RecipeCollectionConverter(RecipeConverter recipeConverter) {
        if (recipeConverter == null) throw new IllegalArgumentException("recipeConverter");

        _recipeConverter = recipeConverter;
    }

    public com.grandpasbrewing.objectmodel.RecipeCollection toObjectModel(RecipeCollection beerXmlObject) {
        if (beerXmlObject == null)
            return null;

        com.grandpasbrewing.objectmodel.RecipeCollection recipeCollection = new com.grandpasbrewing.objectmodel.RecipeCollection();

        ListIterator<Recipe> recipeIterator = beerXmlObject.getRecipes().listIterator();
        ArrayList<com.grandpasbrewing.objectmodel.Recipe> recipeArrayList = new ArrayList<com.grandpasbrewing.objectmodel.Recipe>();

        while (recipeIterator.hasNext())
        {
            Recipe recipe = recipeIterator.next();
            recipeArrayList.add(_recipeConverter.toObjectModel(recipe));
        }

        recipeCollection.setRecipes(recipeArrayList);

        return recipeCollection;
    }

    public RecipeCollection fromObjectModel(com.grandpasbrewing.objectmodel.RecipeCollection objectModelObject) {
        return null;
    }
}
