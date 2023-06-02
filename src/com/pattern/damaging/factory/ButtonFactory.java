package com.pattern.damaging.factory;
//Созжаем фабрику, чтоб кнопки точно не перепутал программист при создании объекта
public class ButtonFactory {
    public static Button getButton(OS os){
        if (OS.WINDOWS.equals(os)){
            return new WindowsButton();
        }else if(OS.LINUX.equals(os)){
            return new LinuxButton();
        }else if(OS.IOS.equals(os)){
            return new IosButton();
        }
        throw new UnsupportedOperationException();
    }
}
