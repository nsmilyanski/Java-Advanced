package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


            Map<String, Trainer> trainerMap = new LinkedHashMap<>();


        while (!input.equals("Tournament")){

            String[] inputArr = input.split(" ");

            String trainerName = inputArr[0];
            String pokemonName = inputArr[1];
            String element = inputArr[2];
            int health = Integer.parseInt(inputArr[3]);

            Pokemon pokemon = new Pokemon(pokemonName, element, health);

            trainerMap.putIfAbsent(trainerName, new Trainer(trainerName));

            trainerMap.get(trainerName).getPokemonCollection().add(pokemon);


            input = scanner.nextLine();
        }

        String token = scanner.nextLine();

        while (!token.equals("End")){
            boolean havaElement = false;

            for (Map.Entry<String, Trainer> trainers: trainerMap.entrySet()) {
                List<Trainer> values = new ArrayList<>(trainerMap.values());
                int size = values.size();
               if (trainers.getValue().getPokemonCollection().contains(token)){
                   trainers.getValue().inceaseBagdest();
                   havaElement = true;

                }else {
                       int size2 = trainers.getValue().getPokemonCollection().size();
                           for (int i = 0; i < size2; i++) {
                               boolean health = values.get(i).getPokemonCollection().get(i).decreaseHealth();
                               if (!health){
                                   values.get(i).removeCollectionFromList(i);
                                   i--;
                                  size2--;
                               }
                           }
               }
            }


            token = scanner.nextLine();
        }

        trainerMap.entrySet().stream().sorted((e1,e2) -> {
            return e2.getValue().getBadgestNum() - e1.getValue().getBadgestNum();
        }).forEach(System.out::println);


    }
}
