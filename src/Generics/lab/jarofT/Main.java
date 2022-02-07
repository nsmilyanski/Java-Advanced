package Generics.lab.jarofT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar<String> jar = new Jar<>();

        jar.add("Pesho");
        jar.add("Pesho");
        jar.add("Gosho");

        jar.remove();
    }
}
