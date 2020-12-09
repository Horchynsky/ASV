package com.horch.ASV.dataAccess.implementation;

import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class ConfigEnterData implements IConfigEnterData {

    //Вхідні дані з консолі
    float Msn;// маса снаряду
    float Sx;//Площа поперечного перерізу
    float V0;//Початкова швидкість снаряду
    float Patm;//Атмосферний тиск
    float Tc;//Температура повітря в градусах Цельсія
    float Vw;//швидкість вітру

    // Дані які знаходимо
    float Result;// результат формули
    float ZP;// висота над рівнем моря
    int TSK;//Температура в кельвінах
    float ga = 9.81f;

    @Override
    public void setMsn(float Msn) {
        this.Msn = Msn;
    }

    @Override
    public void setV0(float V0) {
        this.V0 = V0;
    }

    @Override
    public void setPatm(float Patm) {
        this.Patm = Patm;
    }

    @Override
    public void setTc(float Tc) {
        this.Tc = Tc;
    }

    @Override
    public void setVw(float Vw) {
        this.Vw = Vw;
    }

    @Override
    public int getKelvinCof() {
        return 273;
    }

    @Override
    public int getTSK() {
        return this.TSK;
    }

    @Override
    public void setTSK(int TSK) {
        this.TSK = TSK;
    }

    @Override
    public void setResult(float Result) {
        this.Result = Result;
    }

    @Override
    public float getMsn() {
        return this.Msn;
    }

    @Override
    public float getSx() {
        return this.Sx;
    }

    @Override
    public float getPatm() {
        return this.Patm;
    }

    @Override
    public float getTc() {
        return this.Tc;
    }

    @Override
    public float getZP() {
        return this.ZP;
    }


    @Override
    public float getResult() {
        return this.Result();
    }

    @Override
    public double getP() {
        return 3.14;
    }

    private float Result() {
        return getResult();
    }

}
