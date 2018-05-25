package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fruit = Double.parseDouble(scanner.nextLine());
        double vegetable = Double.parseDouble(scanner.nextLine());
        double BGNEUR = 1.94;
        int klfruit = Integer.parseInt(scanner.nextLine());
        int klvegetable = Integer.parseInt(scanner.nextLine());
        double fruittotal = klfruit * fruit;
        double vegtotal = klvegetable * vegetable;
        System.out.println((fruittotal + vegtotal) / BGNEUR);
    }
}