package com.pattern.structural.adapter;

public class BetaProcessor{
    public static void  process(BetaList betaList){
        betaList.addValue(1);
        betaList.getValue(1);
        betaList.removeValue(1);
    }
}
