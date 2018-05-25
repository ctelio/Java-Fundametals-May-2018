import java.util.Scanner;

public class Formatting_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        double b = Double.parseDouble(scanner.next());
        double c = Double.parseDouble(scanner.next());
        String hex = String.format("%-10s", Integer.toHexString(a).toUpperCase());
        String bin = String.format("%10s", Integer.toString(a, 2)).replace(' ', '0');
        String b2 = String.format("%10s", (b));
        String c2 = String.format("%10s", (c));
        System.out.printf("|%s|%s|%s|%s|", hex, bin, b2, c2);
    }
}