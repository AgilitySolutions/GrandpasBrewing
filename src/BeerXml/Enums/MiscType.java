package BeerXml.Enums;

public enum MiscType {
    Spice("Spice"),
    Fining("Fining"),
    WaterAgent("Water Agent"),
    Herb("Herb"),
    Flavor("Flavor"),
    Other("Other");

    MiscType(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() {
        return _description;
    }
}
