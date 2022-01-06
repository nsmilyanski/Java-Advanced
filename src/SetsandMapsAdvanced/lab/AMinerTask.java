package SetsandMapsAdvanced.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mineMap = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            mineMap .putIfAbsent(input, 0);
            mineMap.put(input, mineMap.get(input) + quantity);

            input = scanner.nextLine();
        }

        mineMap.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));


    }
}
