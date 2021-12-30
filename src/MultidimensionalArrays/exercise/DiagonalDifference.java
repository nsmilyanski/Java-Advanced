package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(rows, rows, scanner);
        
        int firstDiagonal = findFirstDiagonal(matrix);
        int secondDiagonal = findSecondDiagonal(matrix, rows);

         int result = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println(result);

    }

    private static int findSecondDiagonal(int[][] matrix, int rows) {
        int sum = 0;
        for (int i = matrix.length - 1; i >= 0 ; i--) {
            for (int j = matrix.length - 1; j >= 0 ; j--) {
                if (j == matrix.length - 1 - i){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static int findFirstDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
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
