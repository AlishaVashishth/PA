// Q6. Write a program to calculate electricity bill using the following conditions:
// First 100 units → ₹5/unit
// Next 100 units → ₹7/unit
// Above 200 units → ₹10/unit

import java.util.*;

public class ElectricityBill {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Units consumed: ");
            int units = sc.nextInt();
            sc.close();

            int amount;

            if (units < 0) {
                throw new Exception("Units can't be negative");
            }
            else if (units <= 100) {
                amount = units * 5;
            }
            else if (units <= 200) {
                amount = (100 * 5) + (units - 100) * 7;
            }
            else {
                amount = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }

            System.out.println("Amount: ₹" + amount);

            
        }

        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
