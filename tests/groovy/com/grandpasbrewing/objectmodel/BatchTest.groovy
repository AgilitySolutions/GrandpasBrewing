package com.grandpasbrewing.objectmodel

class BatchTest extends GroovyTestCase {
    private Batch _batch;

    void setUp() {
        super.setUp()

        _batch = new Batch();
    }

    void testSetGetStartDate() {
        def date = new Date(2015, 04, 15);

        _batch.setStartDate(date);
        assertEquals(date, _batch.getStartDate());
    }

    void testSetGetIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Ingredient());
        ingredients.add(new Ingredient());
        ingredients.add(new Ingredient());
        ingredients.add(new Ingredient());

        _batch.setIngredients(ingredients);
        assertEquals(4, _batch.getIngredients().size());
    }

    void testSetGetOriginalGravity() {
        _batch.setOriginalGravity(1);
        assertEquals(1, _batch.getOriginalGravity());
    }

    void testSetGetFinalGravity() {
        _batch.setFinalGravity(2);
        assertEquals(2, _batch.getFinalGravity());
    }

    void testSetGetTesting() {
        _batch.setTesting("Test Testing");
        assertEquals("Test Testing", _batch.getTesting());
    }

    void testSetGetRecipeInformation() {
        _batch.setRecipeInformation("Test Recipe Information");
        assertEquals("Test Recipe Information", _batch.getRecipeInformation());
    }

    void testSetGetStyle() {
        _batch.setStyle("Test Style");
        assertEquals("Test Style", _batch.getStyle());
    }

    void testSetGetAlcoholByVolume() {
        _batch.setAlcoholByVolume(3);
        assertEquals(3, _batch.getAlcoholByVolume());
    }

    void testSetGetAvailability() {
        _batch.setAvailability("Test Availability");
        assertEquals("Test Availability", _batch.getAvailability());
    }

    void testSetGetNotes() {
        _batch.setNotes("Test Notes");
        assertEquals("Test Notes", _batch.getNotes());
    }

    void testSetGetPicture() {
        _batch.setPicture("Test Picture");
        assertEquals("Test Picture", _batch.getPicture());
    }

    void testSetGetDescription() {
        _batch.setDescription("Test Description");
        assertEquals("Test Description", _batch.getDescription());
    }

    void testSetGetTypeOfProduct() {
        _batch.setTypeOfProduct("Test Type Of Product");
        assertEquals("Test Type Of Product", _batch.getTypeOfProduct());
    }

    void testSetGetDateOfBrewing() {
        def date = new Date(2015, 04, 16);

        _batch.setDateOfBrewing(date);
        assertEquals(date, _batch.getDateOfBrewing());
    }

    void testSetGetWaterVolume() {
        _batch.setWaterVolume(4);
        assertEquals(4, _batch.getWaterVolume());
    }

    void testSetGetTypeOfSugarsAdded() {
        _batch.setTypeOfSugarsAdded("Test Type Of Sugars Added");
        assertEquals("Test Type Of Sugars Added", _batch.getTypeOfSugarsAdded());
    }

    void testSetGetAmountOfSugarsAdded() {
        _batch.setAmountOfSugarsAdded(5);
        assertEquals(5, _batch.getAmountOfSugarsAdded());
    }

    void testSetGetBestBeforeDate() {
        def date = new Date(2016, 04, 15);

        _batch.setBestBeforeDate(date);
        assertEquals(date, _batch.getBestBeforeDate());
    }

    void testSetGetYeastCodeOnSachet() {
        _batch.setYeastCodeOnSachet("Test Yeast Code On Sachet");
        assertEquals("Test Yeast Code On Sachet", _batch.getYeastCodeOnSachet());
    }

    void testSetGetTemperatureOfWortBeforeAddingYeast() {
        _batch.setTemperatureOfWortBeforeAddingYeast(6)
        assertEquals(6, _batch.getTemperatureOfWortBeforeAddingYeast());
    }

    void testSetGetDateOfBottling() {
        def date = new Date(2015, 06, 15);

        _batch.setDateOfBottling(date);
        assertEquals(date, _batch.getDateOfBottling());
    }

    void testSetGetSanitizing() {
        _batch.setSanitizing("Test Sanitizing");
        assertEquals("Test Sanitizing", _batch.getSanitizing());
    }

    void testSetGetYield() {
        _batch.setYield("Test Yield");
        assertEquals("Test Yield", _batch.getYield());
    }

    void testSetGetId() {
        _batch.setId(7);
        assertEquals(7, _batch.getId());
    }
}
