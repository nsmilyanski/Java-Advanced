package FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> consumer = name -> {
                name = "Sir " + name;
            System.out.println(name);
        };

        Arrays.stream(names).forEach(consumer);
    }
}
