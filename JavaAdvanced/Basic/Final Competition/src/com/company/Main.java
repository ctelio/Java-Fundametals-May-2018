package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dancers = Double.parseDouble(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = scanner.nextLine();
        if (country.equals ("Bulgaria")) {
            double Money = (points * dancers);
            if (season.equals ("summer")) {
                double MoneyAfterRazhodi = Money - Money * 0.05;
                double Charity = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.25);
                double RestMoney = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.75);
                double MoneyPerDancer = RestMoney / dancers;
                System.out.printf("Charity - %.2f", (Charity));
                System.out.printf('\n' + "Money per dancer - %.2f", (MoneyPerDancer));
            } else if (season.equals ("winter")) {
                double MoneyAfterRazhodi = Money - Money * 0.08;
                double Charity = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.25);
                double RestMoney = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.75);
                double MoneyPerDancer = RestMoney / dancers;
                System.out.printf("Charity - %.2f", (Charity));
                System.out.printf('\n' + "Money per dancer - %.2f", (MoneyPerDancer));
            }
        } else if (country.equals ("Abroad")) {
            double Money = (points * dancers) + (points * dancers) / 2;
            if (season.equals ("summer")) {
                double MoneyAfterRazhodi = Money - Money * 0.1;
                double Charity = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.25);
                double RestMoney = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.75);
                double MoneyPerDancer = RestMoney / dancers;
                System.out.printf("Charity - %.2f", (Charity));
                System.out.printf('\n' + "Money per dancer - %.2f", (MoneyPerDancer));
            } else if (season.equals ("winter")) {
                double MoneyAfterRazhodi = Money - Money * 0.15;
                double Charity = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.25);
                double RestMoney = (MoneyAfterRazhodi - MoneyAfterRazhodi * 0.75);
                double MoneyPerDancer = RestMoney / dancers;
                System.out.printf("Charity - %.2f", (Charity));
                System.out.printf('\n' + "Money per dancer - %.2f", (MoneyPerDancer));
            }
        }
    }
}