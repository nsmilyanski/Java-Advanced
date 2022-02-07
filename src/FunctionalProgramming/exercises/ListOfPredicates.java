package FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());




        Predicate<Integer> predicate = list -> {
            for (int num : numbers) {
                if (list % num != 0){
                    return false;
                }
            }
            return true;
        };
        List<Integer> collect = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());

        collect.stream().filter(predicate).forEach(e -> System.out.print(e + " "));

    }
}
