package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            if (command.equals("2")){
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else if (command.equals("3")){
                System.out.println(Collections.max(stack));
            }else {
                int input = Integer.parseInt(command.split(" ")[1]);
                stack.push(input);
            }
        }
    }
}
