package app;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        double budget = Double.parseDouble(scanner.nextLine());        String season = scanner.nextLine();        double price = 0.0;        if (budget <= 1000) {            if (season.equals("Summer")) {                price = budget * 0.65;                System.out.printf("Alaska - Camp - %.2f", price);            } else if (season.equals("Winter")) {                price = budget * 0.45;                System.out.printf("Morocco - Camp - %.2f", price);            }        }        if (budget > 1000 && budget <= 3000) {            if (season.equals("Summer")) {                price = budget * 0.8;                System.out.printf("Alaska - Hut - %.2f", price);            } else if (season.equals("Winter")) {                price = budget * 0.6;                System.out.printf("Morocco - Hut - %.2f", price);            }        }        if (budget > 3000) {            price = budget * 0.9;            if (season.equals("Summer")) {                System.out.printf("Alaska - Hotel - %.2f", price);            } else if (season.equals("Winter")) {                System.out.printf("Morocco - Hotel - %.2f", price);            }        }    }}