import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        System.out.println(list);
        list.isEmpty();
        System.out.println(list);
        list.add(4,900);
        System.out.println(list);
        list.set(4,600);
        list.set(5,700);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.size());
    }
}
