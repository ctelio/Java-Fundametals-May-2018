package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine().toLowerCase();
        int holydays = Integer.parseInt(scanner.nextLine());
        int ProvinceWeekends = Integer.parseInt(scanner.nextLine());
        double PlaySofia = (48 - ProvinceWeekends) * 3.0 / 4 + holydays * 2.0 / 3;
        double PlayTotal = PlaySofia + ProvinceWeekends;
        switch (year) {
            case "leap":
                PlayTotal = Math.floor (PlayTotal * 0.15 + PlayTotal);
                System.out.println(PlayTotal);
                break;
            case "normal":
                System.out.println(Math.floor (PlayTotal));
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}