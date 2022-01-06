package SetsandMapsAdvanced.exercise;

import java.util.*;

public class CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            String continent = inputArr[0];
            String country = inputArr[1];
            String city = inputArr[2];

            continentsMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentsMap.get(continent).putIfAbsent(country, new ArrayList<>());
            continentsMap.get(continent).get(country).add(city);

        }

        continentsMap.entrySet().forEach(entry -> {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().forEach((e1, e2) -> {
                System.out.printf("%s -> ", e1);
                System.out.print(String.join(", ", e2));
                System.out.println();
            } );
        });
    }
}
