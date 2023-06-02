package com.pattern.damaging.singleton;

public class Singleton {
//       Создаем один экземпляр класса
//    volatile добавляем, чтоб поток сразу видел состояние переменной, кто бы ее не заменял
    private static volatile Singleton instance;

    public static Singleton getInstance() {
//        Проверяем на отсутствие объекта, если объект равен нал,
//        то синхронно запускаем проверку на нал еще раз срези тех потоков,
//        которые успели войти после первой проверки.
//        double check working
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton() {
    }

}