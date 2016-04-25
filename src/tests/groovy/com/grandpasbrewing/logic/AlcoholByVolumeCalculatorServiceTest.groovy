package com.grandpasbrewing.logic

class AlcoholByVolumeCalculatorServiceTest extends GroovyTestCase {
    private AlcoholByVolumeCalculatorService _alcoholByVolumeCalculatorService;

    void setUp() {
        super.setUp()

        _alcoholByVolumeCalculatorService = new AlcoholByVolumeCalculatorService();
    }

    void testCalculate() {
        assertEquals(4.1, _alcoholByVolumeCalculatorService.Calculate(42, 15));
    }
}
