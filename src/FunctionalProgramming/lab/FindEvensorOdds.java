package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rangeArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        String type = scanner.nextLine();

        Predicate<Integer> predicate = getNumbers(type);

        String collect = IntStream.rangeClosed(rangeArr[0], rangeArr[1]).boxed().filter(predicate)
                .map(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(collect);
    }

    private static Predicate<Integer> getNumbers(String type) {
        if (type.equals("even")){
            return p -> p % 2 == 0;
        }

        return p -> p % 2 != 0;
    }
}
