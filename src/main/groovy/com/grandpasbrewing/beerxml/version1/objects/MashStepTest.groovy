package com.grandpasbrewing.beerxml.version1.objects

import com.grandpasbrewing.beerxml.version1.enums.MashStepType

class MashStepTest extends GroovyTestCase {
    private MashStep _mashStep;

    void setUp() {
        super.setUp()

        _mashStep = new MashStep();
    }

    void testSetGetType() {
        _mashStep.setType(MashStepType.Infusion);
        assertEquals(MashStepType.Infusion, _mashStep.getType());
    }

    void testSetGetInfuseAmount() {
        _mashStep.setInfuseAmount(1);
        assertEquals(1, _mashStep.getInfuseAmount());
    }

    void testSetGetStepTemperature() {
        _mashStep.setStepTemperature(2);
        assertEquals(2, _mashStep.getStepTemperature());
    }

    void testSetGetStepTime() {
        _mashStep.setStepTime(3);
        assertEquals(3, _mashStep.getStepTime());
    }

    void testSetGetRampTime() {
        _mashStep.setRampTime(4);
        assertEquals(4, _mashStep.getRampTime());
    }

    void testSetGetEndTemperature() {
        _mashStep.setEndTemperature(5);
        assertEquals(5, _mashStep.getEndTemperature());
    }

    void testSetGetDescription() {
        _mashStep.setDescription("Test Description");
        assertEquals("Test Description", _mashStep.getDescription());
    }

    void testSetGetWaterGrainRatio() {
        _mashStep.setWaterGrainRatio("Test Water Grain Ratio");
        assertEquals("Test Water Grain Ratio", _mashStep.getWaterGrainRatio());
    }

    void testSetGetDecoctionAmount() {
        _mashStep.setDecoctionAmount("Test Decoction Amount");
        assertEquals("Test Decoction Amount", _mashStep.getDecoctionAmount());
    }

    void testSetGetInfuseTemperature() {
        _mashStep.setInfuseTemperature("Test Infuse Temperature");
        assertEquals("Test Infuse Temperature", _mashStep.getInfuseTemperature());
    }

    void testSetGetDisplayStepTemperature() {
        _mashStep.setDisplayStepTemperature("Test Display Step Temperature");
        assertEquals("Test Display Step Temperature", _mashStep.getDisplayStepTemperature());
    }

    void testSetGetDisplayInfuseAmount() {
        _mashStep.setDisplayInfuseAmount("Test Display Infuse Amount");
        assertEquals("Test Display Infuse Amount", _mashStep.getDisplayInfuseAmount());
    }

    void testSetGetName() {
        _mashStep.setName("Test Name");
        assertEquals("Test Name", _mashStep.getName());
    }

    void testSetGetVersion() {
        _mashStep.setVersion(6);
        assertEquals(6, _mashStep.getVersion());
    }
}
