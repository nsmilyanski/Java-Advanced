package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Matrixshuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner);

        int rows = inputArr[0];
        int cols = inputArr[1];

        String[][] matrix = readMatrix(rows, cols, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] commandArr = command.split("\\s+");

            String firstCommand = commandArr[0];

            if (!firstCommand.equals("swap") || commandArr.length != 5){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }else {
                int row1 = Integer.parseInt(commandArr[1]);
                int col1 = Integer.parseInt(commandArr[2]);
                int row2 = Integer.parseInt(commandArr[3]);
                int col2 = Integer.parseInt(commandArr[4]);

               boolean inBounds = ifInBounds(matrix, row1, col1, row2, col2);

               if (!inBounds){
                   System.out.println("Invalid input!");
                   command = scanner.nextLine();
                   continue;
               }else {
                   String firstElement = matrix[row1][col1];
                   String secondElement = matrix[row2][col2];
                   matrix[row1][col1] = secondElement;
                   matrix[row2][col2] = firstElement;
                   printMatrix(matrix);
               }
            }



            command = scanner.nextLine();
        }

    }
    private static void printMatrix(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static boolean ifInBounds(String[][] matrix, int row1, int col1, int row2, int col2) {
        return (row1 >= 0 && row1 <= matrix.length - 1) && (col1 >= 0 && col1 <= matrix[row1].length - 1) &&
                (row2 >= 0 && row2 <= matrix.length - 1) && (col2 >= 0 && col2 <= matrix[row2].length - 1);

    }

    private static int[] readArray(Scanner scanner) {
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
    private static String[][] readMatrix(int rows, int cols, Scanner scanner) {
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] array = scanner.nextLine().split("\\s+");
            matrix[i] = array;
        }
        return matrix;
    }
}
