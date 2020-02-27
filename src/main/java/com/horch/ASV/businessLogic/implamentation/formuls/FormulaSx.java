package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaSx implements IMath {

    private double sizeFormula;
    private double P;

    public FormulaSx(){
        this.sizeFormula = 0.05;
        this.P = 3.14;
    }

    @Override
    public double runFormula() {
        double Sx = P * Math.pow(sizeFormula,2);
        return Sx;
    }
}
