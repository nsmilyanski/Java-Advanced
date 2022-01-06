package SetsandMapsAdvanced.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String token = scanner.nextLine();

        Map<String, Map<String, Double>> supermarketMap = new TreeMap<>();

        while (!token.equals("Revision")){
            String[] inputArr = token.split(", ");
            String superMarket = inputArr[0];
            String product = inputArr[1];

            double price = Double.parseDouble(inputArr[2]);

            supermarketMap.putIfAbsent(superMarket, new LinkedHashMap<>());
            supermarketMap.get(superMarket).put(product, price);
            token = scanner.nextLine();
        }

        supermarketMap.entrySet().forEach(entry -> {
            System.out.printf("%s->%n", entry.getKey());
            entry.getValue().forEach((e1, e2) -> System.out.printf("Product: %s, Price: %.1f%n", e1, e2));
        });


    }
}
