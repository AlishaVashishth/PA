// Leetcode 2073

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //using queue
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }

        int time = 0;
        while(true){
            int person = queue.poll();
            tickets[person]--;
            time++;

            if(person==k && tickets[person]==0){
                return time;
            }
            if(tickets[person]>0){
                queue.add(person);
            }
        }
    }
}