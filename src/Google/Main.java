package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        PersonData personData = null;
        Map<String, PersonData> personDataMap = new HashMap<>();

        while (!input.equals("End")){
            String[] inputArr = input.split(" ");
            String name = inputArr[0];

            String type = inputArr[1];

            personDataMap.putIfAbsent(name, new PersonData());


            switch (type){
                case "company":
                    String companyName = inputArr[2];
                    String department = inputArr[3];
                    double salary = Double.parseDouble(inputArr[4]);

                    Company company = new Company(companyName, department, salary);
                    personDataMap.get(name).setCompanyName(company);
                    break;
                case "pokemon":
                    String pokemonName = inputArr[2];
                    String pokemonType = inputArr[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                   personDataMap.get(name).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    String perantsName = inputArr[2];
                    String perantsBirthay = inputArr[3];
                    Parents parents = new Parents(perantsName, perantsBirthay);
                    personDataMap.get(name).getParentsList().add(parents);
                    break;
                case "children":
                    String childrenName = inputArr[2];
                    String childrenBirthay = inputArr[3];
                    Children children = new Children(childrenName, childrenBirthay);
                   personDataMap.get(name).getChildrenList().add(children);
                    break;
                case "car":
                    String carModel = inputArr[2];
                    int carSpeed = Integer.parseInt(inputArr[3]);
                    Car car = new Car(carModel, carSpeed);
                    personDataMap.get(name).setCarModel(car);
                    break;

            }



            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        System.out.println(name);
        PersonData data = personDataMap.get(name);

        System.out.println(data);
    }
}
