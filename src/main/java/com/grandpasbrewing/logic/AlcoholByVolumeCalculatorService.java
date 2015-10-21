package com.grandpasbrewing.logic;

import com.grandpasbrewing.logic.interfaces.AlcoholByVolumeCalculator;

public class AlcoholByVolumeCalculatorService implements AlcoholByVolumeCalculator {
    public double Calculate(int originalGravity, int finalGravity) {
        double value = (originalGravity - finalGravity) / 7.46 + 0.5;
        return (double)Math.round(value * 10) / 10;
    }
}
