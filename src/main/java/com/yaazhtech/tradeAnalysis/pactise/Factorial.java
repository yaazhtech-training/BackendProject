package com.yaazhtech.tradeAnalysis.pactise;

public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Change this to any number you want to find factorial for
        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
