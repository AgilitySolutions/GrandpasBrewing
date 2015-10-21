package com.grandpasbrewing.beerxml.version1.interfaces.serialization;

import javax.xml.bind.JAXBException;

public interface Serializer<T extends BeerXmlSerialization> {
    String fromBeerXml(T beerXmlObject, Class<T> jaxbClass) throws JAXBException;
}
