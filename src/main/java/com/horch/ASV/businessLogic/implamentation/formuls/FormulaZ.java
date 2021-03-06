package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaZ implements IMath {



    private double cx;
    private double Msn;
    private double Tsk;
    private double Sx;
    private double Run;
    private double zp;
    private double zt;
    private double ma;
    private double ka;
    private double y1;
    private double b1;
    private double Vwx;// щвидкість вітру
    private double Vxt;
    private double Vyt;
    private double Vzt;
    private double ga;
    ///////////////////////////////////
    private double cy;
    private double sy;


    public FormulaZ(double cx, double Msn, double Tsk, double Sx, double Run) {
        this.cx = 0.5;
        this.Msn = Msn;
        this.Tsk = Tsk;
        this.Sx = Sx;
        this.Run = 8314;
        this.ma = 28.96;
        this.ka = 1.4;
        this.y1 = -0.02;
        this.b1 = -0.424;
        this.Vwx = 0;
        this.Vxt = 0;
        this.Vzt = 0;
        this.ga = 9.81;


    }

    @Override
    public double runFormula() {
        double Z = -ga -(cx*Sx*ma*101325)/Msn*Run * (Tsk - 0.006328*zt);

        return Z;
    }
}
