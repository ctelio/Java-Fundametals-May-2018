package app;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int N = Integer.parseInt(scan.nextLine());        for (int d1 = 1; d1 <= 9; d1++) {            for (int d2 = 1; d2 <= 9; d2++) {                for (int d3 = 1; d3 <= 9; d3++) {                    for (int d4 = 1; d4 <= 9; d4++) {                        if (N % d1 == 0 && N % d2 == 0 && N % d3 == 0 && N % d4 == 0) {                            System.out.print(String.format("%d%d%d%d ", d1, d2, d3, d4));                        }                    }                }            }        }    }}