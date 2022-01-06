package SetsandMapsAdvanced.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> emailsMap = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String email = scanner.nextLine();


            if(!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                emailsMap.put(input, email);
            }


            input = scanner.nextLine();
        }

        emailsMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue()));
    }
}
