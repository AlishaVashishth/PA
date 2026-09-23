import java.util.*;

public class LL {
    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<>();

        // Add elements
        ll.addFirst("CSE");
        System.out.println(ll);

        ll.addLast("AIML");
        System.out.println(ll);

        ll.add("Java");
        System.out.println(ll);

        ll.add(1, "DSA");
        System.out.println(ll);

        // Access elements
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());
        System.out.println("Element at index 2: " + ll.get(2));

        // Update element
        ll.set(2, "DBMS");
        System.out.println("After update: " + ll);

        // Remove elements
        ll.removeFirst();
        System.out.println("After removing first: " + ll);

        ll.removeLast();
        System.out.println("After removing last: " + ll);

        ll.remove(0);
        System.out.println("After removing index 0: " + ll);

        // Check elements
        System.out.println("Contains Java? " + ll.contains("Java"));
        System.out.println("Size: " + ll.size());

        // Loop through LinkedList
        for (Object x : ll) {
            System.out.println(x);
        }

        // Clear entire list
        ll.clear();
        System.out.println("After clear: " + ll);
    }
}