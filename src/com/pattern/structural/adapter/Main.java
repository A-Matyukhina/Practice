package com.pattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        AlphaListManager alphaListManager = new AlphaListManager();
        BetaProcessor.process(new ListAdapter(alphaListManager));

    }
}
