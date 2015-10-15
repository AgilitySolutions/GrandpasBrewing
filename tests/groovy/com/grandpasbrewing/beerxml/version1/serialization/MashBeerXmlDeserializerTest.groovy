package com.grandpasbrewing.beerxml.version1.serialization

import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.Mash

class MashBeerXmlDeserializerTest extends GroovyTestCase {
    private BeerXmlDeserializer _deserializer;

    void setUp() {
        super.setUp()

        _deserializer = new BeerXmlDeserializer<Mash>();
    }

    void testToBeerMashSingleStepInfusionMash() {
        String xml = "<MASH>" +
                "<NAME>Single Step Infusion, 68 C</NAME>" +
                "<VERSION>1</VERSION>" +
                "<GRAIN_TEMP>22.0</GRAIN_TEMP>" +
                "<MASH_STEPS>" +
                "<MASH_STEP>" +
                "<NAME>Conversion Step, 68C </NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Infusion</TYPE>" +
                "<STEP_TEMP>68.0</STEP_TEMP>" +
                "<STEP_TIME>60.0</STEP_TIME>" +
                "<INFUSE_AMOUNT>10.0</INFUSE_AMOUNT>" +
                "</MASH_STEP>" +
                "</MASH_STEPS>" +
                "</MASH>";

        Mash mash = (Mash) _deserializer.toBeerXml(xml, Mash.class);

        assertEquals("Single Step Infusion, 68 C", mash.getName());
        assertEquals(1, mash.getVersion());
        assertEquals(22.0, mash.getGrainTemperature());
        assertEquals(1, mash.getMashSteps().size());
        assertNull(mash.getNotes());
        assertNull(mash.getTunTemperature());
        assertNull(mash.getSpargeTemperature());
        assertNull(mash.getPH());
        assertNull(mash.getTunWeight());
        assertNull(mash.getTunSpecificHeat());
        assertNull(mash.getEquipmentAdjust());
        assertNull(mash.getDisplayGrainTemperature());
        assertNull(mash.getDisplayTunTemperature());
        assertNull(mash.getDisplaySpargeTemperature());
        assertNull(mash.getDisplayTunWeight());

        def iterator = mash.getMashSteps().listIterator();
        def iteratorCurrent = iterator.next();

        assertNotNull(iteratorCurrent);

        assertEquals("Conversion Step, 68C ", iteratorCurrent.getName());
        assertEquals(1, iteratorCurrent.getVersion());
        assertEquals(MashStepType.Infusion, iteratorCurrent.getType());
        assertEquals(10.0, iteratorCurrent.getInfuseAmount());
        assertEquals(68.0, iteratorCurrent.getStepTemperature());
        assertEquals(60.0, iteratorCurrent.getStepTime());
        assertNull(iteratorCurrent.getRampTime());
        assertNull(iteratorCurrent.getEndTemperature());
        assertNull(iteratorCurrent.getDescription());
        assertNull(iteratorCurrent.getWaterGrainRatio());
        assertNull(iteratorCurrent.getDecoctionAmount());
        assertNull(iteratorCurrent.getInfuseTemperature());
        assertNull(iteratorCurrent.getDisplayStepTemperature());
        assertNull(iteratorCurrent.getDisplayInfuseAmount());
    }

    void testToBeerMashTwoStepTemperatureMash() {
        String xml = "<MASH>" +
                "<NAME>Two Step Temperature, 68C </NAME>" +
                "<VERSION>1</VERSION>" +
                "<GRAIN_TEMP>22.0</GRAIN_TEMP>" +
                "<TUN_TEMP>22.0</TUN_TEMP>" +
                "<SPARGE_TEMP>78.0</SPARGE_TEMP>" +
                "<MASH_STEPS>" +
                "<MASH_STEP>" +
                "<NAME>Protein Rest</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Temperature</TYPE>" +
                "<STEP_TEMP>49.0</STEP_TEMP>" +
                "<STEP_TIME>20.0</STEP_TIME>" +
                "<RAMP_TIME>10.0</RAMP_TIME>" +
                "<INFUSE_AMOUNT>15.0</INFUSE_AMOUNT>" +
                "</MASH_STEP>" +
                "<MASH_STEP>" +
                "<NAME>Conversion Step, 68 C</NAME>" +
                "<VERSION>1</VERSION>" +
                "<TYPE>Temperature</TYPE>" +
                "<STEP_TEMP>68.0</STEP_TEMP>" +
                "<RAMP_TIME>20.0</RAMP_TIME>" +
                "<STEP_TIME>60.0</STEP_TIME>" +
                "</MASH_STEP>" +
                "</MASH_STEPS>" +
                "</MASH>";

        Mash mash = (Mash) _deserializer.toBeerXml(xml, Mash.class);

        assertEquals("Two Step Temperature, 68C ", mash.getName());
        assertEquals(1, mash.getVersion());
        assertEquals(22.0, mash.getGrainTemperature());
        assertEquals(2, mash.getMashSteps().size());
        assertNull(mash.getNotes());
        assertEquals(22.0, mash.getTunTemperature());
        assertEquals(78.0, mash.getSpargeTemperature());
        assertNull(mash.getPH());
        assertNull(mash.getTunWeight());
        assertNull(mash.getTunSpecificHeat());
        assertNull(mash.getEquipmentAdjust());
        assertNull(mash.getDisplayGrainTemperature());
        assertNull(mash.getDisplayTunTemperature());
        assertNull(mash.getDisplaySpargeTemperature());
        assertNull(mash.getDisplayTunWeight());

        def iterator = mash.getMashSteps().listIterator();
        def iteratorCurrent = iterator.next();

        assertNotNull(iteratorCurrent);

        assertEquals("Protein Rest", iteratorCurrent.getName());
        assertEquals(1, iteratorCurrent.getVersion());
        assertEquals(MashStepType.Temperature, iteratorCurrent.getType());
        assertEquals(15.0, iteratorCurrent.getInfuseAmount());
        assertEquals(49.0, iteratorCurrent.getStepTemperature());
        assertEquals(20.0, iteratorCurrent.getStepTime());
        assertEquals(10.0, iteratorCurrent.getRampTime());
        assertNull(iteratorCurrent.getEndTemperature());
        assertNull(iteratorCurrent.getDescription());
        assertNull(iteratorCurrent.getWaterGrainRatio());
        assertNull(iteratorCurrent.getDecoctionAmount());
        assertNull(iteratorCurrent.getInfuseTemperature());
        assertNull(iteratorCurrent.getDisplayStepTemperature());
        assertNull(iteratorCurrent.getDisplayInfuseAmount());

        iteratorCurrent = iterator.next();

        assertNotNull(iteratorCurrent);

        assertEquals("Conversion Step, 68 C", iteratorCurrent.getName());
        assertEquals(1, iteratorCurrent.getVersion());
        assertEquals(MashStepType.Temperature, iteratorCurrent.getType());
        assertNull(iteratorCurrent.getInfuseAmount());
        assertEquals(68.0, iteratorCurrent.getStepTemperature());
        assertEquals(60.0, iteratorCurrent.getStepTime());
        assertEquals(20.0, iteratorCurrent.getRampTime());
        assertNull(iteratorCurrent.getEndTemperature());
        assertNull(iteratorCurrent.getDescription());
        assertNull(iteratorCurrent.getWaterGrainRatio());
        assertNull(iteratorCurrent.getDecoctionAmount());
        assertNull(iteratorCurrent.getInfuseTemperature());
        assertNull(iteratorCurrent.getDisplayStepTemperature());
        assertNull(iteratorCurrent.getDisplayInfuseAmount());
    }
}
