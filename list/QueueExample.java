import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
