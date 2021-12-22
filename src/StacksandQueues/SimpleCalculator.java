package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals("+") && !stack.isEmpty()){
                int num = stack.pop() + Integer.parseInt(inputArr[i + 1]);
                stack.push(num);
            }else if (inputArr[i].equals("-") && !stack.isEmpty()){
                int num2 = stack.pop() - Integer.parseInt(inputArr[i + 1]);
                stack.push(num2);

            }else if (stack.isEmpty()){
                stack.push(Integer.parseInt(inputArr[i]));
            }
        }
        System.out.println(stack.peek());
    }
}
