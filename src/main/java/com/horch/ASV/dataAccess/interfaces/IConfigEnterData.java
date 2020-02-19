package com.horch.ASV.dataAccess.interfaces;

public interface IConfigEnterData {
    public void setMsn(float Msn);

    public void setSx(float Sx);

    public void setV0(float V0);

    public void setPatm(float Patm);

    public void setTc(float Tc);

    public void setga(float ga);

    public void setVw(float Vw);

    public void setQ(float Q);

    public void setLcgrad(float nextFloat);

    public void setdk(float dk);

    public void setzp(float zp);

    public int getKelvinCof();

    int getTSK();

    void setTSK(int TSK);

    public void setResult(float nextFloat);


    public float getMsn();

    public float getSx();

    public float getV0();

    public float getPatm();

    public float getTc();

    public float getga();

    public float getVw();

    public float getQ();

    public float getLcgrad();

    public float getdk();

    public float getzp();

    public float getResult();
}

