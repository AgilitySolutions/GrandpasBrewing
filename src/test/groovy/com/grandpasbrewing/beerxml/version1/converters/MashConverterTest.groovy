package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.MashStepTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.MashStepType
import com.grandpasbrewing.beerxml.version1.objects.Mash
import com.grandpasbrewing.beerxml.version1.objects.MashStep


class MashConverterTest extends GroovyTestCase {
    private MashStepTypeEnumConverter _mashStepTypeEnumConverter;
    private MashStepConverter _mashStepConverter;
    private MashConverter _mashConverter;

    void setUp() {
        super.setUp()

        _mashStepTypeEnumConverter = new MashStepTypeEnumConverter();
        _mashStepConverter = new MashStepConverter(_mashStepTypeEnumConverter);

        _mashConverter = new MashConverter(_mashStepConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Mash mash = _mashConverter.toObjectModel(null);

        assertNull(mash);
    }

    void testToObjectModelMashSingleStepInfusionMash() {
        Mash beerXmlObjectMash = new Mash();

        beerXmlObjectMash.setName("Single Step Infusion, 68 C");
        beerXmlObjectMash.setVersion(1);
        beerXmlObjectMash.setGrainTemperature(22.0);

        ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

        MashStep mashStep1 = new MashStep();
        mashStep1.setName("Conversion Step, 68C ");
        mashStep1.setVersion(1);
        mashStep1.setType(MashStepType.Infusion);
        mashStep1.setStepTemperature(68.0);
        mashStep1.setStepTime(60.0);
        mashStep1.setInfuseAmount(10.0);

        mashSteps.add(mashStep1);

        beerXmlObjectMash.setMashSteps(mashSteps);

        com.grandpasbrewing.objectmodel.Mash mash = _mashConverter.toObjectModel(beerXmlObjectMash);

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
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion, iteratorCurrent.getType());
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

    void testToObjectModelMashTwoStepTemperatureMash() {
        Mash beerXmlObjectMash = new Mash();

        beerXmlObjectMash.setName("Two Step Temperature, 68C ");
        beerXmlObjectMash.setVersion(1);
        beerXmlObjectMash.setGrainTemperature(22.0);
        beerXmlObjectMash.setTunTemperature(22.0);
        beerXmlObjectMash.setSpargeTemperature(78.0);

        ArrayList<MashStep> mashSteps = new ArrayList<MashStep>();

        MashStep mashStep1 = new MashStep();
        mashStep1.setName("Protein Rest");
        mashStep1.setVersion(1);
        mashStep1.setType(MashStepType.Temperature);
        mashStep1.setStepTemperature(49.0);
        mashStep1.setStepTime(20.0);
        mashStep1.setRampTime(10.0);
        mashStep1.setInfuseAmount(15.0);

        mashSteps.add(mashStep1);

        MashStep mashStep2 = new MashStep();
        mashStep2.setName("Conversion Step, 68 C");
        mashStep2.setVersion(1);
        mashStep2.setType(MashStepType.Temperature);
        mashStep2.setStepTemperature(68.0);
        mashStep2.setRampTime(20.0);
        mashStep2.setStepTime(60.0);

        mashSteps.add(mashStep2);

        beerXmlObjectMash.setMashSteps(mashSteps);

        com.grandpasbrewing.objectmodel.Mash mash = _mashConverter.toObjectModel(beerXmlObjectMash);

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
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature, iteratorCurrent.getType());
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
        assertEquals(com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature, iteratorCurrent.getType());
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

    void testFromObjectModelNull() {
        Mash mash = _mashConverter.fromObjectModel(null);

        assertNull(mash);
    }

    void testFromObjectModelMashSingleStepInfusionMash() {
        com.grandpasbrewing.objectmodel.Mash objectModelMash = new com.grandpasbrewing.objectmodel.Mash();

        objectModelMash.setName("Single Step Infusion, 68 C");
        objectModelMash.setVersion(1);
        objectModelMash.setGrainTemperature(22.0);

        ArrayList<com.grandpasbrewing.objectmodel.MashStep> mashSteps = new ArrayList<com.grandpasbrewing.objectmodel.MashStep>();

        com.grandpasbrewing.objectmodel.MashStep mashStep1 = new com.grandpasbrewing.objectmodel.MashStep();
        mashStep1.setName("Conversion Step, 68C ");
        mashStep1.setVersion(1);
        mashStep1.setType(com.grandpasbrewing.objectmodel.enums.MashStepType.Infusion);
        mashStep1.setStepTemperature(68.0);
        mashStep1.setStepTime(60.0);
        mashStep1.setInfuseAmount(10.0);

        mashSteps.add(mashStep1);

        objectModelMash.setMashSteps(mashSteps);

        Mash mash = _mashConverter.fromObjectModel(objectModelMash);

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

    void testFromObjectModelMashTwoStepTemperatureMash() {
        com.grandpasbrewing.objectmodel.Mash objectModelMash = new com.grandpasbrewing.objectmodel.Mash();

        objectModelMash.setName("Two Step Temperature, 68C ");
        objectModelMash.setVersion(1);
        objectModelMash.setGrainTemperature(22.0);
        objectModelMash.setTunTemperature(22.0);
        objectModelMash.setSpargeTemperature(78.0);

        ArrayList<com.grandpasbrewing.objectmodel.MashStep> mashSteps = new ArrayList<com.grandpasbrewing.objectmodel.MashStep>();

        com.grandpasbrewing.objectmodel.MashStep mashStep1 = new com.grandpasbrewing.objectmodel.MashStep();
        mashStep1.setName("Protein Rest");
        mashStep1.setVersion(1);
        mashStep1.setType(com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature);
        mashStep1.setStepTemperature(49.0);
        mashStep1.setStepTime(20.0);
        mashStep1.setRampTime(10.0);
        mashStep1.setInfuseAmount(15.0);

        mashSteps.add(mashStep1);

        com.grandpasbrewing.objectmodel.MashStep mashStep2 = new com.grandpasbrewing.objectmodel.MashStep();
        mashStep2.setName("Conversion Step, 68 C");
        mashStep2.setVersion(1);
        mashStep2.setType(com.grandpasbrewing.objectmodel.enums.MashStepType.Temperature);
        mashStep2.setStepTemperature(68.0);
        mashStep2.setRampTime(20.0);
        mashStep2.setStepTime(60.0);

        mashSteps.add(mashStep2);

        objectModelMash.setMashSteps(mashSteps);

        Mash mash = _mashConverter.fromObjectModel(objectModelMash);

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
