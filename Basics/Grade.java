// Q8. Write a Java program that displays grades based on percentage:
// 90+ → A+
// 80–89 → A
// 70–79 → B
// 60–69 → C
// Below 60 → Fail

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Percentage: ");
        float percent = sc.nextInt();
        
        sc.close();

        if(percent>=90) System.out.println("A+");
        else if(percent>=80 && percent<90) System.out.println("A");
        else if(percent>=70 && percent<80) System.out.println("B");
        else if(percent>=60 && percent<70) System.out.println("C");
        else System.out.println("Fail");

    }
}
