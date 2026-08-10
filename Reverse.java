// Q11. Reverse a given number.
// Example:
// Input: 12345
// Output: 54321

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        sc.close();
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=(rev*10)+d;
            num/=10;
        }
        System.out.println("Reversed num: "+rev);
    }
}
