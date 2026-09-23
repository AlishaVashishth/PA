import java.util.Arrays;

// sort in descending order using bubble sort

class DescendingSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,3,8,4,2,6,9,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
