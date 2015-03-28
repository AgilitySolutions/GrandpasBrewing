package BeerXml.Enums;

public enum MashStepType {
    Infusion,
    Temperature,
    Decoction;

    public String getDesccription() {
        return toString();
    }
}
