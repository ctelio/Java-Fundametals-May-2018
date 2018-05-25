import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");

        int elementToPush = Integer.parseInt(firstLine[0]);
        int elementToPop = Integer.parseInt(firstLine[1]);
        int searchedElement = Integer.parseInt(firstLine[2]);

        String[] secondLine = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < elementToPush; i++) {
            deque.push(Integer.parseInt(secondLine[i]));
        }
        for (int i = 0; i < elementToPop; i++) {
            if (deque.isEmpty()){
                break;
            }
            deque.pop();
        }

        if (deque.isEmpty()){
            System.out.println(0);
        } else if (deque.contains(searchedElement)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(deque));
        }
    }
}