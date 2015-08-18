package com.grandpasbrewing.objectmodel;

import com.agilitysolutions.objectmodel.ObjectModelBase;

public class Reviewer extends ObjectModelBase {
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    private String _name;
}
