class VariableSW {
    public static int SmallestSubarray(int[] arr,int k){
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;

        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                minlength=Math.min(minlength,right-left+1);
                sum-=arr[left];
                left++;
            }
        }

        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }   
    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        int k=7;
        int ans =SmallestSubarray(arr, k);
        System.out.println(ans);
    }
}