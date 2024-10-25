public class SelectionSort {

    public static void selectionSort(int[] arr,int n){
        
        for(int i =0;i<n;i++){
           int min_idx = i;

           for(int j = i+1;j<n;j++){
            if(arr[j]<arr[min_idx]){
                min_idx = j;
            }
           }
           swap(arr,i,min_idx);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,44,3,2,1};

        selectionSort(arr,arr.length);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
