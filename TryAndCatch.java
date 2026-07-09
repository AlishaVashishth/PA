import java.util.*;
import java.lang.*;

//2 try and catch

class TryAndCatch{
    public static void main(String[] args) {
        try {
            int divide = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}