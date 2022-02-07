package FunctionalProgramming.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (x, y) -> {
            if (x % 2 != 0 && y % 2 == 0){
                return 1;
            }else if (x % 2 == 0 && y % 2 != 0){
                return -1;
            }
               return x.compareTo(y);

        };


        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));


    }
}
