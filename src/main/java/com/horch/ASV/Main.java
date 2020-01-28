package com.horch.ASV;

import com.horch.ASV.businessLogic.StartPoint.IProgram;
import com.horch.ASV.businessLogic.StartPoint.Program;

public class Main {
    public static IProgram iProgram;

    public static void main(String[] args) {
        iProgram = new Program();
        iProgram.run();
    }
}
