import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] line1 = scanner.nextLine().split("\\s+");
        int numberToAdd = Integer.parseInt(line1[0]);
        int numberToPoll = Integer.parseInt(line1[1]);
        int elementX = Integer.parseInt(line1[2]);
        String [] line2 = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < numberToAdd; i++) {
            deque.add(Integer.parseInt(line2[i]));
        }
        for (int i = 0; i < numberToPoll; i++) {
            if (deque.isEmpty()) {
                break;
            }
            deque.remove();
        }
        if (deque.isEmpty()){
            System.out.println(0);
        } else if (deque.contains(elementX)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(deque));
        }
    }
}