package com.horch.ASV.businessLogic.interfaces;

import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public interface IConfigEnterFiller {
    public void EnterMsn();
    public void EnterSx();
    public void EnterV0();
    public void EnterPatm();
    public void EnterTc();
    public void Enterga();
    public void EnterVwx();
    public void EnterVwy();
    public void EnterQ();
    public  IConfigEnterData getConfigEnterData();
    public void Result();
}

