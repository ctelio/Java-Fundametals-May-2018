package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine().toLowerCase();
        double volume = Double.parseDouble(scanner.nextLine());
        double tax = 0.0;
        if (volume < 0) {
            System.out.println("error");
        }
            else if (town.equals("sofia")) {
                if (0 <= volume && volume <= 500) {
                    tax = volume * 0.05;
                }
                if (500 < volume && volume <= 1000) {
                    tax = volume * 0.07;
                }
                if (1000 < volume && volume <= 10000) {
                    tax = volume * 0.08;
                }
                if (volume > 10000) {
                    tax = volume * 0.12;
                }
                System.out.printf("%.2f", tax);
            } else if (town.equals("varna")) {
                if (0 <= volume && volume <= 500) {
                    tax = volume * 0.045;
                }
                if (500 < volume && volume <= 1000) {
                    tax = volume * 0.075;
                }
                if (1000 < volume && volume <= 10000) {
                    tax = volume * 0.10;
                }
                if (volume > 10000) {
                    tax = volume * 0.13;
                }
                System.out.printf("%.2f", tax);
            } else if (town.equals("plovdiv")) {
                if (0 <= volume && volume <= 500) {
                    tax = volume * 0.055;
                }
                if (500 < volume && volume <= 1000) {
                    tax = volume * 0.08;
                }
                if (1000 < volume && volume <= 10000) {
                    tax = volume * 0.12;
                }
                if (volume > 10000) {
                    tax = volume * 0.145;
                }
                System.out.printf("%.2f", tax);
            }
        else {
            System.out.println("error");
        }
    }
}