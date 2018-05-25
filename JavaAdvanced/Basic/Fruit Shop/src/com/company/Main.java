package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        Double price = 0.0;
        if ((day.equals ("monday") || day.equals ("tuesday") || day.equals ("wednesday") || day.equals ("thursday") ||
                day.equals ("friday")) && (fruit.equals ("banana") || fruit.equals ("apple") || fruit.equals ("orange") || fruit.equals ("grapefruit") || fruit.equals ("kiwi") || fruit.equals ("pineapple") || fruit.equals ("grapes"))) {
            if (fruit.equals ("banana")) {
                price = quantity * 2.50;
            }
            if (fruit.equals ("apple")) {
                price = quantity * 1.20;
            }
            if (fruit.equals ("orange")) {
                price = quantity * 0.85;
            }
            if (fruit.equals ("grapefruit")) {
                price = quantity * 1.45;
            }
            if (fruit.equals ("kiwi")) {
                price = quantity * 2.70;
            }
            if (fruit.equals ("pineapple")) {
                price = quantity * 5.50;
            }
            if (fruit.equals ("grapes")) {
                price = quantity * 3.85;
            }
            System.out.printf ("%.2f", price);
        } else if ((day.equals ("saturday") || day.equals ("sunday")) && (fruit.equals ("banana") || fruit.equals ("apple") || fruit.equals ("orange") || fruit.equals ("grapefruit") || fruit.equals ("kiwi") || fruit.equals ("pineapple") || fruit.equals ("grapes"))) {
            if (fruit.equals ("banana")) {
                price = quantity * 2.70;
            }
            if (fruit.equals ("apple")) {
                price = quantity * 1.25;
            }
            if (fruit.equals ("orange")) {
                price = quantity * 0.90;
            }
            if (fruit.equals ("grapefruit")) {
                price = quantity * 1.60;
            }
            if (fruit.equals ("kiwi")) {
                price = quantity * 3.00;
            }
            if (fruit.equals ("pineapple")) {
                price = quantity * 5.60;
            }
            if (fruit.equals ("grapes")) {
                price = quantity * 4.20;
            }
            System.out.printf ("%.2f", price);
        }
        else {
            System.out.println("error");
        }
    }
}