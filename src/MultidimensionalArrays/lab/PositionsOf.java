package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, "\\s+");

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrix = readMatrix(rows, cols, scanner);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isContainNumber = numberContains(number, matrix);

        if (isContainNumber){
            printElements(matrix, number);

        }else {
            System.out.println("not found");
        }


    }

    private static void printElements(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    private static boolean numberContains(int number, int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] readArray(Scanner scanner, String regex) {
        int[] array = Arrays.stream(scanner.nextLine().split(regex)).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = array;
        }
        return matrix;
    }
}
