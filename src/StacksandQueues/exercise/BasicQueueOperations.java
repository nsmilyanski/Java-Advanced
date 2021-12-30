package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            queue.offer(num);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.contains(x)){
            System.out.println("true");
        }else {
            if (!queue.isEmpty()){
                System.out.println(Collections.min(queue));
            }else {
                System.out.println(0);
            }
        }
    }
}
