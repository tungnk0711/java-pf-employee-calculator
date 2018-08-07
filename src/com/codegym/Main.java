package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int salaryOfMonth;

        System.out.println("Enter coefficients salary: ");
        int coeff = scanner.nextInt();
        System.out.println("Enter number of year: ");
        int numOfYear = scanner.nextInt();

        if (coeff >= 1 && coeff <= 5) {
            salaryOfMonth = coeff * 4000000 + numOfYear * 500000;
            System.out.printf("Salary: %d", salaryOfMonth);
        } else {
            System.out.println("Invalid input");
        }
    }
}
