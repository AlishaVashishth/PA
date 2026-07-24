class MaxElement{
	static int maxEl(int[] arr){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max) max = arr[i];
		}
		return max;
	}
	public static void main(String[] args){
		int[] arr = {1,5,8,2,11,16,28,4};
		System.out.println(maxEl(arr));
	}
}