package com.grandpasbrewing.beerxml.version1

import com.grandpasbrewing.beerxml.version1.enums.StyleType

class StyleTest extends GroovyTestCase {
    private Style _style;

    void setUp()
    {
        super.setUp();
        _style = new Style();
    }

    void testSetGetCategory() {
        _style.setCategory("Test Category");
        assertEquals("Test Category", _style.getCategory())
    }

    void testSetGetCategoryNumber() {
        _style.setCategoryNumber("Test Category Number");
        assertEquals("Test Category Number", _style.getCategoryNumber())
    }

    void testSetGetStyleLetter() {
        _style.setStyleLetter("Test Style Letter");
        assertEquals("Test Style Letter", _style.getStyleLetter())
    }

    void testSetGetStyleGuide() {
        _style.setStyleGuide("Test Style Guide");
        assertEquals("Test Style Guide", _style.getStyleGuide())
    }

    void testSetGetType() {
        _style.setType(StyleType.Lager);
        assertEquals(StyleType.Lager, _style.getType())
    }

    void testSetGetOriginalGravityMinimum() {
        _style.setOriginalGravityMinimum(1);
        assertEquals(1, _style.getOriginalGravityMinimum())
    }

    void testSetGetOriginalGravityMaximum() {
        _style.setOriginalGravityMaximum(2);
        assertEquals(2, _style.getOriginalGravityMaximum())
    }

    void testSetGetFinalGravityMinimum() {
        _style.setFinalGravityMinimum(3);
        assertEquals(3, _style.getFinalGravityMinimum())
    }

    void testSetGetFinalGravityMaximum() {
        _style.setFinalGravityMaximum(4);
        assertEquals(4, _style.getFinalGravityMaximum())
    }

    void testSetGetIbuMinimum() {
        _style.setIbuMinimum(5);
        assertEquals(5, _style.getIbuMinimum())
    }

    void testSetGetIbuMaximum() {
        _style.setIbuMaximum(6);
        assertEquals(6, _style.getIbuMaximum())
    }

    void testSetGetColorMinimum() {
        _style.setColorMinimum("Test Color Minimum");
        assertEquals("Test Color Minimum", _style.getColorMinimum())
    }

    void testSetGetColorMaximum() {
        _style.setColorMaximum("Test Color Maximum");
        assertEquals("Test Color Maximum", _style.getColorMaximum())
    }

    void testSetGetCarbonationMinimum() {
        _style.setCarbonationMinimum(7);
        assertEquals(7, _style.getCarbonationMinimum())
    }

    void testSetGetCarbonationMaximum() {
        _style.setCarbonationMaximum(8);
        assertEquals(8, _style.getCarbonationMaximum())
    }

    void testSetGetAbvMinimum() {
        _style.setAbvMinimum(9);
        assertEquals(9, _style.getAbvMinimum())
    }

    void testSetGetAbvMaximum() {
        _style.setAbvMaximum(10);
        assertEquals(10, _style.getAbvMaximum())
    }

    void testSetGetNotes() {
        _style.setNotes("Test Notes");
        assertEquals("Test Notes", _style.getNotes())
    }

    void testSetGetProfile() {
        _style.setProfile("Test Profile");
        assertEquals("Test Profile", _style.getProfile())
    }

    void testSetGetIngredients() {
        _style.setIngredients("Test Ingredients");
        assertEquals("Test Ingredients", _style.getIngredients())
    }

    void testSetGetExamples() {
        _style.setExamples("Test Examples");
        assertEquals("Test Examples", _style.getExamples())
    }

    void testSetGetDisplayOriginalGravityMinimum() {
        _style.setDisplayOriginalGravityMinimum("Test Display Original Gravity Minimum");
        assertEquals("Test Display Original Gravity Minimum", _style.getDisplayOriginalGravityMinimum())
    }

    void testSetGetDisplayOriginalGravityMaximum() {
        _style.setDisplayOriginalGravityMaximum("Test Display Original Gravity Maximum");
        assertEquals("Test Display Original Gravity Maximum", _style.getDisplayOriginalGravityMaximum())
    }

    void testSetGetDisplayFinalGravityMinimum() {
        _style.setDisplayFinalGravityMinimum("Test Display Final Gravity Minimum");
        assertEquals("Test Display Final Gravity Minimum", _style.getDisplayFinalGravityMinimum())
    }

    void testSetGetDisplayFinalGravityMaximum() {
        _style.setDisplayFinalGravityMaximum("Test Display Final Gravity Maximum");
        assertEquals("Test Display Final Gravity Maximum", _style.getDisplayFinalGravityMaximum())
    }

    void testSetGetDisplayColorMinimum() {
        _style.setDisplayColorMinimum("Test Display Color Minimum");
        assertEquals("Test Display Color Minimum", _style.getDisplayColorMinimum())
    }

    void testSetGetDisplayColorMaximum() {
        _style.setDisplayColorMaximum("Test Display Color Maximum");
        assertEquals("Test Display Color Maximum", _style.getDisplayColorMaximum())
    }

    void testSetGetOriginalGravityRange() {
        _style.setOriginalGravityRange("Test Original Gravity Range");
        assertEquals("Test Original Gravity Range", _style.getOriginalGravityRange())
    }

    void testSetGetFinalGravityRange() {
        _style.setFinalGravityRange("Test Final Gravity Range");
        assertEquals("Test Final Gravity Range", _style.getFinalGravityRange())
    }

    void testSetGetIbuRange() {
        _style.setIbuRange("Test IBU Range");
        assertEquals("Test IBU Range", _style.getIbuRange())
    }

    void testSetGetCarbonationRange() {
        _style.setCarbonationRange("Test Carbonation Range");
        assertEquals("Test Carbonation Range", _style.getCarbonationRange())
    }

    void testSetGetColorRange() {
        _style.setColorRange("Test Color Range");
        assertEquals("Test Color Range", _style.getColorRange())
    }

    void testSetGetAbvRange() {
        _style.setAbvRange("Test ABV Range");
        assertEquals("Test ABV Range", _style.getAbvRange())
    }

    void testSetGetName() {
        _style.setName("Test Name");
        assertEquals("Test Name", _style.getName())
    }

    void testSetGetVersion() {
        _style.setVersion(11);
        assertEquals(11, _style.getVersion())
    }
}
