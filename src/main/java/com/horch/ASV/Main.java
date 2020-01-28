package com.horch.ASV;

import com.horch.ASV.StartPoint.IProgram;
import com.horch.ASV.StartPoint.Program;
import com.horch.ASV.businessLogic.implamentation.ConfigEnterFiller;
import com.horch.ASV.businessLogic.interfaces.IConfigEnterFiller;
import com.horch.ASV.dataAccess.implementation.ConfigEnterData;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;

public class Main {
    public static IProgram iProgram;

    public static void main(String[] args) {
        iProgram = new Program();
        iProgram.run();
    }
}
