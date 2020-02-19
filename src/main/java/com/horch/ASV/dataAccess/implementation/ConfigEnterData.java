package com.horch.ASV.dataAccess.implementation;

import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class ConfigEnterData implements IConfigEnterData {
    float Msn;// маса снаряду
    float Sx;//Площа поперечного перерізу
    float V0;//Початкова швидкість снаряду
    float Patm;//Атмосферний тиск
    float Tc;//Температура повітря в градусах Цельсія
    float ga = 9.81f;
    float Vw;//видкість вітру
    float Q;// кут під яким вилітає снаряд
    float Result;// результат формули
    float Lcgrad;
    float dk;//діаметр снаряду
    float zp;// висота над рівнем моря
    int TSK;


    @Override
    public void setMsn(float Msn) {
        this.Msn = Msn;
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
    public void setVw(float Vw) {
        this.Vw = Vw;
    }

    @Override
    public void setQ(float Q) {
        this.Q = Q;
    }

    @Override
    public void setLcgrad(float Lcgrad) {
        this.Lcgrad = Lcgrad;
    }

    @Override
    public void setdk(float dk) {
        this.dk = dk;
    }

    @Override
    public void setzp(float zp) {
        this.zp = zp;
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
    public float getVw() {
        return this.Vw;
    }

    @Override
    public float getQ() {
        return this.Q;
    }

    @Override
    public float getLcgrad() {
        return this.Lcgrad;
    }

    @Override
    public float getdk() {
        return 0;
    }

    @Override
    public float getzp() {
        return this.zp;
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
                ", Vw=" + Vw +
                ", Q=" + Q +
                ", Lcgrad = " + Lcgrad +
                '}';
    }
}
