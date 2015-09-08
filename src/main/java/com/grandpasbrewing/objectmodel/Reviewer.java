package com.grandpasbrewing.objectmodel;

public class Reviewer extends ObjectModelBase {
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    private String _name;
}
