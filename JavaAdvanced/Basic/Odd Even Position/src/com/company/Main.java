package com.company;import java.text.DecimalFormat;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        DecimalFormat df = new DecimalFormat("#.###");        int n = Integer.parseInt(scanner.nextLine());        double oddmax = -1000000000.0;        double oddmin = 1000000000.0;        double oddsum = 0;        double evensum = 0;        double evenmin = 1000000000.0;        double evenmax = -1000000000.0;        for (int i = 1; i <= n ; i++) {            double num = Double.parseDouble(scanner.nextLine());            if (i % 2 == 0) {                evensum = evensum + num;                if (num > evenmax) {                    evenmax = num;                }                if (evenmin > num){                    evenmin = num;                }            } else {                oddsum = oddsum + num;                if (num > oddmax) {                    oddmax = num;                }                if (oddmin > num){                    oddmin = num;                }            }        }        System.out.printf("OddSum = %s%n", df.format(oddsum));        if (oddmin==1000000000.0) {            System.out.println("OddMin = No");        } else {            System.out.printf("OddMin = %s%n", df.format(oddmin));        }        if (oddmax==-1000000000.0) {            System.out.println("OddMax = No");        } else {            System.out.printf("OddMax = %s%n", df.format(oddmax));        }        System.out.printf("EvenSum = %s%n", df.format(evensum));        if (evenmin==1000000000.0) {            System.out.println("EvenMin = No");        } else {            System.out.printf("EvenMin = %s%n", df.format(evenmin));        }        if (evenmax==-1000000000.0) {            System.out.println("EvenMax = No");        } else {            System.out.printf("EvenMax = %s%n", df.format(evenmax));        }    }}