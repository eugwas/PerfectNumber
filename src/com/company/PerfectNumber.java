package com.company;

public class PerfectNumber {
    private int number;

    public PerfectNumber(int number) {
        this.number = number;
    }

    public boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                int divisor = i;
                System.out.println("Divisor = " + divisor);
                sum += divisor;
            }
        }
        System.out.println("Sum = " + sum);
        if (number != sum) {
            return false;
        }

        return true;
    }
}
