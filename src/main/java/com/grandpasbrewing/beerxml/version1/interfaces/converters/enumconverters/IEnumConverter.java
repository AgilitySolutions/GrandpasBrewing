package com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters;

public interface IEnumConverter<TBeerXmlEnum, TObjectModelEnum> {
    TObjectModelEnum toObjectModel(TBeerXmlEnum enumValue);
    TBeerXmlEnum fromObjectModel(TObjectModelEnum enumValue);
}
