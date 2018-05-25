package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double steps = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double DaysForLearn = Double.parseDouble(scanner.nextLine());
        double StepsForDay = Math.ceil((steps / DaysForLearn) / steps * 100);
        double StepsForDancer = StepsForDay / dancers;
        if (StepsForDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", (StepsForDancer));
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",
                    (StepsForDancer));
        }
    }
}