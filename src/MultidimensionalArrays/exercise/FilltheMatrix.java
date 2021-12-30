package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = readArray(scanner, ", ");

        int rows = Integer.parseInt(inputArr[0]);

        String type = inputArr[1];

        int[][] matrix = new int[rows][rows];

        if (type.equals("A")){

            matrix = fillMatrixWitthTypeA(matrix, rows, rows);

        }else {
            matrix = fillMatrixTypeB(matrix, rows, rows);

        }

        printElements(matrix);



    }
    private static void printElements(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }

    private static int[][] fillMatrixTypeB(int[][] matrix, int rows, int rows1) {
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0){
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = number++;
            }
            }else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = number++;
                }
            }
        }
        return matrix;
    }

    private static int[][] fillMatrixWitthTypeA(int[][] matrix, int rows, int cols) {

        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = number++;
            }
        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner, String regex) {
        String[] array = scanner.nextLine().split(regex);
        return array;
    }
}
