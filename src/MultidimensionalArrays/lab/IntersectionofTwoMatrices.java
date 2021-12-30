package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrixOne = readMatrix(rows, cols, scanner);
        char[][] matrixTwo = readMatrix(rows, cols, scanner);

        char[][] matrixThree = new char[rows][cols];

       matrixThree = getMatrixThree(matrixOne, matrixTwo, matrixThree);


       printElements(matrixThree);

    }
    private static void printElements(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] getMatrixThree(char[][] matrixOne, char[][] matrixTwo, char[][] matrixThree) {

        for (int i = 0; i <matrixOne.length ; i++) {
            for (int j = 0; j <matrixOne[i].length ; j++) {
                if (matrixOne[i][j] != matrixTwo[i][j]){
                    matrixThree[i][j] = '*';
                }else {
                    matrixThree[i][j] = matrixOne[i][j];
                }
            }
        }
        return matrixThree;
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine();
            char[] charArray = input.replaceAll(" ", "").toCharArray();
            matrix[i] = charArray;
        }
        return matrix;
    }
}
