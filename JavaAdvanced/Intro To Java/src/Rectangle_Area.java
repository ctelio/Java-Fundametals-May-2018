import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double area = a * b;
        System.out.printf("%.2f", area);
    }
}