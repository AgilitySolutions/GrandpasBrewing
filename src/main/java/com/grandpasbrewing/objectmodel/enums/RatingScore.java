package com.grandpasbrewing.objectmodel.enums;

public enum RatingScore {
    NotSet(0.00, "Select One"),
    OnePointZero(1.00, "1.00 - Awful"),
    OnePointTwentyFive(1.25, "1.25"),
    OnePointFifty(1.50, "1.50"),
    OnePointSeventyFive(1.75, "1.75"),
    TwoPointZero(2.00, "2.00 - Poor"),
    TwoPointTwentyFive(2.25, "2.25"),
    TwoPointFifty(2.50, "2.50"),
    TwoPointSeventyFive(2.75, "2.75"),
    ThreePointZero(3.00, "3.00 - Okay"),
    ThreePointTwentyFive(3.25, "3.25"),
    ThreePointFifty(3.50, "3.50"),
    ThreePointSeventyFive(3.75, "3.75"),
    FourPointZero(4.00, "4.00 - Outstanding"),
    FourPointTwentyFive(4.25, "4.25"),
    FourPointFifty(4.50, "4.50"),
    FourPointSeventyFive(4.75, "4.75"),
    FivePointZero(5.00, "5.00 - Perfect");

    private final double _value;
    private final String _description;

    RatingScore(double value, String description) {
        _value = value;
        _description = description;
    }

    public double getValue() {
        return _value;
    }

    public String getDescription() {
        return _description;
    }
}