package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstDouble = input.nextDouble();
        double secondDouble = input.nextDouble();
        double thirdDouble = input.nextDouble();
        double sum = (firstDouble + secondDouble + thirdDouble) / 3;
        System.out.printf("%.2f", sum);
    }
}