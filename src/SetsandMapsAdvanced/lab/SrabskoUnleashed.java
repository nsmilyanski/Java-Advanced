package SetsandMapsAdvanced.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "^(?<name>[A-Z][a-z]+[\\s]*[A-Z]*[a-z]*) @(?<town>[A-Z][a-z]+[\\s]*[A-Z]*[a-z]*) (?<price>[0-9]+) (?<tickets>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = null;

        Map<String, Map<String, Integer>> sarbianMap = new LinkedHashMap<>();

        while (!input.equals("End")){

            matcher = pattern.matcher(input);

            String name = "";
            String town = "";
            int ticketPrice = 0;
            int ticketsNum = 0;

            if (matcher.find()){
                name = matcher.group("name");
                town = matcher.group("town");
                ticketPrice = Integer.parseInt(matcher.group("price"));
                ticketsNum = Integer.parseInt(matcher.group("tickets"));

            }else {
                input = scanner.nextLine();
                continue;
            }

            int earnedMoney = ticketPrice * ticketsNum;
            if (!sarbianMap.containsKey(town)){
                sarbianMap.putIfAbsent(town, new LinkedHashMap<>());
                sarbianMap.get(town).put(name, earnedMoney);
            }else {
                if (!sarbianMap.get(town).containsKey(name)){
                    sarbianMap.get(town).put(name, earnedMoney);
                }else {
                sarbianMap.get(town).put(name, sarbianMap.get(town).get(name) + earnedMoney);

                }

            }
            input = scanner.nextLine();
        }

        sarbianMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());

            entry.getValue().entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(star -> System.out.printf("#  %s -> %d%n", star.getKey(), star.getValue()));
        });

    }
}
