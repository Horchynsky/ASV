package com.horch.ASV.businessLogic.interfaces;

import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public interface IConfigEnterFiller {
    public void EnterMsn();
    public void EnterSx();
    public void EnterV0();
    public void EnterPatm();
    public void EnterTc();
    public void Enterga();
    public void EnterVw();
    public void EnterQ();
    public void EnterLcgrd();
    public void Enterdc();
    public void Enterdk();
    public  IConfigEnterData getConfigEnterData();
    public void Result();

    public void EnterTsk();


}

