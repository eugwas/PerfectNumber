package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Perfect number is a positive integer that is equal to the sum of its positive divisors.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int number = scanner.nextInt();
            PerfectNumber perfectNumber = new PerfectNumber(number);
            System.out.println("Is perfect number = " + perfectNumber.isPerfectNumber(number));
        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        scanner.close();
    }
}
