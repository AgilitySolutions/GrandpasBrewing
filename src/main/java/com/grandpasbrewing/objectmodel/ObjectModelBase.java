package com.grandpasbrewing.objectmodel;

public class ObjectModelBase {
    private int _id;
    private String _name;
    private Integer _version;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public Integer getVersion() {
        return _version;
    }

    public void setVersion(Integer _version) {
        this._version = _version;
    }
}
