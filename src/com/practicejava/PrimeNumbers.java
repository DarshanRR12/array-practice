package com.practicejava;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        boolean isComposite = false;

        for (int i = 2; i <= userInput / 2; ++i) {
            if (userInput % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (!isComposite)
            System.out.println(userInput + " is prime number.");
        else
            System.out.println(userInput + " is not prime number.");
    }
}
