package com.grandpasbrewing.objectmodel.enums

class StateTest  extends GroovyTestCase {
    void testGetName() {
        assertEquals("Alabama", State.Alabama.getName());
        assertEquals("Alaska", State.Alaska.getName());
        assertEquals("Arizona", State.Arizona.getName());
        assertEquals("Arkansas", State.Arkansas.getName());
        assertEquals("California", State.California.getName());
        assertEquals("Colorado", State.Colorado.getName());
        assertEquals("Connecticut", State.Connecticut.getName());
        assertEquals("Delaware", State.Delaware.getName());
        assertEquals("District of Columbia", State.DistrictOfColumbia.getName());
        assertEquals("Florida", State.Florida.getName());
        assertEquals("Georgia", State.Georgia.getName());
        assertEquals("Hawaii", State.Hawaii.getName());
        assertEquals("Idaho", State.Idaho.getName());
        assertEquals("Illinois", State.Illinois.getName());
        assertEquals("Indiana", State.Indiana.getName());
        assertEquals("Iowa", State.Iowa.getName());
        assertEquals("Kansas", State.Kansas.getName());
        assertEquals("Kentucky", State.Kentucky.getName());
        assertEquals("Louisiana", State.Louisiana.getName());
        assertEquals("Maine", State.Maine.getName());
        assertEquals("Maryland", State.Maryland.getName());
        assertEquals("Massachusetts", State.Massachusetts.getName());
        assertEquals("Michigan", State.Michigan.getName());
        assertEquals("Minnesota", State.Minnesota.getName());
        assertEquals("Mississippi", State.Mississippi.getName());
        assertEquals("Missouri", State.Missouri.getName());
        assertEquals("Montana", State.Montana.getName());
        assertEquals("Nebraska", State.Nebraska.getName());
        assertEquals("Nevada", State.Nevada.getName());
        assertEquals("New Hampshire", State.NewHampshire.getName());
        assertEquals("New Jersey", State.NewJersey.getName());
        assertEquals("New Mexico", State.NewMexico.getName());
        assertEquals("New York", State.NewYork.getName());
        assertEquals("North Carolina", State.NorthCarolina.getName());
        assertEquals("North Dakota", State.NorthDakota.getName());
        assertEquals("Ohio", State.Ohio.getName());
        assertEquals("Oklahoma", State.Oklahoma.getName());
        assertEquals("Oregon", State.Oregon.getName());
        assertEquals("Pennsylvania", State.Pennsylvania.getName());
        assertEquals("Rhode Island", State.RhodeIsland.getName());
        assertEquals("South Carolina", State.SouthCarolina.getName());
        assertEquals("South Dakota", State.SouthDakota.getName());
        assertEquals("Tennessee", State.Tennessee.getName());
        assertEquals("Texas", State.Texas.getName());
        assertEquals("Utah", State.Utah.getName());
        assertEquals("Vermont", State.Vermont.getName());
        assertEquals("Virginia", State.Virginia.getName());
        assertEquals("Washington", State.Washington.getName());
        assertEquals("West Virginia", State.WestVirginia.getName());
        assertEquals("Wisconsin", State.Wisconsin.getName());
        assertEquals("Wyoming", State.Wyoming.getName());
    }

    void testGetAbbreviation() {
        assertEquals("AL", State.Alabama.getAbbreviation());
        assertEquals("AK", State.Alaska.getAbbreviation());
        assertEquals("AZ", State.Arizona.getAbbreviation());
        assertEquals("AR", State.Arkansas.getAbbreviation());
        assertEquals("CA", State.California.getAbbreviation());
        assertEquals("CO", State.Colorado.getAbbreviation());
        assertEquals("CT", State.Connecticut.getAbbreviation());
        assertEquals("DE", State.Delaware.getAbbreviation());
        assertEquals("DC", State.DistrictOfColumbia.getAbbreviation());
        assertEquals("FL", State.Florida.getAbbreviation());
        assertEquals("GA", State.Georgia.getAbbreviation());
        assertEquals("HI", State.Hawaii.getAbbreviation());
        assertEquals("ID", State.Idaho.getAbbreviation());
        assertEquals("IL", State.Illinois.getAbbreviation());
        assertEquals("IN", State.Indiana.getAbbreviation());
        assertEquals("IA", State.Iowa.getAbbreviation());
        assertEquals("KS", State.Kansas.getAbbreviation());
        assertEquals("KY", State.Kentucky.getAbbreviation());
        assertEquals("LA", State.Louisiana.getAbbreviation());
        assertEquals("ME", State.Maine.getAbbreviation());
        assertEquals("MD", State.Maryland.getAbbreviation());
        assertEquals("MA", State.Massachusetts.getAbbreviation());
        assertEquals("MI", State.Michigan.getAbbreviation());
        assertEquals("MN", State.Minnesota.getAbbreviation());
        assertEquals("MS", State.Mississippi.getAbbreviation());
        assertEquals("MO", State.Missouri.getAbbreviation());
        assertEquals("MT", State.Montana.getAbbreviation());
        assertEquals("NE", State.Nebraska.getAbbreviation());
        assertEquals("NV", State.Nevada.getAbbreviation());
        assertEquals("NH", State.NewHampshire.getAbbreviation());
        assertEquals("NJ", State.NewJersey.getAbbreviation());
        assertEquals("NM", State.NewMexico.getAbbreviation());
        assertEquals("NY", State.NewYork.getAbbreviation());
        assertEquals("NC", State.NorthCarolina.getAbbreviation());
        assertEquals("ND", State.NorthDakota.getAbbreviation());
        assertEquals("OH", State.Ohio.getAbbreviation());
        assertEquals("OK", State.Oklahoma.getAbbreviation());
        assertEquals("OR", State.Oregon.getAbbreviation());
        assertEquals("PA", State.Pennsylvania.getAbbreviation());
        assertEquals("RI", State.RhodeIsland.getAbbreviation());
        assertEquals("SC", State.SouthCarolina.getAbbreviation());
        assertEquals("SD", State.SouthDakota.getAbbreviation());
        assertEquals("TN", State.Tennessee.getAbbreviation());
        assertEquals("TX", State.Texas.getAbbreviation());
        assertEquals("UT", State.Utah.getAbbreviation());
        assertEquals("VT", State.Vermont.getAbbreviation());
        assertEquals("VA", State.Virginia.getAbbreviation());
        assertEquals("WA", State.Washington.getAbbreviation());
        assertEquals("WV", State.WestVirginia.getAbbreviation());
        assertEquals("WI", State.Wisconsin.getAbbreviation());
        assertEquals("WY", State.Wyoming.getAbbreviation());
    }
}