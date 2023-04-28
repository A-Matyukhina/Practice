package com.tasks.task6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Andrey");
        Worker worker2 = new Worker("Liza");
        Worker worker3 = new Worker("Mikhail");
        Worker worker4 = new Worker("Marina");
        Task task = new Task(1, "to do something");
        Task task1 = new Task(1, "to do something 2");
        Task task2 = new Task(2, "to do something more difficult");
        Task task3 = new Task(3,"most difficult to do");
        Task task4 = new Task(3,"most difficult to do 2");
        Task task5 = new Task(3,"most difficult to do 3");
        Task task6 = new Task(2, "to do something more difficult 2");

        worker1.setTasks(new ArrayList<>(List.of(task, task2, task3, task5)));
        worker2.setTasks(new ArrayList<>(List.of(task1, task2, task3, task4)));
        worker3.setTasks(new ArrayList<>(List.of(task, task1, task3, task4, task5)));
        worker4.setTasks(new ArrayList<>(List.of(task, task2, task3, task4, task5)));

        List<Task> finalList1 = worker1.getTasks().stream().filter(e -> e.getDifficult() == 3).toList();
        List<Task> finalList2 = worker2.getTasks().stream().filter(e -> e.getDifficult() == 3).toList();
        List<Task> finalList3 = worker3.getTasks().stream().filter(e -> e.getDifficult() == 3).toList();
        List<Task> finalList4 = worker4.getTasks().stream().filter(e -> e.getDifficult() == 3).toList();

        ArrayList<List<Task>> listOfList = new ArrayList<>(List.of(finalList1, finalList2, finalList3, finalList4));
        List<Task> resultList = listOfList.stream().max(Comparator.comparingInt(List::size)).orElse(null);
        HashMap<Worker, List<Task>> mapOfList = new HashMap<>();
        mapOfList.put(worker1, finalList1);
        mapOfList.put(worker2, finalList2);
        mapOfList.put(worker3, finalList3);
        mapOfList.put(worker4, finalList4);
        Worker result = mapOfList.entrySet().stream().max(Comparator.comparingInt(e -> e.getValue().size())).get().getKey();
        System.out.println(result);
    }
}
