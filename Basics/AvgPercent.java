// Q4. Write a program that takes marks of 5 subjects and calculates:
// Total Marks
// Percentage
// Average

import java.util.Scanner;

public class AvgPercent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Maximum marks: ");
        float n = sc.nextInt();
        System.out.print("Marks of subject1: ");
        float a = sc.nextInt();
        System.out.print("Marks of subject2: ");
        float b = sc.nextInt();
        System.out.print("Marks of subject3: ");
        float c = sc.nextInt();
        System.out.print("Marks of subject4: ");
        float d = sc.nextInt();
        System.out.print("Marks of subject5: ");
        float e = sc.nextInt();
        sc.close();

        double total = a+b+c+d+e;
        double avg = total/5;
        double percent = total/(n*5)*100;

        System.out.println("Total Marks: "+ total);
        System.out.println("Average Marks: "+ avg);
        System.out.println("Percentage: "+ percent);

    }
}
