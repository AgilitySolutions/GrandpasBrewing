package com.grandpasbrewing.objectmodel;

import java.util.ArrayList;

public class RecipeCollection {
    public ArrayList<Recipe> getRecipes() {
        return _recipes;
    }

    public void setRecipes(ArrayList<Recipe> _recipes) {
        this._recipes = _recipes;
    }

    private ArrayList<Recipe> _recipes;
}
