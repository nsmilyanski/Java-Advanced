package FunctionalProgramming.lab;

import java.awt.print.Pageable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterbyAge {
    public static class Person{
        private final String name;
        private final int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return this.age;
        }

        private Person(String name, int age){
            this.name = name;
            this.age = age;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<Person> supplier = () -> {
            String[] tokens = scanner.nextLine().split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        };

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> listElements = IntStream.range(0, n)
                .mapToObj(ignored -> supplier.get()).collect(Collectors.toList());

        String type = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        String[] nameOrAge = scanner.nextLine().split(" ");

        Predicate<Person> personPredicate = getPredicate(type, age);
        Consumer<Person> personSupplier = printPersons(nameOrAge);

        listElements.stream().filter(personPredicate).forEach(personSupplier);


    }

    private static Consumer<Person> printPersons(String[] nameOrAge) {
        if (nameOrAge.length == 2){
            return p -> System.out.printf("%s - %d%n", p.name, p.getAge());
        }else if (nameOrAge[0].equals("name")){
            return p -> System.out.println(p.getName());
        }
        return p -> System.out.println(p.getAge());
    }

    private static Predicate<Person> getPredicate(String type, int age) {
        if (type.equals("older")){
            return p -> p.getAge() >= age;
        }
        return p -> p.getAge() <= age;
    }
}
