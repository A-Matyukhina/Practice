package com.threads.view;

import com.threads.controller.Controller;
import com.threads.model.OperationType;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/*
Задача 1:
Многопоточный калькулятор.
Требования:
1. Консольный интерфейс;
2. MVC;
3. Вывод набора возможных операций (сложение, вычитание, умножение, факториал числа или чисел);
4. Система дает возможность пользователю поставить задачи - пользователь выбирает тип операции,
вводит набор чисел над которым надо выполнить выбранный тип операции, (ввел N чисел, тип операции
сумма - получили сумму N чисел, в случае факториала - получаем факториал для каждого числа);
5. Задачи накапливаются к выполнению в некую коллекцию, но не выполняются сразу. Пользователь
может ставить неограниченное количество задач.
6. После того, как пользователь поставит все задачи которые захочет - он выбирает команду "запустить",
которая запускает все задачи в многопоточном режиме, и после их параллельного выполнения - выводит
результат выполнения задач в консоль.
 */
public class Console {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        while (true) {
            System.out.println("1 - Добавить операцию");
            System.out.println("2 - Запустить выполнение");
            int choice = scanner.nextInt();

            if (choice == 1) {
                ArrayList<Double> numbers = new ArrayList<>();
                System.out.println("Сколько чисел Вы хотите ввести?");
                int quantityNumbers = scanner.nextInt();
                if (quantityNumbers >= 1) {
                    for (int i = 0; i < quantityNumbers; i++) {
                        System.out.println("Введите число: ");
                        numbers.add(scanner.nextDouble());          //Сохранение введённого числа в коллекцию
                    }

                    printOperation();
                    int numberOperation = scanner.nextInt();
                    OperationType operationType = getTypeOperation(numberOperation);
                    controller.addOperation(numbers, operationType);
                }
            } else if (choice == 2) {
                controller.start();
                break;
            } else {
                System.out.println("Неправильная команда!");
            }

        }
    }

    public static void printOperation() {
        System.out.println("Выберите тип операции:");
        System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Факториал");
    }

    /**
     * Метод, определяющий тип операции
     */
    public static OperationType getTypeOperation(int numberOperation) {
        if (numberOperation == 1) return OperationType.SUM;//switch case would be better
        if (numberOperation == 2) return OperationType.DIFF;
        if (numberOperation == 3) return OperationType.MUL;
        if (numberOperation == 4) return OperationType.DIV;
        if (numberOperation == 5) return OperationType.FACT;
        return null;
    }
}
