// Q2. Write a program to swap two numbers:


// Without using a third variable.
// Using arithmetic operators only.

import java.util.Scanner;

public class Swap {

    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        int[] res = swap(a, b);

        a = res[0];
        b = res[1];

        System.out.println("------After Swapping-----");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);

        sc.close();
    }
}