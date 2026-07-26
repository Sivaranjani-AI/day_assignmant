import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        ListIterator<String> it = list.listIterator();
        System.out.println("Forward direction :");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
  
        System.out.println("Backward direction :");
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }
}