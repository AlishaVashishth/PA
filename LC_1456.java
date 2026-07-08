import java.util.*;

//sliding window ------- substrings

class LC_1456 {
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static int maxVowels(String s, int k) {
        int count=0;
        // s = s.toLowerCase(); 

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        int maxVowel = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) count--;
            if(isVowel(s.charAt(i))) count++;
            maxVowel = Math.max(maxVowel,count);
        }

        return maxVowel;
    }
    public static void main(String[] args) {
        System.out.println(maxVowels("Aisha",3));
    }
}

