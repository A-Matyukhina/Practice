package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getMethods();
        for(var tmp : methods){
            System.out.println((tmp.getName() + " " + Arrays.toString(tmp.getParameterTypes()) + " " + tmp.getReturnType()));
        }
        String s = "umbrella";
        Method m = clazz.getMethod("toUpperCase");
        Object result = m.invoke(s);
        System.out.println(result);
//        System.out.println("_________________________");
//        Constructor ctor = clazz.getConstructor(String.class);
//        String s = (String) ctor.newInstance("Hello");
//        System.out.println(s);
    }
}
