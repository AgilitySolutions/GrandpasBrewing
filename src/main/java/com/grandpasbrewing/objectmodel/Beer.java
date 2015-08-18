package com.grandpasbrewing.objectmodel;

import agilitysolutions.objectmodel.ObjectModelBase;

public class Beer extends ObjectModelBase {
    public Brewer getBrewer() {
        return _brewer;
    }

    public void setBrewer(Brewer brewer) {
        _brewer = brewer;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    private Brewer _brewer;
    private String _name;
}
