package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            stack.push(num);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)){
            System.out.println("true");
        }else {
            if (!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            }else {
                System.out.println(0);
            }
        }
    }
}
