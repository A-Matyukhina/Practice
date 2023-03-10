package com.lambdaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/*
Создайте класс CarList с полем List<Car> carList. Добавьте конструктор для инициализации этого поля.
В классе CarList создайте метод sortByPrice(), который сортирует список автомобилей по цене и возвращает
отсортированный список. Используйте стримы и лямбда-выражения для сортировки.
В классе CarList создайте метод filterByYear(int year), который фильтрует список автомобилей по году выпуска
и возвращает список только тех автомобилей, которые были выпущены в указанный год. Используйте стримы и
лямбда-выражения для фильтрации.
5. В классе CarList создайте метод groupByBrand(), который группирует список автомобилей по марке и возвращает
Map<String, List<Car>>, где ключ - это марка автомобиля, а значение - список автомобилей с этой маркой.
Используйте стримы и метод Collectors.groupingBy() для группировки.
можно добавить новые функции в класс CarList. Например:

Метод, который будет возвращать список автомобилей с заданной моделью
Метод, который будет возвращать среднюю цену автомобилей заданного года выпуска
Метод, который будет возвращать список автомобилей дороже заданной цены
Метод, который будет сгруппировать автомобили по году выпуска и модели.
Реализовывая эти методы, ты можешь использовать различные функции Stream API,
как map, reduce, filter, collect и тд. Это поможет тебе закрепить полученные
знания и научиться их применять на практике.
 */
public class CarList implements Sorting {
    private List<Car> carList;

    public CarList(List<Car> carList) {
        this.carList = carList;
    }

    public CarList() {
        this.carList = new ArrayList<>();
    }

    @Override
    public List<Car> sortByPrice() {
        return carList.stream().sorted(Comparator.comparingDouble(Car::getPrice)).collect(Collectors.toList());
    }

    @Override
    public List<Car> filterByYear(int year) {
        return carList.stream().filter(car -> car.getYear() == year).collect(Collectors.toList());
    }

    @Override
    public List<Car> sortByBrand() {
        return carList.stream().sorted(Comparator.comparing(Car ::getBrand)).collect(Collectors.toList());
    }

    @Override
    public Double AvgPrice(int year) {
        return carList.stream().flatMapToDouble(e -> DoubleStream.of(e.getPrice())).average().orElse(0.0);
    }

    @Override
    public List<Car> filterOverPrice(double price) {
        return carList.stream().filter(e -> e.getPrice() > price).collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Car>> groupingByBrand() {
        return carList.stream().collect(Collectors.groupingBy(Car::getBrand));
    }

    @Override
    public Map<Integer, Map<String, List<Car>>>groupingByYearAndModel() {
        return carList.stream().collect(Collectors.groupingBy(Car ::getYear, Collectors.groupingBy(Car ::getModel)));
    }
}
