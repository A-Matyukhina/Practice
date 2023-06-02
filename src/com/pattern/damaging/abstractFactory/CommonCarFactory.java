package com.pattern.damaging.abstractFactory;

public class CommonCarFactory {
    public static CarsFactory getFactory(Type type){
        if(Type.FORD.equals(type)){
            return new FordFactory();
        }else{
            return new ToyotaFactory();
        }
    }
}
