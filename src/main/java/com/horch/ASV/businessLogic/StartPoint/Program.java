package com.horch.ASV.businessLogic.StartPoint;

import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.implamentation.formuls.FormulaMock;
import com.horch.ASV.businessLogic.implamentation.formuls.FormulaTSK;
import com.horch.ASV.businessLogic.implamentation.formuls.FormulaZP;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IMath;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Program implements IProgram {

    private IMath plusFormula;
    private IMath formZP;
    private IMath formTSK;

    private IConfigEnterData configData;
    private IConfigEnterFiller iConfigEnterFiller;

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

        this.formZP = new FormulaZP(configData.getPatm());
        this.formTSK = new FormulaTSK(configData.getTc(), configData.getKelvinCof());

        double resultTsk = formTSK.runFormula();
        double resultZP = formZP.runFormula();


        System.out.println("resultTsk -> " + resultTsk);
        System.out.println("resultZP -> " + resultZP);
    }


    private void dependencyInjectionFiller() {
        ConfigEnterData configEnterData = new ConfigEnterData();
        iConfigEnterFiller = new ConfigEnterFiller(configEnterData);
        this.configData = configEnterData;

    }

}
