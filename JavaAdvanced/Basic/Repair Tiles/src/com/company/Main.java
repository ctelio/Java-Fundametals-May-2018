package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int o = Integer.parseInt(scanner.nextLine());
        int repairarea = n * n - m * o;
        double tilearea = repairarea / (w * l);
        double time = tilearea * 0.2;
        System.out.println(tilearea);
        System.out.println(time);
    }
}