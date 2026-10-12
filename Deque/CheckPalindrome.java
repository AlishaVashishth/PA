import java.util.*;
class CheckPalindrome{
    // using Deque

    public static void main(String[] args){
        String s = "123321";

        Deque<Character> dq = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            dq.addFirst(s.charAt(i));
        }

        String rev = "";
        while(!dq.isEmpty()){
            rev+=(dq.removeFirst());
        }
        
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}