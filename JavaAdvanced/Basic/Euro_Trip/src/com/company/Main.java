package com.company;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = quantity * 1.2;
        BigDecimal A = new BigDecimal("4210500000000.00");
        BigDecimal exchange = A.multiply(new BigDecimal(price));
        System.out.printf("%.2f marks", exchange);
    }
}