package app;        import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scan = new Scanner (System.in);        int n = 0;        while (true) {            try {                System.out.print("Enter even number: ");                n = Integer.parseInt(scan.nextLine());                if (n % 2 == 0) {                    break;                } else                    System.out.println("The number is not even.");            } catch (NumberFormatException ex) {                System.out.println("Invalid number.");            }        }        System.out.println(n);    }}