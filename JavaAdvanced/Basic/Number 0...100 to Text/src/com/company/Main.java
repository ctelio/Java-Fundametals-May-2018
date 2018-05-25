package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());

        String[] OtDesetDoDvadeset = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] desetici = new String[]{"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "one hundred"};
        String[] edinici = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (number >= 0 && number <= 100) {
            if (number < 10 && number >= 0) {
                System.out.printf(edinici[number]);
            } else if (number < 20 && number >= 0) {
                System.out.printf(OtDesetDoDvadeset[number - 10]);
            } else if (number >= 20 && number % 10 == 0) {
                System.out.printf(desetici[number / 10 - 1]);
            } else if (number > 20 && number < 100 && number % 10 != 0) {
                System.out.printf("%s %s", desetici[number / 10 - 1], edinici[number % 10]);
            }
        }
        else {
            System.out.printf("invalid number");
        }
    }
}