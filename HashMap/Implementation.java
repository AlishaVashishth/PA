import java.util.*;

class Implementation{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101,"Alisha");
        map.put(101, "amvi");

        System.out.println(map);

        // hashCode()
        // formula to calculate bucket index: (n-1) &hash
        // n = capacity of hashmap
        // default capacity of hashmap is 16
        
        // key=0 hash=0 index=0
        // key=1 hash=1 index=1
        // key=2 hash=2 index=2
        // key=10 hash=10 index=10
        // key=100 hash=100 index=4 (100 % 16 = 4)
        // key=101 hash=101 index=5 (101 % 16 = 5)
        // key=102 hash=102 index=6 (102 % 16 = 6)

        
    }
}