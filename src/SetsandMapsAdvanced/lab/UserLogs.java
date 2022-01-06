package SetsandMapsAdvanced.lab;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , Map<String, Integer>> usersMap = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] inputArr = input.split(" ");

            String ip = inputArr[0].replace("IP=", "");
            String user = inputArr[2].replace("user=", "");

            usersMap.putIfAbsent(user, new LinkedHashMap<>());
            usersMap.get(user).putIfAbsent(ip, 0);
            usersMap.get(user).put(ip, usersMap.get(user).get(ip) + 1);
            input = scanner.nextLine();
        }

        usersMap.entrySet().forEach(entry -> {
            System.out.printf("%s:%n", entry.getKey());

            String m = entry.getValue().toString().replaceAll("[\\{\\}]", "") + ".";
            m = m.replaceAll("=", " => ");
            System.out.println(m);

        });
    }
}
