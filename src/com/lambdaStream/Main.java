package com.lambdaStream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model s", 2020, 5230998.00);
        Car car2 = new Car("BMW", "X5", 2020, 4100020.00);
        Car car3 = new Car("Toyota", "Voxi", 2013, 1130198.00);
        Car car4 = new Car("Land Rover", "Evoqe", 2022, 8230998.00);
        Car car5 = new Car("Audi", "A8", 2022, 7830998.00);
        Car car6 = new Car("Land Rover", "Evoqe", 2023, 10230998.00);
        Car car7 = new Car("BMW", "X5", 2021, 5100020.00);
        List<Car> carL = new ArrayList<>();
        carL.add(car1);
        carL.add(car2);
        carL.add(car3);
        carL.add(car4);
        carL.add(car5);
        carL.add(car6);
        carL.add(car7);//List.of() can be used to add all this car objects at once
        CarList carList = new CarList(carL);
        System.out.println(carList.sortByPrice().toString());
        System.out.println("____________________");
        System.out.println(carList.filterByYear(2022).toString());
        System.out.println("____________________");
        System.out.println(carList.groupingByBrand().toString());
        System.out.println("____________________");
        System.out.println(carList.groupingByYearAndModel());
        System.out.println("____________________");
        System.out.println(carList.filterOverPrice(2000000));
        System.out.println("____________________");
        System.out.println(carList.AvgPrice(2022));
        System.out.println("____________________");
        System.out.println(carList.sortByBrand());

    }
}
