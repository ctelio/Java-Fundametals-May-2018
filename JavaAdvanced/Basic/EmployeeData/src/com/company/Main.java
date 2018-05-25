package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        int employee_ID = Integer.parseInt(console.nextLine());
        double salary = Double.parseDouble(console.nextLine());
        System.out.printf("Name: %s%nAge: %d%nEmployee ID: %08d%nSalary: %.2f", name, age, employee_ID, salary);
    }
}