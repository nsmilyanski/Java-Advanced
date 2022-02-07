package FunctionalProgramming.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        List<String> commandList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("Print")){
            if (input.split(";")[0].equals("Remove filter")){
                String object = input.replace(input.split(";")[0], "Add filter");
                commandList.remove(object);
            }else {
                commandList.add(input);
            }

            input = scanner.nextLine();
        }

        for (String tokens: commandList) {

            String[] comandsArr = tokens.split(";");

            String command = comandsArr[0];
            String typeCommand = comandsArr[1];
            String criteria = comandsArr[2];


            Predicate<String> startWith = name -> !name.startsWith(criteria);
            Predicate<String> endWith = name -> !name.endsWith(criteria);
            Predicate<String> contains = name -> !name.contains(criteria);
            Predicate<String> hasLength = name -> name.length() != Integer.parseInt(criteria);

            switch (command){
                case "Add filter":
                    if (typeCommand.equals("Starts with")){
                        namesList = namesList.stream().filter(startWith).collect(Collectors.toList());

                    }else if (typeCommand.equals("Ends with")){
                        namesList = namesList.stream().filter(endWith).collect(Collectors.toList());

                    }else if (typeCommand.equals("Length")){
                        namesList = namesList.stream().filter(hasLength).collect(Collectors.toList());

                    }else {

                        namesList = namesList.stream().filter(contains).collect(Collectors.toList());

                    }
                    break;

            }


        }



        String print = namesList.stream()
                .map(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(print);
    }
}
