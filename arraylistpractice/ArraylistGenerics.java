import java.util.ArrayList;

public class ArraylistGenerics {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        arr.add(3,7);
        arr.add(4,0);
        System.out.println(arr);
        arr.set(2,10);
        arr.set(3,20);
        System.out.println(arr);
        arr.remove(2);

        System.out.println(arr);
        System.out.println(arr.get(4));

    }
}
