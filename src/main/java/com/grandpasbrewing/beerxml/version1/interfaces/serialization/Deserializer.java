package com.grandpasbrewing.beerxml.version1.interfaces.serialization;

import javax.xml.bind.JAXBException;

public interface Deserializer<T extends BeerXmlSerialization> {
    T toBeerXml(String xmlString, Class<T> jaxbClass) throws JAXBException;
}
