package MultidimensionalArrays.lab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = readMatrix(8, 8, scanner);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char symbol = matrix[i][j];
                if (symbol == 'q'){
                  boolean isTheQueen = findAllPaths(matrix, i, j);
                  if (isTheQueen){
                      System.out.println(i + " " + j);
                  }else {
                      break;
                  }
                }

            }
        }


    }

    private static boolean findAllPaths(char[][] matrix, int rows, int cols) {

        int row = rows;
        int col = cols;

            while (ifInBounds(matrix, row, col)){
                if (col >= matrix[row].length - 1){
                    break;
                }
                char symbol = matrix[row][++col];
                if (symbol == 'q'){
                    return false;
                }
            }
            row = rows;
            col = cols;

            while (ifInBounds(matrix, row, col)){
                if (row >= matrix.length - 1){
                    break;
                }
                char symbol = matrix[++row][col];
                if (symbol == 'q'){
                    return false;
                }
            }
        row = rows;
        col = cols;


        while (ifInBounds(matrix, row, col)){
            if (row <= 0){
                break;
            }
            char symbol = matrix[--row][col];
            if (symbol == 'q'){
                return false;
            }
        }
        row = rows;
        col = cols;


        while (ifInBounds(matrix, row, col)){
            if (col == 0){
                break;
            }
            char symbol = matrix[row][--col];
            if (symbol == 'q'){
                return false;
            }
        }
        row = rows;
        col = cols;

        while (ifInBounds(matrix, row, col)){
            if (row >= matrix.length - 1 || col >= matrix[row].length -1){
                break;
            }
            char symbol = matrix[++row][++col];
            if (symbol == 'q'){
                return false;
            }
        }
        row = rows;
        col = cols;

        while (ifInBounds(matrix, row, col)){
            if (row >= matrix.length - 1 || col <= 0){
                break;
            }
            char symbol = matrix[++row][--col];
            if (symbol == 'q'){
                return false;
            }
        }
        row = rows;
        col = cols;
        while (ifInBounds(matrix, row, col)){
            if (col >= matrix[row].length - 1 || row <= 0){
                break;
            }
            char symbol = matrix[--row][++col];
            if (symbol == 'q'){
                return false;
            }
        }
        row = rows;
        col = cols;

        while (ifInBounds(matrix, row, col)){
            if (row <= 0 || col <= 0){
                break;
            }
            char symbol = matrix[--row][--col];
            if (symbol == 'q'){
                return false;
            }
        }


        return true;

    }

    private static boolean ifInBounds(char[][] matrix, int rows, int cols) {
        return (rows >=0 && rows <= matrix.length - 1) && (cols >= 0 && cols <= matrix[rows].length - 1);
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
