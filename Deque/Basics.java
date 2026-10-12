import java.util.*;
class Basics{
    // In Deque you can both insert and delete from both ends of a Deque
    public static void main(String[] args){
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addFirst(20);
        System.out.println(dq);
        dq.addFirst(10);
        System.out.println(dq);

        dq.addLast(30);
        System.out.println(dq);
        dq.addLast(40);
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);
    }
}