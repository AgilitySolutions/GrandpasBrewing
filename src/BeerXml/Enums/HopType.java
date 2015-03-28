package BeerXml.Enums;

public enum HopType {
    Bittering,
    Aroma,
    Both;

    public String getDescription() {
        return toString();
    }
}
