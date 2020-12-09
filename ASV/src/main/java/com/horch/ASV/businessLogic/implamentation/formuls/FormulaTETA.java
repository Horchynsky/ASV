package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaTETA implements IMath {

    private double p;

    public FormulaTETA(){
        this.p = 3.14;
    }


    @Override
    public double runFormula() {
        double TETA = (2*p/180)+(59*p/180*60)+(9*p/180*60*60);
        return TETA;
    }
}
