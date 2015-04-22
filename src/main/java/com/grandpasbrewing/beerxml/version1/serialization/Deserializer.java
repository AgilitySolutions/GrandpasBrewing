package com.grandpasbrewing.beerxml.version1.serialization;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.IBeerXmlSerialization;
import com.grandpasbrewing.beerxml.version1.interfaces.serialization.IDeserializer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Deserializer<T extends IBeerXmlSerialization> implements IDeserializer<T> {
       public T toBeerXml(String xmlString, Class<T> jaxbClass) throws JAXBException {
           JAXBContext context = JAXBContext.newInstance(jaxbClass);
           Unmarshaller unmarshaller = context.createUnmarshaller();

           return jaxbClass.cast(unmarshaller.unmarshal(new StringReader(xmlString)));
       }
}
