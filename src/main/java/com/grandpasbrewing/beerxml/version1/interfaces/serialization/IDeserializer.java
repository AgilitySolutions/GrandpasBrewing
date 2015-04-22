package com.grandpasbrewing.beerxml.version1.interfaces.serialization;

import javax.xml.bind.JAXBException;

public interface IDeserializer<T extends IBeerXmlSerialization> {
    T toBeerXml(String xmlString, Class<T> jaxbClass) throws JAXBException;
}
