package com.practicejava;

import java.util.Scanner;

public class Nsquare(int) {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();


        for(int i = 1; i <= userInput; i++){
            int square =(int) Math.sqrt(i);
            if (square * square == i){
                System.out.println(i + " = " + square + "*" + square);
            }
        }

    }
}

