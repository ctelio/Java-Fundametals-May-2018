import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Balanced_Parantheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] parentheses = scanner.next().split("");

        if (parentheses.length % 2 != 0){
            System.out.println("NO");
        } else {
            ArrayDeque<String> deque = new ArrayDeque<>();
            Collections.addAll(deque, parentheses);

            while (!deque.isEmpty()) {
                String first = deque.pop();
                String second = deque.poll();
                if (!isValidParantheses(first + second)) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("YES");
        }
    }

    private static boolean isValidParantheses(String parentheses) {
        return "()".equals(parentheses) || "[]".equals(parentheses)
                || "{}".equals(parentheses) || " ".equals(parentheses);
    }
}