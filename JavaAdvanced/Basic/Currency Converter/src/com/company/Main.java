package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount = ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Currency from = ");
        String currency1 = scanner.nextLine();
        System.out.print("Currency to = ");
        String currency2 = scanner.nextLine();
        double bgn = 1.0;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        if(currency1.equals("BGN")){
            money = money * bgn;
        } else if(currency1.equals("USD")) {
            money *= usd;
        } else if(currency1.equals("EUR")) {
            money *= eur;
        } else if(currency1.equals("GBP")) {
            money *= gbp;
        }
        if(currency2.equals("BGN")) {
            money = money / bgn;
        } else if(currency2.equals("USD")){
            money /= usd;
        } else if(currency2.equals("EUR")){
            money /= eur;
        } else if(currency2.equals("GBP")) {
            money /= gbp;
        }
        System.out.printf("Your money = %.2f %s", money, currency2);
    }
}