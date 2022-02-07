package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf).collect(Collectors.joining(", "));

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());

      List<Integer> evenNumbers =  numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        String evenNums = mutator.apply(evenNumbers.stream());

        System.out.println(evenNums);

        String sortedElements = mutator.apply(evenNumbers.stream().sorted());

        System.out.println(sortedElements);
    }
}
