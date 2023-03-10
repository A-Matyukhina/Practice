package com.threads.controller;

import com.threads.model.Calculator;
import com.threads.model.ListOperation;
import com.threads.model.Operation;
import com.threads.model.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Связующее звено между моделью и представлением.
 * Занимается проверкой корректности запроса, данных и т.п.
 */
public class Controller {
    private ListOperation listOperation = new ListOperation();

    public void addOperation(ArrayList<Double> numbers, OperationType operationType) {
        if (numbers.isEmpty() || operationType == null) return;
        Operation operation = new Operation(operationType, numbers);

        try {
            listOperation.addOperation(operation);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void start() throws ExecutionException, InterruptedException {
        /**Для каждого объекта операции создаётся и запускается поток*/
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (var tmp : listOperation.getOperations()) {
            List<Double> numbers = new ArrayList<>(tmp.getNumbers());
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    OperationType operationType = tmp.getOperationType();
                    Calculator calculator = new Calculator();
                    if (!operationType.equals(OperationType.FACT)) {
                        calculator.calculate(operationType, numbers);
                    } else {
                        calculator.calculateFact(numbers);
                    }
                }
            };
            System.out.println(executorService.submit(task));
        }
        executorService.shutdown();
    }
}
