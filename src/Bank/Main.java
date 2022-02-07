package Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> accountMap = new HashMap<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command){
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accountMap.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (accountMap.containsKey(id)){
                        accountMap.get(id).deposid(amount * 1.00);
                        System.out.printf("Deposited %d to ID%d%n", amount, id);
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int id2 = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (accountMap.containsKey(id2)) {
                       accountMap.get(id2).getInterest(years);
                        System.out.printf("%.2f%n", accountMap.get(id2).getInterest(years));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }


    }
}
