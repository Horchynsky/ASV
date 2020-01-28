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
    public void EnterVwx() {
        System.out.print("Введіть швидкість вітру на осі у: ");
        configEnterData.setVwx(scan.nextFloat());
    }

    @Override
    public void EnterVwy() {
        System.out.print("Введіть швидкість вітру на осі х: ");
        configEnterData.setVwy(scan.nextFloat());
    }

    @Override
    public void EnterQ() {

    }

    @Override
    public IConfigEnterData getConfigEnterData() {
        return this.configEnterData;
    }

    @Override
    public void Result() {

    }

    @Override
    public String toString() {
        return "ConfigEnterFiller{" +
                "configEnterData=" + configEnterData.toString() +
                '}';
    }
}
