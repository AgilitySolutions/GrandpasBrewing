package com.grandpasbrewing.beerxml.version1.interfaces.serialization;

import javax.xml.bind.JAXBException;

public interface IDeserializer {
    IBeerXmlSerialization toBeerXml(String xmlString) throws JAXBException;
}
