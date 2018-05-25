package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double KGgrozde = (x * y) * 0.4;
        double LitraVine = KGgrozde / 2.5;
        if (LitraVine >= z) {
            double LitraVineLeft = LitraVine - z;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",
                    Math.floor(LitraVine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(LitraVineLeft), Math.ceil(LitraVineLeft / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(z - LitraVine));
        }
    }
}