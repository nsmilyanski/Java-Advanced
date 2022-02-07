package Custom;

import java.util.Scanner;

public class Sorter {


    public static <T extends Comparable<T>> void sort(CustomList<T> customList){

        for (int i = 0; i < customList.getSize(); i++) {
            T element = customList.get(i);
            for (int j = i + 1; j < customList.getSize() ; j++) {
                T nextElement = customList.get(j);
                if (element.compareTo(nextElement) > 0){
                    customList.swap(i, j);
                }
            }

        }
    }
}
