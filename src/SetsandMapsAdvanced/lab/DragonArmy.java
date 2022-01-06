package SetsandMapsAdvanced.lab;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<Integer>>> dragonsMap = new LinkedHashMap<>();
        Map<String, List<Double>> averageMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("\\s+");

            int demage = 0;
            int health = 0;
            int armor = 0;

            String type = inputArr[0];
            String dragon = inputArr[1];
            if(inputArr[2].equals("null")){
                demage = 45;
            }else {
            demage = Integer.parseInt(inputArr[2]);
            }
            if (inputArr[3].equals("null")){
                health = 250;
            }else {
            health = Integer.parseInt(inputArr[3]);
            }
            if (inputArr[4].equals("null")){
                armor = 10;
            }else {
            armor = Integer.parseInt(inputArr[4]);
            }

            dragonsMap.putIfAbsent(type, new TreeMap<>());
            double value1 = 0.0;
            double value2 = 0.0;
            double value3 = 0.0;

            if (!dragonsMap.get(type).containsKey(dragon)) {
                dragonsMap.get(type).putIfAbsent(dragon, new ArrayList<>());
                dragonsMap.get(type).get(dragon).add(demage);
                dragonsMap.get(type).get(dragon).add(health);
                dragonsMap.get(type).get(dragon).add(armor);
            }else {
                value1 = dragonsMap.get(type).get(dragon).get(0);
                value2 = dragonsMap.get(type).get(dragon).get(1);
                value3 =  dragonsMap.get(type).get(dragon).get(2);

                dragonsMap.get(type).get(dragon).set(0, demage);
                dragonsMap.get(type).get(dragon).set(1, health);
                dragonsMap.get(type).get(dragon).set(2, armor);
            }

            averageMap.putIfAbsent(type, new ArrayList<>());

            if (averageMap.get(type).isEmpty()){
                averageMap.get(type).add(demage * 1.00);
                averageMap.get(type).add(health * 1.00);
                averageMap.get(type).add(armor * 1.00);
            }else {
                averageMap.get(type).set(0, (averageMap.get(type).get(0) + (demage * 1.00)));
                averageMap.get(type).set(1, (averageMap.get(type).get(1) + (health * 1.00)));
                averageMap.get(type).set(2, (averageMap.get(type).get(2) + (armor * 1.00)));
            }
            if (value1 != 0 && value2 != 0 && value3 != 0){
                averageMap.get(type).set(0, averageMap.get(type).get(0) - value1);
                averageMap.get(type).set(1, averageMap.get(type).get(1) - value2);
                averageMap.get(type).set(2, averageMap.get(type).get(2) - value3);
            }

        }

        for (Map.Entry<String, List<Double>> average: averageMap.entrySet()) {
            average.getValue().set(0, average.getValue().get(0)/ dragonsMap.get(average.getKey()).size());
            average.getValue().set(1, average.getValue().get(1)/dragonsMap.get(average.getKey()).size());
            average.getValue().set(2, average.getValue().get(2)/ dragonsMap.get(average.getKey()).size());
        }

        averageMap.entrySet().forEach(entry -> {
            System.out.printf("%s::", entry.getKey());
            System.out.printf("(%.2f/%.2f/%.2f)%n", entry.getValue().get(0), entry.getValue().get(1),
                    entry.getValue().get(2));
            dragonsMap.get(entry.getKey()).entrySet().forEach(m -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", m.getKey(), m.getValue().get(0),
                        m.getValue().get(1), m.getValue().get(2));
            });

            });

    }
}
