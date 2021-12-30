package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(rows, rows, scanner);

        int[][] diagonalsMatrix = getDiagonalsMatrix(matrix, rows);

        printElements(diagonalsMatrix);



    }
    private static void printElements(int[][] matrix) {

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getDiagonalsMatrix(int[][] matrix, int cols) {
        int[][] diagonalsMatrix = new int[2][cols];

            cols = cols -1;

        for (int i = 0; i < 2; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < diagonalsMatrix[i].length; j++) {
                if (i == 0) {
                    diagonalsMatrix[i][j] = matrix[row][col];
                    row++;
                    col++;
                }else {
                    diagonalsMatrix[i][j] = matrix[cols--][col++];
                }
            }
        }
        return diagonalsMatrix;


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
