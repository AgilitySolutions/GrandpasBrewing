package com.grandpasbrewing.beerxml.version1.objects;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.BeerXmlSerialization;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "RECIPES")
public class RecipeCollection implements BeerXmlSerialization {

    public ArrayList<Recipe> getRecipes() {
        return _recipes;
    }

    @XmlElement(name = "RECIPE")
    public void setRecipes(ArrayList<Recipe> _recipes) {
        this._recipes = _recipes;
    }

    private ArrayList<Recipe> _recipes;
}
