package SetsandMapsAdvanced.exercise;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> studentMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
            double sum = 0.0;
            for (int j = 0; j < grades.length; j++) {
                double num = grades[j];
                sum += num;
            }
            sum = sum/ grades.length;

            DecimalFormat dec = new DecimalFormat("#.#########################");
            String grade = dec.format(sum);
            studentMap.put(name, grade);
        }

        studentMap.entrySet().forEach(entry ->
                System.out.printf("%s is graduated with %s%n", entry.getKey(), entry.getValue()));
    }
}
