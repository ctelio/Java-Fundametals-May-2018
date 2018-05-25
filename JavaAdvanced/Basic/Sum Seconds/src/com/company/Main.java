package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firsttime = scanner.nextInt();
        int secondtime = scanner.nextInt();
        int tirdtime = scanner.nextInt();
        int allseconds = firsttime + secondtime + tirdtime;
        int minutes = allseconds / 60;
        int Secounds = allseconds % 60;
        if (Secounds < 10 ) {
            System.out.printf("%d:0%d", minutes,Secounds);
        }
        else {
            System.out.printf("%d:%d", minutes,Secounds);
        }
    }
}