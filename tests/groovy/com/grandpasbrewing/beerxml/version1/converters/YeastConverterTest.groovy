package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFlocculationEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastFormEnumConverter
import com.grandpasbrewing.beerxml.version1.converters.enumconverters.YeastTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.YeastFlocculation
import com.grandpasbrewing.beerxml.version1.enums.YeastForm
import com.grandpasbrewing.beerxml.version1.enums.YeastType
import com.grandpasbrewing.beerxml.version1.objects.Yeast

class YeastConverterTest extends GroovyTestCase {
    private YeastFlocculationEnumConverter _yeastFlocculationEnumConverter;
    private YeastFormEnumConverter _yeastFormEnumConverter;
    private YeastTypeEnumConverter _yeastTypeEnumConverter;

    private YeastConverter _yeastConverter;

    void setUp() {
        super.setUp()

        _yeastFlocculationEnumConverter = new YeastFlocculationEnumConverter();
        _yeastFormEnumConverter = new YeastFormEnumConverter();
        _yeastTypeEnumConverter = new YeastTypeEnumConverter();

        _yeastConverter = new YeastConverter(_yeastFlocculationEnumConverter,
                _yeastFormEnumConverter,
                _yeastTypeEnumConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Yeast yeast = _yeastConverter.toObjectModel(null);

        assertNull(yeast);
    }

    void testToObjectModelYeastRequiredFieldsOnly() {
        Yeast beerXmlObjectYeast = new Yeast();

        beerXmlObjectYeast.setName("Ole English Ale Yeast");
        beerXmlObjectYeast.setVersion(1);
        beerXmlObjectYeast.setType(YeastType.Ale);
        beerXmlObjectYeast.setForm(YeastForm.Liquid);
        beerXmlObjectYeast.setAmount(0.100);

        com.grandpasbrewing.objectmodel.Yeast yeast = _yeastConverter.toObjectModel(beerXmlObjectYeast);

        assertEquals("Ole English Ale Yeast", yeast.getName());
        assertEquals(1, yeast.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Ale, yeast.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid, yeast.getForm());
        assertEquals(0.100, yeast.getAmount());
        assertNull(yeast.getAmountIsWeight());
        assertNull(yeast.getLaboratory());
        assertNull(yeast.getManufacturerProductId());
        assertNull(yeast.getMinimumTemperature());
        assertNull(yeast.getMaximumTemperature());
        assertNull(yeast.getFlocculation());
        assertNull(yeast.getAttenuation());
        assertNull(yeast.getNotes());
        assertNull(yeast.getBestFor());
        assertNull(yeast.getTimesCultured());
        assertNull(yeast.getMaximumReuse());
        assertNull(yeast.getAddToSecondary());
        assertNull(yeast.getDisplayAmount());
        assertNull(yeast.getDisplayMinimumTemperature());
        assertNull(yeast.getDisplayMaximumTemperature());
        assertNull(yeast.getInventory());
        assertNull(yeast.getCultureDate());
    }

    void testToObjectModelYeastMorePopularFields() {
        Yeast beerXmlObjectYeast = new Yeast();

        beerXmlObjectYeast.setName("German Ale");
        beerXmlObjectYeast.setType(YeastType.Ale);
        beerXmlObjectYeast.setVersion(1);
        beerXmlObjectYeast.setForm(YeastForm.Liquid);
        beerXmlObjectYeast.setAmount(0.250);
        beerXmlObjectYeast.setLaboratory("Wyeast Labs");
        beerXmlObjectYeast.setManufacturerProductId("1007");
        beerXmlObjectYeast.setMinimumTemperature(12.8);
        beerXmlObjectYeast.setMaximumTemperature(20.0);
        beerXmlObjectYeast.setAttenuation(75.0);
        beerXmlObjectYeast.setNotes("Crisp dry flavor with a hint of mild flavor.  Great for many continental ales.");
        beerXmlObjectYeast.setBestFor("German Ales, Alts, Kolsch, Dry Stouts ");
        beerXmlObjectYeast.setFlocculation(YeastFlocculation.Low);

        com.grandpasbrewing.objectmodel.Yeast yeast = _yeastConverter.toObjectModel(beerXmlObjectYeast);

        assertEquals("German Ale", yeast.getName());
        assertEquals(1, yeast.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastType.Ale, yeast.getType());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastForm.Liquid, yeast.getForm());
        assertEquals(0.250, yeast.getAmount());
        assertNull(yeast.getAmountIsWeight());
        assertEquals("Wyeast Labs", yeast.getLaboratory());
        assertEquals("1007", yeast.getManufacturerProductId());
        assertEquals(12.8, yeast.getMinimumTemperature());
        assertEquals(20.0, yeast.getMaximumTemperature());
        assertEquals(com.grandpasbrewing.objectmodel.enums.YeastFlocculation.Low, yeast.getFlocculation());
        assertEquals(75.0, yeast.getAttenuation());
        assertEquals("Crisp dry flavor with a hint of mild flavor.  Great for many continental ales.", yeast.getNotes());
        assertEquals("German Ales, Alts, Kolsch, Dry Stouts ", yeast.getBestFor());
        assertNull(yeast.getTimesCultured());
        assertNull(yeast.getMaximumReuse());
        assertNull(yeast.getAddToSecondary());
        assertNull(yeast.getDisplayAmount());
        assertNull(yeast.getDisplayMinimumTemperature());
        assertNull(yeast.getDisplayMaximumTemperature());
        assertNull(yeast.getInventory());
        assertNull(yeast.getCultureDate());
    }
}
