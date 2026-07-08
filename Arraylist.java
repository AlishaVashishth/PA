import java.util.*;

public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println("Size : " + fruits.size());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //reverse
        Collections.reverse(list);
        System.out.println("revesed: " + list);

        //sort
        //reverse
        Collections.sort(list);
        System.out.println("sorted: " + list);

        //max element
        System.out.println("maximum: "+ Collections.max(list));
    }
}