package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.MashStep
import com.grandpasbrewing.beerxml.version1.objects.Style

class MashStepDeserializerTest extends GroovyTestCase {
    private Deserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new Deserializer<Style>();
    }

    void testToBeerXmlMashStepInfusionStep() {
        String xml = "<MASH_STEP>" +
                "<NAME>Conversion step</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Infusion</TYPE>" +
                "<STEP_TEMP>68.0</STEP_TEMP>" +
                "<STEP_TIME>70.0</STEP_TIME>" +
                "<INFUSE_AMOUNT>5.0</INFUSE_AMOUNT>" +
                "</MASH_STEP>";

        MashStep mashStep = (MashStep) _deserializer.toBeerXml(xml, MashStep.class);

        assertEquals("Conversion step", mashStep.getName());
        assertEquals(1, mashStep.getVersion());
        assertEquals(MashStepType.Infusion, mashStep.getType());
        assertEquals(5.0, mashStep.getInfuseAmount());
        assertEquals(68.0, mashStep.getStepTemperature());
        assertEquals(70.0, mashStep.getStepTime());
        assertNull(mashStep.getRampTime());
        assertNull(mashStep.getEndTemperature());
    }

    void testToBeerXmlMashStepDecoctionStep() {
        String xml = "<MASH_STEP>" +
                "<NAME>Conversion Decoction</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Decoction</TYPE>" +
                "<STEP_TEMP>68.0</STEP_TEMP>" +
                "<STEP_TIME>90.0</STEP_TIME>" +
                "</MASH_STEP>";

        MashStep mashStep = (MashStep) _deserializer.toBeerXml(xml, MashStep.class);

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
