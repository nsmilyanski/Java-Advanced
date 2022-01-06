package SetsandMapsAdvanced.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String token = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();

        while (!token.equals("END")){
            String[] array = token.split(", ");

            String command = array[0];

            switch (command){
                case "IN":
                    parkingLot.add(array[1]);
                    break;
                case "OUT":
                    parkingLot.remove(array[1]);
                    break;
            }


            token = scanner.nextLine();
        }

        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String carNumbers: parkingLot) {
                System.out.println(carNumbers);
            }
        }
    }
}
