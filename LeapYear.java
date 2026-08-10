//Q7. Write a program to check whether a year is a Leap Year.
import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();

        if(year%400==0 || ((year%4==0) && (year%100!=0))) System.out.println("It is a Leap year");
        else System.out.println("Not a Leap Year");
    }
}
