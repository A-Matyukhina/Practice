package com.pattern.damaging.factory;

public class WindowsProcess {
    private  final OS os;

    public WindowsProcess(OS os){
        this.os = os;
    }
    public void execute(){
        ButtonFactory.getButton(os).execute();
    }
}
