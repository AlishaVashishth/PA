import java.util.*;

// LeetCode 401

public class BinaryWatch {
    static List<String> ans = new ArrayList<>();

    public static void backtrack(int index, int count, int turnedOn, int[] leds){
        if(count==turnedOn){
            int hour=0;
            int min=0;
            for(int i=0;i<4;i++){
                if(leds[i]==1){
                    hour+=(1<<i);
                }
            }
            for(int i=4;i<10;i++){
                if(leds[i]==1){
                    min+=(1<<(i-4));
                }
            }

            if(hour<=11 && min<=59){
                String time = hour+":"+
                String.format("%02d",min);
                ans.add(time);
            }
            return;
        }
        if(index==10) return;

        leds[index]=1;
        backtrack(index+1, count+1, turnedOn, leds);
        leds[index]=0;
        backtrack(index+1, count, turnedOn, leds);
        
    }

    public static void main(String[] args){
        int turnedOn=1;
        int[] leds= new int[10];
        backtrack(0,0,turnedOn,leds);
        System.out.print(ans);
    }
}
