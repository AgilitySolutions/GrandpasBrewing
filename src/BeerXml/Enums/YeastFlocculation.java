package BeerXml.Enums;

public enum YeastFlocculation {
    Low("Low"),
    Medium("Medium"),
    High("High"),
    VeryHigh("Very High");

    YeastFlocculation(String description) {
        _description = description;
    }

    private final String _description;

    public String getDescription() { return _description; }
}
