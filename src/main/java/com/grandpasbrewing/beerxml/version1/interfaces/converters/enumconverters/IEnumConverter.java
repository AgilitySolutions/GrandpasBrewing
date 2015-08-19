package com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters;

public interface IEnumConverter<TBeerXmlEnum, ObjectModelBase> {
    ObjectModelBase toObjectModel(TBeerXmlEnum enumValue);
}
