package exam;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] arr2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int value : arr1) {
            queue.offer(value);
        }

        for (int value : arr2) {
            stack.push(value);
        }

        Map<String, List<Integer>> table = new HashMap<>();


        table.put("Bread", new ArrayList<>());
        table.get("Bread").add(25);
        table.put("Cake", new ArrayList<>());
        table.get("Cake").add(50);
        table.put("Pastry", new ArrayList<>());
        table.get("Pastry").add(75);
        table.put("Fruit Pie", new ArrayList<>());
        table.get("Fruit Pie").add(100);


        while (!queue.isEmpty() || !stack.isEmpty()) {
            Integer poll = queue.poll();
            Integer pop = stack.pop();

            Integer sum = poll + pop;

            List<Integer> first = table.values().stream().filter(x -> x.get(0) == sum)
                    .findFirst().orElse(new ArrayList<>());


            if (first.isEmpty()) {
                stack.push(pop + 3);

            }else {
                Optional<Map.Entry<String, List<Integer>>> mixed =
                        table.entrySet().stream().filter(x -> x.getValue().get(0).equals(sum)).findFirst();

                String key = mixed.get().getKey();
                if (table.get(key).size() == 1) {
                    table.get(key).add(1);
                }else {
                    table.get(key).set(1, table.get(key).get(1) + 1);
                }


            }

        }


        if (queue.isEmpty() && stack.isEmpty()) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        if (queue.isEmpty()) {
            System.out.println("Liquids left: none");
        }else {
            System.out.println("Liquids left: ");
            String collect = queue.stream().map(Object::toString).collect(Collectors.joining(", "));

            System.out.println(collect);
        }

        if (stack.isEmpty()) {
            System.out.println("Ingredients left: none");
        }else {
            System.out.println("Ingredients left: ");

            String collect = stack.stream().map(Object::toString).collect(Collectors.joining(", "));

            System.out.println(collect);
        }





    }
}
