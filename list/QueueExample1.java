import java.util.*;
public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(50);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}