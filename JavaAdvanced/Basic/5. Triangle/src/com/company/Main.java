package com.company;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = Integer.parseInt(scanner.nextLine());        int widht = (4 * n) + 1;        int height = (2 * n) + 1;        System.out.println(repeatStr("#", 4 * n + 1));        for (int i = 1; i <= height / 2; i++)        {        if (i == height / 2 / 2 + 1 )        {        System.out.println(repeatStr(".", i) + repeatStr("#", 2 * n - 2 * i + 1)                + repeatStr(" ", (2 * i - 1) / 2 - 1) + "(@)" + repeatStr(" ", (2 * i - 1) / 2 - 1)                + repeatStr("#", 2 * n - 2 * i + 1) + repeatStr(".", i));        } else {            System.out.println(repeatStr(".", i) + repeatStr("#", 2 * n - 2 * i + 1)                + repeatStr(" ", 2 * i - 1) + repeatStr("#", 2 * n - 2 * i + 1) +                repeatStr(".", i));            }        }        for (int i = height / 2 + 1; i < height; i++) {            System.out.println(repeatStr(".", i) + repeatStr("#", widht - 2 * i) + repeatStr(".", i));            }        }        private static String repeatStr(String str, int count) {            StringBuilder sb = new StringBuilder();            for (int i = 0; i < count; i++) {                sb.append(str);        }        return sb.toString();    }}