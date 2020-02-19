package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class FormulaMock implements IMath {

    private float firstNum;
    private float secondNum;

    private float Patm;


    public FormulaMock(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;

    }

    public FormulaMock(float v) {

    }


    @Override
    public double runFormula() {
        return firstNum + secondNum;
    }

//    @Override
//    public double runZp() {
//        return (288000 / 6.5 * (1 - Math.pow((Patm / 760), (1 / 5.255))));
//    }

    public float getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }

    public float getPatm() {
        return Patm;
    }

    public void setPatm(float Patm) {
        this.Patm = Patm;
    }
}