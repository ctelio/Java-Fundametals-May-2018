package app;        import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = Integer.parseInt(scanner.nextLine());        System.out.println(repeatStr("*", 2 * n + 1));        System.out.println(".*" + repeatStr(" ", 2 * n - 3) + "*.");        for (int row = n - 1; row > 1; row--)        {            for (int star = 0; star <= n - row; star++)            {                System.out.print(".");            }            System.out.print("*");            for (int space = 0; space < row - 1; space++)            {                System.out.print("@");            }            for (int space = 0; space < row - 2; space++)            {                System.out.print("@");            }            System.out.print("*");            for (int star = 0; star <= n - row; star++)            {                System.out.print(".");            }            System.out.println();        }        System.out.println(repeatStr(".", n) + "*" + repeatStr(".", n));        for (int row = 2; row <= n - 1; row++)        {            for (int star = 0; star <= n - row; star++)            {                System.out.print(".");            }            System.out.print("*");            for (int space = 0; space < row - 2; space++)            {                System.out.print(" ");            }            for (int space = 1; space < 2; space++)            {                System.out.print("@");            }            for (int space = 0; space < row - 2; space++)            {                System.out.print(" ");            }            System.out.print("*");            for (int star = 0; star <= n - row; star++)            {                System.out.print(".");            }            System.out.println();        }        System.out.println(".*" + repeatStr("@", 2 * n - 3) + "*.");        System.out.print(repeatStr("*", 2 * n + 1));    }    private static String repeatStr(String str, int count) {        StringBuilder sb = new StringBuilder();        for (int i = 0; i < count; i++) {            sb.append(str);        }        return sb.toString();    }}