package com.tasks.task3;

public class Counter {
    private int count = 0;
    private int maxCount = 10;

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        increment(1);
    }

    public void increment(int number) {
        if ((count + number) <= maxCount && (number + count) > 0) {
            count += number;
        }
    }

    public void decrement() {
        decrement(1);
    }

    public void decrement(int number) {
        if ((count - number) >= 0 && (count - number)< maxCount){
            count -= number;
        }
    }

    public Counter(int maxCount) {
        if (maxCount < this.maxCount) {
            this.maxCount = maxCount;
        }
    }

    public void countReload() {
        count = 0;
    }
}
