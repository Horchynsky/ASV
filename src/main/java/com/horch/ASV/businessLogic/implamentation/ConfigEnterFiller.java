package com.horch.ASV.businessLogic.implamentation;

import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

import java.util.Scanner;

public class ConfigEnterFiller implements IConfigEnterFiller {
    private Scanner scan = new Scanner(System.in);
    private IConfigEnterData configEnterData;

    public ConfigEnterFiller(IConfigEnterData configEnterData) {
        this.configEnterData = configEnterData;
    }

    @Override
    public void EnterMsn() {
        System.out.print("Введіть масу снаряду: ");
        configEnterData.setMsn(scan.nextInt());
    }

    @Override
    public void EnterSx() {
        System.out.print("Введіть площу поперечного перерізу снаряду: ");
        configEnterData.setSx(scan.nextFloat());
    }

    @Override
    public void EnterV0() {
        System.out.print("Введіть початкову швидкість снаряду: ");
        configEnterData.setV0(scan.nextFloat());
    }

    @Override
    public void EnterPatm() {
        System.out.print("Введіть атмосферний тиск: ");
        configEnterData.setPatm(scan.nextFloat());
    }

    @Override
    public void EnterTc() {
        System.out.print("Введіть температуру в градусах Цельсія: ");
        configEnterData.setTc(scan.nextFloat());
    }

    @Override
    public void Enterga() {

        configEnterData.setga(scan.nextFloat());
    }


    @Override
    public void EnterVw() {
        System.out.print("Введіть швидкість вітру: ");
        configEnterData.setVw(scan.nextFloat());
    }

    @Override
    public void EnterQ() {

    }

    @Override
    public void EnterLcgrd() {

    System.out.print("Введіть кут цілі в градусах: ");
    configEnterData.setLcgrad(scan.nextFloat());
    }

    @Override
    public void Enterdc() {

    }

    @Override
    public void Enterdk() {
        System.out.print("Введіть діаметр кулі:");
        configEnterData.setdk(scan.nextFloat());
    }

    @Override
    public IConfigEnterData getConfigEnterData() {
        return this.configEnterData;
    }

    @Override
    public void Result() {

    }

    @Override
    public void EnterTsk() {
        System.out.print("Tемпература в кельвінах = ");
        configEnterData.getTsk();
    }
    public void Enterzp(){
        System.out.print("Висота над рівнем моря = ");
        configEnterData.getzp();
    }

    @Override
    public String toString() {
        return "ConfigEnterFiller{" +
                "configEnterData=" + configEnterData.toString() +
                '}';
    }
}
