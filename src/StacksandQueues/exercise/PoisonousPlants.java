package StacksandQueues.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> integerList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Integer> numsForRemove = new ArrayList<>();
        int counter = 0;

        while (numsForRemove.isEmpty()) {
            counter++;
            for (int i = 0; i < integerList.size() - 1; i++) {
                int firstPlant = integerList.get(i);
                int secondPlant = integerList.get(i + 1);
                if (firstPlant < secondPlant) {
                    numsForRemove.add(secondPlant);
                }
            }

            boolean toRemove = false;
            for (int i = 0; i < numsForRemove.size(); i++) {
                toRemove = true;
                integerList.remove(numsForRemove.get(i));
            }
            numsForRemove = new ArrayList<>();
            if (!toRemove) {
                numsForRemove.add(1);
                break;
            }

        }
        System.out.println(counter - 1);


    }
}
