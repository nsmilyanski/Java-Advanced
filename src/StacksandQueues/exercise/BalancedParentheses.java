package StacksandQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        boolean isValid = false;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '{' || symbol == '[' || symbol == '('){
                stack.push(symbol);
            }else {
                if (!stack.isEmpty()) {
                    char parentheses = stack.pop();
                    if ((parentheses == '(' && symbol == ')') || (parentheses == '[' && symbol == ']')
                            || (parentheses == '{' && symbol == '}')) {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }else {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
