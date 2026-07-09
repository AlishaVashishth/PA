// sliding window

// Imagine you have 10 books on a shelf and want to know which 3 consecutive books have the highest total no. of pages
// Instead of counting all pages for every group from scratch, you count the first 3 books
// Remove the first books pages and the next book's pages

import java.util.*;

class ConsecutiveBookPages{
    public static void main(String[] args){
        int[] arr = {800,100,250,700,220,50};
        int k=3;
        int maxSum=0;
        int sum = 0;
        int left =-1;
        int right =-1;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        } 
        maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum -= arr[i-k];

            if(maxSum<sum){
                maxSum = sum;
                left = i-k+1;
                right = i;
            }
        }

        System.out.println("Left index: " + left + ", Right Index: "+ right + ",Max sum: "+ maxSum);
    }
}