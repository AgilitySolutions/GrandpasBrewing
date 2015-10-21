package com.grandpasbrewing.beerxml.version1.interfaces.converters.enumconverters;

public interface EnumConverter<TBeerXmlEnum, TObjectModelEnum> {
    TObjectModelEnum toObjectModel(TBeerXmlEnum enumValue);
    TBeerXmlEnum fromObjectModel(TObjectModelEnum enumValue);
}
