package SetsandMapsAdvanced.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalsSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
         String[] chemicalChars = scanner.nextLine().split(" ");

         chemicalsSet.addAll(Arrays.asList(chemicalChars));
        }

        chemicalsSet.forEach(entry -> System.out.print(entry + " "));
    }
}
