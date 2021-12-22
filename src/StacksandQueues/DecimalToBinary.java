package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        while (num != 0){
            stack.push(num % 2);
            num /= 2;
        }
        if (!stack.isEmpty()) {
            for (int number : stack) {
                System.out.print(number);
            }
        }else {
            System.out.println(0);
        }
    }
}
