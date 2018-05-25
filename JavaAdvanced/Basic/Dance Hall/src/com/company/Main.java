package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double A = Double.parseDouble(scanner.nextLine());
        double zalaarea = L * 100 * W * 100;
        double quadrantarea = A * 100 * A * 100;
        double skameika = zalaarea / 10;
        double freearea = zalaarea - quadrantarea - skameika;
        System.out.printf("%.0f", Math.floor(freearea / (40 + 7000)));
    }
}