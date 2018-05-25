package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workdays = Integer.parseInt(scanner.nextLine());
        double daymoney = Double.parseDouble(scanner.nextLine());
        double kurs = Double.parseDouble(scanner.nextLine());
        double salary = workdays * daymoney;
        double income = salary * 12 + salary * 2.5;
        double tax = income * 25 / 100;
        double cleartax = (income - tax) * kurs;
        double rsult = cleartax / 365;
        System.out.printf("%.2f",rsult);
    }
}