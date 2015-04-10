package com.grandpasbrewing.objectmodel.enums

class RatingScoreTest extends GroovyTestCase {
    void testGetValue() {
        assertEquals(1.00, RatingScore.OnePointZero.getValue());
        assertEquals(1.25, RatingScore.OnePointTwentyFive.getValue());
        assertEquals(1.50, RatingScore.OnePointFifty.getValue());
        assertEquals(1.75, RatingScore.OnePointSeventyFive.getValue());
        assertEquals(2.00, RatingScore.TwoPointZero.getValue());
        assertEquals(2.25, RatingScore.TwoPointTwentyFive.getValue());
        assertEquals(2.50, RatingScore.TwoPointFifty.getValue());
        assertEquals(2.75, RatingScore.TwoPointSeventyFive.getValue());
        assertEquals(3.00, RatingScore.ThreePointZero.getValue());
        assertEquals(3.25, RatingScore.ThreePointTwentyFive.getValue());
        assertEquals(3.50, RatingScore.ThreePointFifty.getValue());
        assertEquals(3.75, RatingScore.ThreePointSeventyFive.getValue());
        assertEquals(4.00, RatingScore.FourPointZero.getValue());
        assertEquals(4.25, RatingScore.FourPointTwentyFive.getValue());
        assertEquals(4.50, RatingScore.FourPointFifty.getValue());
        assertEquals(4.75, RatingScore.FourPointSeventyFive.getValue());
        assertEquals(5.00, RatingScore.FivePointZero.getValue());
    }

    void testGetDescription() {
        assertEquals("1.00 - Awful", RatingScore.OnePointZero.getDescription());
        assertEquals("1.25", RatingScore.OnePointTwentyFive.getDescription());
        assertEquals("1.50", RatingScore.OnePointFifty.getDescription());
        assertEquals("1.75", RatingScore.OnePointSeventyFive.getDescription());
        assertEquals("2.00 - Poor", RatingScore.TwoPointZero.getDescription());
        assertEquals("2.25", RatingScore.TwoPointTwentyFive.getDescription());
        assertEquals("2.50", RatingScore.TwoPointFifty.getDescription());
        assertEquals("2.75", RatingScore.TwoPointSeventyFive.getDescription());
        assertEquals("3.00 - Okay", RatingScore.ThreePointZero.getDescription());
        assertEquals("3.25", RatingScore.ThreePointTwentyFive.getDescription());
        assertEquals("3.50", RatingScore.ThreePointFifty.getDescription());
        assertEquals("3.75", RatingScore.ThreePointSeventyFive.getDescription());
        assertEquals("4.00 - Outstanding", RatingScore.FourPointZero.getDescription());
        assertEquals("4.25", RatingScore.FourPointTwentyFive.getDescription());
        assertEquals("4.50", RatingScore.FourPointFifty.getDescription());
        assertEquals("4.75", RatingScore.FourPointSeventyFive.getDescription());
        assertEquals("5.00 - Perfect", RatingScore.FivePointZero.getDescription());
    }
}
