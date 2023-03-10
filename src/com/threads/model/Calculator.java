package com.threads.model;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public void calculate(OperationType type, List<Double> numbers) {
        double result = 0.0;
        double result2 = Integer.MIN_VALUE;
        double result3 = 1;
        switch (type) {
            case SUM -> {
                for (double number : numbers) {
                    result += number;
                }
                System.out.println("\t Sum is: " + result);
            }
            case DIV -> {

                for (double number : numbers) {
                    if (result2 < number || numbers.indexOf(number) == 0) {
                        result2 = number;
                    } else {
                        result2 /= number;
                    }
                }
                System.out.println("\t Division result is: " + result2);
            }
            case DIFF -> {
                for (double number : numbers) {
                    if (result2 < number || numbers.indexOf(number) == 0) {
                        result2 = number;
                    } else {
                        result2 -= number;
                    }
                }
                System.out.println("\t Difference is: " + result2);
            }
            case MUL -> {
                for (double number : numbers) {
                    result3 *= number;
                }
                System.out.println("\t Multiply result is: " + result3);
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        ;
    }

    public void calculateFact(List<Double> numbers) {
        List<Integer> resultFact = new ArrayList<>();
        for (double tmp : numbers) {
            int result = 1;
            try {
                if (tmp % 1 != 0) {
                    resultFact.add(0);
                }
                if (tmp == 0) {
                    resultFact.add(result);
                }
                for (int i = 1; i <= tmp; i++) {
                    result = result * i;
                }
                resultFact.add(result);
            } catch (ArithmeticException e) {
                System.out.println("Double number has no factorial!");
            }
        }
        System.out.println("\t Factorial of numbers you have entered is: " + resultFact);
    }
}
