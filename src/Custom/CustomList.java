package Custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;


    public CustomList() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T element){
        list.add(element);
    }

    public T remove(int index){
        return list.remove(index);
    }

    public boolean contains(T element){
        return list.contains(element);
    }
    public void swap(int firstIndex, int secondIndex){
        T firstElement = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, firstElement);
    }
    public <T extends Comparable<T>> int  countGreaterThan(T element){
        int indexes = 0;
        for (int i = 0; i < list.size(); i++) {
            int compare = element.compareTo((T) list.get(i));
            if (compare < 0 ){
                indexes++;
            }
        }
        return indexes;
    }
    public T getMax(){
       return Collections.max(list);
    }

    public T getMin(){
        return Collections.min(list);
    }

    public int getSize(){
        return list.size();
    }
    public T get(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element: list) {
            sb.append(element).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
