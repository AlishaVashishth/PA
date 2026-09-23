import java.util.Arrays;

// find the Kth smallest element using selection sort
class KthSmallestElement {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {5,3,8,4,2};
        int k=3;
        selectionSort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        System.out.println(k+"rd smallest element :"+arr[k-1]);
    }
}
