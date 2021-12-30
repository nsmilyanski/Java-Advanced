package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = inputArr[0];
        int cols = inputArr[1];

        int[][] matrixOne = readMatrix(rows , cols, scanner);

        int[] inputArrTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        rows = inputArrTwo[0];
        cols = inputArrTwo[1];

        int[][] matrixTwo = readMatrix(rows, cols, scanner);

         boolean isMatrixEquals  = matrixAreEquals(matrixOne, matrixTwo);

        System.out.println(isMatrixEquals ? "equal" : "not equal");

    }

    private static boolean matrixAreEquals(int[][] matrixOne, int[][] matrixTwo) {
        if (matrixOne.length != matrixTwo.length){
            return false;
        }

        for (int i = 0; i < matrixOne.length; i++) {
            if (matrixOne[i].length != matrixTwo[i].length){
                return false;
            }
            for (int j = 0; j < matrixOne[i].length; j++) {
                if (matrixOne[i][j] != matrixTwo[i][j]){
                    return false;
                }
            }
        }
        return true;
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
