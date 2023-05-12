package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndSubstractionAndDiv(double first, double second) {
        return sum(subtraction(first, second), dividing(first, second));
    }

    public static double sum4Func(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndSubstractionAndDiv(50, 10));
        System.out.println("Результат расчета равен: " + sum4Func(234, 2));
    }
}
