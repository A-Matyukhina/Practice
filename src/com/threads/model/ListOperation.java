package com.threads.model;

import java.util.concurrent.LinkedBlockingQueue;

public class ListOperation {
    private final LinkedBlockingQueue<Operation> operations = new LinkedBlockingQueue<>();

    /**
     * Метод сохранения операции с числами
     */
    public void addOperation(Operation operation) throws InterruptedException {
        operations.put(operation);
    }

    public LinkedBlockingQueue<Operation> getOperations() {
        return operations;
    }
}
