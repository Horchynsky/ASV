package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaY implements IMath {

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
    public double Vwy;
    public double ly;
    ///////////////////////////////////
    private double cy;
    private double sy;


    public FormulaY(double cx, double Msn, double Tsk, double Sx, double Run) {
        this.cy = 0.5;
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


    }



    @Override
    public double runFormula() {
        double Y = (cy*sy*ma*101325)/(Msn*Run*(Tsk-0.006328*zt))*Math.pow((1-(6.5*zt+zp)/288000), 5.255)*Math.pow((Vwy-Vyt), ly);
        return Y;
    }
}
