package com.horch.ASV.businessLogic.StartPoint;

import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.implamentation.formuls.*;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IMath;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Program implements IProgram {

    private IMath formZP;
    private IMath formTSK;
    private IMath formSx;
    private IMath formX;
    private IMath formY;
    private IMath formZ;
    private IMath formTETA;


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
        this.formSx = new FormulaSx();
        this.formX = new FormulaX(configData.getMsn(),configData.getTSK(),configData.getSx(),configData.getZP());
        this.formY = new FormulaY(configData.getMsn(), configData.getTSK(),configData.getSx(),configData.getZP());
        this.formZ = new FormulaZ(configData.getMsn(),configData.getTSK(), configData.getSx(), configData.getZP());
        this.formTETA= new FormulaTETA();


        double resultZP = formZP.runFormula();
        double resultTsk = formTSK.runFormula();
        double resultSx = formSx.runFormula();
        double resultX = formX.runFormula();
        double resultY = formY.runFormula();
        double resultZ = formZ.runFormula();
        double resultTETA = formTETA.runFormula();

        System.out.println("resultZP -> " + resultZP);
        System.out.println("resultTsk -> " + resultTsk);
        System.out.println("resultSx -> "+ resultSx);
        System.out.println("resultX -> " + resultX);
        System.out.println("resultY -> " + resultY);
        System.out.println("resultZ -> " + resultZ);
        System.out.println("resultTETA -> "+ resultTETA);
    }


    private void dependencyInjectionFiller() {
        ConfigEnterData configEnterData = new ConfigEnterData();
        iConfigEnterFiller = new ConfigEnterFiller(configEnterData);
        this.configData = configEnterData;

    }

}
