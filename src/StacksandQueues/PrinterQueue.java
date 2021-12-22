package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queues = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (queues.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled" + " " + queues.poll());
                }
            }else {
                queues.offer(input);
            }

            input = scanner.nextLine();
        }

        for (String printer: queues) {
            System.out.println(printer);
        }
    }
}
