package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, ", ");

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrix = readMatrix(rows, cols, scanner);

        System.out.println(rows);
        System.out.println(cols);

        printElements(matrix);


    }
    private static void printElements(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
    private static int[] readArray(Scanner scanner, String regex) {
        int[] array = Arrays.stream(scanner.nextLine().split(regex)).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = array;
        }
        return matrix;
    }
}
