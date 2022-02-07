package DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String brand = tokens[0];
            String model = tokens[1];
            int hp = Integer.parseInt(tokens[2]);

            Cars cars = new Cars();

            cars.setBrand(brand);
            cars.setModel(model);
            cars.setHorsePower(hp);

            System.out.printf("The car is: %s %s - %d HP.%n", cars.getBrand(), cars.getModel(), cars.getHorsePower());
        }

    }
}
