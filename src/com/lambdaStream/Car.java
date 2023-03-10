package com.lambdaStream;

/*
Создайте класс Car с полями brand, model, year и price. Добавьте конструктор для инициализации этих полей.
Создайте класс CarList с полем List<Car> carList. Добавьте конструктор для инициализации этого поля.
В классе CarList создайте метод sortByPrice(), который сортирует список автомобилей по цене и возвращает
отсортированный список. Используйте стримы и лямбда-выражения для сортировки.
В классе CarList создайте метод filterByYear(int year), который фильтрует список автомобилей по году выпуска
и возвращает список только тех автомобилей, которые были выпущены в указанный год. Используйте стримы и
лямбда-выражения для фильтрации.
5. В классе CarList создайте метод groupByBrand(), который группирует список автомобилей по марке и возвращает
Map<String, List<Car>>, где ключ - это марка автомобиля, а значение - список автомобилей с этой маркой.
Используйте стримы и метод Collectors.groupingBy() для группировки.

В методе main создайте экземпляр класса CarList, добавьте несколько объектов Car в список, и вызовите методы
sortByPrice(), filterByYear(int year) и groupByBrand() с соответствующими параметрами и выведите результаты в консоль.

Это должна быть хорошая практика для изучения стримов, лямбда-выражений и группировки элементов в Java.
 */
public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
