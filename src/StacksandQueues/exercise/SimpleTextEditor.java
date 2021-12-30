package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            String command = inputArr[0];

            switch (command){
                case "1":
                    String text = inputArr[1];
                    sb.append(text);
                    stack.push(sb.toString());
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        int erasesChars = Integer.parseInt(inputArr[1]);
                        sb.delete(sb.length() - erasesChars, sb.length());
                        stack.push(sb.toString());
                    }
                    break;
                case "3":
                    int index = Integer.parseInt(inputArr[1]);
                    if(!stack.isEmpty()){
                    System.out.println(stack.peek().charAt(index - 1));
                    }
                    break;
                case "4":
                    if (stack.size() > 1) {
                    stack.pop();
                        sb = new StringBuilder(stack.peek());
                    }else {
                        sb = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
