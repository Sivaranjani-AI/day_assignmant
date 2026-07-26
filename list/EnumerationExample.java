import java.util.*;
public class EnumerationExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("O");
        v.add("T");
        v.add("A");
        v.add("B");
        v.add("C");

        Enumeration<String> e = v.elements();
       
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}