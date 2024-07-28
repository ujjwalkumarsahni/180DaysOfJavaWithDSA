public class sortArrayOneAndZeroes{
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortZeroesOne(int[] arr){
        int n = arr.length;
        int Zeroes = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                Zeroes++;
            }
        }
        for(int i = 0;i<n;i++){
            if(i<Zeroes){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
    static void swapArray(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void AlternateAprochSort(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swapArray(arr,left,right);
                left++;
                right--;

            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
        // for(int i = 0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
    }
    public static void main(String args[]){
        int[] arr = {1,0,0,1,1,1,0,0,0,1};
        // sortZeroesOne(arr);
        AlternateAprochSort(arr);
        printArray(arr);

    }
}