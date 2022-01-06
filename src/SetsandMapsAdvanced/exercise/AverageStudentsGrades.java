package SetsandMapsAdvanced.exercise;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new TreeMap<>();
        Map<String, Double> averageGrade = new HashMap<>();


        for (int i = 0; i < n; i++) {
        String[] inputArr = scanner.nextLine().split("\\s+");
        String name = inputArr[0];
        double grade = Double.parseDouble(inputArr[1]);

        studentsMap.putIfAbsent(name, new ArrayList<>());
        studentsMap.get(name).add(grade);
        }

        studentsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> ", entry.getKey());
            double averageNum = entry.getValue().stream().mapToDouble(e -> e).sum();
            averageNum = averageNum/ entry.getValue().size();
            entry.getValue().forEach(grade -> {
                System.out.printf("%.2f ", grade);
            }
            );
            System.out.printf("(avg: %.2f)", averageNum);
            System.out.println();
        });

    }
}
