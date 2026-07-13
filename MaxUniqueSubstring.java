import java.util.*;

//using hash set with variable sliding window

class MaxUniqueSubstring{
    public static void main(String[] args){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        String str = "abcadba";

        int left=0;

        for(int right=0;right<str.length();right++){
            char ch = str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);

            maxLength = Math.max(right-left+1,maxLength);
        }
        System.out.println(maxLength);
    }
}
