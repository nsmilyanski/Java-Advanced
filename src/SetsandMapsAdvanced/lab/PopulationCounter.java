package SetsandMapsAdvanced.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> countryMap = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> cityMap = new LinkedHashMap<>();

        while (!input.equals("report")){
            String[] inputArr = input.split("\\|+");
            String city = inputArr[0];
            String country = inputArr[1];
            int population = Integer.parseInt(inputArr[2]);

            countryMap.putIfAbsent(country, 0);
            countryMap.put(country, countryMap.get(country) + population);
            cityMap.putIfAbsent(country, new LinkedHashMap<>());
            cityMap.get(country).put(city, 0);
            cityMap.get(country).put(city, cityMap.get(country).get(city) + population);


            input = scanner.nextLine();
        }

        countryMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)%n", entry.getKey(), entry.getValue());

                    cityMap.get(entry.getKey()).entrySet().stream()
                            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                            .forEach(t -> System.out.printf("=>%s: %d%n", t.getKey(), t.getValue()));
                });
    }
}
