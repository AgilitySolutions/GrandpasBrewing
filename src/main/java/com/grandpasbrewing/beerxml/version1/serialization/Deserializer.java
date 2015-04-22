package com.grandpasbrewing.beerxml.version1.serialization;

import com.grandpasbrewing.beerxml.version1.interfaces.serialization.IBeerXmlSerialization;
import com.grandpasbrewing.beerxml.version1.interfaces.serialization.IDeserializer;
import com.grandpasbrewing.beerxml.version1.objects.Equipment;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Deserializer implements IDeserializer {
    public IBeerXmlSerialization toBeerXml(String xmlString) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Equipment.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        return (IBeerXmlSerialization) unmarshaller.unmarshal(new StringReader(xmlString));
    }
}
