package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            int b = console.nextInt();
            double area = a * b;
            System.out.printf("%.2f", area);
        }
    }
}