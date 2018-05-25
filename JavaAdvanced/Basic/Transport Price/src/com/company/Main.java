package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String DayOrNight = scanner.nextLine();
        double price = 0.0;
        double taxiprice = 0.0;
        if (DayOrNight.equals ("day")) {
            taxiprice = 0.79;
        }
        else if (DayOrNight.equals ("night")) {
            taxiprice = 0.90;
        }
        if (n < 20) {
            price = 0.70 + (n * taxiprice);
        } else if (n < 100) {
            price = n * 0.09;
        } else {
            price = n * 0.06;
        }
        System.out.printf("%.2f", price);
    }
}