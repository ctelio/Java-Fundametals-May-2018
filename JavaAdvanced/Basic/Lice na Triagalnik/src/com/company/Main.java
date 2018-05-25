package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("°C = ");
        double C = Double.parseDouble(scanner.nextLine());
        double F = (C * 1.8) + 32;
        System.out.printf("°F = %.2f", F);
    }
}