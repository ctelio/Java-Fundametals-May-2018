package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer v = Integer.parseInt(input.nextLine());
        Integer p1 = Integer.parseInt(input.nextLine());
        Integer p2 = Integer.parseInt(input.nextLine());
        Double h = Double.parseDouble(input.nextLine());
        Double Water = h * p1 + h * p2;
        if (Water > v) {
            System.out.printf("For %f hours the pool overflows with %f liters.", h, Water - v);
        }
        else {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    Math.floor(Water / v * 100),
                    Math.floor(p1 * h / Water * 100),
                    Math.floor(p2 * h / Water * 100));
        }

    }
}
