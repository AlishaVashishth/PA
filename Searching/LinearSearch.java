class LinearSearch{
    static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,8,5,16,28,-2};
        int ans = linearSearch(arr,28);

        if(ans==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index: "+ ans);
        }
    }
}