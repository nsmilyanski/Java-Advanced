package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Engines>> engineMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split(" ");

            String engineType = token[0];
            int power = Integer.parseInt(token[1]);

            Engines engine = null;

            if (token.length == 2){
                engine = new Engines(engineType, power);
            }else if (token.length == 4){
                String displacement = token[2];
                String efficiency = token[3];
                engine = new Engines(engineType, power, displacement, efficiency);
            }else if (token.length == 3){
                try {
                    int efficiencyNum = Integer.parseInt(token[2]);
                    engine = new Engines(engineType, power, efficiencyNum);

                }catch (NumberFormatException e){
                    String displacement = token[2];
                    engine = new Engines(engineType, power, displacement);
                }
            }
            engineMap.put(engineType, new ArrayList<>());
            engineMap.get(engineType).add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

       List<CarforSale> carforSaleList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String model = inputArr[0];
            String engineType = inputArr[1];

            CarforSale carforSale = null;

            if (inputArr.length == 2){
                carforSale = new CarforSale(model, engineType);
            }else if (inputArr.length == 4){
                String weight = inputArr[2];
                String color = inputArr[3];
                carforSale = new CarforSale(model, engineType, weight, color);
            }else if (inputArr.length == 3){
                try {
                    int weightNum = Integer.parseInt(inputArr[2]);
                    carforSale = new CarforSale(model, engineType, weightNum);
                }catch (NumberFormatException e){
                    String color = inputArr[2];
                    carforSale = new CarforSale(model, engineType, color);
                }
            }
           carforSaleList.add(carforSale);

        }

        carforSaleList.forEach(entry -> {
            System.out.println(entry.getModel() + ":");
            engineMap.get(entry.getTypeEngine()).forEach(System.out::println);
            System.out.printf("Weight: %s%n", entry.getWeight());
            System.out.printf("Color: %s%n", entry.getColor());
        });

    }
}
