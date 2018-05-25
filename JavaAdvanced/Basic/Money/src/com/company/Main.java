package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());
        double yuantoleva = yuan * 0.15 * 1.76;
        double evro = (bitcoin * 1168 + yuantoleva) / 1.95;
        double komisionna = evro * procent / 100;
        double rsult = evro - komisionna;
        System.out.println(rsult);
    }
}