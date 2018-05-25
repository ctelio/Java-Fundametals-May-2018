package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.50);
            }
            if (product.equals("water")) {
                System.out.println(quantity * 0.80);
            }
            if (product.equals("beer")) {
                System.out.println(quantity * 1.20);
            }
            if (product.equals("sweets")) {
                System.out.println(quantity * 1.45);
            }
            if (product.equals("peanuts")) {
                System.out.println(quantity * 1.60);
            }
        }
        if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.40);
            }
            if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            }
            if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            }
            if (product.equals("sweets")) {
                System.out.println(quantity * 1.30);
            }
            if (product.equals("peanuts")) {
                System.out.println(quantity * 1.50);
            }
        }
        if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            }
            if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            }
            if (product.equals("beer")) {
                System.out.println(quantity * 1.10);
            }
            if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            }
            if (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}