package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaZP implements IMath {

    private double patm;

    public FormulaZP(double patm) {
        this.patm = patm;
    }

    @Override
    public double runFormula() {
        return (288000 / 6.5 * (1 - Math.pow((patm / 760), (1 / 5.255))));
    }
}
