package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double a = 0;
        if (number <= 100) {
            a = 5;
        } else if (number > 100 && number < 1000) {
            a = number * 0.2;
        } else if (number > 1000) {
            a = number * 0.1;
        }
        if (number % 2 == 0) {
            a += 1;
        } else if (number % 5 == 0) {
            a += 2;
        }
        System.out.println(a);
        System.out.println(number + a);
    }
}