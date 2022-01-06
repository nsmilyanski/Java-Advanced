package SetsandMapsAdvanced.lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolsMap = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            symbolsMap.putIfAbsent(symbol, 0);
            symbolsMap.put(symbol, symbolsMap.get(symbol) + 1);
        }

        symbolsMap.entrySet()
                .forEach(entry -> System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue()));
    }
}
