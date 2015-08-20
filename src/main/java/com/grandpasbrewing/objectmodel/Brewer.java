package com.grandpasbrewing.objectmodel;

import com.agilitysolutions.objectmodel.ObjectModelBase;

public class Brewer extends ObjectModelBase {
    private String _name;

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
