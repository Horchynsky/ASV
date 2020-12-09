package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaX implements IMath {
    private double cx;
    private double Msn;
    private double Tsk;
    private double Sx;
    private double Run;
    private double ZP;
    private double zt;
    private double ma;
    private double ka;
    private double y1;
    private double b1;
    private double Vwx;// щвидкість вітру
    private double Vxt;
    private double Vzt;


    public FormulaX(double Msn, double Tsk, double Sx , float ZP) {
        // Дані введені з консолі та результати попередніх формул
        this.Msn = Msn;
        this.Tsk = Tsk;
        this.Sx = Sx;
        this.ZP = ZP;
        // Константи, які занесені в програму з самого початку
        this.cx = 0.5;
        this.Run = 8314;
        this.ma = 28.96;
        this.ka = 1.4;
        this.y1 = -0.02;
        this.b1 = -0.424;
        this.Vwx = 1;
        this.Vxt = 1;
        this.Vzt = 1;
        this.zt = 1;


    }


    @Override
    public double runFormula() {

        //Змінні перша частина формули
        double fir = 1 - ((6.5 * ZP) / 288000);
        //Змінні друга частина формули
        double first = Math.pow(Vxt, 2);
        double second = Math.pow(Vzt, 2);
        //Змініні третя частина формули
        double fir1 = ((ka * Run) / ma * (Tsk - 0.006328 * zt));
        double fir2 = Math.pow(fir1, 0.5);
        //
        double fir3 = fir2 + (Vwx * Vxt) / Math.sqrt(first + second);
        double fir4 = Math.pow(fir3, b1);

        System.out.println("fir " + fir);
        System.out.println("fir1 " + fir1);
        System.out.println("fir2 " + fir2);
        System.out.println("fir3 " + fir3);
        System.out.println("fir4 " + fir4);
        //
        double X = ((-cx * Sx * ma * 101325) / (Msn * Run * (Tsk - 0.006328 * zt)) * Math.pow(fir, 5.255)) *
                ((Math.pow((first + second - Vwx * Vzt), 2 + y1 + b1)) * Vxt) /
                fir4 * Math.pow((first + second), 0.5 * (3 + y1 + b1));
        return X;


        //Second formula


    }

}
