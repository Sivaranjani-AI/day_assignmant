import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Max");
        names.add("Steve");
        names.add("Max");
        System.out.println(names);
    }
}