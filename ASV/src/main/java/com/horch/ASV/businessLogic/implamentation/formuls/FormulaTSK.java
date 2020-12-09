package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaTSK implements IMath {

    private double userTemperatureInCelsius;
    private double kelvinCof;

    public FormulaTSK(double userTemperatureInCelsius, double kelvinCof) {
        this.userTemperatureInCelsius = userTemperatureInCelsius;
        this.kelvinCof = kelvinCof;
    }

    @Override
    public double runFormula() {
        double tsk = userTemperatureInCelsius + kelvinCof;
        return tsk;
    }
}
