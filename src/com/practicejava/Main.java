package com.practicejava;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("PRESS 1 FOR NSQUARE PROGRAM.");
        System.out.print("PRESS 2 FOR FIBONACCI PROGRAM.");
        System.out.print("PRESS 3 FOR PRIME NUMBER PROGRAM.");


        int choice = scanner.nextInt();
        switch (choice){
            case 1 ->{
                int userInput = scanner.nextInt();
                System.out.println(new Nsquare(userInput));
            }

        }

    }
}