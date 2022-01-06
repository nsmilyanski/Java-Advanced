package SetsandMapsAdvanced.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guests = scanner.nextLine();

        Set<String> guestList = new TreeSet<>();

        while (!guests.equals("PARTY")){
            guestList.add(guests);
            guests = scanner.nextLine();
        }

        String party = scanner.nextLine();

        while (!party.equals("END")){
            guestList.remove(party);
            party = scanner.nextLine();
        }

        System.out.println(guestList.size());

        for (String guest: guestList) {
            System.out.println(guest);
        }
    }
}
