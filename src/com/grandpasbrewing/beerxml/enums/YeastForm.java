package com.grandpasbrewing.beerxml.enums;

public enum YeastForm {
    Liquid,
    Dry,
    Slant,
    Culture;

    public String getDescription()
    {
       return toString();
    }
}
