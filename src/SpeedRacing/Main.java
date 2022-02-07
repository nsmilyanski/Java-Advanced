package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, CarsRacing> carsRacingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double fuelCoast = Double.parseDouble(tokens[2]);

            CarsRacing carsRacing = new CarsRacing(model, fuel, fuelCoast);

            carsRacingMap.put(model, carsRacing);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputArr = input.split(" ");

            String modelCar = inputArr[1];
            int distanceForTraveling = Integer.parseInt(inputArr[2]);

            CarsRacing car = carsRacingMap.get(modelCar);


            if (!car.drive(distanceForTraveling)){
                System.out.println("Insufficient fuel for the drive");
            }


            input = scanner.nextLine();
        }

        carsRacingMap.values().forEach(System.out::println);
    }
}
