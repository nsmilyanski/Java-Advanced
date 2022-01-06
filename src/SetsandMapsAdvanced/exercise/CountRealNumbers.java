package SetsandMapsAdvanced.exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < numbers.length; i++) {
            double num = numbers[i];

            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        map.entrySet().stream().forEach(entry -> {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        });


    }
}
