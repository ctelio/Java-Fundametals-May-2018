import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int bestMaxElement = 0;
        for (int i = 0; i < numberOfCommands; i++) {
            String[] firstLine = scanner.nextLine().split(" ");
            int command = Integer.parseInt(firstLine[0]);
            if (command == 1) {
                int elementX = Integer.parseInt(firstLine[1]);
                deque.push(elementX);
                if (elementX > bestMaxElement){
                    bestMaxElement = elementX;
                }
            } else if (command == 2) {
                if (deque.isEmpty()) {
                    break;
                }
                deque.pop();
            } else {
                System.out.println(Collections.max(deque));
            }
        }
    }
}