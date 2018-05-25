import java.util.Scanner;

public class String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    private static String[][] fillMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];
            }
        }
        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] r : matrix) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}