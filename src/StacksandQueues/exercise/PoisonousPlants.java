package StacksandQueues.exercise;

import java.util.*;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] gardenArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> integerList = new ArrayList<>();

        for (int plant: gardenArr) {
            integerList.add(plant);
        }

        int counter = 0;


        while (true) {
        ArrayDeque<Integer> plantQueue = new ArrayDeque<>();
            counter++;
            int size = integerList.size();

            for (int i = 1; i < size - 1 ; i++) {

                int firstPlant = integerList.get(i - 1);

                int secondPlant = integerList.get(i);

                if (i == 0){
                    plantQueue.offer(firstPlant);
                }else if (firstPlant <= secondPlant) {
                    plantQueue.offer(firstPlant);
                }

            }
            if (integerList.size() == plantQueue.size()){
                break;
            }
        }
        System.out.println(counter);
    }
}
