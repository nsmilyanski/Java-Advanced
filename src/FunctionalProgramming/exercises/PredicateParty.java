package FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String typeCommand = tokens[1];
            String criteria = tokens[2];

            Predicate<String> startWith = name -> !name.startsWith(criteria);
            Predicate<String> endWith = name -> !name.endsWith(criteria);
            Predicate<String> hasLength = name -> name.length() != Integer.parseInt(criteria);
            ;

            BiFunction<List<String>, String, List<String>> dubleString = (array, criterials) -> {
                if (typeCommand.equals("StartWith")) {
                    for (String name : array) {
                        if (name.startsWith(criteria)) {
                            array.add(name);
                        }
                    }

                } else if (typeCommand.equals("EndWith")) {

                    for (String name : array) {
                        if (name.endsWith(criteria)) {
                            array.add(name);
                        }
                    }
                } else if (typeCommand.equals("Length")) {
                    for (String name : array) {
                        if (name.length() <= Integer.parseInt(criterials))
                            array.add(name);
                    }
                }
                return array;
            };

            switch (command) {
                case "Remove":
                    if (typeCommand.equals("StartsWith")) {
                        namesList = namesList.stream().filter(startWith).collect(Collectors.toList());

                    } else if (typeCommand.equals("EndsWith")) {
                        namesList = namesList.stream().filter(endWith).collect(Collectors.toList());

                    } else if (typeCommand.equals("Length")) {
                        namesList = namesList.stream().filter(hasLength).collect(Collectors.toList());

                    }
                    break;
                case "Double":
                    if (typeCommand.equals("StartsWith")) {
                        for (int i = 0; i < namesList.size(); i++) {
                            if (namesList.get(i).startsWith(criteria)) {
                                namesList.add(i, namesList.get(i));
                                i++;


                            }
                        }


                    } else if (typeCommand.equals("EndsWith")) {
                        ;
                        for (int i = 0; i < namesList.size(); i++) {
                            if (namesList.get(i).endsWith(criteria)) {
                                namesList.add(i, namesList.get(i));
                                i++;

                            }
                        }

                    } else if (typeCommand.equals("Length")) {
                        for (int i = 0; i < namesList.size(); i++) {
                            if (namesList.get(i).length() == Integer.parseInt(criteria)) {
                                namesList.add(i, namesList.get(i));
                                i++;
                            }
                        }
                        break;

                    }

            }
            input = scanner.nextLine();
        }
            if (namesList.isEmpty()) {
                System.out.println("Nobody is going to the party!");
            } else {
                String print = namesList.stream().sorted()
                        .map(String::valueOf).collect(Collectors.joining(", "));

                System.out.println(print + " are going to the party!");

            }
    }
}
