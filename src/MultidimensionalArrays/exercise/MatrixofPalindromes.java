package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArray(scanner, " ");

        int rows = inputArr[0];
        int cols = inputArr[1];

        String[][] matrix = new String[rows][cols];

        matrix = genarateMatrix(matrix, rows, cols);

        printElements(matrix);


    }
    private static void printElements(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }

    private static String[][] genarateMatrix(String[][] matrix, int rows, int cols) {
        String text = "aaa";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = text;
                int n = text.charAt(1) + 1;
                char symbol = (char) n;
                text = new StringBuilder(text).deleteCharAt(1).insert(1, symbol).toString();
            }
            int n = text.charAt(0) + 1;
            char symbol = (char) n;
            text = symbol + "" + symbol + "" + symbol;
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner, String regex) {
        int[] array = Arrays.stream(scanner.nextLine().split(regex)).mapToInt(Integer::parseInt)
                .toArray();
        return array;
    }
}
