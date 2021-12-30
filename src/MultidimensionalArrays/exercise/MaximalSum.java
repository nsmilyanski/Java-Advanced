package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, "\\s+");

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrix = readMatrix(rows, cols, scanner);


        int maxSum = 0;

        int rol = 0;
        int col = 0;

        for (int i = 0; i <= matrix.length - 3; i++) {
            for (int j = 0; j <= matrix[i].length - 3; j++) {

                int sum = findTheBiggestMatrix(matrix, i, j);

                if (sum > maxSum){
                    maxSum = sum;
                    rol = i;
                    col = j;
                }

            }

        }
        System.out.printf("Sum = %d%n", maxSum);

        for (int i = rol; i < rol + 3 ; i++) {
            for (int j = col; j < col + 3 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int findTheBiggestMatrix(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int i = rows; i < rows + 3; i++) {
            for (int j = cols; j < cols + 3 ; j++) {
                sum += matrix[i][j];
            }
        }
        return  sum;
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
    private static int[] readArray(Scanner scanner, String regex) {
        int[] array = Arrays.stream(scanner.nextLine().split(regex)).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
}
