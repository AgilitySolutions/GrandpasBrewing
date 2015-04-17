package com.grandpasbrewing.objectmodel

import com.grandpasbrewing.objectmodel.enums.MashStepType

class MashStepTest extends GroovyTestCase {
    private MashStep _mashStep;

    void setUp() {
        super.setUp()

        _mashStep = new MashStep();
    }

    void testGetType() {
        _mashStep.setType(MashStepType.Temperature);
        assertEquals(MashStepType.Temperature, _mashStep.getType());
    }

    void testGetInfuseAmount() {
        _mashStep.setInfuseAmount(1);
        assertEquals(1, _mashStep.getInfuseAmount());
    }

    void testGetStepTemperature() {
        _mashStep.setStepTemperature(2);
        assertEquals(2, _mashStep.getStepTemperature());
    }

    void testGetStepTime() {
        _mashStep.setStepTime(3);
        assertEquals(3, _mashStep.getStepTime());
    }

    void testGetRampTime() {
        _mashStep.setRampTime(4);
        assertEquals(4, _mashStep.getRampTime());
    }

    void testGetEndTemperature() {
        _mashStep.setEndTemperature(5);
        assertEquals(5, _mashStep.getEndTemperature());
    }

    void testGetDescription() {
        _mashStep.setDescription("Test Description");
        assertEquals("Test Description", _mashStep.getDescription());
    }

    void testGetWaterGrainRatio() {
        _mashStep.setWaterGrainRatio("Test Water Grain Ratio");
        assertEquals("Test Water Grain Ratio", _mashStep.getWaterGrainRatio());
    }

    void testGetDecoctionAmount() {
        _mashStep.setDecoctionAmount("Test Decoction Amount");
        assertEquals("Test Decoction Amount", _mashStep.getDecoctionAmount());
    }

    void testGetInfuseTemperature() {
        _mashStep.setInfuseTemperature("Test Infuse Temperature");
        assertEquals("Test Infuse Temperature", _mashStep.getInfuseTemperature());
    }

    void testGetDisplayStepTemperature() {
        _mashStep.setDisplayStepTemperature("Test Display Step Temperature");
        assertEquals("Test Display Step Temperature", _mashStep.getDisplayStepTemperature());
    }

    void testGetDisplayInfuseAmount() {
        _mashStep.setDisplayInfuseAmount("Test Display Infuse Amount");
        assertEquals("Test Display Infuse Amount", _mashStep.getDisplayInfuseAmount());
    }

    void testGetId() {
        _mashStep.setId(6);
        assertEquals(6, _mashStep.getId());
    }
}
