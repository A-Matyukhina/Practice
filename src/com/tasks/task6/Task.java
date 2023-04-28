package com.tasks.task6;

public class Task {
    private int difficult;
    private String description;

    public Task(int difficult, String description) {
        this.difficult = difficult;
        this.description = description;
    }

    public Task() {
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "difficult=" + difficult +
                ", description='" + description + '\'' +
                '}';
    }
}
