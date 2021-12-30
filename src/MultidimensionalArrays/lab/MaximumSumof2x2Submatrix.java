package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, ", ");

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrix = readMatrix(rows, cols, scanner);

        int[][] subMatrix  = new int[2][2];

        subMatrix = getMaxMatrixs(matrix);

        printElements(subMatrix);


    }

    private static int[][] getMaxMatrixs(int[][] matrix) {
        int[][] subMatrix = new int[2][2];

        int maxNumber = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1 ; j++) {
                int sum = 0;
                int constant = matrix[i][j];
                int right = matrix[i][j + 1];
                int down =  matrix[i + 1][j];
                int downRight = matrix[i + 1][j + 1];

                sum =  constant + right + down + downRight;

                if (sum > maxNumber){
                    maxNumber = sum;
                    subMatrix[0][0] = matrix[i][j];
                    subMatrix[0][1] = matrix[i][j + 1];
                    subMatrix[1][0] = matrix[i + 1][j];
                    subMatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }
        return subMatrix;
    }


    private static void printElements(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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
