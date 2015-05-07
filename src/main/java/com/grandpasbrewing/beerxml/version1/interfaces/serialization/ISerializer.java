package com.grandpasbrewing.beerxml.version1.interfaces.serialization;

import javax.xml.bind.JAXBException;

public interface ISerializer<T extends IBeerXmlSerialization> {
    String fromBeerXml(T beerXmlObject, Class<T> jaxbClass) throws JAXBException;
}
