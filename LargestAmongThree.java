// Q5. Write a program to find the largest among three numbers.

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        if(a>b && a>c) System.out.println("Largest is "+a);
        else if(b>a && b>c) System.out.println("Largest is "+b);
        else System.out.println("Largest is "+c);
        sc.close();
    }
}
