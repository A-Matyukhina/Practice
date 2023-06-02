package com.pattern.damaging.factory;

public class LinuxProcess {
    private  final OS os;

    public LinuxProcess(OS os){
        this.os = os;
    }
    public void run(){
        ButtonFactory.getButton(os).execute();
    }
}
