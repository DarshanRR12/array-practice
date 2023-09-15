package com.practicejava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int userInput = scanner.nextInt();

        int[] values = new int[userInput];
        values[0] = 0;
        values[1] = 1;

        for (int i = 2; i < userInput; i++){
            values[i] = values[i - 1] + values[i - 2];
        }
        for(int current : values){
            System.out.println(current);
        }
    }
}
