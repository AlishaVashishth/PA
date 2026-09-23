import java.util.Arrays;

class LC_34 {
    static int firstOccurrence(int[] nums, int target){
        int low=0,high=nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]< target) low = mid+1;
            else high = mid-1;
        }

        return ans;
    }

    static int lastOccurrence(int[] nums, int target){
        int low=0,high=nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]< target) low = mid+1;
            else high = mid-1;
        }

        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums,target);
        int last = lastOccurrence(nums,target);

        int[] list = {0,0};
        list[0] = first;
        list[1] = last;

        return list;
    }

    // running the first testcase in main
    public static void main(String[] args){
		int[] arr = {5,7,7,8,8,10};
		int target=8;

        int[] ans = searchRange(arr,target);

        System.out.println(Arrays.toString(ans));
	}
}