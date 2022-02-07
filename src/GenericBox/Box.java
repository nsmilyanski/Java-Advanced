package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void swap(int firstIndex, int secondIndex){
        T firstElement = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, firstElement);
    }

    public <T extends Comparable<T>> int  compare(T element){
        int indexes = 0;
        for (int i = 0; i < list.size(); i++) {
            int compare = element.compareTo((T) list.get(i));
            if (compare < 0 ){
                indexes++;
            }
        }
        return indexes;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (T element: list) {
            sb.append("java.lang.Integer: ").append(element).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
