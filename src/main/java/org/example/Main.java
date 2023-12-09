package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        int n = 5; // variable n to calculate the sum from 1 to n

        int sumResult = calculator.sum(n);
        System.out.println("Сума чисел від 1 до " + n + " = " + sumResult);
    }
}