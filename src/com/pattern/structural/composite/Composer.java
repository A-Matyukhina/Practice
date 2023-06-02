package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composer implements Car{

    private List<Car> carList = new ArrayList<>();

    public void add(Car... cars){
        this.carList = Arrays.asList(cars);
    }
//    в данном случае метод клиа не нужен, так как сразу идет лист а не по отдельности в лист добавляется, но на будущее может потребоваться
    public void clear(){
        carList.clear();
    }
    @Override
    public void draw(String color) {
        carList.forEach(e -> e.draw(color));
    }
}
