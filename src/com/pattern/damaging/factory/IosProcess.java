package com.pattern.damaging.factory;

public class IosProcess {
    private  final OS os;

    public IosProcess(OS os){
        this.os = os;
    }
    public void doSmthng(){
        ButtonFactory.getButton(os).execute();
    }
}
