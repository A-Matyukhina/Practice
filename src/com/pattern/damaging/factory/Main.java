package com.pattern.damaging.factory;

public class Main {
    public static void main(String[] args) {

    LinuxProcess linuxProcess = new LinuxProcess(OS.LINUX);
    WindowsProcess windowsProcess = new WindowsProcess(OS.WINDOWS);
    IosProcess iosProcess = new IosProcess(OS.IOS);

    linuxProcess.run();
    windowsProcess.execute();
    iosProcess.doSmthng();
    }
}
