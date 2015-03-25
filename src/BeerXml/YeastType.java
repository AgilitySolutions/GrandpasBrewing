package BeerXml;

public enum YeastType {
    Ale,
    Lager,
    Wheat,
    Wine,
    Champagne;

    public String getDescription()
    {
        return this.toString();
    }
}
