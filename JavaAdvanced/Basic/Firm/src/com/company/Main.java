package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededhours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double totalhours = Math.floor(days * (8 + 2) * 0.9 * workers);
        if (totalhours >= neededhours) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(totalhours - neededhours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(neededhours - totalhours));
        }
    }
}