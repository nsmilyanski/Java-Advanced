package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 5 , 15, - 8);



        int element = ListUtils.getMIn(integerList);

        System.out.println(element);

        int max = ListUtils.getMax(integerList);

        System.out.println(max);








    }
}
