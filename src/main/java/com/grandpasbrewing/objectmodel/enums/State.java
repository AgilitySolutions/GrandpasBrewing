package com.grandpasbrewing.objectmodel.enums;

public enum State {
    Alabama("AL", "Alabama"),
    Alaska("AK", "Alaska"),
    Arizona("AZ", "Arizona"),
    Arkansas("AR", "Arkansas"),
    California("CA", "California"),
    Colorado("CO", "Colorado"),
    Connecticut("CT", "Connecticut"),
    Delaware("DE", "Delaware"),
    DistrictOfColumbia("DC", "District of Columbia"),
    Florida("FL", "Florida"),
    Georgia("GA", "Georgia"),
    Hawaii("HI", "Hawaii"),
    Idaho("ID", "Idaho"),
    Illinois("IL", "Illinois"),
    Indiana("IN", "Indiana"),
    Iowa("IA", "Iowa"),
    Kansas("KS", "Kansas"),
    Kentucky("KY", "Kentucky"),
    Louisiana("LA", "Louisiana"),
    Maine("ME", "Maine"),
    Maryland("MD", "Maryland"),
    Massachusetts("MA", "Massachusetts"),
    Michigan("MI", "Michigan"),
    Minnesota("MN", "Minnesota"),
    Mississippi("MS", "Mississippi"),
    Missouri("MO", "Missouri"),
    Montana("MT", "Montana"),
    Nebraska("NE", "Nebraska"),
    Nevada("NV", "Nevada"),
    NewHampshire("NH", "New Hampshire"),
    NewJersey("NJ", "New Jersey"),
    NewMexico("NM", "New Mexico"),
    NewYork("NY", "New York"),
    NorthCarolina("NC", "North Carolina"),
    NorthDakota("ND", "North Dakota"),
    Ohio("OH", "Ohio"),
    Oklahoma("OK", "Oklahoma"),
    Oregon("OR", "Oregon"),
    Pennsylvania("PA", "Pennsylvania"),
    RhodeIsland("RI", "Rhode Island"),
    SouthCarolina("SC", "South Carolina"),
    SouthDakota("SD", "South Dakota"),
    Tennessee("TN", "Tennessee"),
    Texas("TX", "Texas"),
    Utah("UT", "Utah"),
    Vermont("VT", "Vermont"),
    Virginia("VA", "Virginia"),
    Washington("WA", "Washington"),
    WestVirginia("WV", "West Virginia"),
    Wisconsin("WI", "Wisconsin"),
    Wyoming("WY", "Wyoming");

    private final String _abbreviation;
    private final String _name;

    State(String abbreviation, String name) {
        _abbreviation = abbreviation;
        _name = name;
    }

    public String getAbbreviation() { return _abbreviation; }
    public String getName() { return _name; }
}
