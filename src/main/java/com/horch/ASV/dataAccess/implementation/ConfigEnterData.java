package com.horch.ASV.dataAccess.implementation;

import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class ConfigEnterData implements IConfigEnterData {
    float Msn;// маса снаряду
    float Sx;//Площа поперечного перерізу
    float V0;//Початкова швидкість снаряду
    float Patm;//Атмосферний тиск
    float Tc;//Температура повітря в градусах Цельсія
    float ga = 9.81f;
    float Vwy;//Швидкість вітру
    float Vwx;//Швидкість вітру
    float Q;// кут під яким вилітає снаряд
    float Result;


    @Override
    public void setMsn(float Msn) {this.Msn = Msn;

    }

    @Override
    public void setSx(float Sx) {
        this.Sx = Sx;
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
    public void setga(float ga) {
        this.ga = ga;
    }

    @Override
    public void setVwx(float Vwx) {
        this.Vwx = Vwx;
    }

    @Override
    public void setVwy(float Vwx) {
        this.Vwy = Vwx;
    }

    @Override
    public void setQ(float Q) {
        this.Q = Q;
    }

    @Override
    public void setResult(float Result) {
        this.Result=Result;
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
    public float getV0() {
        return this.V0;
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
    public float getga() {
        return this.ga;
    }

    @Override
    public float getVwx() {
        return this.Vwx;
    }

    @Override
    public float getVwy() {
        return this.Vwy;
    }

    @Override
    public float getQ() {
        return this.Q;
    }


    @Override
    public float getResult() {
        return this.Result();
    }

    private float Result() {
        return getResult();
    }

    @Override
    public String toString() {
        return "ConfigEnterData{" +
                "Msn=" + Msn +
                ", Sx=" + Sx +
                ", V0=" + V0 +
                ", Patm=" + Patm +
                ", Tc=" + Tc +
                ", ga=" + ga +
                ", Vwy=" + Vwy +
                ", Vwx=" + Vwx +
                ", Q=" + Q +
                '}';
    }
}
