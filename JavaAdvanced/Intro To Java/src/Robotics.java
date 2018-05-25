import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(";");
        String[] robotNames = new String[info.length];
        int[] processTime = new int[info.length];
        for (int i = 0; i < info.length; i++) {
            String[] robots = info[i].split("-");
            robotNames[i] = robots[0];
            processTime[i] = Integer.parseInt(robots[1]);
        }
        String[] timeInput = scanner.nextLine().split(":");
        long startTime = 3600 * Integer.parseInt(timeInput[0]) +
                60 * Integer.parseInt(timeInput[1]) + Integer.parseInt(timeInput[2]);

        ArrayDeque<String> result = new ArrayDeque<>();

        while (true) {

            String products = scanner.nextLine();
            if(products.equals("End") || products.equals("END")){
                break;
            }
            result.offer(products);
        }
        int timer = 1;
        while (!result.isEmpty()) {

            for (int i = 0; i < robotNames.length; i++) {
                if (result.isEmpty()) {
                    break;
                }
                long currentTime = startTime + timer;
                long hours = (currentTime) / 3600 % 24;
                long minutes = (currentTime) % 3600 / 60;
                long seconds = (currentTime) % 3600 % 60;

                if (processTime[i] > 0 && (timer - i - 1) % processTime[i] == 0) {
                    String prod = result.poll();
                    System.out.printf("%s - %s [%02d:%02d:%02d]%n",
                            robotNames[i], prod, hours, minutes, seconds);
                } else {
                    result.offer(result.poll());
                }
                timer++;
            }
        }
    }
}