package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box();

        for (int i = 0; i < n ; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            box.getList().add(input);
        }

        double elementForCompare = Double.parseDouble(scanner.nextLine());

        int compare = box.compare(elementForCompare);

        System.out.println(compare);
    }
}
