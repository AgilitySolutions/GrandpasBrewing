package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;
import com.grandpasbrewing.objectmodel.enums.RatingScore;
import com.grandpasbrewing.objectmodel.enums.ServingType;

import java.util.Date;

public class Rating extends ObjectModelBase {
    public Beer getBeer() {
        return _beer;
    }

    public void setBeer(Beer beer) {
        _beer = beer;
    }

    public Batch getBatch() {
        return _batch;
    }

    public void setBatch(Batch batch) {
        _batch = batch;
    }

    public Reviewer getReviewer() {
        return _reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        _reviewer = reviewer;
    }

    public Date getReviewDateTime() {
        return _reviewDateTime;
    }

    public void setReviewDateTime(Date reviewDateTime) {
        _reviewDateTime = reviewDateTime;
    }

    public ServingType getServingType() {
        return _servingType;
    }

    public void setServingType(ServingType servingType) {
        _servingType = servingType;
    }

    public RatingScore getAppearance() {
        return _appearance;
    }

    public void setAppearance(RatingScore appearance) {
        _appearance = appearance;
    }

    public RatingScore getSmell() {
        return _smell;
    }

    public void setSmell(RatingScore smell) {
        _smell = smell;
    }

    public RatingScore getTaste() {
        return _taste;
    }

    public void setTaste(RatingScore taste) {
        _taste = taste;
    }

    public RatingScore getMouthfeel() {
        return _mouthfeel;
    }

    public void setMouthfeel(RatingScore mouthfeel) {
        _mouthfeel = mouthfeel;
    }

    public RatingScore getOverall() {
        return _overall;
    }

    public void setOverall(RatingScore overall) {
        _overall = overall;
    }

    public String getComments() {
        return _comments;
    }

    public void setComments(String comments) {
        _comments = comments;
    }

    private Beer _beer;
    private Batch _batch;
    private Reviewer _reviewer;
    private Date _reviewDateTime;
    private ServingType _servingType;
    private RatingScore _appearance;
    private RatingScore _smell;
    private RatingScore _taste;
    private RatingScore _mouthfeel;
    private RatingScore _overall;
    private String _comments;
}
