package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MashStepTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.MashStep

class MashStepConverterTest extends GroovyTestCase {
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;
    private MashStepConverter _mashStepConverter;

    void setUp() {
        super.setUp()

        _mashStepTypeEnumConverter = new MashStepTypeEnumConverter();
        _mashStepConverter = new MashStepConverter(_mashStepTypeEnumConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.MashStep mashStep = _mashStepConverter.toObjectModel(null);

        assertNull(mashStep);
    }

    void testToObjectModelMashStepInfusionStep()
    {
        MashStep beerXmlObjectMashStep = new MashStep();

        beerXmlObjectMashStep.setName("Conversion step");
        beerXmlObjectMashStep.setVersion(1);
        beerXmlObjectMashStep.setType(MashStepType.Infusion);
        beerXmlObjectMashStep.setStepTemperature(68.0);
        beerXmlObjectMashStep.setStepTime(70.0);
        beerXmlObjectMashStep.setInfuseAmount(5.0);

        com.grandpasbrewing.objectmodel.MashStep mashStep = _mashStepConverter.toObjectModel(beerXmlObjectMashStep);

        assertEquals("Conversion step", mashStep.getName());
        assertEquals(1, mashStep.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion, mashStep.getType());
        assertEquals(5.0, mashStep.getInfuseAmount());
        assertEquals(68.0, mashStep.getStepTemperature());
        assertEquals(70.0, mashStep.getStepTime());
        assertNull(mashStep.getRampTime());
        assertNull(mashStep.getEndTemperature());
    }

    void testToObjectModelMashStepDecoctionStep() {
        MashStep beerXmlObjectMashStep = new MashStep();

        beerXmlObjectMashStep.setName("Conversion Decoction");
        beerXmlObjectMashStep.setVersion(1);
        beerXmlObjectMashStep.setType(MashStepType.Decoction);
        beerXmlObjectMashStep.setStepTemperature(68.0);
        beerXmlObjectMashStep.setStepTime(90.0);

        com.grandpasbrewing.objectmodel.MashStep mashStep = _mashStepConverter.toObjectModel(beerXmlObjectMashStep);

        assertEquals("Conversion Decoction", mashStep.getName());
        assertEquals(1, mashStep.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction, mashStep.getType());
        assertNull(mashStep.getInfuseAmount());
        assertEquals(68.0, mashStep.getStepTemperature());
        assertEquals(90.0, mashStep.getStepTime());
        assertNull(mashStep.getRampTime());
        assertNull(mashStep.getEndTemperature());
    }

    void testFromObjectModelNull() {
        MashStep mashStep = _mashStepConverter.fromObjectModel(null);

        assertNull(mashStep);
    }

    void testFromObjectModelMashStepInfusionStep()
    {
        com.grandpasbrewing.objectmodel.MashStep objectModelMashStep = new com.grandpasbrewing.objectmodel.MashStep();

        objectModelMashStep.setName("Conversion step");
        objectModelMashStep.setVersion(1);
        objectModelMashStep.setType(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion);
        objectModelMashStep.setStepTemperature(68.0);
        objectModelMashStep.setStepTime(70.0);
        objectModelMashStep.setInfuseAmount(5.0);

        MashStep mashStep = _mashStepConverter.fromObjectModel(objectModelMashStep);

        assertEquals("Conversion step", mashStep.getName());
        assertEquals(1, mashStep.getVersion());
        assertEquals(MashStepType.Infusion, mashStep.getType());
        assertEquals(5.0, mashStep.getInfuseAmount());
        assertEquals(68.0, mashStep.getStepTemperature());
        assertEquals(70.0, mashStep.getStepTime());
        assertNull(mashStep.getRampTime());
        assertNull(mashStep.getEndTemperature());
    }

    void testFromOjectModelMashStepDecoctionStep() {
        com.grandpasbrewing.objectmodel.MashStep objectModelMashStep = new com.grandpasbrewing.objectmodel.MashStep();

        objectModelMashStep.setName("Conversion Decoction");
        objectModelMashStep.setVersion(1);
        objectModelMashStep.setType(com.grandpasbrewing.objectmodel.enums.MashStepType.Decoction);
        objectModelMashStep.setStepTemperature(68.0);
        objectModelMashStep.setStepTime(90.0);

        MashStep mashStep = _mashStepConverter.fromObjectModel(objectModelMashStep);

        assertEquals("Conversion Decoction", mashStep.getName());
        assertEquals(1, mashStep.getVersion());
        assertEquals(MashStepType.Decoction, mashStep.getType());
        assertNull(mashStep.getInfuseAmount());
        assertEquals(68.0, mashStep.getStepTemperature());
        assertEquals(90.0, mashStep.getStepTime());
        assertNull(mashStep.getRampTime());
        assertNull(mashStep.getEndTemperature());
    }
}
