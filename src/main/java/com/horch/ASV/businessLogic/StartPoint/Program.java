package com.horch.ASV.businessLogic.StartPoint;

import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.implamentation.formuls.FormulaMock;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IMath;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Program implements IProgram {

    private IMath plusFormula;
    private IMath ZP;

    @Override
    public void run() {
        dependencyInjectionFiller();

        iConfigEnterFiller.EnterMsn();
        iConfigEnterFiller.EnterSx();
        iConfigEnterFiller.EnterV0();
        iConfigEnterFiller.EnterPatm();
        iConfigEnterFiller.EnterVw();
        iConfigEnterFiller.EnterTc();
        iConfigEnterFiller.EnterTsk();

        IConfigEnterData configEnterData = iConfigEnterFiller.getConfigEnterData();
//        System.out.println(configEnterData.toString());

        plusFormula = new FormulaMock(configEnterData.getTc(), configEnterData.getTsk());
        double plusFormulaResult = plusFormula.runFormula();
        System.out.println(plusFormulaResult);

        float configEnterDataget;
        plusFormula = new FormulaMock(configEnterData.getTc() + configEnterData.getTsk());

        ZP = new FormulaMock(configEnterData.getPatm());
        double ZPResult = ZP.runZp();
        System.out.println(ZPResult);
    }


    private  IConfigEnterFiller iConfigEnterFiller;

    private  void dependencyInjectionFiller() {
        ConfigEnterData configEnterData = new ConfigEnterData();
        iConfigEnterFiller = new ConfigEnterFiller(configEnterData);
    }

}
