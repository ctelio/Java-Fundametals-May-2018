package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD = ");
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = 1.79549*USD;
        System.out.printf("BGN = %.2f", BGN);
    }
}