import java.util.Scanner;

public class Byte_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int [countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        String line;
        while (true) {
            if ("party over".equals(line = scanner.nextLine())){
                break;
            }
            String[] tokens = line.split("\\s+");
            int pattern = Integer.parseInt(tokens[0]);
            int position = Integer.parseInt(tokens[1]);
            for (int i = 0; i < numbers.length; i++) {
                switch  (pattern){
                    case 1:
                        changeValueToOne(numbers, position);
                        break;
                    case 0:
                        changeValueToZero(numbers, position);
                        break;
                    case -1:
                        changeValueByPosition(numbers, position, i);
                        break;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void changeValueToZero(int[] numbers, int position) {
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            int b = a >> position;
            int c = b & 1;
            int d = ~(1 << position);
            int result = a & d;
            numbers[i] = result;
        }
    }

    private static void changeValueToOne(int[] numbers, int position) {
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            int b = a >> position;
            int c = b & 1;
            int d = 1 << position;
            int result = a | d;
            numbers[i] = result;
        }
    }

    private static void changeValueByPosition(int[] numbers, int position, int i) {
        int a = numbers[i];
        int b = a >> position;
        int c = b & 1;
        if (c == 0){
            int d = 1 << position;
            int result = a | d;
            numbers[i] = result;
        }
        else
        {
            int d = ~(1 << position);
            int result = a & d;
            numbers[i] = result;
        }
    }
}
