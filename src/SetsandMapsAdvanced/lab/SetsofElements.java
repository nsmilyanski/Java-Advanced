package SetsandMapsAdvanced.lab;

import java.util.*;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(inputArr[0]);
        int m = Integer.parseInt(inputArr[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSet.add(num);
        }

        for (int i = 0; i < m; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            secondSet.add(num2);
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(entry -> System.out.print(entry + " "));
    }
}
