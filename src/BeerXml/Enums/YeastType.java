package BeerXml.Enums;

public enum YeastType {
    Ale,
    Lager,
    Wheat,
    Wine,
    Champagne;

    public String getDescription()
    {
        return toString();
    }
}
