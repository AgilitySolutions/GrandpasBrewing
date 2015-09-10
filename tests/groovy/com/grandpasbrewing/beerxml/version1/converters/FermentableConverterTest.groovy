package com.grandpasbrewing.beerxml.version1.converters

import com.grandpasbrewing.beerxml.version1.converters.enumconverters.FermentableTypeEnumConverter
import com.grandpasbrewing.beerxml.version1.enums.FermentableType
import com.grandpasbrewing.beerxml.version1.objects.Fermentable


class FermentableConverterTest extends GroovyTestCase {
    private FermentableTypeEnumConverter _fermentableTypeEnumConverter;
    private FermentableConverter _fermentableConverter;

    void setUp() {
        super.setUp()

        _fermentableTypeEnumConverter = new FermentableTypeEnumConverter();
        _fermentableConverter = new FermentableConverter(_fermentableTypeEnumConverter);
    }

    void testToObjectModelNull() {
        com.grandpasbrewing.objectmodel.Fermentable fermentable = _fermentableConverter.toObjectModel(null);

        assertNull(fermentable);
    }

    void testToObjectModelRequiredFieldsOnly() {
        Fermentable beerXmlFermentable = new Fermentable();

        beerXmlFermentable.setName("Pale 2-row Malt");
        beerXmlFermentable.setVersion(1);
        beerXmlFermentable.setAmount(5.0);
        beerXmlFermentable.setType(FermentableType.Grain);
        beerXmlFermentable.setYield(73.4);
        beerXmlFermentable.setColor(3.0);

        com.grandpasbrewing.objectmodel.Fermentable fermentable = _fermentableConverter.toObjectModel(beerXmlFermentable);

        assertEquals("Pale 2-row Malt", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentable.getType());
        assertEquals(5.0, fermentable.getAmount());
        assertEquals(73.4, fermentable.getYield());
        assertEquals(3.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertNull(fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testToObjectModelHoppedExtract() {
        Fermentable beerXmlFermentable = new Fermentable();

        beerXmlFermentable.setName("Fustons Hopped Amber");
        beerXmlFermentable.setVersion(1);
        beerXmlFermentable.setAmount(0.50);
        beerXmlFermentable.setNotes("Hopped amber extract suitable as a base for english ales.");
        beerXmlFermentable.setYield(78.0);
        beerXmlFermentable.setType(FermentableType.Extract);
        beerXmlFermentable.setColor(13);
        beerXmlFermentable.setIBUGallonsPerPound(16.6);

        com.grandpasbrewing.objectmodel.Fermentable fermentable = _fermentableConverter.toObjectModel(beerXmlFermentable);

        assertEquals("Fustons Hopped Amber", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Extract, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(78.0, fermentable.getYield());
        assertEquals(13, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertEquals("Hopped amber extract suitable as a base for english ales.", fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertEquals(16.6, fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testToObjectModelCrystalMaltSpecialtyGrainWithAllApplicableFields() {
        Fermentable beerXmlFermentable = new Fermentable();

        beerXmlFermentable.setName("Crystal 40 L");
        beerXmlFermentable.setVersion(1);
        beerXmlFermentable.setAmount(0.50);
        beerXmlFermentable.setType(FermentableType.Grain);
        beerXmlFermentable.setYield(74.0);
        beerXmlFermentable.setColor(40.0);
        beerXmlFermentable.setPlaceOfOrigin("United Kingdom");
        beerXmlFermentable.setSupplier("Fussybrewer Malting");
        beerXmlFermentable.setNotes("Darker crystal malt.  Adds body and improves head retention.  Also called caramel malt.");
        beerXmlFermentable.setCoarseFineDiff(1.5);
        beerXmlFermentable.setMoisture(4.0);
        beerXmlFermentable.setDiastaticPower(0.0);
        beerXmlFermentable.setProtein(13.2);
        beerXmlFermentable.setMaximumInBatch(10.0);
        beerXmlFermentable.setRecommendMash(false);

        com.grandpasbrewing.objectmodel.Fermentable fermentable = _fermentableConverter.toObjectModel(beerXmlFermentable);

        assertEquals("Crystal 40 L", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(74.0, fermentable.getYield());
        assertEquals(40.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertEquals("United Kingdom", fermentable.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentable.getSupplier());
        assertEquals("Darker crystal malt.  Adds body and improves head retention.  Also called caramel malt.", fermentable.getNotes());
        assertEquals(1.5, fermentable.getCoarseFineDiff());
        assertEquals(4.0, fermentable.getMoisture());
        assertEquals(0.0, fermentable.getDiastaticPower());
        assertEquals(13.2, fermentable.getProtein());
        assertEquals(10.0, fermentable.getMaximumInBatch());
        assertFalse(fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testFromObjectModelNull() {
        Fermentable fermentable = _fermentableConverter.fromObjectModel(null);

        assertNull(fermentable);
    }

    void testFromObjectModelRequiredFieldsOnly() {
        com.grandpasbrewing.objectmodel.Fermentable objectModelFermentable = new com.grandpasbrewing.objectmodel.Fermentable();

        objectModelFermentable.setName("Pale 2-row Malt");
        objectModelFermentable.setVersion(1);
        objectModelFermentable.setAmount(5.0);
        objectModelFermentable.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain);
        objectModelFermentable.setYield(73.4);
        objectModelFermentable.setColor(3.0);

        Fermentable fermentable = _fermentableConverter.fromObjectModel(objectModelFermentable);

        assertEquals("Pale 2-row Malt", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Grain, fermentable.getType());
        assertEquals(5.0, fermentable.getAmount());
        assertEquals(73.4, fermentable.getYield());
        assertEquals(3.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertNull(fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testFromObjectModelHoppedExtract() {
        com.grandpasbrewing.objectmodel.Fermentable objectModelFermentable = new com.grandpasbrewing.objectmodel.Fermentable();

        objectModelFermentable.setName("Fustons Hopped Amber");
        objectModelFermentable.setVersion(1);
        objectModelFermentable.setAmount(0.50);
        objectModelFermentable.setNotes("Hopped amber extract suitable as a base for english ales.");
        objectModelFermentable.setYield(78.0);
        objectModelFermentable.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Extract);
        objectModelFermentable.setColor(13);
        objectModelFermentable.setIBUGallonsPerPound(16.6);

        Fermentable fermentable = _fermentableConverter.fromObjectModel(objectModelFermentable);

        assertEquals("Fustons Hopped Amber", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Extract, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(78.0, fermentable.getYield());
        assertEquals(13, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertNull(fermentable.getPlaceOfOrigin());
        assertNull(fermentable.getSupplier());
        assertEquals("Hopped amber extract suitable as a base for english ales.", fermentable.getNotes());
        assertNull(fermentable.getCoarseFineDiff());
        assertNull(fermentable.getMoisture());
        assertNull(fermentable.getDiastaticPower());
        assertNull(fermentable.getProtein());
        assertNull(fermentable.getMaximumInBatch());
        assertNull(fermentable.getRecommendMash());
        assertEquals(16.6, fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }

    void testFromObjectModelCrystalMaltSpecialtyGrainWithAllApplicableFields() {
        com.grandpasbrewing.objectmodel.Fermentable objectModelFermentable = new com.grandpasbrewing.objectmodel.Fermentable();

        objectModelFermentable.setName("Crystal 40 L");
        objectModelFermentable.setVersion(1);
        objectModelFermentable.setAmount(0.50);
        objectModelFermentable.setType(com.grandpasbrewing.objectmodel.enums.FermentableType.Grain);
        objectModelFermentable.setYield(74.0);
        objectModelFermentable.setColor(40.0);
        objectModelFermentable.setPlaceOfOrigin("United Kingdom");
        objectModelFermentable.setSupplier("Fussybrewer Malting");
        objectModelFermentable.setNotes("Darker crystal malt.  Adds body and improves head retention.  Also called caramel malt.");
        objectModelFermentable.setCoarseFineDiff(1.5);
        objectModelFermentable.setMoisture(4.0);
        objectModelFermentable.setDiastaticPower(0.0);
        objectModelFermentable.setProtein(13.2);
        objectModelFermentable.setMaximumInBatch(10.0);
        objectModelFermentable.setRecommendMash(false);

        Fermentable fermentable = _fermentableConverter.fromObjectModel(objectModelFermentable);

        assertEquals("Crystal 40 L", fermentable.getName());
        assertEquals(1, fermentable.getVersion());
        assertEquals(FermentableType.Grain, fermentable.getType());
        assertEquals(0.50, fermentable.getAmount());
        assertEquals(74.0, fermentable.getYield());
        assertEquals(40.0, fermentable.getColor());
        assertNull(fermentable.getAddAfterBoil());
        assertEquals("United Kingdom", fermentable.getPlaceOfOrigin());
        assertEquals("Fussybrewer Malting", fermentable.getSupplier());
        assertEquals("Darker crystal malt.  Adds body and improves head retention.  Also called caramel malt.", fermentable.getNotes());
        assertEquals(1.5, fermentable.getCoarseFineDiff());
        assertEquals(4.0, fermentable.getMoisture());
        assertEquals(0.0, fermentable.getDiastaticPower());
        assertEquals(13.2, fermentable.getProtein());
        assertEquals(10.0, fermentable.getMaximumInBatch());
        assertFalse(fermentable.getRecommendMash());
        assertNull(fermentable.getIBUGallonsPerPound());
        assertNull(fermentable.getDisplayAmount());
        assertNull(fermentable.getPotential());
        assertNull(fermentable.getInventory());
        assertNull(fermentable.getDisplayColor());
    }
}
