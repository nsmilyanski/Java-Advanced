package SetsandMapsAdvanced.lab;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> cardPlayersMap = new LinkedHashMap<>();

        Map<String, Integer> playerPowerMap = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String[] inputArr = input.split(": ");
            String name = inputArr[0];
            String[] cardsArr = inputArr[1].split(",\\s+");

            Set<String> cardsSet = new HashSet<>();

            cardsSet.addAll(Arrays.asList(cardsArr));
            cardPlayersMap.putIfAbsent(name, new HashSet<>());

            cardsSet.addAll(cardPlayersMap.get(name));
            cardPlayersMap.put(name, cardsSet);


            input = scanner.nextLine();
        }
                    Map<Character, Integer> powerMap = getCardsPower();

        for (Map.Entry<String, Set<String>> player: cardPlayersMap.entrySet()) {
            int sum = 0;
            for (String card: player.getValue()) {
                if (card.contains("10")){
                    int type = powerMap.get(card.charAt(2));
                    sum += 10 * type;

                }else {
                    char symbol = card.charAt(0);
                    char symbol2 = card.charAt(1);

                    int power = powerMap.get(symbol);
                    int type = powerMap.get(symbol2);

                    sum += power * type;

                }

            }
            playerPowerMap.put(player.getKey(), sum);

        }

        playerPowerMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }

    private static Map<Character, Integer> getCardsPower() {
        Map<Character, Integer> map = new LinkedHashMap<>();

        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('J', 11);
        map.put('Q', 12);
        map.put('K', 13);
        map.put('A', 14);
        map.put('S', 4);
        map.put('H', 3);
        map.put('D', 2);
        map.put('C', 1);

        return map;

    }
}
