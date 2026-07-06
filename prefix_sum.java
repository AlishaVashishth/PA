// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        //prefix sum
        int[] arr = {2,5,3,8,1,6};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        
        // for(int i=1;i<arr.length;i++){
        //     prefix[i] = prefix[i-1] + arr[i];
        // }
        
        // for(int num:prefix){
        //     System.out.print(num+" ");
        // }
        
        //sum in a range
        // sum from start to end
        for(int i=1;i<arr.length;i++)
            prefix[i] = prefix[i-1] + arr[i];
            
            int start=2;
            int end = 5;
            int sum;
            
            if(start==0) sum=prefix[end];
            else{
                sum=prefix[end] - prefix[start-1];
            }
        
        System.out.print(sum);
    }
}