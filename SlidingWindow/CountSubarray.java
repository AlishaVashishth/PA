class CountSubarray {
    public static int count(int[] arr,int k){
        int left=0;
        int c=0;
        int sum=0;

        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                sum-=arr[left];
                left++;
            }
            c+=(right-left+1);
        }
        return c;

    }

    public static void main(String[] args){
        int[] arr={1,2,3};
        int k=3;

        int ans=count(arr, k);
        System.out.print(ans);
        
    }
}