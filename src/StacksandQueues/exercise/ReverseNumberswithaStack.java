package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] nums = scanner.nextLine().split(" ");

        for (String numbers: nums) {
            stack.push(numbers);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
