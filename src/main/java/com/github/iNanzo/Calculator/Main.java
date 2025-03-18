package com.github.iNanzo.Calculator;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        int sum = calculator.add(4, 7);
        System.out.println("4 + 7 = " + sum);
    }
}