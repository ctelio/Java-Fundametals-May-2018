import java.util.ArrayDeque;

import java.util.Scanner;

public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < firstLine.length; i++) {
            deque.push(Integer.parseInt(firstLine[i]));
        }
        for (int i = 0; i < firstLine.length; i++) {
            if (deque.isEmpty()) {
                break;
            }
            Integer element = deque.peek();
            System.out.print(element + " ");
            deque.pop();
        }
    }
}