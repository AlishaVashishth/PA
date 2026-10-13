import java.util.*;

class HospitalPriority{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(60);
        pq.add(2);
        pq.add(0);
        System.out.println("Patients priority list:");
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}