package FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Function<List<String>, List<String>> removeNames = list -> list.stream()
                .filter(e -> e.length() <= n).collect(Collectors.toList());

        names = removeNames.apply(names);

        names.forEach(System.out::println);
    }
}
