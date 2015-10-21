package com.grandpasbrewing.beerxml.version1.serialization;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.BeerXmlSerialization;
import com.grandpasbrewing.beerxml.version1.interfaces.serialization.Deserializer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class BeerXmlDeserializer<T extends BeerXmlSerialization> implements Deserializer<T> {
       public T toBeerXml(String xmlString, Class<T> jaxbClass) throws JAXBException {
           JAXBContext context = JAXBContext.newInstance(jaxbClass);
           Unmarshaller unmarshaller = context.createUnmarshaller();

           return jaxbClass.cast(unmarshaller.unmarshal(new StringReader(xmlString)));
       }
}
