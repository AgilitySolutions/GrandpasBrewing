package com.grandpasbrewing.beerxml.version1.serialization;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.BeerXmlSerialization;
import com.grandpasbrewing.beerxml.version1.interfaces.serialization.Serializer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import java.io.StringWriter;

public class BeerXmlSerializer<T extends BeerXmlSerialization> implements Serializer<T> {
    public String fromBeerXml(T beerXmlObject, Class<T> jaxbClass) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(jaxbClass);
        Marshaller marshaller = context.createMarshaller();

        QName qName = new QName(getNamespaceURI(jaxbClass));
        JAXBElement<T> jaxbElement = new JAXBElement<T>(qName, jaxbClass, beerXmlObject);

        marshaller.marshal(jaxbElement, writer);

        return writer.toString();
    }

    private String getNamespaceURI(Class<T> jaxbClass)
    {
        return jaxbClass.getAnnotation(XmlRootElement.class).name();
    }
}
