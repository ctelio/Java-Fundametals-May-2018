package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")) {
            double square1 = Double.parseDouble(scanner.nextLine());
            double area1 = square1 * square1;
            DecimalFormat f = new DecimalFormat("##.000");
            System.out.println(f.format(area1));
        }
        else if (figure.equals("rectangle")) {
            double rectangle1 = Double.parseDouble(scanner.nextLine());
            double rectangle2 = Double.parseDouble(scanner.nextLine());
            double area2 = rectangle1 * rectangle2;
            DecimalFormat f = new DecimalFormat("##.000");
            System.out.println(f.format(area2));
        }
        else if (figure.equals("circle")) {
            double circle1 = Double.parseDouble(scanner.nextLine());
            double area3 = Math.PI * circle1 * circle1;
            DecimalFormat f = new DecimalFormat("##.000");
            System.out.println(f.format(area3));
        }
        else if (figure.equals("triangle")) {
            double triangle1 = Double.parseDouble(scanner.nextLine());
            double triangle2 = Double.parseDouble(scanner.nextLine());
            double area4 = (triangle1 * triangle2) / 2;
            DecimalFormat f = new DecimalFormat("##.000");
            System.out.println(f.format(area4));
        }
    }
}