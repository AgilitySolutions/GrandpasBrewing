package BeerXml.Enums;

public enum HopUse {
    Boil("Boil"),
    DryHop("Dry Hop"),
    Mash("Mash"),
    FirstWort("First Wort"),
    Aroma("Aroma");

    HopUse(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() {
        return _description;
    }
}
