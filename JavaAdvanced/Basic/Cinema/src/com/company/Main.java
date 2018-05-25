package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TypeCinema = scanner.nextLine().toLowerCase();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double income = 0;
        switch (TypeCinema) {
            case "premiere":
                income = r * c *12.00;
                System.out.printf("%.2f leva", income);
                break;
            case "normal":
                income = r * c *7.50;
                System.out.printf("%.2f leva", income);
                break;
            case "discount":
                income = r * c *5.00;
                System.out.printf("%.2f leva", income);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}