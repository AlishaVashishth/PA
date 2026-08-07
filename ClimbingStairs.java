// LeetCode 70
import java.util.*;
public class ClimbingStairs {
    public static int climb(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        int first=1;
        int second=2;
        
        // ways(n) = ways(n-1) + ways(n-2)
        for(int i=3;i<=n;i++){
            int curr = first+second;
            first=second;
            second = curr;
        }

        return second;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs:");
        int n = sc.nextInt();
        System.out.println("Total ways to climb "+n+" stairs: "+climb(n));
        sc.close();
    }
}
