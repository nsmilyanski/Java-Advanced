package SetsandMapsAdvanced.lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBookMap = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")){
            String[] inputArr = input.split("-");
            String name = inputArr[0];
            String phone = inputArr[1];

            phoneBookMap.put(name, phone);
            input = scanner.nextLine();
        }

        String token = scanner.nextLine();

        while (!token.equals("stop")){
            if (phoneBookMap.containsKey(token)){
                System.out.printf("%s -> %s%n", token, phoneBookMap.get(token));
            }else {
                System.out.printf("Contact %s does not exist.%n", token);
            }

            token = scanner.nextLine();
        }
    }
}
