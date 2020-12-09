package com.horch.ASV.dataAccess.interfaces;

public interface IConfigEnterData {
    public void setMsn(float Msn);

    public void setV0(float V0);

    public void setPatm(float Patm);

    public void setTc(float Tc);

    public void setVw(float Vw);

    public int getKelvinCof();

    int getTSK();

    void setTSK(int TSK);

    public void setResult(float nextFloat);


    public float getMsn();

    public float getSx();

    public float getPatm();

    public float getTc();

    public  float getZP();

    public float getResult();

    double getP();


}

