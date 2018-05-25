package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();
        String thirdWord = input.next();

        int sum = firstInt + secondInt + thirdInt;

        System.out.println( firstWord + " " + secondWord + " " + thirdWord + " " + sum);
    }
}