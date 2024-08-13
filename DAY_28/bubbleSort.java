public class bubbleSort{

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void BubbelSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {5,4,3,6,1};
        printArray(arr);
        BubbelSort(arr);
        printArray(arr);

    }
}


