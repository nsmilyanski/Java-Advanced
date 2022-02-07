package GenericScale;

public class Scale <T extends Comparable<T>>{
   private T left;
   private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }
    public T getHeavier(){
        int element = left.compareTo(right);
        if (element == 0){
            return null;
        }else if (element == 1){
            return left;
        }
        return right;
    }
}
