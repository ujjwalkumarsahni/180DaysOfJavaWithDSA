public class sortEvenOdd {
    static void  printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void SortEvenOdd(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {1,3,4,6,5,7};
        SortEvenOdd(arr);
        printArray(arr);
    }
}
