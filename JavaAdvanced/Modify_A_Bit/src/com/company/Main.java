package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int mask = scanner.nextInt();
        if (  mask == 0  ) {
            int mask1 = ~(1 << p);
            int result = n & mask1;
            System.out.println(result);
        }
        else
        {
            int mask1 = 1 << p;
            int result = n | mask1;
            System.out.println(result);
        }
    }
}