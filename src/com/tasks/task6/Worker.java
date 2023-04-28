package com.tasks.task6;

import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<Task> tasks;

    public Worker() {
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
