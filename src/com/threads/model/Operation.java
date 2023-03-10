package com.threads.model;

import java.util.ArrayList;
import java.util.List;

/**
 * DTO (Data Transfer Object) объект
 * Просто хранит данные, которые будут передаваться
 */
public class Operation {
    private OperationType operationType;
    private List<Double> numbers = new ArrayList<>();

    public Operation(OperationType operationType, List<Double> numbers) {
        this.operationType = operationType;
        this.numbers = numbers;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }
}
