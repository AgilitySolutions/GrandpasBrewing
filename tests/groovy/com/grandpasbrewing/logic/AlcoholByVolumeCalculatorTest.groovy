package com.grandpasbrewing.logic

class AlcoholByVolumeCalculatorTest extends GroovyTestCase {
    private AlcoholByVolumeCalculator _alcoholByVolumeCalculator;

    void setUp() {
        super.setUp()

        _alcoholByVolumeCalculator = new AlcoholByVolumeCalculator();
    }

    void testCalculate() {
        assertEquals(4.1, _alcoholByVolumeCalculator.Calculate(42, 15));
    }
}
