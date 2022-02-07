package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Predicate<String> predicate = x -> Character.isUpperCase(x.charAt(0));

        List<String> list = Arrays.stream(text).filter(predicate).collect(Collectors.toList());

        int size = list.size();

        System.out.println(size);

        list.forEach(e -> System.out.printf("%s%n", e));
    }
}
