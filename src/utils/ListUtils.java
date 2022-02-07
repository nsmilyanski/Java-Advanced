package utils;

import java.util.Collections;
import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>> T getMIn(List<T> list){
        if (list.isEmpty()){
            throw  new IllegalArgumentException("Collection is empty");
        }
        T minElement =  Collections.min(list);
        return minElement;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw  new IllegalArgumentException("Collection is empty");
        }
        T maxElement = Collections.max(list);
        return maxElement;
    }

}
