package SetsandMapsAdvanced.lab;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> durationMap = new TreeMap<>();
        Map<String, Set<String>> ipMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("\\s+");

            String ip = inputArr[0];
            String name = inputArr[1];
            int duration = Integer.parseInt(inputArr[2]);

            durationMap.putIfAbsent(name, 0);
            durationMap.put(name, durationMap.get(name) + duration);

            ipMap.putIfAbsent(name, new TreeSet<>());
            ipMap.get(name).add(ip);

        }

        durationMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d ", entry.getKey(), entry.getValue());
            System.out.print(ipMap.get(entry.getKey()));
            System.out.println();
        });
    }
}
