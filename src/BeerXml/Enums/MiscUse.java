package BeerXml.Enums;

public enum MiscUse {
    Boil,
    Mash,
    Primary,
    Secondary,
    Bottle;

    public String getDescription()
    {
        return toString();
    }
}
