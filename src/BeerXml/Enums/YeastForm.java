package BeerXml.Enums;

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
