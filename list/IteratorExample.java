import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        list.add("Cherry");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if(s.equals("Banana"))
                it.remove();
        }
        System.out.println("After remove :" + list);
    }
}

       

