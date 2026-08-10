//Q10. Find the factorial of a number using a loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        sc.close();
        long fac =1;
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println("Factorial: "+fac);
    }
}
