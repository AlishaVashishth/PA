class BS{
	static int binarySearch(int[] arr, int target){
		int low=0;
		int high=arr.length-1;
		
		while(low<=high){
			int mid = low+(high-low)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<target){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {10,11,25,28,30,32,46,88,100};
		int ans = binarySearch(arr,46);
		
		if(ans==-1) System.out.println("Element not found");
		else System.out.println("Element found at index:"+ans);
	}
}