package FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Function<List<Integer> , List<Integer>> removeElements = list ->
                list.stream().filter(e -> e % n != 0).collect(Collectors.toList());

        Collections.reverse(numbers);

        numbers = removeElements.apply(numbers);

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
