package CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String brand = tokens[0];

            Car car;

            if (tokens.length == 1){
                car = new Car(brand);
            }else {
                String model = tokens[1];
                int hp = Integer.parseInt(tokens[2]);

                car = new Car(brand, model, hp);

            }
            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower());
        }
    }
}
