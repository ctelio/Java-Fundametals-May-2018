package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer weekdays = Integer.parseInt(scanner.nextLine());
        Integer workdays = 365 - weekdays;
        Integer PlayMinutes = workdays * 63 + weekdays * 127;
        double razlika = Math.abs(PlayMinutes - 30000);
        double hours = razlika / 60;
        double minutes = razlika % 60;
        if (PlayMinutes > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(hours), Math.floor(minutes));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), Math.floor(minutes));
        }
    }
}