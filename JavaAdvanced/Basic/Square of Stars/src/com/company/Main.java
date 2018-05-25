package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String stars = new String(new char[n]).replace( "\0","*");
        System.out.println(stars);
        for (int i=0; i<n - 2; i++) {
            System.out.printf("*");
            System.out.printf(new String(new char[n - 2]).replace("\0"," " ));
            System.out.println("*");
        }
        System.out.println(stars);
    }
}
