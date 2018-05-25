package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int total = hour * 60 + minutes + 15;
        Integer Hours = total / 60;
        Integer Minutes = total % 60;

        if (Hours == 24) {
            Hours = 0;
        }
        if (Minutes <= 9) {
            System.out.printf("%d:0%d", Hours, Minutes);
        } else {
            System.out.printf("%d:%d", Hours, Minutes);
        }
    }
}