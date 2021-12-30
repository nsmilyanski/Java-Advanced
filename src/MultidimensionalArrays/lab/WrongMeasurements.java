package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(rows, rows, scanner);
        int[][] matrixTwo = new int[rows][matrix[0].length];

        int[] array = readArray(scanner, " ");

        int wrongNum = matrix[array[0]][array[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (wrongNum == matrix[i][j]){
                    int newNumber = getNewNumber(matrix, i, j);
                    matrixTwo[i][j] = newNumber;
                }else {
                    matrixTwo[i][j] = matrix[i][j];
                }
            }

        }
        printElements(matrixTwo);




    }
    private static void printElements(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getNewNumber(int[][] matrix, int rows, int cols) {
        int number = 0;

        int row = rows;
        int col = cols;

        while (ifInBounds(matrix, row, col)){
            if (col >= matrix[row].length - 1){
                break;
            }

                int current = matrix[row][++col];
            if (current != matrix[rows][cols]){
                number += current;
            }

            break;

        }
        row = rows;
        col = cols;

        while (ifInBounds(matrix, row, col)){
            if (row >= matrix.length - 1){
                break;
            }
            int current = matrix[++row][col];
            if (current != matrix[rows][cols]){
                number += current;
            }
            break;
        }
        row = rows;
        col = cols;


        while (ifInBounds(matrix, row, col)){
            if (row <= 0){
                break;
            }
            int current = matrix[--row][col];
            if (current != matrix[rows][cols]){
                number += current;
            }
            break;
        }
        row = rows;
        col = cols;


        while (ifInBounds(matrix, row, col)){
            if (col == 0){
                break;
            }
            int current = matrix[row][--col];
            if (current != matrix[rows][cols]){
                number += current;
            }
            break;
        }

        return number;
    }

    private static boolean ifInBounds(int[][] matrix, int rows, int cols) {
        return (rows >=0 && rows <= matrix.length - 1) && (cols >= 0 && cols <= matrix[rows].length - 1);
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
