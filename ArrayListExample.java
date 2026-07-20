import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(1,"Grapes");

        System.out.println("List:" + list);
        System.out.println("Element at index 2:" + list.get(2));

        list.remove("Banana");
        System.out.println("After removing Banana:" + list);

        list.set(1,"Orange");
        System.out.println("After set:" + list);
        System.out.println("Size:" + list.size());
    }
}