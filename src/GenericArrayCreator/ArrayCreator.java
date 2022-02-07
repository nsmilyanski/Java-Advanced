package GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator<T> {

    private T[] array;

    public static <T> T[] create(int length, T item) {
        T[] arr = (T[]) new Object[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item;
        }
        return arr;
    }

    public static <T> T[] create(Class<T> cl , int length, T item){
        T[] array = (T[]) Array.newInstance(cl, length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }
}
