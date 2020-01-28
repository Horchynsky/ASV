package com.horch.ASV.businessLogic.implamentation.formuls;

import com.horch.ASV.businessLogic.interfaces.IMath;

public class FormulaMock implements IMath {

    private float firstNum;
    private float secondNum;

    public FormulaMock(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public double runFormula() {
        return firstNum + secondNum;
    }

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
}
