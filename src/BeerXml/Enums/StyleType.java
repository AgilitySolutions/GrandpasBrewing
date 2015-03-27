package BeerXml.Enums;

public enum StyleType {
    Lager,
    Ale,
    Mead,
    Wheat,
    Mixed,
    Cider;

    public String getDescription() { return toString(); }
}
