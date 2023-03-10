package com.lambdaStream;

import java.util.List;
import java.util.Map;

public interface Sorting<T> {
    <T> List<T> sortByPrice();

    <T> List<T> sortByBrand();

    <T> Double AvgPrice(int year);

    <T> List<T> filterByYear(int year);

    <T> List<T> filterOverPrice(double p);

    Map<String, List<Car>> groupingByBrand();

    Map<String, Map<Integer, Car>> groupingByYearAndModel();
}
