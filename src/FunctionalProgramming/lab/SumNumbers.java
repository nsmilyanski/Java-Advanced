package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        int length = numbers.length;

        System.out.println("Count = " + length);

        int sum = Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();

        System.out.println("Sum = " + sum);



    }
}
