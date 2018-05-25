package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter two integers:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Greater number: " + number1);
        } else {
            System.out.println("Greater number: " + number2);
        }
    }
}