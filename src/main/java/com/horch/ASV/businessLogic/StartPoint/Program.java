package com.horch.ASV.businessLogic.StartPoint;

import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.implamentation.formuls.FormulaMock;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IMath;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Program implements IProgram {

    private IMath plusFormula;

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
//        System.out.println(configEnterData.toString());

        plusFormula = new FormulaMock(configEnterData.getSx(), configEnterData.getV0());
        double plusFormulaResult = plusFormula.runFormula();
        System.out.println(plusFormulaResult);
    }

    private  IConfigEnterFiller iConfigEnterFiller;

    private  void dependencyInjectionFiller() {
        ConfigEnterData configEnterData = new ConfigEnterData();
        iConfigEnterFiller = new ConfigEnterFiller(configEnterData);
    }

}
