import java.util.*;
public class Calc {
    public static void calc(int a, int b){
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: "+ (a-b));
        System.out.println("Product: "+ (a*b));
        System.out.println("Quotient: "+ (a/b));
        System.out.println("Remainder: "+ (a%b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        sc.close();
        calc(a,b);
    }
}
