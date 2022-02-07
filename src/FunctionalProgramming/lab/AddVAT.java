package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Double, Double> manipulator = x -> x * 1.20;
        Function<Double, String> doubleString = y -> String.format("%.2f", y);


        List<Double> listNums = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        String collect = listNums.stream().map(manipulator).map(doubleString)
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println("Prices with VAT:");

        System.out.println(collect);


    }
}
