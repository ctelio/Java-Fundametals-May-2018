package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        if (budget <= 100) {
            if (season.equals("summer")) {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", budget * 0.3);
            } else if (season.equals("winter")) {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", budget * 0.7);
            }
        } else if (budget <= 1000) {
                if (season.equals("summer")) {
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", budget * 0.4);
                } else if (season.equals("winter")) {
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", budget * 0.8);
                }
        } else if (budget > 1000) {
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", budget * 0.9);
        }
    }
}