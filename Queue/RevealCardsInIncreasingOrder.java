// Leetcode 950

import java.util.*;
class RevealCardsInIncreasingOrder{
    public static int[] decRevealed(int[] deck){
        Arrays.sort(deck);
        int n = deck.length;
        int[] ans = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i);
        }

        for(int card:deck){
            int index = q.poll();
            ans[index] = card;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] deck = {17,13,11,2,3,5,7};
        int ans[] = decRevealed(deck);
        System.out.println(Arrays.toString(ans));
    }
}