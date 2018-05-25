package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lenght in meters = ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter widht in meters = ");
        double width = Double.parseDouble(scanner.nextLine());
        int cols = (int) (((width * 100) - 100) / 70);
        int rows = (int) ((length * 100) / 120);
        int seats = (rows * cols) - 3;
        System.out.println(seats);
    }
}