import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Simple_Text_Editor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCommands = Integer.parseInt(reader.readLine());
        String text = "";
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        undoStack.addLast(text);
        for (int i = 0; i < numberOfCommands; i++)
        {
            String[] commands = reader.readLine().split(" ");
            switch (commands[0])
            {
                case "1":
                    undoStack.addLast(text);
                    text += commands[1];break;
                case "2":
                    undoStack.addLast(text);
                    text = text.substring(0, text.length() - Integer.parseInt(commands[1]));break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(commands[1]) - 1));break;
                case "4":
                    text = undoStack.pollLast();break;
            }
        }
    }
}