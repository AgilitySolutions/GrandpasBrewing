package BeerXml.Enums;

public enum RecipeType {
    Extract("Extract"),
    PartialMash("Partial Mash"),
    AllGrain("All Grain");

    RecipeType(String description)
    {
        _description = description;
    }

    private String _description;

    public String getDescription()
    {
        return _description;
    }
}
