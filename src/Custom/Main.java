package Custom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList();

        while (!input.equals("End")){
            String[] inputArr = input.split(" ");

            String command = inputArr[0];

            switch (command){
                case "Add":
                    String element = inputArr[1];
                    customList.getList().add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(inputArr[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String contElement = inputArr[1];
                    System.out.println(customList.contains(contElement));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(inputArr[1]);
                    int index2 = Integer.parseInt(inputArr[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String greatElement = inputArr[1];
                    int element1 = customList.countGreaterThan(greatElement);
                    System.out.println(element1);
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
