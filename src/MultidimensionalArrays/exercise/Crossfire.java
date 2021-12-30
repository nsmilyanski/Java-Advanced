package MultidimensionalArrays.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, "\\s+");

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrtix = readMatrix(rows, cols);

        String token = scanner.nextLine();

        while (!token.equals("Nuke it from orbit")){

            String[] tokenArr = token.split("\\s+");

            int row1 = Integer.parseInt(tokenArr[0]);
            int col1 = Integer.parseInt(tokenArr[1]);
            int radius = Integer.parseInt(tokenArr[2]);

            boolean inBounds = ifInBounds(matrtix, row1, col1);


                destroyMatrix(matrtix, row1, col1, radius);
                swap(matrtix);


            token = scanner.nextLine();
        }



       printElements(matrtix);


    }

    private static void swap(int[][] matrtix) {
        for (int i = matrtix.length - 1; i >= 0 ; i--) {
            for (int j = matrtix.length - 1; j > 0 ; j--) {
                if (matrtix[i][j - 1] == 0 && matrtix[i][j] != 0){
                    int element = matrtix[i][j];
                    matrtix[i][j - 1] = element;
                    matrtix[i][j] = 0;
                }
            }

        }
    }

    private static void printElements(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            boolean isHaveZero = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    isHaveZero = true;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            if (isHaveZero) {
                System.out.println();
            }
        }

    }

    private static void destroyMatrix(int[][] matrtix, int row1, int col1, int radius) {

        int counter = 0;

        int row = row1;
        int col = col1;
        while (ifInBounds(matrtix, row, col) && counter <= radius){
            counter++;
            matrtix[row][col++] = 0;
        }
         row = row1;
         col = col1;
        counter = 0;

        while (ifInBounds(matrtix, row, col) && counter <= radius){
            counter++;
            matrtix[row][col--] = 0;
        }

        row = row1;
        col = col1;
        counter = 0;

        while (ifInBounds(matrtix, row, col) && counter <= radius){
            counter++;
            matrtix[row++][col] = 0;
        }
        row = row1;
        col = col1;
        counter = 0;

        while (ifInBounds(matrtix, row, col) && counter <= radius){
            counter++;
            matrtix[row--][col] = 0;
        }



    }

    private static boolean ifInBounds(int[][] matrtix, int row1, int col1) {
        return (row1 >= 0 && row1 <= matrtix.length - 1) && (col1 >= 0 && col1 <= matrtix[row1].length - 1);
    }

    private static int[][] readMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = number++;

            }
        }
        return matrix;
    }
    private static int[] readArray(Scanner scanner, String regex) {
        int[] array = Arrays.stream(scanner.nextLine().split(regex)).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
}
