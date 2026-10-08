// Leetcode 346

import java.util.*;

class MovingAverageFromDataStream{

    public static class MovingAvg{
        Queue<Integer> q;
        int size;
        MovingAvg(int size){
            this.size=size;
            q = new LinkedList<>();
        }
        public double next(int value){
            q.add(value);
            if(q.size()>size){
                q.poll();
            }
            int sum=0;
            for(int num:q){
                sum+=num;
            }
            return (double) sum/q.size();
        }
    }
    public static void main(String[] args){
        MovingAvg obj = new MovingAvg(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));

    }
}