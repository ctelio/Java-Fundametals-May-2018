package com.company;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result1 = 0;
        if (N2 == 0) {
            System.out.printf("Cannot divide %d by zero", N1);
        }
            else if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
                String evenodd = "";
                if (operator.equals("+")) {
                    result1 = (N1 + N2);
                } else if (operator.equals("-")) {
                    result1 = (N1 - N2);
                } else if (operator.equals("*")) {
                    result1 = (N1 * N2);
                }
                if (result1 % 2 == 0) {
                    evenodd = "even";
                } else {
                    evenodd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result1, evenodd);
            }
        else if (operator.equals ("%")) {
            result1 = (N1 % N2);
            System.out.printf("%d %s %d = %d", N1, operator, N2, result1);
        }
        // ДЕЛЕНЕ С РЕЗУЛТАТ ДО 2 ЗНАКА СЛЕД ЗАПЕТАЯТА ! ! !
        else if (operator.equals ("/")) {
            BigDecimal result = new BigDecimal("0.00");
            result = new BigDecimal(N1).divide(new BigDecimal(N2), 2, RoundingMode.HALF_UP);
            DecimalFormat decimal = new DecimalFormat("0.00");
            System.out.printf("%d %s %d = %s", N1, operator, N2, decimal.format(result));
        }
    }
}