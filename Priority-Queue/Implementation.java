import java.util.*;
class Implementation{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq.poll());
        System.out.println(pq.poll()); // 20 since 20 has high priority than 30
    }
}