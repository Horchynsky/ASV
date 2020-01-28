package com.horch.ASV.businessLogic.StartPoint;

import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Program implements IProgram {

    private  IConfigEnterFiller iConfigEnterFiller;

    @Override
    public void run() {
        dependencyInjectionFiller();
        iConfigEnterFiller.EnterMsn();
        iConfigEnterFiller.EnterSx();
        iConfigEnterFiller.EnterV0();
        iConfigEnterFiller.EnterPatm();
        iConfigEnterFiller.EnterVwy();
        iConfigEnterFiller.EnterVwx();
        iConfigEnterFiller.EnterTc();
        IConfigEnterData configEnterData = iConfigEnterFiller.getConfigEnterData();
        System.out.println(configEnterData.toString());
    }

    private  void dependencyInjectionFiller() {
        ConfigEnterData configEnterData = new ConfigEnterData();
        iConfigEnterFiller = new ConfigEnterFiller(configEnterData);
    }

}
