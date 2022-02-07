package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Map<String, List<Truck>> truckMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tyre1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tyre2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tyre3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tyre4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoType, cargoWeight);
            Tire tires = new Tire(tyre1Pressure, tire1Age, tyre2Pressure, tire2Age, tyre3Pressure, tire3Age,
                    tyre4Pressure, tire4Age);
            Truck truck = new Truck(model, engine, cargo, tires);


            truckMap.putIfAbsent(cargoType, new ArrayList<>());
            truckMap.get(cargoType).add(truck);

        }

        String type = scanner.nextLine();

        if (type.equals("fragile")) {
            truckMap.get(type).stream().filter(e -> e.getTire().isTireUnder1Bar()).forEach(System.out::println);
        }else {
            truckMap.get(type).stream().filter(e -> e.getEngine().isEngineOver250Hp()).forEach(System.out::println);
        }
    }
}
