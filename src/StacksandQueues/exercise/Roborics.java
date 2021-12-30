package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Roborics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(";");

        LinkedHashMap<String, Integer> robotsMap = getRobotsWorked(inputArr);
        LinkedHashMap<String, Integer> robotsWokrkingTime = getRobotsTime(inputArr);

        String[] timeArr = scanner.nextLine().split(":");

        int secondsTime = getSecondds(timeArr);

        String tokens = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!tokens.equals("End")){
            queue.offer(tokens);
            tokens = scanner.nextLine();
        }


        while (!queue.isEmpty()){
            String currentProduct = queue.poll();
        boolean isWorking = false;
                secondsTime++;
                decreaseWorkingTime(robotsWokrkingTime);

            for (Map.Entry<String, Integer> robots: robotsWokrkingTime.entrySet()) {
                String currentTime = getTime(secondsTime).replaceAll(" ", "");
                if (robots.getValue() == 0){
                    System.out.printf("%s - %s %s%n", robots.getKey(), currentProduct, currentTime);
                    robotsWokrkingTime.put(robots.getKey(), robotsMap.get(robots.getKey()));
                    isWorking = true;
                    break;
                }
            }
        if (!isWorking){
         queue.offer(currentProduct);
        }
        }


    }

    private static void decreaseWorkingTime(LinkedHashMap<String, Integer> robotsWokrkingTime) {
        for (Map.Entry<String, Integer> robots: robotsWokrkingTime.entrySet()) {
            if (robots.getValue() > 0){
                robotsWokrkingTime.put(robots.getKey(), robots.getValue() - 1);
            }
        }
    }

    private static String getTime(int secondsTime) {
        int hours = (secondsTime / 3600) % 24;
        int minutes = secondsTime % 3600 / 60;
        int seconds = secondsTime % 60;
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }

    private static int getSecondds(String[] timeArr) {

        int hours = Integer.parseInt(timeArr[0]);
        int minutes = Integer.parseInt(timeArr[1]);
        int seconds = Integer.parseInt(timeArr[2]);

        return (hours * 3600) + minutes * 60 + seconds;
    }

    private static LinkedHashMap<String, Integer> getRobotsWorked(String[] inputArr) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String robots: inputArr) {
            map.put(robots.split("-")[0], Integer.parseInt(robots.split("-")[1]));
        }
        return map;
    }

    private static LinkedHashMap<String, Integer> getRobotsTime(String[] inputArr) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String robots: inputArr) {
            map.put(robots.split("-")[0], 0);
        }
        return map;
    }
}

