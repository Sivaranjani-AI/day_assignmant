import java.util.*;
public class SetExample1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(60);
        numbers.add(90);
        numbers.add(80);
        numbers.add(60);
        System.out.println(numbers);
    }
}