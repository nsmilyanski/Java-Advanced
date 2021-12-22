package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

       List<String> nameList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());

        int size = nameList.size();

        for (int i = 0; i < nameList.size(); i++) {
            queue.offer(nameList.get(i));
        }


        while (queue.size() != 1){

            for (int i = 0; i < num -1; i++) {
                String content = queue.poll();
                queue.offer(content);
            }

            System.out.println("Removed " + queue.poll());
        }
        for (String name : queue) {
                System.out.printf("Last is %s%n", queue.peek());
        }
    }
}
