package com.grandpasbrewing.objectmodel

import com.grandpasbrewing.objectmodel.enums.RatingScore
import com.grandpasbrewing.objectmodel.enums.ServingType

class RatingTest extends GroovyTestCase {
    private Rating _rating;

    void setUp() {
        super.setUp()

        _rating = new Rating();
    }

    void testSetGetBeer() {
        Beer beer = new Beer();
        beer.setName("Test Beer");

        _rating.setBeer(beer);
        assertEquals("Test Beer", _rating.getBeer().getName());
    }

    void testSetGetBatch() {
        Batch batch = new Batch();
        batch.setId(999);

        _rating.setBatch(batch);
        assertEquals(999, _rating.getBatch().getId());
    }

    void testSetGetReviewer() {
        Reviewer reviewer = new Reviewer();
        reviewer.setName("Test Reviewer");

        _rating.setReviewer(reviewer);
        assertEquals("Test Reviewer", _rating.getReviewer().getName());
    }

    void testSetGetReviewDateTime() {
        Date date = new Date(2015, 4, 10);

        _rating.setReviewDateTime(date);
        assertEquals(date, _rating.getReviewDateTime());
    }

    void testSetGetServingType() {
        _rating.setServingType(ServingType.Growler);
        assertEquals(ServingType.Growler, _rating.getServingType());
    }

    void testSetGetAppearance() {
        _rating.setAppearance(RatingScore.FourPointSeventyFive);
        assertEquals(RatingScore.FourPointSeventyFive, _rating.getAppearance());
    }

    void testSetGetSmell() {
        _rating.setSmell(RatingScore.FivePointZero);
        assertEquals(RatingScore.FivePointZero, _rating.getSmell());
    }

    void testSetGetTaste() {
        _rating.setTaste(RatingScore.OnePointFifty);
        assertEquals(RatingScore.OnePointFifty, _rating.getTaste());
    }

    void testSetGetMouthfeel() {
        _rating.setMouthfeel(RatingScore.ThreePointSeventyFive);
        assertEquals(RatingScore.ThreePointSeventyFive, _rating.getMouthfeel());
    }

    void testSetGetOverall() {
        _rating.setOverall(RatingScore.TwoPointTwentyFive);
        assertEquals(RatingScore.TwoPointTwentyFive, _rating.getOverall());
    }

    void testSetGetComments() {
        _rating.setComments("Test Comments");
        assertEquals("Test Comments", _rating.getComments());
    }

    void testSetGetId() {
        _rating.setId(1);
        assertEquals(1, _rating.getId());
    }
}
