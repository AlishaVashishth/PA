// Q3. Write a program to check whether a number is:
// Even or Odd
// Positive, Negative, or Zero

import java.util.Scanner;

public class ZeroPosOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();

        if(n%2==0) System.out.print("Even and ");
        else System.out.print("Odd and ");

        if(n>0) System.out.print("Positive");
        else if(n<0) System.out.print("Negative");
        else System.out.print("Zero");
    }
}
